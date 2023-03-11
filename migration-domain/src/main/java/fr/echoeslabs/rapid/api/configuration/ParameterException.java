package fr.echoeslabs.rapid.api.configuration;

import fr.echoeslabs.migration.utils.exception.RapidRuntimeException;

/**
 * The Class ParameterException describes an exception associated to a rule
 * parameter.
 *
 * @author sleroy
 */
public class ParameterException extends RapidRuntimeException {

	private static final long serialVersionUID = 5363254091787686583L;

	public ParameterException(final String message) {

		super(message);
	}

	public ParameterException(final String message, final Throwable cause) {

		super(message, cause);
	}

	public ParameterException(final Throwable cause) {

		super(cause);
	}

}
