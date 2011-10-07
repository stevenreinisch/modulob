package de.dubmas.modulob.state.diagram.graphiti;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class DiagramTypeProvider extends AbstractDiagramTypeProvider {

	public DiagramTypeProvider() {
		super();
		setFeatureProvider(new FeatureProvider(this));
	}
}
