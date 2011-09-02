package de.dubmas.modulob.migration.ui.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

public class CreateEntityMigration implements IObjectActionDelegate {

	private Shell shell;

	private ISelection selection;
	
	@Override
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			List<ISelection> selectedObjects = ((IStructuredSelection) selection).toList();
			
			if(selectedObjects.size() != 2){
				System.out.println("ERROR: select exactly 2 files for migration");
				return;
			}else{
				List<IFile> mobFiles = new ArrayList<IFile>(2);
				for(Object selected: selectedObjects){
					if (selected instanceof IFile) {
						IFile file = (IFile) selected;
						if(file.getLocation().getFileExtension().equals("mob")){
							System.out.println("Found modulob file");
							mobFiles.add(file);
						}else{
							System.out.println("ERROR: only select mob files");
							return;
						}
					}else{
						System.out.println("ERROR: only select mob files");
						return;
					}
				}
				
				Collections.sort(mobFiles, new Comparator<IFile>(){
					@Override
					public int compare(IFile f1, IFile f2) {
						if(f1.getLocalTimeStamp() > f2.getLocalTimeStamp()){
							return 1;
						}else if(f1.getLocalTimeStamp() < f2.getLocalTimeStamp()){
							return -1;
						}
						return 0;
					}
				});
				
				//DEBUG
				System.out.println("oldest: " + mobFiles.get(0));
				System.out.println("newest: " + mobFiles.get(1));
				//DEBUG
				
				ResourceSet rs = new ResourceSetImpl();
				Resource oldestResource = rs.getResource(URI.createFileURI(mobFiles.get(0).getLocation().toString()), true);
				Resource newestResource = rs.getResource(URI.createFileURI(mobFiles.get(1).getLocation().toString()), true);
				try {
					oldestResource.load(Collections.EMPTY_MAP);
					newestResource.load(Collections.EMPTY_MAP);
					
					EObject oldestModel = oldestResource.getContents().get(0);
					EObject newestModel = newestResource.getContents().get(0);
					
					Map<String, Object> options = new HashMap<String, Object>(); 
					options.put(MatchOptions.OPTION_DISTINCT_METAMODELS, false);
					MatchModel match = MatchService.doMatch(newestModel, oldestModel, options); 
					DiffModel diff = DiffService.doDiff(match, false);
					
					XtendFacade xf = XtendFacade.create("de::dubmas::modulob::migration::transformation::DiffToMigration");
					xf.registerMetaModel(new EmfRegistryMetaModel());
					Object result = xf.call("transform", diff, match);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
