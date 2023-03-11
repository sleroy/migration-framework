package fr.echoeslabs.migration.api.sourceadapters;

/**
 * The Class SourceAdapterException defines the exception when a source adapter
 * is failing.
 */
public class SourceAdapterException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new source adapter exception.
	 */
	public SourceAdapterException() {
		this("Could not adapt the provided resource");
	}

	/**
	 * Instantiates a new source adapter exception.
	 *
	 * @param message
	 *            the message
	 */
	public SourceAdapterException(final String message) {
		super(message);

	}

	/**
	 * Instantiates a new source adapter exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public SourceAdapterException(final String message, final Throwable cause) {
		super(message, cause);

	}

	/**
	 * Instantiates a new source adapter exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 * @param enableSuppression
	 *            the enable suppression
	 * @param writableStackTrace
	 *            the writable stack trace
	 */
	public SourceAdapterException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	/**
	 * Instantiates a new source adapter exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public SourceAdapterException(final Throwable cause) {
		super(cause);

	}

}
