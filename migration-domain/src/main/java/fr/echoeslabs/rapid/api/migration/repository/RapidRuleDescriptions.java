
package fr.echoeslabs.rapid.api.migration.repository;

import java.util.Collection;
import java.util.List;

import fr.echoeslabs.rapid.api.loader.repository.RuleDefinition;
import fr.echoeslabs.rapid.api.rules.RapidRuleDescription;

/**
 * The Interface RapidRuleDescriptions defines the list of rapid rules loaded.
 */
public interface RapidRuleDescriptions {

	/**
	 * Adds the rule description.
	 *
	 * @param ruleDefinition
	 *            the rule definition
	 */
	void addRuleDescription(RuleDefinition ruleDefinition);

	/**
	 * Clear the rules.
	 */
	void clear();

	/**
	 * Gets the rule with the given name.
	 *
	 * @param ruleName
	 *            the rule name
	 * @return the rapid rule description
	 * @throws RuleNotFoundException
	 *             the rule not found exception
	 */
	RuleDefinition findRuleDefinition(String ruleName) throws RuleNotFoundException;

	/**
	 * Gets the rule with the given name.
	 *
	 * @param ruleName
	 *            the rule name
	 * @return the rapid rule description
	 * @throws RuleNotFoundException
	 *             the rule not found exception
	 */
	RapidRuleDescription findRuleDescription(String ruleName) throws RuleNotFoundException;

	/**
	 * Gets the migrations.
	 *
	 * @return the migrations
	 */
	List<RapidRuleDescription> getAnalyses();

	/**
	 * Gets the migrations.
	 *
	 * @return the migrations
	 */
	List<RapidRuleDescription> getAudits();

	/**
	 * Gets the descriptions.
	 *
	 * @return the descriptions
	 */
	Collection<RapidRuleDescription> getDescriptions();

	/**
	 * Gets the migrations.
	 *
	 * @return the migrations
	 */
	List<RapidRuleDescription> getMigrations();

	/**
	 * Gets the rule definitions.
	 *
	 * @return the rule definitions
	 */
	Collection<RuleDefinition> getRuleDefinitions();

	/**
	 * Checks if is rule loaded.
	 *
	 * @param key
	 *            the key
	 * @return true, if is rule loaded
	 */
	boolean isRuleLoaded(String key);

	/**
	 * Number of rules.
	 *
	 * @return the number of rules loaded and present in Rapid.
	 */
	int numberOfRules();

	/**
	 * Register a rule already presents as a bean.
	 *
	 * @param beanName
	 *            the bean name
	 * @param rapidRuleDescription
	 *            the rapid rule description
	 * @throws RuleAlreadyExistingException
	 *             the rule already existing exception
	 */
	void registerSpringBeanAsRule(String beanName, RapidRuleDescription rapidRuleDescription) throws RuleAlreadyExistingException;

	/**
	 * Reload the rule definitions.
	 *
	 * @throws RuleAlreadyExistingException
	 */
	void reloadTheRuleDefinitions() throws RuleAlreadyExistingException;

}