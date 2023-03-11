package fr.echoeslabs.rapid.api.migration;

public interface RuleMigrationContext extends MigrationContext {

	/**
	 * Gets the selected rule key.
	 *
	 * @return the selected rule key
	 */
	String getSelectedRuleKey();
}
