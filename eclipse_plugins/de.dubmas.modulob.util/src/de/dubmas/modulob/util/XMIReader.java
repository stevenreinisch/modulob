package de.dubmas.modulob.util;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class XMIReader {
	
	/**
	 * 
	 * @param fileExtension without leading dot (correct:  "java", incorrect: ".java")
	 * @param folderURI e.g. "platform:/resource/project-name/path"
	 * @return
	 * @throws IOException 
	 */
	public static List<EObject> firstElementsOfFilesWithExtensioninFolder(final String fileExtension, 
			final String folderRelativePath, final String folderURI) throws IOException
	{
		List<EObject> result = new LinkedList<EObject>();
		
		File folder = new File(folderRelativePath);
		
		List<File> files = new LinkedList<File>();
		XMIReader.listFilesWithExtension(folder, fileExtension, files);
		
		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().
			getExtensionToFactoryMap().put(fileExtension, new XMIResourceFactoryImpl());
		
		for(File file : files){
			//String nuri = folderURI + file;
			//set.createResource(URI.createURI(nuri));
			
			Resource res = set.getResource(URI.createFileURI(file.getAbsolutePath()), true);
			if(res != null){
				if(!res.isLoaded()){
					res.load(Collections.EMPTY_MAP);
				}
				
				if(!res.getContents().isEmpty()){
					result.add(res.getContents().get(0));
				}
			}
		}
		
		return result;
	}
	
	public static void listFilesWithExtension(final File root, 
											   final String fileExtension, 
											   final List<File> files)
	{
		for(File child: root.listFiles()){
			if(child.isFile()){
				String ext = XMIReader.fileExtension(child.getName());
				if(ext.equals(fileExtension)){
					files.add(child);
				}
			} else if(child.isDirectory()){
				XMIReader.listFilesWithExtension(child, fileExtension, files);
			}
		}
	}
	
	public static String fileExtension(String fileName) {
	      int dotInd = fileName.lastIndexOf('.');

	      // if dot is in the first position,
	      // we are dealing with a hidden file rather than an extension
	      return (dotInd > 0) ? fileName.substring(dotInd + 1) : fileName;
	  }
}
