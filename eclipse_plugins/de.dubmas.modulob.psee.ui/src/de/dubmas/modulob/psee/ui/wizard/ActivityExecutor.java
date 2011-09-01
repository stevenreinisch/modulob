package de.dubmas.modulob.psee.ui.wizard;

import java.lang.reflect.Constructor;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class ActivityExecutor implements IActivityExecutor{
	
	private IActivityRegistry registry;

	public ActivityExecutor() {
		registry = new SimpleActivityRegistry();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void executeActivity(String activityName) {
		
		try {
			String wizardClassName = registry.wizardClassNameForActivityName(activityName);
			Class wizardClass      = Class.forName(wizardClassName);
			Constructor ctor       = wizardClass.getConstructor();
			Wizard wizard          = (Wizard)ctor.newInstance(new Object[]{});
		
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

			WizardDialog dialog = new WizardDialog(shell, wizard);
			dialog.create();
			
			//trigger notification: activity started?
			
			dialog.open();
			
			//trigger notification: activity ended?
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
