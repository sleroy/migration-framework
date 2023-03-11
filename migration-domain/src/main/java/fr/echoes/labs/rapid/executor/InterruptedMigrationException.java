package fr.echoes.labs.rapid.executor;

import fr.echoeslabs.migration.utils.exception.RapidRuntimeException;

public class InterruptedMigrationException extends RapidRuntimeException {

	/**
	 *
	 */
	private static final long	serialVersionUID					= 1L;
	private static final String	THE_MIGRATION_HAS_BEEN_INTERRUPTED	= "The migration has been interrupted";

	public InterruptedMigrationException(final String message) {
		super(THE_MIGRATION_HAS_BEEN_INTERRUPTED);
	}

	public InterruptedMigrationException(final String message, final Throwable cause) {
		super(THE_MIGRATION_HAS_BEEN_INTERRUPTED + "\n" + message, cause);
	}

	public InterruptedMigrationException(final Throwable cause) {
		super(THE_MIGRATION_HAS_BEEN_INTERRUPTED, cause);
	}

}
