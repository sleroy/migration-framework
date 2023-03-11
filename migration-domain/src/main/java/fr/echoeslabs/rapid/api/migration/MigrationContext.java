/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.echoeslabs.rapid.api.migration;

import fr.echoeslabs.migration.api.migration.MigrationParameters;

/**
 * This interface defines the migration context.
 *
 * @author sleroy
 */
public interface MigrationContext {

	/**
	 * Gets the configuration of the migration
	 *
	 * @return the configuration
	 */
	MigrationParameters getParameters();

}
