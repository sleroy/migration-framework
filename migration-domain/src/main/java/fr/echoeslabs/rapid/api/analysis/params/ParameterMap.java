package fr.echoeslabs.rapid.api.analysis.params;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ParameterMap is a wrapper above a parameter map.
 *
 * @author sleroy
 */
public class ParameterMap {

	private static final Logger				LOGGER		= LoggerFactory.getLogger(ParameterMap.class);

	private final Map<String, Parameter>	parameters	= new HashMap<>();

	/**
	 * Instantiates a new parameter map.
	 *
	 * @param dynamicConfiguration
	 *            the dynamic configuration
	 */
	public ParameterMap(final ParameterConfiguration dynamicConfiguration) {

		for (final Parameter param : dynamicConfiguration.getParameters()) {
			LOGGER.debug("assign param {}", param.getName());
			this.parameters.put(param.getName(), param);
		}
	}

	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	public Map<String, Parameter> getMap() {

		return Collections.unmodifiableMap(this.parameters);
	}

	/**
	 * Gets the parameter.
	 *
	 * @param _parameterName
	 *            the _parameter name
	 * @return the parameter
	 */
	public Parameter getParameter(final String _parameterName) {

		return this.parameters.get(_parameterName);
	}

	/**
	 * Checks for parameter.
	 *
	 * @param prefixJsFile
	 *            the prefix js file
	 * @return true, if successful
	 */
	public boolean hasParameter(final String prefixJsFile) {

		return this.parameters.containsKey(prefixJsFile);
	}

}
