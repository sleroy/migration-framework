package fr.echoeslabs.migration.api.migration;

import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The Interface ISourceMigrationState defines the state of a source (a file)
 * after the refactoring/migration execution.
 *
 * @author sleroy
 */
public interface ISourceMigrationState {

	/**
	 * Marks the migration has failed
	 *
	 * @param explanation
	 *            the explanation
	 */
	void fail(String explanation);

	/**
	 * Marks the migration has failed.
	 *
	 * @param explanation
	 *            the explanation
	 * @param cause
	 *            the cause
	 */
	void fail(String explanation, Exception cause);

	/**
	 * Gets the failure explanation.
	 *
	 * @return the failure explanation
	 */
	SourceMigrationFailure getFailureExplanation();

	/**
	 * Gets the modifications on the source
	 *
	 * @return the modifications
	 */
	<T extends ISourceModification> T getModifications();

	/**
	 * Gets the source.
	 *
	 * @return the source
	 */
	ISource getSource();

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	SourceMigrationStateStatus getStatus();

	/**
	 * Gets the status name.
	 *
	 * @return the status name
	 */
	String getStatusName();

	/**
	 * Checks for changed
	 *
	 * @return true, if is modified, created or deleted
	 */
	boolean hasChanged();

	/**
	 * Checks for failed.
	 *
	 * @return true, if is failed
	 */
	boolean hasFailed();

	/**
	 * Checks if this source is modified (not created, not deleted) with real
	 * modifications (ignoring spaces, \t, \r, \n)
	 *
	 * @return true, if is modified with real modifications
	 */
	boolean hasModifiedCode();

	/**
	 * Checks if is created.
	 *
	 * @return true, if is created
	 */
	boolean isCreated();

	/**
	 * Checks if is deleted.
	 *
	 * @return true, if is deleted
	 */
	boolean isDeleted();

	/**
	 * Checks if this source is modified (not created, not deleted).
	 *
	 * @return true, if is modified
	 */
	boolean isModified();

	/**
	 * Checks if is successful (hasFailed = false)
	 *
	 * @return true, if is successful
	 */
	boolean isSuccessful();

	/**
	 * Apply refactoring based on a source modification.
	 *
	 * @param _modification
	 *            the _modification
	 */
	void modify(ISourceModification _modification);

}
