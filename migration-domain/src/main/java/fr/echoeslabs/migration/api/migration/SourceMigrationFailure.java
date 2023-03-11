package fr.echoeslabs.migration.api.migration;

/**
 * The Interface SourceMigrationFailure describes the reason of a failure during
 * a migration.
 *
 * @author sleroy
 */
public interface SourceMigrationFailure {

	/**
	 * Gets the cause.
	 *
	 * @return the cause
	 */
	Exception getCause();

	/**
	 * Gets the failure explanation.
	 *
	 * @return the failure explanation
	 */
	String getMessage();
}
