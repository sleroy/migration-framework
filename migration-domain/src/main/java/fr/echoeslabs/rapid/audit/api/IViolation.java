package fr.echoeslabs.rapid.audit.api;

import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The Interface IViolation defines a violation found on code.
 *
 * @author sleroy
 */
public interface IViolation {

	/**
	 * Gets the column.
	 *
	 * @return the column
	 */
	int getColumn();

	/**
	 * Gets the line.
	 *
	 * @return the line
	 */
	int getLine();

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	String getMessage();

	/**
	 * Gets the source.
	 *
	 * @return the source
	 */
	ISource getSource();
}
