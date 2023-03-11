package fr.echoeslabs.fircosoft.continuity.refactorings;

import fr.echoeslabs.migration.utils.exception.RapidRuntimeException;

public class InvalidPathException extends RapidRuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -5349632869286465358L;

	public InvalidPathException(final String message) {

		super(message);
	}

	public InvalidPathException(final String message, final Throwable cause) {

		super(message, cause);
	}

	public InvalidPathException(final Throwable cause) {

		super(cause);
	}

}
