
package fr.echoeslabs.rapid.api.loader;

import java.util.Map;

import org.springframework.context.ApplicationContext;

import fr.echoes.labs.pluginfwk.api.plugin.PluginDefinition;
import fr.echoeslabs.migration.api.sourceadapters.SourceAdapters;
import fr.echoeslabs.rapid.api.context.RapidScopeContext;
import fr.echoeslabs.rapid.api.migration.MigrationContext;
import fr.echoeslabs.rapid.api.migration.repository.RuleNotFoundException;
import fr.echoeslabs.rapid.api.rules.IRapidRule;

/**
 * The Interface RapidScopeContext.
 */
public interface RapidLoaderContext extends RapidScopeContext {

	/**
	 * Gets the application context.
	 *
	 * @return the application context
	 */
	ApplicationContext getApplicationContext();

	/**
	 * Gets the decorators.
	 *
	 * @return the decorators
	 */
	fr.echoeslabs.migration.api.decoration.Decorators getDecorators();

	/**
	 * Gets the migration context.
	 *
	 * @return the migration context
	 */
	MigrationContext getMigrationContext();

	/**
	 * Gets the present plugins inside the Spring ApplicationContext.
	 *
	 * @return the present plugins
	 */
	Map<String, PluginDefinition> getPresentPlugins();

	/**
	 * Gets the bean.
	 *
	 * @param <T>
	 *            the generic type
	 * @param _ruleName
	 *            the _rule name
	 * @param _expectedRuleType
	 *            the expected rule type
	 * @return the rule or an exception
	 * @throws RuleNotFoundException
	 *             the rule not found exception
	 */
	<T extends IRapidRule> T getRule(String _ruleName, Class<T> _expectedRuleType) throws RuleNotFoundException;

	/**
	 * Gets the source adapters.
	 *
	 * @return the source adapters
	 */
	SourceAdapters getSourceAdapters();
}
