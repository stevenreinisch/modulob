package de.dubmas.modulob.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class DataDslCrossReferenceSerializer extends CrossReferenceSerializer {
	
	@Inject
	private IQualifiedNameProvider qnProvider;
	
	@Override
	public String serializeCrossRef(EObject semanticObject, CrossReference crossref, EObject target, INode node, Acceptor errors) 
	{
		QualifiedName qn = qnProvider.getFullyQualifiedName(target);
		if(qn != null && qn.getSegmentCount() > 0){
			return qn.toString();
		}
		
		return super.serializeCrossRef(semanticObject, crossref, target, node, errors);
	}
}
