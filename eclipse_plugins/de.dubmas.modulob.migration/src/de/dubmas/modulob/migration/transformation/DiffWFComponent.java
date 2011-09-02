package de.dubmas.modulob.migration.transformation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchEngineRegistry;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.runtime.workflow.AbstractCompositeWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class DiffWFComponent extends AbstractCompositeWorkflowComponent{
	
	/*
	 * slot vars
	 */
	
	private String oldModelSlotName;
	private String newModelSlotName;
	
	private String diffModelSlotName;
	private String matchModelSlotName;
	
	/*
	 * slot var setters
	 */
	
	public void setOldModelSlotName(String oldModelSlotName){
		this.oldModelSlotName = oldModelSlotName;
	}
	
	public void setNewModelSlotName(String newModelSlotName){
		this.newModelSlotName = newModelSlotName;
	}
	
	public void setDiffModelSlotName(String diffModelSlotName){
		this.diffModelSlotName = diffModelSlotName;
	}
	
	public void setMatchModelSlotName(String matchModelSlotName){
		this.matchModelSlotName = matchModelSlotName;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.mwe2.runtime.workflow.AbstractCompositeWorkflowComponent#invoke(org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext)
	 */
	 public void invoke(IWorkflowContext ctx)
	 {
		 EObject oldModel = (EObject)ctx.get(oldModelSlotName);
		 EObject newModel = (EObject)ctx.get(newModelSlotName);
		 
		 Map<String, Object> options = new HashMap<String, Object>();
		 options.put(MatchOptions.OPTION_DISTINCT_METAMODELS, false);
		 options.put(MatchOptions.OPTION_IGNORE_XMI_ID, true);
		 
		 /*
		  * use the registry in standalone mode. else use extension point.
		  */
		 MatchEngineRegistry.INSTANCE.putValue("mob", new ModulobMatchEngine());
		 
		 try {
			 MatchModel matchModel = MatchService.doMatch(newModel, oldModel, options);
			 DiffModel diffModel   = DiffService.doDiff(matchModel, false);
			 
			 ctx.put(diffModelSlotName, diffModel);
			 ctx.put(matchModelSlotName, matchModel);
		 } catch (Exception e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }
	 }
}
