package de.dubmas.modulob.generator.transformation

import java.util.List
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import de.dubmas.modulob.system.Module
import de.dubmas.modulob.system.InterfaceModel
import de.dubmas.modulob.system.EntityModel
import de.dubmas.modulob.system.NotificationModel

class ModuleTransformation implements org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent {
	
	String interfaceModelSlotName
	String entityModelSlotName
	String notificationModelSlotName
	String moduleSlotName
	
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
	
	override invoke(IWorkflowContext context) {
		var List<Module> modules                       = context.get(moduleSlotName) as List<Module>
		var List<InterfaceModel> interfaceModels       = context.get(interfaceModelSlotName) as List<InterfaceModel>
		var List<EntityModel> entityModels             = context.get(entityModelSlotName) as List<EntityModel>
		var List<NotificationModel> notificationModels = context.get(notificationModelSlotName) as List<NotificationModel>
		
		for(m: modules){
			m.interfaceModel = interfaceModels.filter(im | im.module == m).head
		}
	
		for(m: modules){
			m.entityModel = entityModels.filter(em | em.module == m).head
		}
		
		for(m: modules){
			m.notificationModel = notificationModels.filter(nm | nm.module == m).head
		}
	}

	override postInvoke() {
		// TODO Auto-generated method stub
		
	}

	override preInvoke() {
		// TODO Auto-generated method stub
		
	}
}