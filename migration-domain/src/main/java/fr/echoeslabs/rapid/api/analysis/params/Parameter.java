package fr.echoeslabs.rapid.api.analysis.params;

import org.apache.commons.lang3.Validate;

import fr.echoeslabs.rapid.api.rules.RapidParameter;

/**
 * The Class Parameter defines a refactoring parameter with its attribute.
 *
 * @author sleroy
 */
public class Parameter {

	/**
	 * The default value.
	 */
	private String			defaultValue;

	private String			description;

	/**
	 * The name.
	 */
	private String			name;

	/**
	 * The required type.
	 */
	private ParameterType	requiredType	= ParameterType.STRING;

	/**
	 * Instantiates a new parameter.
	 */
	public Parameter() {

		super();
	}

	/**
	 * This parameter is build from the annotation given as parameter
	 *
	 * @param rapidParameter
	 *            the annotation.
	 */
	public Parameter(final RapidParameter rapidParameter) {
		Validate.notNull(rapidParameter);
		this.name = rapidParameter.name();
		this.defaultValue = rapidParameter.defaultValue();
		this.description = rapidParameter.description();
		this.requiredType = rapidParameter.type();
	}

	/**
	 * Instantiates a new parameter.
	 *
	 * @param name
	 *            the name
	 * @param defaultValue
	 *            the default value
	 * @param requiredType
	 *            the required type
	 */
	public Parameter(final String name, final String defaultValue, final ParameterType requiredType) {

		super();
		this.name = name;
		this.defaultValue = defaultValue;
		this.requiredType = requiredType;
	}

	/**
	 * Instantiates a new parameter.
	 *
	 * @param name
	 *            the name
	 * @param defaultValue
	 *            the default value
	 * @param requiredTYpe
	 *            the required t ype
	 * @param description
	 *            the description
	 */
	public Parameter(final String name, final String defaultValue, final ParameterType requiredTYpe, final String description) {

		this(name, defaultValue, requiredTYpe);
		this.description = description;

	}

	/**
	 * Gets the default value.
	 *
	 * @return the default value
	 */
	public String getDefaultValue() {

		return this.defaultValue;
	}

	public String getDescription() {

		return this.description;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {

		return this.name;
	}

	/**
	 * Gets the required type.
	 *
	 * @return the required type
	 */
	public ParameterType getRequiredType() {

		return this.requiredType;
	}

	/**
	 * Sets the default value.
	 *
	 * @param defaultValue
	 *            the new default value
	 */
	public void setDefaultValue(final String defaultValue) {

		this.defaultValue = defaultValue;
	}

	public void setDescription(final String description) {

		this.description = description;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(final String name) {

		this.name = name;
	}

	/**
	 * Sets the required type.
	 *
	 * @param requiredType
	 *            the new required type
	 */
	public void setRequiredType(final ParameterType requiredType) {

		this.requiredType = requiredType;
	}

	@Override
	public String toString() {
		return "Parameter [defaultValue=" + this.defaultValue + ", description=" + this.description + ", name=" + this.name + ", requiredType="
				+ this.requiredType + "]";
	}
}
