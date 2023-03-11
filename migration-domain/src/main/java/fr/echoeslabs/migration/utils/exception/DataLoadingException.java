package fr.echoeslabs.migration.utils.exception;

public class DataLoadingException extends RapidRuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public DataLoadingException(final String message) {
		super(message);
		//
	}

	public DataLoadingException(final String message, final Throwable cause) {
		super(message, cause);
		//
	}

	public DataLoadingException(final Throwable cause) {
		super(cause);
		//
	}

}
