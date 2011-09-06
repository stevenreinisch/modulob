package de.dubmas.modulob.migration.ui.mapping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.dubmas.modulob.migration.services.IModelFileLister;
import de.dubmas.modulob.migration.services.impl.Util;
import de.dubmas.modulob.migration.services.impl.XtextWorkspaceFileLister;
import de.dubmas.modulob.psee.ui.wizard.AbstractWizardPage;

public class EntityModelsSelectionPage extends AbstractWizardPage implements SelectionListener{

	/*
	 * begin class variables
	 */
	
	public static final String SOURCE_FILE_KEY       = "sourceFile";
	public static final String DESTINATION_FILE_KEY  = "destinationFile";
	
	private static final Set<String> EXCLUDED_FOLDER_NAMES = new HashSet<String>();
	
	static{
		EXCLUDED_FOLDER_NAMES.add("bin");
	}
	
	/*
	 * begin instance variables
	 */
	
	private IModelFileLister fileLister = new XtextWorkspaceFileLister();
	
	private List<IFile> sourceEntityModelFiles;
	private List<IFile> destinationEntityModelFiles;
	
	private Combo sourceFilesDropDown;
	private Combo destinationFilesDropDown;
	
	/*
	 * begin ctors
	 */
	
	public EntityModelsSelectionPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	/*
	 * begin methods
	 */
	
	@Override
	public void createControl(Composite parent) {
		
		super.createControl(parent);
		
		Composite mainComposite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 2;
	    gl.numColumns = ncol;
	    mainComposite.setLayout(gl);
	   
	    setControl(mainComposite);
	    
	    /*
	     * source model
	     */
	    
	    Composite sourceModelComposite = new Composite(mainComposite, SWT.NONE);
	    sourceModelComposite.setLayout(new RowLayout());
	
	    new Label (sourceModelComposite, SWT.NONE).setText("Source:");
	    
	    sourceFilesDropDown          = new Combo(sourceModelComposite, SWT.DROP_DOWN);
	    sourceEntityModelFiles       = fileLister.listAllFiles("modat_v\\S+", EXCLUDED_FOLDER_NAMES);
		List<String> sourceFileNames = Util.fileNamesFromFiles(sourceEntityModelFiles);
	    String[] sourceItems         = sourceFileNames.toArray(new String[sourceFileNames.size()]);
	    
	    sourceFilesDropDown.setItems (sourceItems);
	    
	    sourceFilesDropDown.addSelectionListener(this);
	    
	    /*
	     * destination model
	     */
	    
	    Composite destModelComposite = new Composite(mainComposite, SWT.NONE);
	    destModelComposite.setLayout(new RowLayout());
	    
	    new Label (destModelComposite, SWT.NONE).setText("Destination:");
	    
	    destinationEntityModelFiles = fileLister.listAllFiles("modat", EXCLUDED_FOLDER_NAMES);
		List<String> fileNames      = Util.fileNamesFromFiles(destinationEntityModelFiles);
	    destinationFilesDropDown    = new Combo(destModelComposite, SWT.DROP_DOWN);
	    String[] destinationItems   = fileNames.toArray(new String[fileNames.size()]);
	    
	    destinationFilesDropDown.setItems (destinationItems);
	    
	    destinationFilesDropDown.addSelectionListener(this);
	}
	
	@Override
	public boolean isPageComplete() {
		return slots.containsKey(SOURCE_FILE_KEY) && 
			   slots.containsKey(DESTINATION_FILE_KEY);
	}
	
	@Override
	public boolean canFlipToNextPage(){
		return slots.containsKey(SOURCE_FILE_KEY) && 
			   slots.containsKey(DESTINATION_FILE_KEY);
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
		if(e.getSource() == sourceFilesDropDown) {
			int index = ((Combo)e.getSource()).getSelectionIndex();
			if(index > -1){
				slots.put(SOURCE_FILE_KEY, sourceEntityModelFiles.get(index));
			}
		} else if(e.getSource() == destinationFilesDropDown) {
			int index = ((Combo)e.getSource()).getSelectionIndex();
			if(index > -1){
				slots.put(DESTINATION_FILE_KEY, destinationEntityModelFiles.get(index));
			}
		}
		getWizard().getContainer().updateButtons();
	}
}
