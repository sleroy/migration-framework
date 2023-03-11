package fr.echoeslabs.rapid.api.migration.repository;

import fr.echoeslabs.migration.utils.exception.RapidException;

/**
 * The Class RuleNotFoundException is thrown when a rule was not found after
 * request.
 */
public class RuleNotFoundException extends RapidException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new rule not found exception.
	 *
	 * @param ruleName
	 *            the rule name
	 */
	public RuleNotFoundException(final String ruleName) {
		this(ruleName, null);
	}

	/**
	 * Instantiates a new rule not found exception.
	 *
	 * @param _ruleName
	 *            the _rule name
	 * @param e
	 *            the exception
	 */
	public RuleNotFoundException(final String _ruleName, final Exception e) {
		super("Rule " + _ruleName + " was not found", e);
	}

}
