package de.dubmas.modulob.ui.wizard.util

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
	current interfaces for module «fqModuleName» version "1.0"
	
	interface AnInterface {
		Void foo:String value bar:Timestamp date
	}
	'''
	
	def dataFile ()
	'''
	current entities for module «fqModuleName» version "1.0"
	
	entity AnEntity {
		String uuid;
	}
	'''
	
	def notificationFile()
	'''
	current notifications for module «fqModuleName» version "1.0"
	
	notification aNotification {
		String value;
		Timestamp date;
	}
	'''
}