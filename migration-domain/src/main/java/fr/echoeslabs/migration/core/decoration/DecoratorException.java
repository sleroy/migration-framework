package fr.echoeslabs.migration.core.decoration;

import fr.echoeslabs.migration.utils.exception.RapidRuntimeException;

public class DecoratorException extends RapidRuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public DecoratorException(final String message) {
		super(message);
	}

	public DecoratorException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public DecoratorException(final Throwable cause) {
		super(cause);
	}

}
