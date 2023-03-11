package fr.echoeslabs.migration.api.sources;

import fr.echoeslabs.migration.utils.exception.RapidRuntimeException;

/**
 * The Class SourceContentException is thrown when the content of a source could
 * not be fetched.
 *
 * @author sleroy
 */
public class SourceContentException extends RapidRuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -1814398823323341929L;

	/**
	 * Instantiates a new source content exception.
	 *
	 * @param message
	 *            the message
	 */
	public SourceContentException(final String message) {
		super(message);
	}

	/**
	 * Instantiates a new source content exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public SourceContentException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new source content exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public SourceContentException(final Throwable cause) {
		super(cause);
	}

}
