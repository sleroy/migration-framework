package fr.echoes.labs.rapid.api.loader.repository;

import java.util.List;

import fr.echoeslabs.rapid.api.loader.repository.BeanDeclaration;
import fr.echoeslabs.rapid.api.loader.repository.RuleDefinition;

// TODO: Auto-generated Javadoc
/**
 * The Interface BeanDeclarationCatalog.
 */
public interface BeanDeclarationCatalog {

	/**
	 * Adds the beans to catalog.
	 *
	 * @param _beanDeclarations
	 *            the bean declarations.
	 */
	void addBeansToCatalog(List<? extends BeanDeclaration> _beanDeclarations);

	/**
	 * Adds the rules to catalog.
	 *
	 * @param _ruleDefinitions
	 *            the rule definitions
	 */
	void addRulesToCatalog(List<? extends RuleDefinition> _ruleDefinitions);

	/**
	 * Adds the scanned packages.
	 *
	 * @param _scannedPackages
	 *            the _scanned packages
	 */
	void addScannedPackages(String[] _scannedPackages);

	/**
	 * Clear the bean definitions.
	 */
	void clear();

	/**
	 * Gets the bean declarations.
	 *
	 * @return the beans
	 */
	List<BeanDeclaration> getBeanDeclarations();

	/**
	 * Gets the scanned packages.
	 *
	 * @return the scanned packages
	 */
	String[] getScannedPackages();

	/**
	 * Reload the bean declarations.
	 */
	void reloadTheBeanDeclarations();

}
