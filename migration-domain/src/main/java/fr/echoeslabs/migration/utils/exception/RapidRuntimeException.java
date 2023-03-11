package fr.echoeslabs.migration.utils.exception;

/**
 * The Class MigrationException is triggered when an exception occured inside
 * the migration framework.
 */
public class RapidRuntimeException extends RuntimeException {

	private static final String	RAPID_FRAMEWORK		= "RAPID Framework\n";
	private static final long	serialVersionUID	= -8188618139077818486L;

	/**
	 * Instantiates a new migration exception.
	 *
	 * @param message
	 *            the message
	 */
	public RapidRuntimeException(final String message) {

		super(RAPID_FRAMEWORK + message);
	}

	/**
	 * Instantiates a new migration exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public RapidRuntimeException(final String message, final Throwable cause) {

		super(RAPID_FRAMEWORK + message + ": " + cause.getMessage(), cause);

	}

	/**
	 * Instantiates a new migration exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public RapidRuntimeException(final Throwable cause) {

		super(RAPID_FRAMEWORK, cause);
	}

}
