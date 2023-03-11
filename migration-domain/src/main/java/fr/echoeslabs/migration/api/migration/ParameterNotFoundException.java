package fr.echoeslabs.migration.api.migration;

import fr.echoeslabs.rapid.api.configuration.ParameterException;

/**
 * This exception is thrown when a parameter was not found.
 *
 * @author sleroy
 *
 */
public class ParameterNotFoundException extends ParameterException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public ParameterNotFoundException(final String message) {
		super(message);
		//
	}

	public ParameterNotFoundException(final String message, final Throwable cause) {
		super(message, cause);
		//
	}

	public ParameterNotFoundException(final Throwable cause) {
		super(cause);
		//
	}

}
