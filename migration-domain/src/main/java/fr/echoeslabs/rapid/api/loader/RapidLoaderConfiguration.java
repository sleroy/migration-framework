/*
 * Copyright (C) Metrixware / Echoes Labs, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * @since 2016
 */
package fr.echoeslabs.rapid.api.loader;

import java.io.File;

import fr.echoes.labs.pluginfwk.api.plugin.PluginFrameworkConfiguration;
import fr.echoes.labs.pluginfwk.api.plugin.PluginPropertyStorageConfiguration;

public interface RapidLoaderConfiguration extends PluginFrameworkConfiguration, PluginPropertyStorageConfiguration {

	/**
	 * Gets the extra packages.
	 *
	 * @return the extra packages
	 */
	String[] getExtraPackages();

	/**
	 * Gets the java plugin folder.
	 *
	 * @return the java plugin folder
	 */
	File getJavaPluginFolder();

}
