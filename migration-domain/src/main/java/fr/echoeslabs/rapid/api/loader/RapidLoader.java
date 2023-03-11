/*
 *
 */
package fr.echoeslabs.rapid.api.loader;

import java.io.Closeable;

import fr.echoes.labs.pluginfwk.api.extension.Extension;
import fr.echoes.labs.pluginfwk.api.plugin.PluginDefinition;
import fr.echoes.labs.pluginfwk.api.plugin.PluginFramework;
import fr.echoes.labs.pluginfwk.api.scanner.PluginScanner;
import fr.echoeslabs.migration.utils.exception.RapidException;
import fr.echoeslabs.rapid.api.analysis.params.ParameterConfiguration;
import fr.echoeslabs.rapid.api.migration.MigrationContext;
import fr.echoeslabs.rapid.api.migration.repository.MigrationMetaRepository;
import fr.echoeslabs.rapid.api.migration.repository.MigrationRepository;

/**
 * The Interface RapidLoader provides all necessary methods to load rules and
 * instantiate them.
 */
public interface RapidLoader extends Closeable {

	/**
	 * Declare extensions.
	 *
	 * @param _name
	 *            the name
	 * @param extensions
	 *            the extensions
	 * @throws RapidException
	 *             the rapid exception
	 */
	void declareExtensions(String _name, Extension... extensions) throws RapidException;

	/**
	 * Gets the global configuration.
	 *
	 * @return the global configuration
	 */
	ParameterConfiguration getGlobalConfiguration();

	/**
	 * Returns the migration meta repository.
	 *
	 * @return the migration metarepository.
	 */
	MigrationMetaRepository getMigrationMetaRepository();

	/**
	 * Gets the plugin framework.
	 *
	 * @return the plugin framework
	 */
	PluginFramework getPluginFramework();

	/**
	 * Gets the migration repository.
	 *
	 * @param _migrationContext
	 *
	 *            the _migration context
	 * @return the migration repository
	 * @throws RapidException
	 *             the rapid exception
	 */
	MigrationRepository instantiateMigrationRepository(MigrationContext _migrationContext) throws RapidException;

	/**
	 * TEST Purpose only. Register a plugin into Rapid Loader. This methods is a shortcut to reload the informations from RAPID when a plugin is added for debug
	 * purpose.
	 * Plugins should be added through a plugin scanner and the method reloadPlugins() invoked.
	 *
	 * @param plugin
	 *            the plugin
	 * @throws RapidException
	 */
	void registerPlugin(PluginDefinition plugin) throws RapidException;

	/**
	 * Register plugin scanner and invokes the reloading of RAPID.
	 *
	 * @param pluginScanner
	 *            the plugin scanner
	 */
	void registerPluginScanner(PluginScanner pluginScanner);

	/**
	 * Reload the plugins loaded by RAPID.
	 *
	 * @throws RapidException
	 *             the rapid exception if any problem occurred during the reload of the plugins
	 */
	void reloadPlugins() throws RapidException;

}