package fr.echoeslabs.rapid.audit.api;

import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The listener interface for receiving IViolation events. The class that is
 * interested in processing a IViolation event implements this interface, and
 * the object created with that class is registered with a component using the
 * component's <code>addIViolationListener<code> method. When the IViolation
 * event occurs, that object's appropriate method is invoked.
 *
 * @see IViolationEvent
 */
public interface IViolationListener {

	/**
	 * Begin execution of an audit
	 */
	void beginExecution();

	/**
	 * End the execution of an audit.
	 */
	void endExecution();

	/**
	 * Notify violation.
	 *
	 * @param _violation
	 *            the _violation
	 * @param line
	 *            the line
	 * @param column
	 *            the column
	 * @param message
	 *            the message
	 */
	void notifyViolation(ISource _violation, int line, int column, String message);

	/**
	 * Notify violation.
	 *
	 * @param _violation
	 *            the _violation
	 */
	void notifyViolation(IViolation _violation);

}
