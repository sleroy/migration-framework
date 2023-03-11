package fr.echoeslabs.migration.core.refactoring;

import java.text.MessageFormat;

import fr.echoeslabs.rapid.api.analysis.params.Parameter;
import fr.echoeslabs.rapid.api.analysis.params.ParameterType;
import fr.echoeslabs.rapid.api.configuration.ParameterException;

/**
 * The Class InvalidParameterException is thrown when a parameter is invalid.
 *
 * @author sleroy
 */
public class InvalidParameterException extends ParameterException {

	private static final long serialVersionUID = -4848137035332510601L;

	public InvalidParameterException(final Parameter parameter, final Throwable cause) {
		this(parameter.getName(), parameter.getDefaultValue(), parameter.getRequiredType(), cause);
	}

	/**
	 * Instantiates a new invalid parameter exception.
	 *
	 * @param message
	 *            the message
	 */
	public InvalidParameterException(final String message) {

		super(message);
	}

	/**
	 * Instantiates a new invalid parameter exception.
	 *
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 * @param requiredType
	 *            the required type
	 */
	public InvalidParameterException(final String key, final Object value, final ParameterType requiredType, final Throwable cause) {

		super(MessageFormat.format("Parameter with name {0} and value {1} (class={3}) with parameter type {2} is invalid. Maybe the defaultValue is invalid.",
				key, value, requiredType, value == null ? "<null>" : value.getClass()), cause);
	}

	public InvalidParameterException(final Throwable cause) {

		super(cause);

	}

}
