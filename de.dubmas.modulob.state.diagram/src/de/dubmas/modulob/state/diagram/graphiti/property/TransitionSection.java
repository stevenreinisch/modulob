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

import de.dubmas.modulob.state.StatePackage;
import de.dubmas.modulob.state.Transition;

public class TransitionSection extends GFPropertySection implements
ITabbedPropertyConstants {
	
	private Text guardField;
	private Transition transition;
	private IDiagramTypeProvider diagramTypeProvider;
	 
	private ModifyListener listener = new ModifyListener(){

		@Override
		public void modifyText(ModifyEvent e) {
			try {
				String guard = ((Text)e.getSource()).getText();
					
				if(guard != null && !guard.equals("")){
						
					EditingDomain editingDomain =
							diagramTypeProvider.getDiagramEditor().getEditingDomain();
						
					if(editingDomain != null){
						editingDomain.getCommandStack().
								execute(SetCommand.create(editingDomain, 
														  transition.getGuard(), 
														  StatePackage.eINSTANCE.getCondition_Expression(), 
														  guard));
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
        Composite composite = factory.createFlatFormComposite(parent);
        FormData data;
 
        guardField = factory.createText(composite, "switches if this and that is true");
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        guardField.setLayoutData(data);
 
        CLabel valueLabel = factory.createCLabel(composite, "Guard (Describe why transition switches.):");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(guardField, -HSPACE);
        data.top = new FormAttachment(guardField, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
        
        guardField.addModifyListener(listener);
    }
 
    @Override
    public void refresh() {
    	
    	this.diagramTypeProvider = this.getDiagramTypeProvider();
    	
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            Object bo = Graphiti.getLinkService()
                 .getBusinessObjectForLinkedPictogramElement(pe);

            if (bo == null)
                return;
            
            this.transition = (Transition)bo;
            
            String guard = transition.getGuard().getExpression();
            guardField.setText(guard == null ? "" : guard);
        }
    }
}
