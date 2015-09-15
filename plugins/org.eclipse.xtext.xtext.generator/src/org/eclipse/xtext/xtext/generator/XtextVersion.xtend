package org.eclipse.xtext.xtext.generator

import java.io.IOException
import java.io.InputStream
import java.net.URL
import java.util.jar.Manifest
import org.eclipse.emf.common.EMFPlugin
import org.eclipse.xtend.lib.annotations.Data

@Data
class XtextVersion {
	
	static def getCurrent() {
		new XtextVersion(readVersionFromManifest ?: 'unknown')
	}
	
	private static def readVersionFromManifest() {
		var InputStream is
		try {
			val url = new URL(Plugin.INSTANCE.baseURL + 'META-INF/MANIFEST.MF')
			is = url.openStream()
			val manifest = new Manifest(is)
			return manifest.getMainAttributes().getValue('Maven-Version')
		} catch (Exception e) {
			return null;
		} finally {
			if (is != null) {
				try { is.close() }
				catch (IOException e) {}
			}
		}
	}

	private static class Plugin extends EMFPlugin {
		public static final Plugin INSTANCE = new Plugin
		private new() {
			super(#[]);
		}
		override getPluginResourceLocator() {
		}
	}
	
	String version
	
	def isSnapshot() {
		version.endsWith("-SNAPSHOT")
	}
	
	override toString() {
		version
	}
}
