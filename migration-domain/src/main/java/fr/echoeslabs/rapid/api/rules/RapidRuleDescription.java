package fr.echoeslabs.rapid.api.rules;

import java.util.List;

import fr.echoeslabs.rapid.api.analysis.params.Parameter;

/**
 * The Interface RapidRuleDescription defines the description of our rule.
 */
public interface RapidRuleDescription {

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	String getDescription();

	/**
	 * Gets the label.
	 *
	 * @return the label
	 */
	String getKey();

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Gets the parameters.
	 *
	 * @return the parameters
	 */
	List<Parameter> getParameters();

	/**
	 * Gets the type of the rule. (REFACTORING, AUDIT, ANALYSIS)
	 *
	 * @return the type
	 */
	RapidRuleType getType();

}
