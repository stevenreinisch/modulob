package de.dubmas.modulob.migration.services;

import org.eclipse.core.resources.IFile;

import de.dubmas.modulob.migration.Migration;

public interface IMigrationService {
	
	public void createNewEntityModelVersionFile(IFile oldVersionFile, String newVersion);
	
	public Migration createMigrationModel(IFile sourceFile, IFile destinationFile);
	
//	public DiffModel createDiff(IFile sourceFile, IFile destinationFile);
//	
//	public Migration diffToMigration(DiffModel diff, Module sourceModule);
}
