package fr.echoes.labs.rapid.executor;

import fr.echoeslabs.migration.utils.exception.RapidException;
import fr.echoeslabs.rapid.api.analysis.IAnalysisExecutor;
import fr.echoeslabs.rapid.api.migration.RuleMigrationContext;
import fr.echoeslabs.rapid.api.refactoring.IRefactoringExecutor;
import fr.echoeslabs.rapid.audit.api.IAuditExecutor;

/**
 * A factory for creating Executor objects.
 */
public interface ExecutorFactoryService {

	/**
	 * New analysis executor.
	 *
	 * @param _QuickMigrationContext
	 *            the _migration context
	 * @return the i analysis executor service
	 * @throws RapidException
	 *             the rapid exception
	 */
	IAnalysisExecutor newAnalysisExecutor(RuleMigrationContext _QuickMigrationContext) throws RapidException;

	/**
	 * New audit executor.
	 *
	 * @param _QuickMigrationContext
	 *            the _migration context
	 * @return the i audit executor service
	 * @throws RapidException
	 *             the rapid exception
	 */
	IAuditExecutor newAuditExecutor(RuleMigrationContext _QuickMigrationContext) throws RapidException;

	/**
	 * Refactor.
	 *
	 * @param _QuickMigrationContext
	 *            the _migration context
	 * @return the i refactoring executor service
	 * @throws RapidException
	 *             the rapid exception
	 */
	IRefactoringExecutor newRefactoringExecutor(RuleMigrationContext _QuickMigrationContext) throws RapidException;

}
