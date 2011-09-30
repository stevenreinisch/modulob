package de.dubmas.modulob.util;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import de.dubmas.modulob.util.ShellCommandExecutor.CommandResult;

public class ObjectiveCFormatter extends org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2{

	private static final String SCRIPT_PATH = "./formatSource.sh";
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		try{
			CommandResult cr = ShellCommandExecutor.execute(SCRIPT_PATH, new String[]{});

			if (cr.success){
				System.out.println("Formatting complete!");
			} else{
				issues.addError(cr.output);
			}
		}catch (Exception e){
			issues.addError(e.getMessage());
		}
	}

}
