package fr.echoeslabs.rapid.api.refactoring;

import java.io.File;
import java.util.Collection;

import fr.echoeslabs.migration.api.migration.IMigrationState;
import fr.echoeslabs.migration.api.refactoring.RefactoringException;
import fr.echoeslabs.migration.utils.progressmonitor.ProgressMonitor;

/**
 * The Interface IMigrationExecutor defines the component to execution a
 * migration. Uses the define methods to initialize the component.
 *
 * @author sleroy
 */
public interface IRefactoringExecutor {

	/**
	 * Launch the refactoring.
	 *
	 * @param files
	 *            the files
	 * @param listener
	 *            the listener
	 * @return the migration state
	 * @throws RefactoringException
	 *             the refactoring exception
	 */
	IMigrationState launch(Collection<File> files, ProgressMonitor listener) throws RefactoringException;

}