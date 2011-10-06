package de.dubmas.modulob.ui.wizard.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.osgi.framework.Bundle;

import de.dubmas.modulob.ui.internal.SystemDslActivator;
import de.dubmas.modulob.ui.wizard.SystemDslProjectCreator;
import de.dubmas.modulob.util.ShellCommandExecutor;

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
		result.add("de.dubmas.modulob.behaviour.dsl");
		result.add("de.dubmas.modulob.generator");
		result.add("de.dubmas.modulob.generator.common");
		result.add("de.dubmas.modulob.util");
		
		result.add("org.eclipse.xpand");
		result.add("org.eclipse.xtend");
		result.add("org.eclipse.xtext");
		result.add("org.eclipse.emf.mwe2.launch");
		result.add("org.eclipse.emf.mwe.utils");
		result.add("org.eclipse.xtend.typesystem.emf");
		result.add("org.eclipse.xtend.util.stdlib");
		result.add("org.eclipse.xtext.xbase.lib");
		
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
		facade.evaluate("de::dubmas::modulob::ui::wizard::util::SystemDslNewProject::main", getProjectInfo());

		copyFormattingFiles(project);
		
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
	
	private void copyFormattingFiles(final IProject project){
		Bundle bundle = SystemDslActivator.getInstance().getBundle();
		IPath scriptPath = copyFile("formatting/formatSource.sh"     , "formatSource.sh",      project, bundle);
		IPath binaryPath = copyFile("formatting/uncrustify_osx",       "uncrustify_osx",       project, bundle);
		
		copyFile("formatting/uncrustify_obj_c.cfg", "uncrustify_obj_c.cfg", project, bundle);
		
		//make script and binary executable
		try {
			ShellCommandExecutor.execute("chmod", "+x", scriptPath.toString());
			ShellCommandExecutor.execute("chmod", "+x", binaryPath.toString());
		} catch (Exception e) {
			//TODO: write to error log
		}
	}
	
	private IPath copyFile(String sourcePath, String destinationPath, IProject project, Bundle bundle) {
		try {
			bundle             = SystemDslActivator.getInstance().getBundle();
			IPath scriptPath   = new Path(sourcePath);
			InputStream stream = FileLocator.openStream( bundle, scriptPath, false );
			IFile file         = project.getFile(destinationPath);
			file.create( stream, true, null );
			
			return file.getLocation();
		} catch (Exception e){
			//TODO: write to error log
		}
		return null;
	}
}
