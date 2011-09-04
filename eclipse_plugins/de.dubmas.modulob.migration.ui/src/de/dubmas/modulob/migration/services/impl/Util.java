package de.dubmas.modulob.migration.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;

public class Util {
	
	public static List<String> fileNamesFromFiles(List<IFile> files){
		List<String> names = new ArrayList<String>(files.size());
		for(IFile file: files){
			names.add(file.getName());
		}
		return names;
	}
	
	/**
	 * Retuns a file's extension. Examples: <br><br>
	 * 
	 * "test.txt"       -> "txt" <br>
	 * "test.txt_v3.1"  -> "txt_v3.1" <br>
	 * ".test.txt_v3.1" -> "txt_v3.1" <br>
	 * ".test"          -> "" <br>
	 * 
	 * @param fileName File name + file extension (e.g. "test.txt", or "test.txt_v3.1")
	 * @return The substring from first first occurrence of ".". "." as first character is ignored.
	 * If no file extension exists, returns empty string.
	 */
	public static String getFileExtension(String fileName){
		int firstDotIndex = fileName.indexOf(".", 1);
		if(firstDotIndex == -1){
			return "";
		} else {
			return fileName.substring(firstDotIndex + 1);
		}
	}
}
