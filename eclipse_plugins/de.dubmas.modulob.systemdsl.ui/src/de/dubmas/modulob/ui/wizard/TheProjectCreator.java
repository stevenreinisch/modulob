package de.dubmas.modulob.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;

public class TheProjectCreator extends SystemDslProjectCreator{
	
	@Override
	protected List<String> getRequiredBundles() {
		
		List<String> result = new ArrayList<String>(10);
		
		result.add("de.dubmas.modulob.metamodels");
		result.add("de.dubmas.modulob.common.dsl");
		result.add("de.dubmas.modulob.systemdsl");
		result.add("de.dubmas.modulob.datadsl");
		result.add("de.dubmas.modulob.interfacedsl");
		result.add("de.dubmas.modulob.notificationdsl");
		result.add("de.dubmas.modulob.generator");
		result.add("de.dubmas.modulob.generator.common");
		
		result.add("org.eclipse.xpand");
		result.add("org.eclipse.xtend");
		result.add("org.eclipse.xtext");
		result.add("org.eclipse.emf.mwe2.launch");
		result.add("org.eclipse.emf.mwe.utils");
		result.add("org.eclipse.xtend.typesystem.emf");
		result.add("org.eclipse.xtend.util.stdlib");
		
		return result;
	}
	
	@Override
	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("UTF-8");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("de::dubmas::modulob::ui::wizard::SystemDslNewProject::main", getProjectInfo());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
}
