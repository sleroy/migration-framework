package fr.echoeslabs.migration.api.migration;

public interface IMigrationListener {

	void notifyMigration(ISourceMigrationState migration);
}
