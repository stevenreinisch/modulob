package de.dubmas.modulob.state.diagram.graphiti.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.util.IColorConstant;


public class AddTransitionFeature extends AbstractAddTransitionFeature{

	public AddTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected Color getColor() {
		return manageColor(IColorConstant.BLACK);
	}
}
