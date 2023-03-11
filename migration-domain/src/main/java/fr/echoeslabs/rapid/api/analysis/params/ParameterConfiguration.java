package fr.echoeslabs.rapid.api.analysis.params;

import java.util.List;

/**
 * The Interface ParameterConfiguration.
 *
 * @author sleroy
 */
public interface ParameterConfiguration {

	/**
	 * Gets the parameters of a refactoring
	 *
	 * @return the parameters
	 */
	List<Parameter> getParameters();

}
