package de.dubmas.modulob.validation

import de.dubmas.modulob.system.EntityModel

import de.dubmas.modulob.ModulobPackage
import de.dubmas.modulob.Entity
import de.dubmas.modulob.ConfigOption

class DataDslExtensions {
	
	def isPersistent(Entity e) {
		e.annotations.exists(a | a.option == ConfigOption::PERSISTENCY)
	}
	
	/*
	 * Returns all entities from e.entityModel that have at least one
	 * feature of type e. 
	 */
	def containerEntities(Entity e){
		(e.eContainer as EntityModel).entities.
			filter(container | container.entityFeatures.exists(f | f.type.referenced == e))
	}
	
	/*
	 * Return all features of e that reference an entity
	 */
	def entityFeatures(Entity e){
		e.features.filter(f | ModulobPackage::eINSTANCE.entity.isInstance(f.type.referenced))
	}
}