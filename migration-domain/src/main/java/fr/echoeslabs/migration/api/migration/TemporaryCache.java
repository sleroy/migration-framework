package fr.echoeslabs.migration.api.migration;

/**
 * The Interface TemporaryCache describes a temporary cache used to store
 * informations during refactoring.
 *
 * @author sleroy
 */
public interface TemporaryCache {

	/**
	 * Tests if a parameter exists.
	 *
	 * @param _parameterName
	 *            the _parameter name
	 * @return true, if successful
	 */
	boolean exists(String _parameterName);

	/**
	 * Gets the parameter.
	 *
	 * @param _parameterName
	 *            the _parameter name
	 * @return the parameter
	 */
	Object get(String _parameterName);

	/**
	 * Gets the parameter and controls its type.
	 *
	 * @param <T>
	 *            the generic type
	 * @param _parameterName
	 *            the parameter name
	 * @param _expectedType
	 *            the class1
	 * @return the string
	 */
	<T> T get(String _parameterName, Class<T> _expectedType);

	/**
	 * Put an object into the cache.
	 *
	 * @param _paramKey
	 *            the _param key
	 * @param _object
	 *            the _object
	 */
	void put(String _paramKey, Object _object);
}
