package fr.echoeslabs.migration.api.migration;

import java.io.File;
import java.util.Collection;
import java.util.List;

import fr.echoeslabs.migration.api.decoration.IDecoratedSource;

/**
 * The Interface IMigrationState defines the state of a migration and its
 * configuration parameters.
 *
 * @author sleroy
 */
public interface IMigrationState {

	/**
	 * Gets the failures.
	 *
	 * @return the failures
	 */
	List<SourceMigrationFailure> getFailures();

	/**
	 * Gets the source states.
	 *
	 * @return the source states
	 */
	Collection<ISourceMigrationState> getSourceStates();

	/**
	 * Use it to store date during the refactoring.
	 *
	 * @return
	 */
	TemporaryCache getTemporaryCache();

	/**
	 * Checks for failed.
	 *
	 * @return true, if successful
	 */
	boolean hasFailed();

	/**
	 * Checks if is successfull.
	 *
	 * @return true, if is successfull
	 */
	boolean isSuccessfull();

	/**
	 * Gets the source migration state for a new file to be produced.
	 *
	 * @param _newFile
	 *            the _new file
	 * @return the source migration state
	 */
	ISourceMigrationState newSourceMigrationState(File _newFile);

	/**
	 * Gets the source migration state for a given decorated source
	 *
	 * @param _source
	 *            the _source
	 * @return the source migration state
	 */
	ISourceMigrationState newSourceMigrationState(IDecoratedSource _source);
}
