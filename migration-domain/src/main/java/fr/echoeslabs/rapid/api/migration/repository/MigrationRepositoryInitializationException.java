package fr.echoeslabs.rapid.api.migration.repository;

import fr.echoeslabs.migration.utils.exception.RapidException;

/**
 * The Class MigrationInitializationException is thrown when the migration
 * repository could not be initialized.
 */
public class MigrationRepositoryInitializationException extends RapidException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new migration initialization exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public MigrationRepositoryInitializationException(final String _message, final Throwable cause) {
		super("Migration repository could not be initialized :\n\t->" + _message, cause);
	}

	/**
	 * Instantiates a new migration initialization exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public MigrationRepositoryInitializationException(final Throwable cause) {
		super("Migration repository could not be initialized.", cause);
	}

}
