package fr.echoeslabs.rapid.api.migration.repository;

import fr.echoeslabs.migration.utils.exception.RapidRuntimeException;

public class IllegalRepositoryException extends RapidRuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public IllegalRepositoryException(final String message) {
		super(message);
	}

	public IllegalRepositoryException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public IllegalRepositoryException(final Throwable cause) {
		super(cause);
	}

}
