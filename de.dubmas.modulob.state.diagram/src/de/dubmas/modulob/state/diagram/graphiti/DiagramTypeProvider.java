package de.dubmas.modulob.state.diagram.graphiti;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class DiagramTypeProvider extends AbstractDiagramTypeProvider {

	public static final String DIAGRAM_TYPE_ID = "modulobStateMachine";
	public static final String DIAGRAM_TYPEPROVIDER_ID = "de.dubmas.modulob.state.diagramtypeprovider";
	
	private IToolBehaviorProvider[] toolBehaviorProviders;
	
	public DiagramTypeProvider() {
		super();
		setFeatureProvider(new FeatureProvider(this));
	}
	
	@Override
	public boolean isAutoUpdateAtStartup() {
		return true;
	}
	
	@Override
	public boolean isAutoUpdateAtRuntime() {
		return true;
	}
	
	@Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders =
                new IToolBehaviorProvider[] { new ToolBehaviourProvider(this) };
        }
        return toolBehaviorProviders;
    }
}
