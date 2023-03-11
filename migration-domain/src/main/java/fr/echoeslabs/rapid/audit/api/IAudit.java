package fr.echoeslabs.rapid.audit.api;

import com.tocea.codewatch.platform.api.rule.Criticity;

import fr.echoeslabs.migration.api.migration.MigrationParameters;
import fr.echoeslabs.migration.api.sources.ISource;
import fr.echoeslabs.rapid.api.rules.IRapidRule;

// TODO: Auto-generated Javadoc
/**
 * The Interface IAudit defines the behaviour of a script offering to detect
 * code violations.
 *
 * @author sleroy
 */
public interface IAudit extends IRapidRule {

	/**
	 * Analysis the file and throws violations.
	 *
	 * @param _source
	 *            the _source
	 * @param _listener
	 *            the _listener
	 * @param _parameters
	 *            the _parameters
	 */
	void audit(ISource _source, IViolationListener _listener, MigrationParameters _parameters);

	/**
	 * Gets the criticity.
	 *
	 * @return the criticity
	 */
	public Criticity getCriticity();

	/**
	 * Gets the target.
	 *
	 * @return the target
	 */
	String getTarget();

}
