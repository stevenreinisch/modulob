package de.dubmas.modulob.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class ResourceProviderWFComponent extends AbstractWorkflowComponent2{

	private String fileExtension;
	private String folderRelativePath;
	
	private String slotName;
	
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public void setFolderRelativePath(String folderRelativePath) {
		this.folderRelativePath = folderRelativePath;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}
		
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) 
	{
		try {
			List<Resource> result = 
					ResourceProvider.resourcesInFolderWithExtension(folderRelativePath, fileExtension);
			
			ctx.set(slotName, result);
		} catch (Exception e) {
			issues.addError(e.getMessage());
			
		}
	}
}
