package fr.echoes.labs.rapid.api.extensions;

import fr.echoes.labs.pluginfwk.api.extension.Extension;
import fr.echoeslabs.rapid.api.analysis.params.ParameterConfiguration;

/**
 * The Interface ExtensionParameters allows to define parameters to a migration.
 */
public interface ExtensionParameters extends Extension {

	/**
	 * Returns the global configuration needed by these rules.
	 *
	 * @return the global configuration
	 */
	ParameterConfiguration getRepositoryConfiguration();

}
