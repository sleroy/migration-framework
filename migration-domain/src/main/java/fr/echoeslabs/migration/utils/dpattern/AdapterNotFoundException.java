package fr.echoeslabs.migration.utils.dpattern;

import fr.echoeslabs.migration.utils.exception.RapidRuntimeException;

/**
 * The Class AdapterNotFoundException is thrown when no adapter is found for the
 * given requested functionality.
 *
 * @author sleroy
 */
public class AdapterNotFoundException extends RapidRuntimeException {

	private static final long serialVersionUID = 368454524363218187L;

	/**
	 * Instantiates a new adapter not found exception.
	 *
	 * @param message
	 *            the message
	 */
	public AdapterNotFoundException(final String message) {

		super(message);
	}

	/**
	 * Instantiates a new adapter not found exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public AdapterNotFoundException(final String message, final Throwable cause) {

		super(message, cause);
	}

	/**
	 * Instantiates a new adapter not found exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public AdapterNotFoundException(final Throwable cause) {

		super(cause);
		//
	}

}
