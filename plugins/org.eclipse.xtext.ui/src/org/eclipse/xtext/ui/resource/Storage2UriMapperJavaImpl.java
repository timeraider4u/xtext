/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.resource;

import static com.google.common.collect.Lists.*;
import static com.google.common.collect.Maps.*;
import static com.google.common.collect.Sets.*;
import static java.util.Collections.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.log4j.Logger;
import org.eclipse.core.internal.resources.WorkManager;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJarEntryResource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.xtext.ui.util.IJdtHelper;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.common.base.Objects;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * @author Sven Efftinge - Initial contribution and API
 * @noextend This class is not intended to be subclassed by clients.
 */
@Singleton
public class Storage2UriMapperJavaImpl implements IStorage2UriMapperJdtExtensions, IStorage2UriMapperContribution, IElementChangedListener {
	
	private static final Logger log = Logger.getLogger(Storage2UriMapperJavaImpl.class);
	
	/**
	 * @since 2.5
	 */
	public static class PackageFragmentRootData {
		public URI uriPrefix;
		public final Object modificationStamp;
		public final Map<String, IPackageFragmentRoot> associatedRoots;
		public Map<URI, IStorage> uri2Storage = newLinkedHashMap();

		public PackageFragmentRootData(Object modificationStamp) {
			this.modificationStamp = modificationStamp;
			this.associatedRoots = newLinkedHashMap();
		}
		
		@Override
		public String toString() {
			return getPath() + " / " + uriPrefix;
		}

		public boolean exists() {
			if (associatedRoots.isEmpty()) {
				return false;
			}
			return IterableExtensions.head(associatedRoots.values()).exists();
		}

		public IPath getPath() {
			if (associatedRoots.isEmpty()) {
				return null;
			}
			return IterableExtensions.head(associatedRoots.values()).getPath();
		}

		public void addRoot(IPackageFragmentRoot root) {
			if (root != null) {
				associatedRoots.put(root.getHandleIdentifier(), root);
			}
		}

	}
	
	
	@Inject private JarEntryLocator locator;
	@Inject private IJdtHelper jdtHelper;
	@Inject private UriValidator uriValidator;
	
	@Inject private IStorage2UriMapper host;
	
	/**
	 * Public for testing purpose
	 * 
	 * @since 2.4
	 * @nooverride This method is not intended to be re-implemented or extended by clients.
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public void setJdtHelper(IJdtHelper jdtHelper) {
		this.jdtHelper = jdtHelper;
	}
	
	/**
	 * Public for testing purpose
	 * 
	 * @nooverride This method is not intended to be re-implemented or extended by clients.
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public void setLocator(JarEntryLocator locator) {
		this.locator = locator;
	}
	
	/**
	 * Public for testing purpose
	 * 
	 * @nooverride This method is not intended to be re-implemented or extended by clients.
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public void setUriValidator(UriValidator uriValidator) {
		this.uriValidator = uriValidator;
	}
	
	/**
	 * Public for testing purpose
	 * 
	 * @since 2.5
	 * @nooverride This method is not intended to be re-implemented or extended by clients.
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public void setHost(IStorage2UriMapper host) {
		this.host = host;
	}
	
	private Map<String, PackageFragmentRootData> cachedPackageFragmentRootData = newLinkedHashMap();
	
	/**
	 * Rejects Java output folders when traversing a project.
	 * @return <code>true</code> if the folder is a java output folder. Otherwise <code>false</code>.
	 * @since 2.5
	 */
	@Override
	public boolean isRejected(/* @NonNull */ IFolder folder) {
		return jdtHelper.isFromOutputPath(folder);
	}
	
	/**
	 * @since 2.4
	 */
	@Override
	public Pair<URI, URI> getURIMapping(IPackageFragmentRoot root) throws JavaModelException {
		PackageFragmentRootData data = getData(root);
		if (data.uriPrefix == null)
			return null;
		IPath path = root.isExternal() ? root.getPath() : root.getUnderlyingResource().getLocation();
		URI physical = null;
		if (root.isArchive()) {
			String archiveScheme = "zip".equalsIgnoreCase(root.getPath().getFileExtension()) ? "zip" : "jar";
			physical = URI.createURI(archiveScheme+":file:"+path.toFile().getPath()+"!/");
		} else {
			physical = URI.createFileURI(path.toFile().getPath()+"/");
		}
		return Tuples.create(data.uriPrefix, physical);
	}
	
