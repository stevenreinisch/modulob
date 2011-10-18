package de.dubmas.modulob.state.diagram.graphiti;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class DiagramTypeProvider extends AbstractDiagramTypeProvider {

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
}
