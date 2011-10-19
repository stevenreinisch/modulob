package de.dubmas.modulob.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class XMIReaderWorkflowComponent extends AbstractWorkflowComponent2{

	private String fileExtension;
	private String folderRelativePath;
	private String folderURI;
	private String slotName;
	private List<String> fqPackageNames;
	
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public void setFolderRelativePath(String folderRelativePath) {
		this.folderRelativePath = folderRelativePath;
	}

	public void setFolderURI(String folderURI) {
		this.folderURI = folderURI;
	}
	
	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}
	
	public void addFqPackageNames(String fqPackageName){
		if(fqPackageNames == null){
			fqPackageNames = new ArrayList<String>(5);
		}
		fqPackageNames.add(fqPackageName);
	}
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) 
	{
		try {
			registerPackages();
			
			List<EObject> result = 
					XMIReader.firstElementsOfFilesWithExtensioninFolder
							(fileExtension, folderRelativePath, folderURI);
			
			ctx.set(slotName, result);
		} catch (Exception e) {
			issues.addError(e.getMessage());
			
		}
	}
	
	@SuppressWarnings("rawtypes")
	private void registerPackages() throws Exception{
		for(String fqPackageName: fqPackageNames){
			Class pkgClass = Class.forName(fqPackageName);
			
			Field nsUriField = pkgClass.getDeclaredField("eNS_URI");
			String nsUri = (String)nsUriField.get(pkgClass);
			
			if (!EPackage.Registry.INSTANCE.containsKey(nsUri)) {
				Field eInstanceField = pkgClass.getDeclaredField("eINSTANCE");
				Object eInstance     = eInstanceField.get(pkgClass);
				
				EPackage.Registry.INSTANCE.put(nsUri, eInstance);
			}
		}
	}
}
