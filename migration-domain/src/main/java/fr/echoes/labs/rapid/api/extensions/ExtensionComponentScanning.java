package fr.echoes.labs.rapid.api.extensions;

import fr.echoes.labs.pluginfwk.api.extension.Extension;

/**
 * The Interface ExtensionComponentScanning defines an extension to allow more packages to be scanned by RAPID to include beans.
 */
public interface ExtensionComponentScanning extends Extension {

	/**
	 * Gets the scanned packages.
	 *
	 * @return the scanned packages
	 */
	String[] getScannedPackages();
}
