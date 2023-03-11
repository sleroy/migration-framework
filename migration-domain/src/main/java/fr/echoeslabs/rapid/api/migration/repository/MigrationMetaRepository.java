/*
 *
 */
package fr.echoeslabs.rapid.api.migration.repository;

import fr.echoeslabs.rapid.api.analysis.params.ParameterConfiguration;
import fr.echoeslabs.rapid.api.rules.RapidRuleDescription;

/**
 * The Interface MigrationMetaRepository defines the migration meta repository.
 *
 * @author sleroy
 */
public interface MigrationMetaRepository {

	/**
	 * Returns the rapid rule description from its name.
	 *
	 * @throws RuleNotFoundException
	 */
	public RapidRuleDescription findRuleDescription(String ruleName) throws RuleNotFoundException;

	/**
	 * Gets the global configuration.
	 *
	 * @return the global configuration
	 */
	public ParameterConfiguration getGlobalConfiguration();

	/**
	 * Gets the rapid rule descriptions.
	 *
	 * @return the rapid rule descriptions
	 */
	public RapidRuleDescriptions getRapidRuleDescriptions();

	/**
	 * Reload definitions from the plugins.
	 *
	 * @throws RuleAlreadyExistingException
	 */
	public void reloadDefinitions() throws RuleAlreadyExistingException;
}