	/**
	 * @since 2.4
	 */
	@Override
	public Map<URI, IStorage> getAllEntries(IPackageFragmentRoot root) {
		try {
			IResource underlyingResource = root.getUnderlyingResource();
			if (underlyingResource instanceof IFolder) {
				return host.getAllEntries((IFolder) underlyingResource);
			}
		} catch (JavaModelException e) {
			if (!e.isDoesNotExist())
				log.error(e.getMessage(), e);
			return emptyMap();
		}
		PackageFragmentRootData data = getData(root);
		return data.uri2Storage;
	}
	
	private PackageFragmentRootData getData(IPackageFragmentRoot root) {
		final boolean isCachable = root.isArchive() || root.isExternal();
		if (isCachable) {
			return getCachedData(root);
		}
		PackageFragmentRootData data = initializeData(root);
		return data;
	}

	private PackageFragmentRootData getCachedData(IPackageFragmentRoot root) {
		final String path = root.getPath().toString();
		synchronized (cachedPackageFragmentRootData) {
			if(cachedPackageFragmentRootData.containsKey(path)) {
				final PackageFragmentRootData data = cachedPackageFragmentRootData.get(path);
				if (isUpToDate(data, root)) {
					data.addRoot(root);
					return data;
				} else {
					cachedPackageFragmentRootData.remove(path);
				}
			}
		}
		PackageFragmentRootData data = initializeData(root);
		synchronized (cachedPackageFragmentRootData) {
			cachedPackageFragmentRootData.put(path, data);
		}
		return data;
	}
	
	private boolean isUpToDate(PackageFragmentRootData data, IPackageFragmentRoot root) {
		return Objects.equal(data.modificationStamp, computeModificationStamp(root));
	}
	
	private Object computeModificationStamp(IPackageFragmentRoot root) {
		try {
			if (root.exists()) {
				IResource resource = root.getUnderlyingResource();
				if (resource != null) {
					return resource.getLocation().toFile().lastModified();
				}
				return root.getPath().toFile().lastModified();
			}
		} catch (JavaModelException e) {
			log.error(e.getMessage(), e);
		}
		return new Object();
	}

	/**
	 * @since 2.4
	 */
	protected PackageFragmentRootData initializeData(final IPackageFragmentRoot root) {
		final PackageFragmentRootData data = new PackageFragmentRootData(computeModificationStamp(root));
		data.addRoot(root);
		try {
			final SourceAttachmentPackageFragmentRootWalker<Void> walker = new SourceAttachmentPackageFragmentRootWalker<Void>() {
				
				@Override
				protected URI getURI(IFile file,
						org.eclipse.xtext.ui.resource.PackageFragmentRootWalker.TraversalState state) {
					if (!uriValidator.isPossiblyManaged(file))
						return null;
					return super.getURI(file, state);
				}

				@Override
				protected URI getURI(IJarEntryResource jarEntry,
						org.eclipse.xtext.ui.resource.PackageFragmentRootWalker.TraversalState state) {
					if (!uriValidator.isPossiblyManaged(jarEntry))
						return null;
					final URI uri = locator.getURI(root, jarEntry, state);
					if (!uriValidator.isValid(uri, jarEntry))
						return null;
					return uri;
				}

				@Override
				protected Void handle(URI uri, IStorage storage,
						org.eclipse.xtext.ui.resource.PackageFragmentRootWalker.TraversalState state) {
					data.uri2Storage.put(uri, storage);
					return null;
				}
				
			};
			walker.traverse(root, false);
			if (walker.getBundleSymbolicName() != null)
				data.uriPrefix = URI.createPlatformResourceURI(walker.getBundleSymbolicName()+"/", true);
		} catch (RuntimeException e) {
			log.error(e.getMessage(), e);
		} catch (JavaModelException e) {
			log.debug(e.getMessage(), e);
		}
		return data;
	}
	
