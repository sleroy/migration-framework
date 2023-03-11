/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.echoeslabs.rapid.api.migration.repository;

import fr.echoeslabs.migration.api.decoration.Decorators;
import fr.echoeslabs.migration.api.migration.IMigration;
import fr.echoeslabs.migration.api.migration.MigrationParameters;
import fr.echoeslabs.migration.api.sourceadapters.SourceAdapters;
import fr.echoeslabs.rapid.api.analysis.IAnalysis;
import fr.echoeslabs.rapid.audit.api.IAudit;

/**
 * Defines the components offered by RAPID once the repository definitions are
 * loaded and an migration context provided.
 *
 * @author sleroy
 */
public interface MigrationRepository {

	/**
	 * Gets the analysis for the given name.
	 *
	 * @param <T>
	 *            the generic type
	 * @param selectedRuleName
	 *            the selected rule name
	 * @return the analysis
	 * @throws RuleNotFoundException
	 *             the rule not found exception
	 */
	<T extends IAnalysis> T getAnalysis(String selectedRuleName) throws RuleNotFoundException;

	/**
	 * Gets the audit.
	 *
	 * @param <T>
	 *            the generic type
	 * @param selectedRuleName
	 *            the selected rule name
	 * @return the audit
	 * @throws RuleNotFoundException
	 *             the rule not found exception
	 */
	<T extends IAudit> T getAudit(String selectedRuleName) throws RuleNotFoundException;

	/**
	 * Gets a specific bean.
	 *
	 * @param <T>
	 *            the generic type
	 * @param class1
	 *            the class 1
	 * @return the bean
	 */
	<T> T getBean(Class<T> class1);

	/**
	 * Gets the migration for the given name.
	 *
	 * @param <T>
	 *            the generic type
	 * @param selectedRuleName
	 *            the selected rule name
	 * @return the migration
	 * @throws RuleNotFoundException
	 *             the rule not found exception
	 */
	<T extends IMigration> T getMigration(String selectedRuleName) throws RuleNotFoundException;

	/**
	 * Gets the configuration of the migration.
	 *
	 * @return the configuration
	 */
	MigrationParameters getParameters();

	/**
	 * New decorators.
	 *
	 * @return the decorators
	 */
	Decorators newDecorators();

	/**
	 * New source adapters.
	 *
	 * @return the source adapters
	 */
	SourceAdapters newSourceAdapters();

}
