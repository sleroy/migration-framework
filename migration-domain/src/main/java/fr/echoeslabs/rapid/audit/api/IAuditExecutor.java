/*
 *
 */
package fr.echoeslabs.rapid.audit.api;

import java.io.File;
import java.util.Collection;

import fr.echoeslabs.migration.utils.progressmonitor.ProgressMonitor;

/**
 * The Interface IAuditExecutor. allows to launch an audit.
 *
 * @author sleroy
 */
public interface IAuditExecutor {

	/**
	 * Launch audit.
	 *
	 * @param audit
	 *            the audit
	 * @param files
	 *            the files
	 * @param configuration
	 *            the configuration
	 * @param _progressMonitor
	 *            the _progress monitor
	 * @param _violationListener
	 *            the _violation listener
	 */
	void launch(Collection<File> files, ProgressMonitor _progressMonitor, final IViolationListener _listener);

}
