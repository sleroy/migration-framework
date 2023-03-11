/*
 *
 */
package fr.echoeslabs.migration.api.migration;

import java.util.Map;
import java.util.Properties;

/**
 * The Interface MigrationParameters.
 *
 * @author sleroy
 */
public interface MigrationParameters {

	/**
	 * Tests if the container contains the parameter with the given key.
	 *
	 * @param key
	 *            the key
	 * @return true, if successful
	 */
	boolean contains(String key);

	/**
	 * Gets the parameter for the given key.
	 *
	 * @param key
	 *            the key
	 * @return the object
	 */
	Object get(String key);

	/**
	 * Inject properties.
	 *
	 * @param properties
	 *            the properties
	 */
	void injectProperties(Properties properties);

	/**
	 * Adds a property to the list of the migration parameters.
	 *
	 * @param paramKey
	 *            the param key
	 * @param paramValue
	 *            the param value
	 */
	void put(String paramKey, Object paramValue);

	/**
	 * Put all parameters.
	 *
	 * @param _migrationParameters
	 *            the migration parameters
	 */
	void putAllParameters(Map<String, ?> _migrationParameters);

}
