package de.dubmas.modulob.migration.services;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

import de.dubmas.modulob.migration.Migration;
import de.dubmas.modulob.system.EntityModel;

public interface IMigrationService {
	
	public void createNewEntityModelVersionFile(IFile oldVersionFile, String newVersion);
	
	public MigrationResult createMigrationModel(IFile sourceFile, IFile destinationFile);
	
	public boolean generateMigration(EntityModel sourceModel, EntityModel destinationModel, Migration migration, IProject project);
}
