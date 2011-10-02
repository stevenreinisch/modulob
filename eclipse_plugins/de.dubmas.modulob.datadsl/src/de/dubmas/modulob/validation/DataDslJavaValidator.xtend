package de.dubmas.modulob.validation

import de.dubmas.modulob.system.EntityModel

import de.dubmas.modulob.ModulobPackage
import de.dubmas.modulob.Feature
import de.dubmas.modulob.Entity
import de.dubmas.modulob.ConfigOption
import de.dubmas.modulob.ConfigValue

import de.dubmas.modulob.types.TypesPackage
import de.dubmas.modulob.types.Primitive

import org.eclipse.xtext.validation.Check
import com.google.inject.Inject

class DataDslJavaValidator extends AbstractDataDslJavaValidator {
	
	@Inject extension DataDslExtensions extensions
		
	@Check
	def checkIfIndexedAllowed(Feature f) {
		if(f.isIndexed && !(f.eContainer as Entity).isPersistent()){
			error("\"indexed\" can only be used if entity is annotated with \"@persistency\"", 
				  ModulobPackage::eINSTANCE.feature_IsIndexed,
				  0,
				  ValidationIssueCodes::INDEXED_ALLOWED_CODE,
				  null
			)
		}
	}
	
	@Check
	def checkIfProperFeatures(Entity e){
		var boolean valid = e.features.forall(f | TypesPackage::eINSTANCE.primitive.isInstance(f.type.referenced)
							  					  ||
							  					  TypesPackage::eINSTANCE.any.isInstance(f.type.referenced)
							  					  ||
							  					  ModulobPackage::eINSTANCE.entity.isInstance(f.type.referenced)
							  
							)				
							
		if(!valid){
			error("Only primitive types, any, or entities can be referenced.", 
				  ModulobPackage::eINSTANCE.entity_Features,
				  0,
				  ValidationIssueCodes::PROPER_FEATURE_TYPES_CODE,
				  null
			)
		}
	}	
	
	/*
	 * If an entity is persistent, the type of all entity features
	 * must be a persistent entity with the same persistency as e.
	 */
	@Check
	def checkIfAllEntityFeaturesArePersistent(Entity e){
		var boolean valid = true
		
		if(e.isPersistent){
			var entityFeaturesWithWrongPersistency =  
				e.entityFeatures.
					/*
					 * filter features whose entity has:
					 * - no persistency annotation
					 * - a persistency annotation with different value
					 */
					filter(f | !(f.type.referenced as Entity).annotations.exists(a | a.option == ConfigOption::PERSISTENCY)
							   ||
						       (f.type.referenced as Entity).
								annotations.exists(a | a.option == ConfigOption::PERSISTENCY
											  		   &&
											   		   a.value == e.annotations.
											   		   				filter(a1 | a1.option != ConfigOption::PERSISTENCY).head.value
						)
					)
				
			for(f: entityFeaturesWithWrongPersistency){
				error("Only persistent entities can be referenced", 
					  f, 
					  ModulobPackage::eINSTANCE.feature_Type, 
					  0, 
					  ValidationIssueCodes::ENTIYFEATURES_HAVE_SAME_PERSISTENCY_CODE, 
					  null)
			}
		}
	}
	
	/*
	 * A persistent entity must not reference an entity from another module.
	 */
	@Check
	def checkPersistentEntityCrossModuleRef(Entity e){
		if(e.isPersistent){
			var invalidFeatures = e.entityFeatures.filter(f | ((f.type.referenced as Entity).eContainer as EntityModel).module 
															  != 
															  (e.eContainer as EntityModel).module)
		
			for(f: invalidFeatures){
				error("Entitites from other modules cannot be referenced if the containing entity is persistent", 
				   	  f, 
				   	  ModulobPackage::eINSTANCE.feature_Type, 
				   	  0, 
					  ValidationIssueCodes::ENTIY_REF_MODULE_BOUNDARIES_CODE, 
					  null)
			}
		}
	}
}