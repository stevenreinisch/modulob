package de.dubmas.modulob.migration.services.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.xtext.ui.XtextProjectHelper;

import de.dubmas.modulob.migration.services.IModelFileLister;

/**
 * Scans all Xtext projects in the current workspace for files.
 * 
 * @author steffen
 *
 */
public class XtextWorkspaceFileLister implements IModelFileLister {

	@Override
	public List<IFile> listAllFiles(String fileExtensionRegEx, Set<String> excludedFolderNames) {
		List<IFile> files = new LinkedList<IFile>();
		try {
			collectFilesFromWorkspace(fileExtensionRegEx, excludedFolderNames, files);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return files;
	}
	
	private void collectFilesFromWorkspace(String fileExtensionRegEx, Set<String> excludedFolderNames, Collection<IFile> collection) throws Exception{
		for(IProject project: ResourcesPlugin.getWorkspace().getRoot().getProjects()){
			if(project.getNature(XtextProjectHelper.NATURE_ID) != null){
				addAllFilesWithExtension(project, fileExtensionRegEx, excludedFolderNames, collection);
			}
		}
	}
	
	private void addAllFilesWithExtension(IContainer container, String fileExtensionRegEx, Set<String> excludedFolderNames, Collection<IFile> collection) throws Exception{
		for(IResource res: container.members()){
			if (res instanceof IFile) {
				IFile file = (IFile) res;
				String fileExtension = file.getFileExtension();//Util.getFileExtension(file.getName()); 
				if(fileExtension.matches((fileExtensionRegEx))){
					collection.add(file);
				}
			} else if ((res instanceof IFolder) && !excludedFolderNames.contains(res.getName())) {
				addAllFilesWithExtension((IFolder)res, fileExtensionRegEx, excludedFolderNames, collection);
			}
		}
	}
	
	
//	public static void main(String[] args) {
//		String fullFileName1 = "test.txt";
//		String fullFileName2 = "test.txt_v3.1";
//		String fullFileName3 = ".test";
//		
//		System.out.println(getFileExtension(fullFileName1));
//		System.out.println(getFileExtension(fullFileName2));
//		System.out.println(getFileExtension(fullFileName3));
//	}
}
