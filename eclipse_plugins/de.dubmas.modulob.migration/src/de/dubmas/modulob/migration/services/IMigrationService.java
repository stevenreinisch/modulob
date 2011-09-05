package de.dubmas.modulob.migration.services;

import org.eclipse.core.resources.IFile;

public interface IMigrationService {
	
	public void createNewEntityModelVersionFile(IFile oldVersionFile, String newVersion);
	
	public MigrationResult createMigrationModel(IFile sourceFile, IFile destinationFile);
}
