/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.resource;

import org.eclipse.emf.common.util.URI;

/**
 * Extension to the {@link IResourceServiceProvider} which allows to ask
 * if a given resource URI points to a project source or a library.
 * 
 * @author Sven Efftinge - Initial contribution and API
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 * @since 2.8
 */
public interface IResourceServiceProviderExtension {

	/**
	 * Returns true if the given uri is from a source that is to-be-processed.
	 * @since 3.0
	 */
	boolean isSource(URI uri);
}
