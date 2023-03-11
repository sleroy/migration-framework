package fr.echoeslabs.migration.core.refactoring;

import fr.echoeslabs.migration.utils.exception.RapidRuntimeException;

public class RollbackException extends RapidRuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public RollbackException(final String message) {
		super(message);
	}

	public RollbackException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public RollbackException(final Throwable cause) {
		super(cause);
	}

}
