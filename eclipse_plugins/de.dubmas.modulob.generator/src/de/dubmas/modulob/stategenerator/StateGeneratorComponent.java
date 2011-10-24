package de.dubmas.modulob.stategenerator;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import com.google.inject.Injector;

import de.dubmas.modulob.state.StateMachine;
import de.dubmas.modulob.util.queries.StateMachineQueries;

public class StateGeneratorComponent extends AbstractWorkflowComponent2 {

	private StateMachineQueries queries = new StateMachineQueries();
	
	private Injector injector;
	private List<String> slotNames = newArrayList();
	private Map<String,String> outlets = newHashMap();

	
	/**
	 * registering an {@link ISetup}, which causes the execution of {@link ISetup#createInjectorAndDoEMFRegistration()}
	 * the resulting {@link com.google.inject.Inject} is stored and used to obtain the used {@link IGenerator}. 
	 */
	public void setRegister(ISetup setup) {
		injector = setup.createInjectorAndDoEMFRegistration();
	}
	
	/**
	 * sets the {@link Injector} to be used to obtain the used {@link IGenerator} instance.
	 */
	public void setInjector(Injector injector) {
		this.injector = injector;
	}
	
	/**
	 * adds a slot name to look for {@link Resource}s (the slot's contents might be a Resource or an Iterable of Resources).
	 */
	public void addSlot(String slot) {
		this.slotNames.add(slot);
	}

	public void preInvoke() {
		if (slotNames.isEmpty())
			throw new IllegalStateException("no 'slot' has been configured.");
		if (injector == null)
			throw new IllegalStateException("no Injector has been configured. Use 'register' with an ISetup or 'injector' directly.");
		if (outlets.isEmpty())
			throw new IllegalStateException("no 'outlet' has been configured.");
			
		for (Entry<String, String> outlet : outlets.entrySet()) {
			if (outlet.getKey()==null)
				throw new IllegalStateException("One of the outlets was configured without a name");
			if (outlet.getValue()==null)
				throw new IllegalStateException("The path of outle '"+outlet.getKey()+"' was null.");
		}
	}
	
	private void doChecks(WorkflowContext ctx, Issues issues){
		for (String slot : slotNames) {
			Object object = ctx.get(slot);
			if (object == null) {
				issues.addError("Slot '"+slot+"' was empty!");
			}
			if (object instanceof Iterable) {
				Iterable<?> iterable = (Iterable<?>) object;
				for (Object object2 : iterable) {
					if (!(object2 instanceof Resource)) {
						issues.addError("Slot contents was not a Resource but a '"+object.getClass().getSimpleName()+"'!");
					}
					checkResource((Resource)object2, issues);
				}
			} else if (object instanceof Resource) {
				checkResource((Resource)object, issues);
			} else {
				issues.addError("Slot contents was not a Resource but a '"+object.getClass().getSimpleName()+"'!");
			}
		}
	}
	
	private void checkResource(Resource r, Issues issues){
		if(r.getContents().size() == 0){
			issues.addError("Resource does not contain any element!", r);
		}
		
		Object obj = r.getContents().get(0);
		if (obj instanceof StateMachine) {
			StateMachine sm = (StateMachine) obj;
			
			if(sm.getName() == null){
				issues.addError("StateMachine must have a name", sm);
			}
			
			if(sm.getModule() == null){
				issues.addError("Module for StateMachine: " + sm.getName() + " must be set!", sm);
			}
		} else {
			issues.addError("Resource does not contain a StateMachine but !" + obj.getClass().getSimpleName(), r);
		}
	}
	
	public static class Outlet {
		
		private String outletName = IFileSystemAccess.DEFAULT_OUTPUT;
		private String path;
		
		public void setOutletName(String outputName) {
			this.outletName = outputName;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getOutletName() {
			return outletName;
		}
		public String getPath() {
			return path;
		}
	}
	
	/**
	 * an outlet is defined by a name and a path.
	 * The generator will internally choose one of the configured outlets when generating a file.
	 * the given path defines the root directory of the outlet.
	 */
	public void addOutlet(Outlet out) {
		outlets.put(out.outletName,out.path);
	}
	
	//public void invoke(IWorkflowContext ctx) {
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		doChecks(ctx, issues);
		
		if(issues.hasWarnings() || issues.hasErrors()){
			return;
		}
		
		IGenerator instance = getCompiler();
		IFileSystemAccess fileSystemAccess = getConfiguredFileSystemAccess();
		for (String slot : slotNames) {
			Object object = ctx.get(slot);
			if (object == null) {
				throw new IllegalStateException("Slot '"+slot+"' was empty!");
			}
			if (object instanceof Iterable) {
				Iterable<?> iterable = (Iterable<?>) object;
				for (Object object2 : iterable) {
					if (!(object2 instanceof Resource)) {
						throw new IllegalStateException("Slot contents was not a Resource but a '"+object.getClass().getSimpleName()+"'!");
					}
					instance.doGenerate((Resource) object2, fileSystemAccess);
				}
			} else if (object instanceof Resource) {
				instance.doGenerate((Resource) object, fileSystemAccess);
			} else {
				throw new IllegalStateException("Slot contents was not a Resource but a '"+object.getClass().getSimpleName()+"'!");
			}
		}
	}

	protected IGenerator getCompiler() {
		return injector.getInstance(IGenerator.class);
	}

	protected IFileSystemAccess getConfiguredFileSystemAccess() {
		final JavaIoFileSystemAccess configuredFileSystemAccess = injector.getInstance(JavaIoFileSystemAccess.class);
		for (Entry<String, String> outs : outlets.entrySet()) {
			configuredFileSystemAccess.setOutputPath(outs.getKey(), outs.getValue());
		}
		return configuredFileSystemAccess;
	}

	public void postInvoke() {
		
	}
}
