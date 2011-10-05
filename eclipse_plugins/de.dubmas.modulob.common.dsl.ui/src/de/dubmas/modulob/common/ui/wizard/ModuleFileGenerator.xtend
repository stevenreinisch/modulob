package de.dubmas.modulob.common.ui.wizard


import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

class ModuleFileGenerator {
	
	String fqModuleName
	String simpleModuleName
	
	def void setModuleName(String moduleName) {
		this.fqModuleName     = moduleName
		var segments          = fqModuleName.split("\\.")
		this.simpleModuleName = segments.get(segments.size - 1)
	}
	
	def void doGenerate(IFileSystemAccess fsa) {
		fsa.generateFile(simpleModuleName + "_v1.0.moif", IFileSystemAccess::DEFAULT_OUTPUT, interfaceFile)
		fsa.generateFile(simpleModuleName + "_v1.0.modat", IFileSystemAccess::DEFAULT_OUTPUT, dataFile)
		fsa.generateFile(simpleModuleName + "_v1.0.mono", IFileSystemAccess::DEFAULT_OUTPUT, notificationFile)	
	}
	
	def interfaceFile ()
	'''
	interfaces for module «fqModuleName» version "1.0"
	
	interface AnInterface {
		Void foo:String param1 bar:Timestamp param2
	}
	'''
	
	def dataFile ()
	'''
	entities for module «fqModuleName» version "1.0"
	
	entity AnEntity {
		String uuid;
	}
	'''
	
	def notificationFile()
	'''
	notifications for module «fqModuleName» version "1.0"
	
	notification aNotification {
		String contextAttribute;
	}
	'''
}