	/* @NonNull */
	@Override
	public Iterable<Pair<IStorage, IProject>> getStorages(/* @NonNull */ URI uri) {
		List<Pair<IStorage, IProject>> result = newArrayListWithCapacity(1);
		List<PackageFragmentRootData> packageFragmentRootDatas;
		synchronized(cachedPackageFragmentRootData) {
			packageFragmentRootDatas = newArrayList(cachedPackageFragmentRootData.values());
		}
		Iterator<PackageFragmentRootData> iterator = packageFragmentRootDatas.iterator();
		while (iterator.hasNext()) {
			PackageFragmentRootData data = iterator.next();
			if (data.exists()) {
				if (data.uriPrefix == null || uri.toString().startsWith(data.uriPrefix.toString())) {
					IStorage storage = data.uri2Storage.get(uri);
					if (storage != null) {
						for (IPackageFragmentRoot root : data.associatedRoots.values()) {
							result.add(Tuples.create(storage, root.getJavaProject().getProject()));
						}
					}
				}
			} else {
				iterator.remove();
			}
		}
		if (result.isEmpty() && uri.isArchive()) {
			String authority = uri.authority();
			authority = authority.substring(0, authority.length() - 1);
			URI archiveURI = URI.createURI(authority);
			if (archiveURI.isFile() || archiveURI.isPlatformResource()) {
				IPath archivePath = new Path(archiveURI.isPlatformResource()? archiveURI.toPlatformString(true): archiveURI.toFileString());
				for (PackageFragmentRootData data : packageFragmentRootDatas) {
					if (data.uriPrefix != null && archivePath.equals(data.getPath())) {
						// prefixes have an empty last segment.
						URI prefix = data.uriPrefix.lastSegment().length()==0 ? data.uriPrefix.trimSegments(1) : data.uriPrefix;
						URI expectedURI = prefix.appendSegments(uri.segments());
						IStorage storage = data.uri2Storage.get(expectedURI);
						if (storage != null) {
							for (IPackageFragmentRoot root : data.associatedRoots.values()) {
								result.add(Tuples.create(storage, root.getJavaProject().getProject()));
							}
						}
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * @since 2.5
	 */
	@Override
	public URI getUri(/* @NonNull */ IStorage storage) {
		if (storage instanceof IJarEntryResource) {
			final IJarEntryResource casted = (IJarEntryResource) storage;
			IPackageFragmentRoot packageFragmentRoot = casted.getPackageFragmentRoot();
			Map<URI, IStorage> data = getAllEntries(packageFragmentRoot);
			for (Map.Entry<URI, IStorage> entry : data.entrySet()) {
				if (entry.getValue().equals(casted))
					return entry.getKey();
			}
			if (packageFragmentRoot.exists() && packageFragmentRoot.isArchive()) {
				IPath jarPath = packageFragmentRoot.getPath();
				URI jarURI;
				if (packageFragmentRoot.isExternal()) {
					jarURI = URI.createFileURI(jarPath.toOSString());
				} else {
					jarURI = URI.createPlatformResourceURI(jarPath.toString(), true);
				}
				URI result = URI.createURI("archive:" + jarURI + "!" + storage.getFullPath());
				return result;
			}
		}
		return null;
	}
	
	@Override
	public void elementChanged(ElementChangedEvent event) {
		initializeCache(true);
		Set<IJavaProject> javaProjectsWithClasspathChange = getJavaProjectsWithClasspathChange(event.getDelta());
		if(!javaProjectsWithClasspathChange.isEmpty()) {
			for(IJavaProject project: javaProjectsWithClasspathChange) {
				updateCache(project);
			}
		} 
		for(IJavaElementDelta projectDelta: getProjectDeltas(event.getDelta())) {
			IJavaProject project = (IJavaProject) projectDelta.getElement();
			if((projectDelta.getKind() & IJavaElementDelta.REMOVED) != 0) {
				clearCache(project, Collections.<PackageFragmentRootData>emptySet());
				return;
			} 
			switch(projectDelta.getFlags()) {
				case IJavaElementDelta.F_OPENED: 
					updateCache(project);
					break;
				case IJavaElementDelta.F_CLOSED:
					clearCache(project, Collections.<PackageFragmentRootData>emptySet());
					break;
			}
		}
	}

	@Inject
	private IWorkspace workspace;
	
	/**
	 * @since 2.9
	 */
	public void setWorkspace(IWorkspace workspace) {
		this.workspace = workspace;
	}
	
	private volatile boolean isInitialized = false;
	private AtomicReference<CountDownLatch> initializerGuard = new AtomicReference<CountDownLatch>();

	/**
	 * @since 2.4
	 */
	private void updateCache(IJavaProject project) {
		Set<PackageFragmentRootData> datas = newHashSet();
		try {
			if (project.exists() && project.getProject().isAccessible()) {
				for(IPackageFragmentRoot root: project.getPackageFragmentRoots()) {
					boolean isCachable = root.isArchive() || root.isExternal();
					if(isCachable) 
						datas.add(getCachedData(root));
				}
			}
		} catch (JavaModelException e) {
			if (!e.isDoesNotExist())
				log.error("Error getting package fragments roots of " + project.getElementName(), e);
		} finally {
			clearCache(project, datas);
		}
	}
	
	private void clearCache(IJavaProject project, Set<PackageFragmentRootData> toBeKept) {
		Collection<PackageFragmentRootData> values;
		synchronized (cachedPackageFragmentRootData) {
			values = newArrayList(cachedPackageFragmentRootData.values());
		}
		List<PackageFragmentRootData> toBeRemoved = newArrayList();
		for (PackageFragmentRootData data : values) {
			if (toBeKept.contains(data)) {
				continue;
			}
			Iterator<IPackageFragmentRoot> i = data.associatedRoots.values().iterator();
			IPackageFragmentRoot someRoot = null;
			boolean didChange = false;
			while (i.hasNext()) {
				IPackageFragmentRoot root = i.next();
				if (project.equals(root.getJavaProject())) {
					i.remove();
					didChange = true;
				} else if (someRoot == null) {
					someRoot = root;
				}
			}
			if (data.associatedRoots.size() == 0) {
				toBeRemoved.add(data);
			} else if (didChange) {
				// get rid of cached storages that still point to roots / projects that are no longer available
				// and recompute them lazily on demand
				final IPackageFragmentRoot rootToProcess = someRoot;
				data.uri2Storage = new ForwardingMap<URI, IStorage>() {
					Map<URI, IStorage> delegate;
					@Override
					protected Map<URI, IStorage> delegate() {
						if (delegate == null) {
							PackageFragmentRootData newlyCollected = initializeData(rootToProcess);
							return delegate = newlyCollected.uri2Storage; 
						}
						return delegate;
					}
				};
			}
		}
		if(!toBeRemoved.isEmpty()) {
			synchronized (cachedPackageFragmentRootData) {
				cachedPackageFragmentRootData.values().removeAll(toBeRemoved);
			}
		}
	}

	/**
	 * @since 2.4
	 */
	@Override
	public void initializeCache() {
		initializeCache(false);
	}
	
	/**
	 * Schedules cache initialization to be performed in the background.
	 * Cache init needs a WS lock, though.
	 * 
	 * @since 2.9
	 */
	public void asyncInitializeCache() {
		if(!isInitialized) {
			useNewThreadToInitialize(false);
		}
	}

	private boolean isWorkspaceLockedByCurrentThread() {
		try {
			WorkManager workManager = ((Workspace) workspace).getWorkManager();
			return workManager.isLockAlreadyAcquired();
		} catch(CoreException e) {
			return false;
		}
	}
	
	private void initializeCache(boolean wait) {
		if(!isInitialized) {
			/*
			 * IWorkspace.run(IWorkspaceRunnable, ISchedulingRule, int, IProgressMonitor)
			 * accepts a scheduling rule to allow a workspace runnable to be postponed
			 * when another plain job with the same SR is still running (and vice versa),
			 * but the main lock during the run is the one of the Workmanager.
			 * Even if the there is no current rule on the manager, the workspace may be currently
			 * locked by this thread. If that is already the case, initialize the cache
			 * immedidatly, otherwise postpone the initialization to another thread.  
			 */
			// basically two scenarios: the current thread has the build rule or ws-root rule
			// that is, we can init directly
			if (isWorkspaceLockedByCurrentThread()) {
				// perform initialization from the current thread and everything should be fine
				// since we already have the WS lock
				try {
					doInitializeCache();
				} catch (CoreException e) {
					log.error(e.getMessage(), e);
				}
				// this may have happend while another thread is already waiting to aquire the WS root
				// release the guard to let potentially waiting threads continue as early as possible 
				CountDownLatch guard = initializerGuard.get();
				if (guard != null) {
					// notify waiting threads
					guard.countDown();
				}
			} else {
				// or we need to defer the initialization
				useNewThreadToInitialize(wait);
			}
		}
	}

	/**
	 * If no thread has been spawned so far, spawns a new one that will perform the cache init.
	 * Optionally waits for the cache initialization to be performed in a another thread.
	 */
	private void useNewThreadToInitialize(boolean wait) {
		if (wait && isWorkspaceLockedByCurrentThread()) {
			// may not wait if we currently hold a conflicting rule
			throw new IllegalStateException("Cannot wait for the thread to finish if we currently hold the WS lock");
		}
		CountDownLatch myGuard = initializerGuard.get();
		// check if there was already a thread scheduled
		if (myGuard == null) {
			// no guard found so far
			final CountDownLatch newGuard = new CountDownLatch(1);
			if (initializerGuard.compareAndSet(null, newGuard)) {
				// still no other thread created a guard in the (short) meantime 
				myGuard = newGuard;
				// aquire the WS rule in an own thread and perform the initialization from there
				startInitializerThread(newGuard);
			} else {
				// use the guard that was created by another thread
				myGuard = initializerGuard.get();
			}
		}
		if (myGuard == null) {
			throw new IllegalStateException();
		}
		if (wait) {
			try {
				// optionally wait for the initialization to finish
				myGuard.await();
			} catch (InterruptedException e) {
				// ignore
			}
		}
	}

	private void startInitializerThread(final CountDownLatch countDown) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					doInitializeCache();
				} catch (CoreException e) {
					log.error(e.getMessage(), e);
				} finally {
					// mark the initialization as done
					countDown.countDown();
				}
			}
		}).start();
	}

