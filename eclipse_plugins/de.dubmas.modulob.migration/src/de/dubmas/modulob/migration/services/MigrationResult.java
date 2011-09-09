package de.dubmas.modulob.migration.services;

import de.dubmas.modulob.migration.Migration;
import de.dubmas.modulob.system.EntityModel;

public class MigrationResult {
	private EntityModel source;
	public EntityModel getSource() {
		return source;
	}

	private EntityModel destination;
	public EntityModel getDestination() {
		return destination;
	}

	private Migration migration;
	public Migration getMigration() {
		return migration;
	}
	
	public MigrationResult(EntityModel source,
			EntityModel destination,
			Migration migration) 
	{
		this.source      = source;
		this.destination = destination;
		this.migration   = migration;
	}
}