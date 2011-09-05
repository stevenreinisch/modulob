package de.dubmas.modulob.migration.services;

import java.util.List;

import de.dubmas.modulob.Entity;
import de.dubmas.modulob.migration.Migration;

public class MigrationResult {
	private List<Entity> sourceEntities;
	public List<Entity> getSourceEntities() {
		return sourceEntities;
	}

	private List<Entity> destinationEntities;
	public List<Entity> getDestinationEntities() {
		return destinationEntities;
	}

	private Migration migration;
	public Migration getMigration() {
		return migration;
	}
	
	public MigrationResult(List<Entity> sourceEntities,
			List<Entity> destinationEntities,
			Migration migration) 
	{
		this.sourceEntities      = sourceEntities;
		this.destinationEntities = destinationEntities;
		this.migration           = migration;
	}
}