package de.dubmas.modulob.util;

import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;

/**
 * Lists all available model files.<br>
 * Files can be listed from a workspace, a mega model, or anything imaginable.
 * 
 * @author steffen
 *
 */
public interface IModelFileLister {
	
	/**
	 * 
	 * Usage:<br> <code> Set<String> excludedFolderNames = ...; <br>
	 * excludedFolderNames.add("bin"); <br>
	 * listAllFiles("java", excludedFolderNames);
	 * </code>
	 * 
	 * @param fileExtensionRegEx regular expression for file extension of files we are interested in
	 * @param excludedFolderNames the names of folders that should not be scanned for files
	 * @return A list of file handles. An empty list if no files could be found.
	 */
	public List<IFile> listAllFiles(String fileExtensionRegEx, Set<String> excludedFolderNames);
}
