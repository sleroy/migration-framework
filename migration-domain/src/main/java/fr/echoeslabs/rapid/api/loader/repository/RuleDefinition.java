package fr.echoeslabs.rapid.api.loader.repository;

import fr.echoeslabs.rapid.api.rules.RapidRuleDescription;

/**
 * The Interface RuleDefinition defines the rule definition and bean.
 */
public interface RuleDefinition extends BeanDeclaration {

	@Override
	String getBeanName();

	/**
	 * Gets the rapid rule description.
	 *
	 * @return the rapid rule description
	 */
	RapidRuleDescription getRapidRuleDescription();

	/**
	 * Checks if is analysis.
	 *
	 * @return true, if is analysis
	 */
	boolean isAnalysis();

	/**
	 * Checks if is audits.
	 *
	 * @return true, if is audits
	 */
	boolean isAudit();

	/**
	 * Checks if is migration.
	 *
	 * @return true, if is migration
	 */
	boolean isMigration();
}
