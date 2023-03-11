package fr.echoeslabs.rapid.api.analysis.params;

import java.io.File;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.echoeslabs.migration.core.refactoring.InvalidParameterException;

// TODO: Auto-generated Javadoc
/**
 * The Enum ParameterType defines all kind of parameter types allowed by a
 * refactoring parameter.
 *
 * @author sleroy
 */
public enum ParameterType {

	/** The file; must exist */
	INPUT_FILE() {

		@Override
		public Object parseString(final String value) {

			return new File(value);
		}
	},
	/** folder; must exist **/
	INPUT_FOLDER() {

		@Override
		public Object parseString(final String value) {

			return new File(value);
		}
	},
	/** folder; **/
	OUTPUT_FILE() {

		@Override
		public Object parseString(final String value) {

			return new File(value);
		}
	},
	/** folder; **/
	OUTPUT_FOLDER() {

		@Override
		public Object parseString(final String value) {

			return new File(value);
		}
	},
	/** The output file path. */
	OUTPUT_FILE_PATH,
	/** The output fodler path. */
	OUTPUT_FOLDER_PATH,

	/** The float. */
	FLOAT {

		@Override
		public Object parseString(final String value) {

			return Float.parseFloat(value);
		}
	},
	/** The integer. */
	INTEGER {

		@Override
		public Object parseString(final String value) {
			return Integer.valueOf(value);
		}
	},
	/** The string. */
	STRING;

	private static final Logger LOGGER = LoggerFactory.getLogger(ParameterType.class);

	/**
	 * Checks the parameter value type.
	 *
	 * @param _value
	 *            the _value
	 * @param _requiredType
	 *            the _required type
	 * @return true, if is required
	 */
	public static boolean checkParameterValueType(final Object _value, final ParameterType _requiredType) {

		switch (_requiredType) {
		case INPUT_FILE:
			return _value instanceof File && ((File) _value).exists() && ((File) _value).isFile();
		case INPUT_FOLDER:
			return _value instanceof File && ((File) _value).exists() && ((File) _value).isDirectory();
		case OUTPUT_FILE:
			return _value instanceof File && (!((File) _value).exists() || ((File) _value).isFile());
		case OUTPUT_FOLDER:
			return _value instanceof File && (!((File) _value).exists() || ((File) _value).isDirectory());
		case OUTPUT_FILE_PATH:
			return _value instanceof String && (!new File((String) _value).exists() || new File((String) _value).isFile());
		case OUTPUT_FOLDER_PATH:
			return _value instanceof String && (!new File((String) _value).exists() || new File((String) _value).isDirectory());
		case FLOAT:
			return _value instanceof Float;
		case INTEGER:
			return _value instanceof Integer;
		case STRING:
			return _value instanceof String;
		default:
			return false;

		}
	}

	/**
	 * Convert the parameter with the parameter type to the final object.
	 *
	 * @param value
	 *            the default value
	 * @param requiredType
	 *            the required type
	 * @return the object
	 * @throws InvalidParameterTypeException
	 */
	public static Object convert(final String value, final ParameterType requiredType) throws InvalidParameterTypeException {
		Validate.notNull(requiredType);
		Validate.notNull(value);
		switch (requiredType) {
		case INPUT_FILE:
		case INPUT_FOLDER:
		case OUTPUT_FOLDER:
		case OUTPUT_FILE:
			return new File(FilenameUtils.normalize(value));
		case OUTPUT_FILE_PATH:
		case OUTPUT_FOLDER_PATH:
			return FilenameUtils.normalize(value);
		case FLOAT:
			try {
				return Float.parseFloat(value);
			} catch (final NumberFormatException e) {
				LOGGER.debug("Could not convert the float value '{}'", value, e);
				throw new InvalidParameterTypeException(value, requiredType);
			}
		case INTEGER:
			try {
				return Integer.parseInt(value);
			} catch (final NumberFormatException e) {
				LOGGER.debug("Could not convert the integer value '{}'", value, e);
				throw new InvalidParameterTypeException(value, requiredType);
			}
		case STRING:
			return value;

		}
		return requiredType;
	}
	/**
	 * Convert default value of a parameter to an object.
	 *
	 * @param parameter
	 *            the parameter
	 * @return the object
	 * @throws InvalidParameterTypeException
	 */
	public static Object convertDefaultValue(final Parameter parameter) throws InvalidParameterException {
		try {
			final Object convert = convert(parameter.getDefaultValue(), parameter.getRequiredType());
			return convert;
		} catch (final InvalidParameterTypeException e) {
			throw new InvalidParameterException(parameter, e);
		}

	}
	public Object parseString(final String value) {

		return value;
	}
}
