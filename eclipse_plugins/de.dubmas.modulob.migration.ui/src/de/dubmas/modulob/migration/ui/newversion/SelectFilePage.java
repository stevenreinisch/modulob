package de.dubmas.modulob.migration.ui.newversion;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.dubmas.modulob.migration.services.IModelFileLister;
import de.dubmas.modulob.migration.services.impl.Util;
import de.dubmas.modulob.migration.services.impl.XtextWorkspaceFileLister;
import de.dubmas.modulob.psee.ui.wizard.AbstractInteractiveActivityWizard;

public class SelectFilePage extends WizardPage implements SelectionListener{

	public static final String SELECTED_FILE_KEY           = "selectedFile";
	private static final String FILE_EXTENSION_OF_INTEREST = "modat";
	private static final Set<String> EXCLUDED_FOLDER_NAMES = new HashSet<String>();
	
	private IModelFileLister fileLister = new XtextWorkspaceFileLister();
	
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
			files = fileLister.listAllFiles(FILE_EXTENSION_OF_INTEREST, EXCLUDED_FOLDER_NAMES);
			List<String> fileNames = Util.fileNamesFromFiles(files);
		    
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
}
