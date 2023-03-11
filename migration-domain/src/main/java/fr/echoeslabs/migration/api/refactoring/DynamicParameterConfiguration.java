/**
 * @author sleroy
 */
package fr.echoeslabs.migration.api.refactoring;

import java.util.List;

import fr.echoeslabs.rapid.api.analysis.params.InvalidParameterTypeException;
import fr.echoeslabs.rapid.api.analysis.params.Parameter;
import fr.echoeslabs.rapid.api.analysis.params.ParameterConfiguration;
import fr.echoeslabs.rapid.api.analysis.params.ParameterType;

/**
 * The Interface DynamicParameterConfiguration allows a refactoring script to
 * declares new parameters for the configuration.
 *
 * @author sleroy
 */
public interface DynamicParameterConfiguration extends ParameterConfiguration {

	/**
	 * Adds the parameter to the dynamic configuration.
	 *
	 * @param _parameter
	 *            the _parameter
	 * @throws InvalidParameterTypeException
	 */
	void addParameter(Parameter _parameter) throws InvalidParameterTypeException;

	/**
	 * Adds the parameter.
	 *
	 * @param name
	 *            the name
	 * @param defaultValue
	 *            the default value
	 * @param _type
	 *            the _type
	 * @throws InvalidParameterTypeException
	 */
	void addParameter(String name, String defaultValue, ParameterType _type) throws InvalidParameterTypeException;

	/**
	 * Adds the parameters.
	 *
	 * @param _parameters
	 *            the _parameters
	 * @throws InvalidParameterTypeException
	 */
	void addParameters(List<Parameter> _parameters) throws InvalidParameterTypeException;
}
