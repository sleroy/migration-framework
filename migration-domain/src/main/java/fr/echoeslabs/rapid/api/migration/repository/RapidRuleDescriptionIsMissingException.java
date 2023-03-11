package fr.echoeslabs.rapid.api.migration.repository;

import fr.echoeslabs.migration.utils.exception.RapidRuntimeException;

/**
 * The Class RapidRuleDescriptionIsMissingException is launched when the description of a RAPID was not found.
 */
public class RapidRuleDescriptionIsMissingException extends RapidRuntimeException {

	/**
	 *
	 */
	private static final long	serialVersionUID					= 1L;
	private static final String	RAPID_RULE_DESCRIPTION_IS_MISSING	= "RAPID Rule description is missing : ";

	/**
	 * Instantiates a new rapid rule description is missing exception.
	 *
	 * @param message
	 *            the message
	 */
	public RapidRuleDescriptionIsMissingException(final String message) {
		super(RAPID_RULE_DESCRIPTION_IS_MISSING + message);
	}

	/**
	 * Instantiates a new rapid rule description is missing exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public RapidRuleDescriptionIsMissingException(final String message, final Throwable cause) {
		super(RAPID_RULE_DESCRIPTION_IS_MISSING + message, cause);
	}

	/**
	 * Instantiates a new rapid rule description is missing exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public RapidRuleDescriptionIsMissingException(final Throwable cause) {
		super(cause);
	}

}