	private void doInitializeCache() throws CoreException {
		if(!isInitialized) {
			IWorkspaceRunnable runnable = new IWorkspaceRunnable() {
				@Override
				public void run(IProgressMonitor monitor) throws CoreException {
					if(!isInitialized) {
						for(IProject project: workspace.getRoot().getProjects()) {
							if(project.isAccessible() && JavaProject.hasJavaNature(project)) {
								IJavaProject javaProject = JavaCore.create(project);
								updateCache(javaProject);
							}
						}
						isInitialized = true;
					}
				}
			};
			// while the tree is locked, workspace.run may not be used but we are sure that we do already
			// hold the workspace lock - save to just run the action code
			if (workspace.isTreeLocked()) {
				runnable.run(null);
			} else {
				workspace.run(runnable, null, IWorkspace.AVOID_UPDATE, null);
			}
		}
	}
	
	private Set<IJavaElementDelta> getProjectDeltas(IJavaElementDelta delta) {
		IJavaElement element = delta.getElement();
		if(delta.getElement().getElementType() == IJavaElement.JAVA_PROJECT) {
			return Collections.singleton(delta);
		}
		Set<IJavaElementDelta> result = null;
		if(element instanceof IJavaModel) {
			for(IJavaElementDelta child: delta.getAffectedChildren()) {
				Set<IJavaElementDelta> projectDeltas = getProjectDeltas(child);
				if(!projectDeltas.isEmpty()) {
					if(result == null)
						result = newLinkedHashSet(); 
					result.addAll(projectDeltas);
				}
			}
		}
		return result == null ? Collections.<IJavaElementDelta>emptySet() : result;
	}
	
