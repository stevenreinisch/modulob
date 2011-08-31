package de.dubmas.modulob.generator.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe2.runtime.workflow.AbstractCompositeWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtend.check.CheckFacade;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

public class CheckBasedTest extends AbstractCompositeWorkflowComponent{
	
	private String modelToBeCheckedSlotName;
	private String checkFileName;
	
	public void setModelToBeCheckedSlotName(String modelToBeCheckedSlotName){
		this.modelToBeCheckedSlotName = modelToBeCheckedSlotName;
	}
	
	public void setCheckFileName(String checkFileName){
		this.checkFileName = checkFileName;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void invoke(IWorkflowContext ctx) {
		Issues issues = new IssuesImpl();
		ExecutionContextImpl exeCtx = new ExecutionContextImpl();
		exeCtx.registerMetaModel(new EmfRegistryMetaModel());
		
		Object slotContent  = ctx.get(modelToBeCheckedSlotName);
		
		List<EObject> list = new ArrayList<EObject>();
		if (slotContent instanceof EObject) {
		
			Iterator<EObject> iter = ((EObject)slotContent).eAllContents();
			while(iter.hasNext()){
				list.add(iter.next());
			}
			
		} else {
			for(EObject object: (List<EObject>)slotContent){
				Iterator<EObject> iter = ((EObject)object).eAllContents();
				while(iter.hasNext()){
					list.add(iter.next());
				}
			}
		}
		
		CheckFacade.checkAll(checkFileName, list, exeCtx, issues);

		if (issues.hasWarnings()) {
			for (MWEDiagnostic d : issues.getWarnings()) {
				System.out.println(d.toString());
			}
		}
		
		if(issues.hasErrors()){
			for(MWEDiagnostic d: issues.getErrors()){
				System.out.println(d.toString());
			}
		}
	}
}
