package de.dubmas.modulob.state.diagram.graphiti.property;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.dubmas.modulob.state.State;
import de.dubmas.modulob.state.StatePackage;

public class StateSection extends GFPropertySection implements
ITabbedPropertyConstants {
	
	private Text durationField;
	private Text nameField;
	private State state;
	private IDiagramTypeProvider diagramTypeProvider;
	 
	private ModifyListener listener = new ModifyListener(){

		@Override
		public void modifyText(ModifyEvent e) {
			try {
				String text = ((Text)e.getSource()).getText();
					
				if(text != null && !text.equals("")){
						
					EditingDomain editingDomain =
							diagramTypeProvider.getDiagramEditor().getEditingDomain();
						
					if(editingDomain != null && e.getSource() == durationField) {
						
						Double value = null;
						try {
							value = Double.parseDouble(text);
						} catch (NumberFormatException nfe) {
							value = new Double(0.0);
						}
						
						editingDomain.getCommandStack().
								execute(SetCommand.create(editingDomain, 
														  state, 
														  StatePackage.eINSTANCE.getState_Duration(), 
														  value));
						
					} else if (editingDomain != null && e.getSource() == nameField){
						
						editingDomain.getCommandStack().
							execute(SetCommand.create(editingDomain, 
													  state, 
													  StatePackage.eINSTANCE.getState_Name(), 
													  text));
					}
				}
			} catch (Exception ex){
				ex.printStackTrace();
				//TODO: write to error log
			}
		}
	};
	
    @Override
    public void createControls(Composite parent,
        TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
 
        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite;
        CLabel valueLabel;
        FormData data;
 
//        composite = factory.createFlatFormComposite(parent);
//        nameField = factory.createText(composite, "");
//        data = new FormData();
//        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
//        data.right = new FormAttachment(100, 0);
//        data.top = new FormAttachment(0, VSPACE);
//        nameField.setLayoutData(data);
// 
//        valueLabel = factory.createCLabel(composite, "Name:");
//        data = new FormData();
//        data.width = 20;
//        data.left = new FormAttachment(0, 0);
//        data.right = new FormAttachment(nameField, -HSPACE);
//        data.top = new FormAttachment(nameField, 0, SWT.CENTER);
//        valueLabel.setLayoutData(data);
//        
//        nameField.addModifyListener(listener);
        
        ////
        
        composite = factory.createFlatFormComposite(parent);
        
        durationField = factory.createText(composite, "0.0");
        data = new FormData();
        data.width = 10;
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        durationField.setLayoutData(data);
 
        valueLabel = factory.createCLabel(composite, "Duration (sec):");
        data = new FormData();
        data.width = 200;
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(durationField, -HSPACE);
        data.top = new FormAttachment(durationField, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
        
        durationField.addModifyListener(listener);
    }
 
    @Override
    public void refresh() {
    	
    	this.diagramTypeProvider = this.getDiagramTypeProvider();
    	
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            Object bo = Graphiti.getLinkService()
                 .getBusinessObjectForLinkedPictogramElement(pe);

            if (bo == null || !(bo instanceof State))
                return;
            
            this.state = (State)bo;
            
            String duration = state.getDuration().toString();
            durationField.setText(duration == null ? "" : duration);
        }
    }
}