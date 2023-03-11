package fr.echoeslabs.rapid.api.loader.repository.factory;

import fr.echoeslabs.migration.api.migration.MigrationParameters;
import fr.echoeslabs.migration.utils.exception.RapidException;
import fr.echoeslabs.rapid.api.analysis.params.InvalidParameterTypeException;
import fr.echoeslabs.rapid.api.migration.MigrationContext;
import fr.echoeslabs.rapid.api.migration.repository.MigrationRepository;

public interface MigrationRepositoryFactory {

	/**
	 * Inject the default configuration into existing properties.
	 *
	 * @param _existingConfiguration
	 *            the _existing configuration
	 * @return the properties with the missing properties injected.
	 * @throws InvalidParameterTypeException
	 *             the invalid parameter type exception
	 */
	public MigrationParameters injectDefaultConfiguration(MigrationParameters _existingConfiguration) throws InvalidParameterTypeException;

	/**
	 * Instantiate a migration repository from a user context provided by argument. THe migration repository contains the list of rules and beans according
	 * with the migration parameters.
	 *
	 * @param _migrationContext
	 *            the migration context
	 * @return the migration repository
	 * @throws RapidException
	 */
	public MigrationRepository instantiateRepository(MigrationContext _migrationContext) throws RapidException;

}
