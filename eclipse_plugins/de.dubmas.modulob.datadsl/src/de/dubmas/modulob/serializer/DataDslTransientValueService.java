package de.dubmas.modulob.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

import de.dubmas.modulob.Annotation;
import de.dubmas.modulob.ModulobPackage;

public class DataDslTransientValueService extends DefaultTransientValueService {
	
	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		if (owner instanceof Annotation && ModulobPackage.ANNOTATION__VALUE == feature.getFeatureID()) {
			//return ((Annotation) owner).getValue() != null;
			return false;
		}
		return super.isTransient(owner, feature, index);
	}
}
