package de.dubmas.modulob;

import org.eclipse.emf.ecore.EObject;

public interface ICommentExtractor {
	
	public String commentForModelElement(EObject modelElement);
}
