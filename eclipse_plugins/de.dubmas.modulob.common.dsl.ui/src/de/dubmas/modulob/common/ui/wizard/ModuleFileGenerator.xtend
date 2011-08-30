package de.dubmas.modulob.common.ui.wizard

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

class ModuleFileGenerator {
	
	String moduleName
	String destinationDirPath
	
	def void setModuleName(String moduleName) {
		this.moduleName = moduleName
	}
	
	/** 
	 * 
	 * Set the path of the destination directory.
	 * The path must contain a trailing slash "/"
	 */
	def void setDestinationDirPath(String path){
		this.destinationDirPath = path
	}
	
	def void doGenerate(IFileSystemAccess fsa) {
		fsa.generateFile(moduleName + ".moif", IFileSystemAccess::DEFAULT_OUTPUT, interfaceFile)
		fsa.generateFile(moduleName + ".modat", IFileSystemAccess::DEFAULT_OUTPUT, dataFile)	
	}
	
	def interfaceFile ()
	'''
	interfaces for module «moduleName» version "1.0"
	
	interface AnInterface {
		
	}
	'''
	
	def dataFile ()
	'''
	entities for module «moduleName» version "1.0"
	
	entity AnEntity {
		
	}
	'''
}