package fr.echoeslabs.rapid.api.analysis.params;

import fr.echoeslabs.migration.utils.exception.RapidException;

/**
 * The Class InvalidParameterTypeException.
 *
 * @author sleroy
 */
public class InvalidParameterTypeException extends RapidException {

	/**
	 *
	 */
	private static final long serialVersionUID = -788724423050180266L;

	/**
	 * Instantiates a new invalid parameter type exception.
	 *
	 * @param message
	 *            the message
	 */
	public InvalidParameterTypeException(final String message) {

		super(message);

	}

	/**
	 * Instantiates a new invalid parameter type exception.
	 *
	 * @param defaultValue
	 *            the default value
	 * @param requiredType
	 *            the required type
	 */
	public InvalidParameterTypeException(final String defaultValue, final ParameterType requiredType) {

		super("Value " + defaultValue + " with parameter type " + requiredType + " is not valid");
	}

	/**
	 * Instantiates a new invalid parameter type exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public InvalidParameterTypeException(final String message, final Throwable cause) {

		super(message, cause);

	}

	/**
	 * Instantiates a new invalid parameter type exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public InvalidParameterTypeException(final Throwable cause) {

		super(cause);

	}

}
