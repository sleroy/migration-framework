package fr.echoes.labs.rapid.api.extensions;

import java.util.List;

import fr.echoes.labs.pluginfwk.api.extension.Extension;
import fr.echoeslabs.rapid.api.loader.repository.RuleDefinition;

/**
 * The Interface ExtensionRules defines an extension to declare new rules inside RAPID. These rules are accessible with the CLI.
 */
public interface ExtensionRules extends Extension {

	/**
	 * Gets the rule definitions.
	 *
	 * @return the rule definitions
	 */
	public List<? extends RuleDefinition> getRuleDefinitions();

}
