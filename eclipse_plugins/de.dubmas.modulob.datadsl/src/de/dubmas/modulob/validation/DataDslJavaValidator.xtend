package de.dubmas.modulob.validation

import de.dubmas.modulob.system.EntityModel

import de.dubmas.modulob.ModulobPackage
import de.dubmas.modulob.Feature
import de.dubmas.modulob.Entity
import de.dubmas.modulob.ConfigOption
import de.dubmas.modulob.ConfigValue
import de.dubmas.modulob.ValueObject
import de.dubmas.modulob.StringValue
import de.dubmas.modulob.IntegerValue
import de.dubmas.modulob.FloatValue

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
	
	@Check
	def checkIfEntitySuperFromSameModule(Entity e){
		if(e.^super != null){
			if(!((e.^super.eContainer as EntityModel).module
				==
				((e.eContainer as EntityModel).module)
			   ))
			{
				error("Only Entities from same module can be specified as super entity.", 
				  	  ModulobPackage::eINSTANCE.entity_Super,
				  	  0,
				  	  ValidationIssueCodes::ENTITY_SUPER_SAME_MODULE_CODE,
				  	  null
					)
			}
		}
	}
	
	/*
	 * A persistent entity must not reference an entity from another module.
	 */
	@Check
	def checkPersistentEntityCrossModuleRef(Entity e){
		if(e.isPersistent){
			var invalidFeatures = e.entityFeaturesWithCrossModuleRef
		
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
	
	@Check
	def checkIfInverseAllowed(Feature f){
		if(f.inverse != null){
			if(!(f.eContainer as Entity).isCoreDataPersistent){
				error("Inverse relations can only be specified if entity is CoreData-persitent", 
				   	  f, 
				   	  ModulobPackage::eINSTANCE.feature_Inverse, 
				   	  0, 
					  ValidationIssueCodes::INVERSE_ALLOWED_CODE, 
					  null)
			}	
		}
	}
	
	@Check
	def checkIfInverseIsEntity(Feature f){
		if(f.inverse != null){
			if(!(ModulobPackage::eINSTANCE.entity.isInstance(f.inverse.type.referenced))){
				error("Inverse relation can only reference Entity", 
				   	  f, 
				   	  ModulobPackage::eINSTANCE.feature_Inverse, 
				   	  0, 
					  ValidationIssueCodes::INVERSE_IS_ENTITY_CODE, 
					  null)
			}
		}
	}
	
	@Check
	def checkIfInverseNotCrossesModuleBoundaries(Feature f){
		if(f.inverse != null){
			if(((f.inverse.type.referenced as Entity).eContainer as EntityModel).module
				!=
				(f.eContainer.eContainer as EntityModel).module)
			{
				error("Inverse relation cannot reference Entity from another module", 
				   	  f, 
				   	  ModulobPackage::eINSTANCE.feature_Inverse, 
				   	  0, 
					  ValidationIssueCodes::INVERSE_MODULE_BOUNDARIES_CODE, 
					  null)	
			}
		}
	}
	
	@Check
	def checkIfPersistentEntityHasUUID(Entity e){
		if(e.isPersistent){
			if(! e.uuidInInheritanceHierarchy){
				error("If entity is persistent, it must have an attribute 'String uuid'", 
				  ModulobPackage::eINSTANCE.entity_Features,
				  0,
				  ValidationIssueCodes::UUID_REQUIRED_CODE,
				  null
				)
			}
		}
	}
	
	@Check
	def checkIfFeatureNotNamedDescription(Feature f){
		if(f.name == 'description'){
			error("Name cannot be 'description'.", 
				  ModulobPackage::eINSTANCE.feature_Name,
				  0,
				  ValidationIssueCodes::FEATURE_NAME_CODE,
				  null
				)
		}
	}
	
	@Check
	def checkIfDefaultValueAllowed(Feature f){
		if(f.defaultValue != null){
			if(!((f.eContainer as Entity).isCoreDataPersistent
				 &&
				 TypesPackage::eINSTANCE.primitive.isInstance(f.type.referenced)
				)
			){
				error("Default value can only be specified if type is primitive and entity's persistency is 'CoreData'", 
				  ModulobPackage::eINSTANCE.feature_DefaultValue,
				  0,
				  ValidationIssueCodes::DEFAULT_VALUE_EXISTENCE_CODE,
				  null
				)
			}
		}
	}
	
	@Check
	def checkIfDefaultValueCorrect(Feature f){
		if(f.defaultValue != null){
			var errorMsg = f.defaultValue.check(f.type.referenced as Primitive)
			if(errorMsg != null){
				error(errorMsg, 
				  	  ModulobPackage::eINSTANCE.feature_DefaultValue,
				  	  0,
				  	  ValidationIssueCodes::DEFAULT_VALUE_CORRECTNESS_CODE,
				  	  null
					)
			}
		}
	}
	
	def dispatch check(ValueObject vo, Primitive p){
		null
	}
	
	def dispatch check(StringValue vo, Primitive p){
		if(!(p.name == "String")){
			"Type of this feature must be String for the given default value."
		}else{
			null
		}
	}
	
	def dispatch check(IntegerValue vo, Primitive p){
		if(!(p.name == "Integer16"
			||
			p.name == "Integer32"
			||
			p.name == "Integer64"
			||
			p.name == "Bool"))
		{
			"Type of this feature must be 'Integer16', 'Integer32', 'Integer64', or 'Bool' for the given default value."
		}else{
			null
		}
	}
	
	def dispatch check(FloatValue vo, Primitive p){
		if(!(p.name == "Decimal")){
			"Type of this feature must be Decimal for the given default value."
		}else{
			null
		}
	}
}