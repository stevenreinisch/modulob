package de.dubmas.modulob.migration.ui.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.ActionDelegate;

import de.dubmas.modulob.migration.services.IMigrationService;
import de.dubmas.modulob.migration.services.impl.MigrationService;

public class CreateNewEntityModelFileAction extends ActionDelegate {
	
	private IFile selectedEntityModelFile;
	private IMigrationService migrationService;
	
	 public void run(IAction action) {
		 migrationService = new MigrationService();
		 migrationService.createNewEntityModelVersionFile(selectedEntityModelFile, "3.1");
	 }
	 
	 public void selectionChanged(IAction action, ISelection selection) {
		 if (selection instanceof IStructuredSelection) {
			if(((IStructuredSelection) selection).getFirstElement() instanceof IFile) {
				this.selectedEntityModelFile = 
						(IFile)((IStructuredSelection) selection).getFirstElement();
			}
		}
	 }
}
