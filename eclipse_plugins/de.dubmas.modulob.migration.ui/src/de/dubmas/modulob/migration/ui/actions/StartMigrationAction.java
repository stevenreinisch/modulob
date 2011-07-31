package de.dubmas.modulob.migration.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

import de.dubmas.modulob.migration.ui.wizard.EntityMappingWizard;

public class StartMigrationAction extends ActionDelegate {
	
	private ISelection selection;
	
	 public void run(IAction action) {
		 EntityMappingWizard wizard = new EntityMappingWizard();
		 
		 Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		 
		 WizardDialog dialog = new WizardDialog(shell, wizard);
		 dialog.create();
		 dialog.open();
	 }
	 
	 public void selectionChanged(IAction action, ISelection selection) {
		 this.selection = selection;
		 System.out.println("selectionChanged ... " + selection);
	 }
}
