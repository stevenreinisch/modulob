package de.dubmas.modulob.validation

import de.dubmas.modulob.system.EntityModel

import de.dubmas.modulob.ModulobPackage
import de.dubmas.modulob.Entity
import de.dubmas.modulob.Feature
import de.dubmas.modulob.ConfigOption

import de.dubmas.modulob.types.TypesPackage
import de.dubmas.modulob.ConfigValue

class DataDslExtensions {
	
	def isPersistent(Entity e) {
		e.annotations.exists(a | a.option == ConfigOption::PERSISTENCY)
	}
	
	def isCoreDataPersistent(Entity e){
		e.annotations.exists(a | a.option == ConfigOption::PERSISTENCY && a.value == ConfigValue::CORE_DATA)
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
	
	/*
	 * Return all entity features that reference an Entity from a module
	 * different than e's module.
	 */
	def entityFeaturesWithCrossModuleRef(Entity e){
		e.entityFeatures.filter(f | ((f.type.referenced as Entity).eContainer as EntityModel).module 
									!= 
									(e.eContainer as EntityModel).module)
	}
	
	def hasUUID(Entity e){
		e.features.exists(f | TypesPackage::eINSTANCE.primitive.isInstance(f.type.referenced)
						      &&
						      f.type.referenced.name == "String"
						      &&
						      f.name == "uuid"
		)
	}
	
	//!! recursive functions must specify return type
	def boolean uuidInInheritanceHierarchy(Entity e){
		e.hasUUID
		||
		//the '^' before super is there because 'super' is a keyword that must be escaped
		(if(e.^super != null){
			e.^super.uuidInInheritanceHierarchy
		}else{
			false
		})
	}
	
	def boolean existInSuperHierarchy(Feature f, Entity e){
		if(e.^super == null){
			false
		} else {
			if(e.^super.features.exists(f_ | f_.name == f.name
											 &&
											 f_.type.isMulti == f_.type.isMulti
											 &&
											 f_.type.referenced == f_.type.referenced
			)){
				return true
			} else {
				return f.existInSuperHierarchy(e.^super)
			}
		}
		
		false
	}
}