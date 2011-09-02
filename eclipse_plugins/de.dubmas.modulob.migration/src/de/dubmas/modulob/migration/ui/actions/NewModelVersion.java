package de.dubmas.modulob.migration.ui.actions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtend.XtendFacade;

import de.mdelab.modelmanagement.core.modification.adapters.EMFMetaModelAdapter;
import de.mdelab.modelmanagement.core.modification.adapters.EMFModelAdapter;
import de.mdelab.spi.mom.MOM;
import de.mdelab.spi.process.interpreter.MOMInterpreter;

public class NewModelVersion implements IObjectActionDelegate {

	/*
	 * model mgmgt fields
	 */
	private static final String obligationRelTypeName = "NewEntityModelVersion";
	
	private EMFMetaModelAdapter emfMMAdapter;
	private EMFModelAdapter emfAdapter;
	private MOM mom;
	
	private MOMInterpreter momInterpreter = MOMInterpreter.INSTANCE;
	
	/*
	 * util fields
	 */
	private XtendFacade xf;
	
	/*
	 * ui fields
	 */
	private Shell shell;
	private ISelection selection;
	
//	private void setupModelMgmgt(){
//		emfMMAdapter = new EMFMetaModelAdapter();
//		emfAdapter   = new EMFModelAdapter();
//		
//		IMOMProjectCore core = CoreManager.getAllCores().get(0);
//		mom = core.getMOM();
//		
//		xf = XtendFacade.create("de::dubmas::modulob::migration::modelmanagement::Util");
//		xf.registerMetaModel(new EmfRegistryMetaModel());
//		relType = (MOMObligationRelationType)xf.call("relationTypeForName", mom, obligationRelTypeName);
//	}
	
	@Override
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for(Object selected: ((IStructuredSelection) selection).toList()){
				if (selected instanceof IFile) {
					IFile file = (IFile) selected;
					if(file.getLocation().getFileExtension().equals("mob")){
						
						List<Object> artifacts = new LinkedList<Object>();
						artifacts.add(file);
						
						Map<String, Object> ctx = new HashMap<String, Object>();
						ctx.put(MOMInterpreter.CTX_MATCH_ARTIFACTS_KEY, artifacts);
						
						momInterpreter.instantiateRelationType(obligationRelTypeName, ctx);
						
//						setupModelMgmgt();
						
						/*
						 * Create match for source parameter: Map<MOMParameterType, MOMArtifact>.
						 * Match for source is sufficient because the related MOMObligationRelationType
						 * has only one source paramType. For the target paramType there must not
						 * be a match because the corresponding param instance is created upon
						 * the instantiation of the MOMObligationRelationType through the 
						 * LocalizationManager.
						 */
						
						/*
						 * 1. get corresponding MOMArtifact from core 
						 */
//						MOMArtifact artifact = emfAdapter.getArtifact(file, mom);
//						
//						/*
//						 * 2. get corresponding parameterType from relationType.
//						 */
//						//MOMParameterType pType = relType.getSource().get(0);
//						MOMParameterType pType = 
//							(MOMParameterType)xf.call("parameterTypeForArtifactType", 
//													  relType, 
//													  artifact.getInstanceOf());
//						
//						Map<MOMParameterType, MOMArtifact> match = new HashMap<MOMParameterType, MOMArtifact>();
//						match.put(pType, artifact);
//						
//						//3. trigger relation creation
//						LocalizationManager.get().createRelation(relType, null, match);
					}
				}
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

}
