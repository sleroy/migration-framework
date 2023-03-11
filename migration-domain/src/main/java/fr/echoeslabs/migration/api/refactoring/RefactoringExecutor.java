package fr.echoeslabs.migration.api.refactoring;

import fr.echoeslabs.migration.api.decoration.IDecoratedSource;
import fr.echoeslabs.migration.api.migration.IMigrationState;

/**
 * The Interface RefactoringExecutor defines a component that halps the RAPID
 * SDK Developer to execute refactoring scripts.
 *
 * @author sleroy
 */
public interface RefactoringExecutor {

	/**
	 * Apply.
	 *
	 * @param _refactoring
	 *            the _refactoring
	 * @param _source
	 *            the _source
	 * @warning It never returns exception, they are handled properly
	 */
	void apply(IRefactoring _refactoring, IDecoratedSource _source);

	/**
	 * Gets the migration state.
	 *
	 * @return the migration state
	 */
	IMigrationState getMigrationState();

	/**
	 * Decorate refactoring parameters using source decorations.
	 *
	 * @param _refactoring
	 *            the _refactoring
	 * @param _source
	 *            the _source
	 * @return the dynamic parameter configuration
	 * @warning It never returns exception, they are handled properly
	 */
	DynamicParameterConfiguration requestDynamicParameters(IRefactoring _refactoring, IDecoratedSource _source);
}
