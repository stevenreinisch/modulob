package de.dubmas.modulob.util;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ResourceProvider {
	
	/**
	 * 
	 * @param folderRelativePath
	 * @param fileExtension without leading dot (correct:  "java", incorrect: ".java")
	 * @return
	 */
	public static List<Resource> resourcesInFolderWithExtension(String folderRelativePath, String fileExtension){
		List<Resource> result = new ArrayList<Resource>(5);
		File folder = new File(folderRelativePath);
		
		List<File> files = new LinkedList<File>();
		XMIReader.listFilesWithExtension(folder, fileExtension, files);
		
		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().
			getExtensionToFactoryMap().put(fileExtension, new XMIResourceFactoryImpl());
		
		for(File file : files){
			
			Resource res = set.getResource(URI.createFileURI(file.getAbsolutePath()), true);
			result.add(res);
		}
		return result;
	}
}
