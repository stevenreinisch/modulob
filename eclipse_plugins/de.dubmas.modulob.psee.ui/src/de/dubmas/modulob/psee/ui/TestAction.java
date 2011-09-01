package de.dubmas.modulob.psee.ui;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.actions.ActionDelegate;

import de.dubmas.modulob.psee.ui.wizard.ActivityExecutor;
import de.dubmas.modulob.psee.ui.wizard.IActivityExecutor;

public class TestAction extends ActionDelegate {
	
	private ISelection selection;
	
	 public void run(IAction action) {

		 
		 IActivityExecutor ae = new ActivityExecutor();
		 ae.executeActivity("newEntityModelVersion");
		 
//		 Map<String, String> pageMap  = new HashMap<String, String>();
//		 
//		 pageMap.put("Invoke the operation XY", "de.dubmas.modulob.psee.ui.wizard.InvokeOperationXYPage");
//		 
//		 Map<String, Object> slots = new HashMap<String, Object>();
//		 slots.put("name", "aNameXX");
//		 slots.put("entityModel", "this should be an instance of EntityModel");
//		 
//		 CreateMigrationWizard wizard = new CreateMigrationWizard(pageMap, slots);
//		 
//		 Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//		 
//		 WizardDialog dialog = new WizardDialog(shell, wizard);
//		 dialog.create();
//		 dialog.open();
	 }
	 
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);
		this.selection = selection;
	}
}