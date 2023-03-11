package fr.echoeslabs.migration.api.refactoring;

import fr.echoeslabs.migration.api.decoration.IDecoratedSource;
import fr.echoeslabs.migration.api.migration.IMigrationState;
import fr.echoeslabs.rapid.api.analysis.params.InvalidParameterTypeException;

/**
 * The Interface IRefactoring defines a script that implements a refactoring.
 * The refactoring has to be applied on a single source.
 *
 * @author sleroy
 */
public interface IRefactoring {

	/**
	 * Refactor the given source.
	 *
	 * @param source
	 *            the source
	 * @param state
	 *            the state
	 * @throws Exception
	 *             the exception
	 */
	void refactor(IDecoratedSource source, IMigrationState state) throws Exception;

	/**
	 * Adds new parameters to the migrations
	 *
	 * @param _source
	 *            the _source
	 * @param _configuration
	 *            the _ configuration
	 * @throws InvalidParameterTypeException
	 */
	void requestDynamicParameters(IDecoratedSource _source, DynamicParameterConfiguration _configuration) throws InvalidParameterTypeException;

}
