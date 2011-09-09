package de.dubmas.modulob.generator.transformation

import java.util.*
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import de.dubmas.modulob.system.Module
import de.dubmas.modulob.system.InterfaceModel
import de.dubmas.modulob.system.EntityModel
import de.dubmas.modulob.system.NotificationModel
import org.eclipse.xtend.util.stdlib.CloningExtensions

class ModuleTransformation implements org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent {
	
	String interfaceModelSlotName
	String entityModelSlotName
	String notificationModelSlotName
	String moduleSlotName
	String oldVersionEntiyModelSlotName
	
	def setInterfaceModelSlotName(String name){
		interfaceModelSlotName = name
	}
	
	def setEntityModelSlotName(String name){
		entityModelSlotName = name
	}
	
	def setNotificationModelSlotName(String name){
		notificationModelSlotName = name
	}
	
	def setModuleModelSlotName(String name){
		moduleSlotName = name
	}
	
	def setOldVersionEntiyModelSlotName(String name){
		oldVersionEntiyModelSlotName = name
	}
	
	override invoke(IWorkflowContext context) {
		var modules            = context.get(moduleSlotName) as List<Module>
		var interfaceModels    = context.get(interfaceModelSlotName) as List<InterfaceModel>
		var entityModels       = context.get(entityModelSlotName) as List<EntityModel>
		var notificationModels = context.get(notificationModelSlotName) as List<NotificationModel>
	
		for(m: modules){
			m.interfaceModel = interfaceModels.filter(im | im.module == m).head
		}
		
		var groupedEntityModels    = sortedEntityModelsGroupedByModule(entityModels)
		var oldVersionEntityModels = new ArrayList<EntityModel>(10);
		
		for(m: modules){
			var sortedEntityModels            = groupedEntityModels.get(m.name)
			var entityModelWithHighestVersion = sortedEntityModels.remove(sortedEntityModels.lastKey)
			
			/*
			 * For the remaining entity models we have to set the module reference and vice versa
			 * to get the code generation work properly.
			 * We clone the module because if we would use the original module the object graph
			 * (semantic model, a.k.a. AST) would not have correct links.
			 * We clone the module at this point because we do not want to copy the 
			 * entityModelWithHighestVersion because it will be referenced later and the cloning
			 * is a deep copy.
			 */
			for(em: sortedEntityModels.values){
				var moduleClone = CloningExtensions::clone(m) as Module
				moduleClone.entityModel = em
				em.module = moduleClone
			}
			
			m.entityModel = entityModelWithHighestVersion
			
			oldVersionEntityModels.addAll(sortedEntityModels.values)
		}
		
		context.put(oldVersionEntiyModelSlotName, oldVersionEntityModels)
		
		for(m: modules){
			m.notificationModel = notificationModels.filter(nm | nm.module == m).head
		}
	}
	
	def sortedEntityModelsGroupedByModule(List<EntityModel> entityModels){
		/* 
		 * map module names to sorted map of entity models 
		 */
		var Map<String, SortedMap<String, EntityModel>> moduleEntityModelsMap
			= new HashMap<String, SortedMap<String, EntityModel>>();
			
		for(em: entityModels)
		{
			var SortedMap<String, EntityModel> entityModelsMap = 
							moduleEntityModelsMap.get(em.module.name);
							
			if(entityModelsMap == null){
				entityModelsMap = new TreeMap<String, EntityModel>()
				moduleEntityModelsMap.put(em.module.name, entityModelsMap)
			}
			
			entityModelsMap.put(em.version, em)
		}
		
		return moduleEntityModelsMap
	}
	
	override postInvoke() {
		// TODO Auto-generated method stub
		
	}

	override preInvoke() {
		// TODO Auto-generated method stub
		
	}
}