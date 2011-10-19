package de.dubmas.modulob.state.diagram.graphiti.property;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.inject.Injector;

import de.dubmas.modulob.state.StateMachine;
import de.dubmas.modulob.state.StatePackage;
import de.dubmas.modulob.state.diagram.util.Util;
import de.dubmas.modulob.system.SystemPackage;
import de.dubmas.modulob.ui.internal.SystemDslActivator;

public class StateMachineSection extends GFPropertySection implements
ITabbedPropertyConstants {

	private Text nameField;
	private Combo modulesDropDown;
	
	private Injector injector;
	private IResourceDescriptions index;
	
	private List<IEObjectDescription> moduleDescriptions;
	private StateMachine stateMachine;
	private IDiagramTypeProvider diagramTypeProvider;
	
	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) 
	{
		super.createControls(parent, tabbedPropertySheetPage);
				
		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite;
		CLabel valueLabel;
		FormData data;

		composite = factory.createFlatFormComposite(parent);
		nameField = factory.createText(composite, "");
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, VSPACE);
		nameField.setLayoutData(data);

		valueLabel = factory.createCLabel(composite, "Name:");
		data = new FormData();
		data.width = 20;
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(nameField, -HSPACE);
		data.top = new FormAttachment(nameField, 0, SWT.CENTER);
		valueLabel.setLayoutData(data);

		nameField.addModifyListener(listener);

		// //
		composite = factory.createFlatFormComposite(parent);

		modulesDropDown = new Combo(composite, SWT.DROP_DOWN);
		String[] items = moduleNames();
		modulesDropDown.setItems (items);
		
		modulesDropDown.addSelectionListener(selectionListener);

		valueLabel = factory.createCLabel(composite, "Module:");
		data = new FormData();
		data.width = 20;
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(nameField, -HSPACE);
		data.top = new FormAttachment(nameField, 0, SWT.CENTER);
		valueLabel.setLayoutData(data);
	}
	
	private String[] moduleNames() {
		injector = SystemDslActivator.getInstance().getInjector("de.dubmas.modulob.SystemDsl");
		index   = injector.getInstance(IResourceDescriptions.class);
		
		moduleDescriptions = 
				IterableExtensions.toList(
						index.getExportedObjectsByType(
								SystemPackage.eINSTANCE.getModule()));
		
		List<String> moduleNames = 
			IterableExtensions.toList(
				IterableExtensions.map(moduleDescriptions, new Function1<IEObjectDescription, String>(){
					@Override
					public String apply(IEObjectDescription desc) {
						return desc.getName().toString();
					}	
				}));
		
		return moduleNames.toArray(new String[moduleNames.size()]);
	}
	
	 	@Override
	    public void refresh() {
	    	
	    	this.diagramTypeProvider = this.getDiagramTypeProvider();
	    	
	        PictogramElement pe = getSelectedPictogramElement();
	        if (pe instanceof Diagram) {
	            try {
					this.stateMachine = Util.stateMachine;
					
					if(this.stateMachine != null){
						String name = stateMachine.getName();
						nameField.setText(name == null ? "" : name);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    }
	 	
	 	
	 	
	 //////
	 	
	 	private ModifyListener listener = new ModifyListener(){

			@Override
			public void modifyText(ModifyEvent e) {
				if(stateMachine != null){
					try {
						String text = ((Text)e.getSource()).getText();
						
						if(text != null && !text.equals("")){
							
							EditingDomain editingDomain =
									diagramTypeProvider.getDiagramEditor().getEditingDomain();
							
							if (editingDomain != null && e.getSource() == nameField){
							
								editingDomain.getCommandStack().
									execute(SetCommand.create(
												editingDomain, 
												stateMachine, 
												StatePackage.eINSTANCE.getStateMachine_Name(), 
												text));
							}
						}
					} catch (Exception ex){
						ex.printStackTrace();
						//TODO: write to error log
					}
				}
			}
		};
		
		private SelectionListener selectionListener = new SelectionListener(){
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				onSelection(e);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				onSelection(e);
			}
			
			private void onSelection(SelectionEvent e){
				if(e.getSource() == modulesDropDown) {
					int index = ((Combo)e.getSource()).getSelectionIndex();
					if(index > -1){
						try {
							IEObjectDescription desc =
									moduleDescriptions.get(index);
								
							if(desc != null){
									
								EditingDomain editingDomain =
										diagramTypeProvider.getDiagramEditor().getEditingDomain();
									
								if (editingDomain != null){
									
									EObject moduleProxy = desc.getEObjectOrProxy();
									editingDomain.getCommandStack().
										execute(SetCommand.create(editingDomain, 
																  stateMachine, 
																  StatePackage.eINSTANCE.getStateMachine_Module(), 
																  moduleProxy));
								}
							}
						} catch (Exception ex){
							ex.printStackTrace();
							//TODO: write to error log
						}
					}
			}
		}
		};
}
