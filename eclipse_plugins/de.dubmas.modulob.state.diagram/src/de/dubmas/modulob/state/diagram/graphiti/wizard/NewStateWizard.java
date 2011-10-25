package de.dubmas.modulob.state.diagram.graphiti.wizard;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public class NewStateWizard extends Wizard implements IWorkbenchWizard {

	String stateName;
	
	private IFolder targetFolder;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		//TODO: add selection constraint for wizard in extension point (enablesFor ...)
		if(selection.getFirstElement() instanceof IFolder 
		   && ((IFolder)selection.getFirstElement()).getName().equals("states"))
		{
			this.targetFolder = (IFolder)selection.getFirstElement();
		} else {
			this.performCancel();
			MessageDialog.
				openError(getShell(), 
						  "Wrong Selection", "State machines can only be created in a package named 'states'");
		}
	}

	public void addPages() {
		IWizardPage page = new NewStateWizardPage("NewStateWizardPage");
		super.addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		 ResourceSet resourceSet = new ResourceSetImpl();
		 TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(resourceSet);
		 if (editingDomain == null) {
			 editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		 }
		 
		 CreateStateMachineCommand command = new CreateStateMachineCommand(editingDomain, stateName, targetFolder);
		 editingDomain.getCommandStack().execute(command);
		 try {
			 Map<String, Resource> resources = command.getCreatedResources();
			 for(String key: resources.keySet()){
				 resources.get(key).save(Collections.EMPTY_MAP);
			 }
		 } catch (IOException e) {
			 IStatus status = new Status(IStatus.ERROR, "org.eclipse.graphiti.examples.tutorial", e.getMessage(), e); //$NON-NLS-1$
			 ErrorDialog.openError(Display.getCurrent().getActiveShell(), "State Machine Creation", e.getMessage(), status);
			 return false;
		 }
		 
		 // Dispose the editing domain to eliminate memory leak
		 editingDomain.dispose();
		 
         // Open the editor
		String platformString = 
				command.getCreatedResources().
					get(CreateStateMachineCommand.DIAGRAM_RESOURCE_KEY).
						getURI().toPlatformString(true);
		
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
		IFileEditorInput input = new FileEditorInput(file);
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage()
					.openEditor(input, DiagramEditor.DIAGRAM_EDITOR_ID);
		} catch (PartInitException e) {
			IStatus status = new Status(IStatus.ERROR,
					"de.dubmas.modulob.state.diagram", e.getMessage(), e); //$NON-NLS-1$
			ErrorDialog.openError(Display.getCurrent().getActiveShell(),
					"Cannot open state machine editor",
					e.getMessage(), status);
			
			return false;
		}
		 
		return true;
	}
	
	@Override
	public boolean canFinish() {
		return stateName != null && stateName.length() > 3;
	}
}
