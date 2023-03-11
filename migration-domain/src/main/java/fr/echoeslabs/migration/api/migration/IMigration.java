package fr.echoeslabs.migration.api.migration;

import java.util.Collection;

import fr.echoeslabs.migration.api.decoration.IDecoratedSource;
import fr.echoeslabs.migration.api.refactoring.RefactoringExecutor;
import fr.echoeslabs.migration.utils.progressmonitor.ProgressMonitor;
import fr.echoeslabs.rapid.api.rules.IRapidRule;

/**
 * A migration can apply a collection of refactorings on a collection of
 * sources. Migration will be processed following a migration algorithm.
 *
 * @author antoine
 *
 */
public interface IMigration extends IRapidRule {

	/**
	 * Compute and apply a text transformation for each analyzed source.
	 *
	 * @param sources
	 *            analyzed sources
	 * @param _refactoringExecutor
	 *            the _refactoring executor is a component to execute
	 *            refactoring scripts and handle exceptions
	 * @param monitor
	 *            the monitor
	 */
	void migrate(Collection<? extends IDecoratedSource> sources, RefactoringExecutor _refactoringExecutor, ProgressMonitor monitor);

	/**
	 * Generates the dynamic parameters of a migration if any.
	 *
	 * @param sources
	 *            analyzed sources
	 * @param _refactoringExecutor
	 *            the _refactoring executor is a component to execute
	 *            refactoring scripts and handle exceptions
	 * @param monitor
	 *            the monitor
	 */
	void requestDynamicParameters(Collection<? extends IDecoratedSource> sources, RefactoringExecutor _refactoringExecutor, ProgressMonitor monitor);

}
