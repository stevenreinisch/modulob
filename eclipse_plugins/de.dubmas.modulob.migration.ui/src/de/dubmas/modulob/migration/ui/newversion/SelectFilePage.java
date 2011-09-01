package de.dubmas.modulob.migration.ui.newversion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.xtext.ui.XtextProjectHelper;

import de.dubmas.modulob.psee.ui.wizard.AbstractInteractiveActivityWizard;

public class SelectFilePage extends WizardPage implements SelectionListener{

	public static final String SELECTED_FILE_KEY           = "selectedFile";
	private static final String FILE_EXTENSION_OF_INTEREST = "modat";
	private static final Set<String> EXCLUDED_FOLDER_NAMES = new HashSet<String>();
	
	static{
		EXCLUDED_FOLDER_NAMES.add("bin");
	}
	
	private Composite mainComposite;
	private Combo filesDropDown;
	private List<IFile> files;
	private Map<String, Object> slots;
	
	public SelectFilePage(String pageName) {
		super(pageName);
		files = new LinkedList<IFile>();
	}

	@Override
	public void createControl(Composite parent) {
		
		mainComposite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 2;
	    gl.numColumns = ncol;
	    mainComposite.setLayout(gl);
	    setControl(mainComposite);
		
		slots = ((AbstractInteractiveActivityWizard)this.getWizard()).getSlots();
		
		/*
		 * 1. scan workspace for *.modat files
		 */
		try {
			collectFilesFromWorkspace(FILE_EXTENSION_OF_INTEREST, EXCLUDED_FOLDER_NAMES, files);
			List<String> fileNames = fileNamesFromFiles(files);
		    
		    new Label (mainComposite, SWT.NONE).setText("File name:");
		    
		    filesDropDown  = new Combo(mainComposite, SWT.DROP_DOWN);
		    String[] items = fileNames.toArray(new String[fileNames.size()]);
		    filesDropDown.setItems (items);
		    
		    filesDropDown.addSelectionListener(this);
		    
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public boolean isPageComplete() {
		return slots.containsKey(SELECTED_FILE_KEY);
	}
	
	@Override
	public boolean canFlipToNextPage(){
		return slots.containsKey(SELECTED_FILE_KEY);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		onSelection(e);
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		onSelection(e);
	}
	
	private void onSelection(SelectionEvent e){
		if(e.getSource() == filesDropDown) {
			int index = ((Combo)e.getSource()).getSelectionIndex();
			if(index > -1){
				slots.put(SELECTED_FILE_KEY, files.get(index));
				
				getWizard().getContainer().updateButtons();
			}
		}
	}
	
	private List<String> fileNamesFromFiles(List<IFile> files){
		List<String> names = new ArrayList<String>(files.size());
		for(IFile file: files){
			names.add(file.getName());
		}
		return names;
	}
	
	private void collectFilesFromWorkspace(String interestedFileExtension, Set<String> excludedFolderNames, Collection<IFile> collection) throws Exception{
		for(IProject project: ResourcesPlugin.getWorkspace().getRoot().getProjects()){
			if(project.getNature(XtextProjectHelper.NATURE_ID) != null){
				addAllFilesWithExtension(project, interestedFileExtension, excludedFolderNames, collection);
			}
		}
	}
	
	private void addAllFilesWithExtension(IContainer container, String extension, Set<String> excludedFolderNames, Collection<IFile> collection) throws Exception{
		for(IResource res: container.members()){
			if (res instanceof IFile) {
				IFile file = (IFile) res;
				if(file.getFileExtension().equals(extension)){
					collection.add(file);
				}
			} else if ((res instanceof IFolder) && !excludedFolderNames.contains(res.getName())) {
				addAllFilesWithExtension((IFolder)res, extension, excludedFolderNames, collection);
			}
		}
	}
}
