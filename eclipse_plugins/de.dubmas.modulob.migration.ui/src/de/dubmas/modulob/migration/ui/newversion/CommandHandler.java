package de.dubmas.modulob.migration.ui.newversion;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.dubmas.modulob.psee.ui.wizard.ActivityExecutor;
import de.dubmas.modulob.psee.ui.wizard.IActivityExecutor;


public class CommandHandler extends AbstractHandler {
	
	private IActivityExecutor activityExecutor;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		activityExecutor = new ActivityExecutor();
		activityExecutor.executeActivity("newEntityModelVersion");
		return null;
	}

	

}