	private Set<IJavaProject> getJavaProjectsWithClasspathChange(IJavaElementDelta delta) {
		IJavaElement element = delta.getElement();
		if (element instanceof IPackageFragmentRoot) {
			IPackageFragmentRoot root = (IPackageFragmentRoot) element;
			if (delta.getKind() == IJavaElementDelta.REMOVED || delta.getKind() == IJavaElementDelta.ADDED
					|| (delta.getFlags() & IJavaElementDelta.F_REORDER) != 0
					|| (delta.getFlags() & IJavaElementDelta.F_REMOVED_FROM_CLASSPATH) != 0
					|| (delta.getFlags() & IJavaElementDelta.F_ADDED_TO_CLASSPATH) != 0
					|| (root.isExternal() && (delta.getFlags() & // external folders change
					(IJavaElementDelta.F_CONTENT | IJavaElementDelta.F_SOURCEATTACHED | IJavaElementDelta.F_SOURCEDETACHED)) == delta
							.getFlags())) {
				return Collections.singleton(root.getJavaProject());
			}
		} else if (element instanceof IJavaModel) {
			return getPackageFragmentRootDeltas(delta.getAffectedChildren());
		} else if (element instanceof IJavaProject) {
			if ((delta.getFlags() & IJavaElementDelta.F_CLASSPATH_CHANGED) != 0
					|| (delta.getFlags() & IJavaElementDelta.F_RESOLVED_CLASSPATH_CHANGED) != 0)
				return Collections.singleton((IJavaProject) element);
			return getPackageFragmentRootDeltas(delta.getAffectedChildren());
		}
		return Collections.emptySet();
	}

	private Set<IJavaProject> getPackageFragmentRootDeltas(IJavaElementDelta[] affectedChildren) {
		LinkedHashSet<IJavaProject> set = Sets.newLinkedHashSet();
		for (IJavaElementDelta delta : affectedChildren) {
			set.addAll(getJavaProjectsWithClasspathChange(delta));
		}
		return set;
	}

}
