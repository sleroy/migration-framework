package fr.echoeslabs.migration.api.migration;

import java.util.Map;

/**
 * The Interface IMigrationConfiguration defines the configuration of a
 * migration. Basically it is a map of parameters. e
 *
 * @author sleroy
 */
public interface IMigrationConfiguration {

	/**
	 * Gets the parameters.
	 *
	 * @return the parameters
	 */
	Map<String, Object> getAllParameters();

	/**
	 * Gets the parameter and checks its type.
	 *
	 * @param <T>
	 *            the generic type
	 * @param _name
	 *            the _name
	 * @return the parameter
	 */
	<T> T getParameter(String _name);

	/**
	 * Gets the parameters provided by a refactoring script.
	 *
	 * @param _refactoringClass
	 *            the _refactoring class
	 * @return the parameters
	 */
	Map<String, Object> getRefactoringParameters(Class<?> _refactoringClass);
}
