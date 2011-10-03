package de.dubmas.modulob;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.google.inject.Inject;

import de.dubmas.modulob.services.DataDslGrammarAccess;

public class CommentExtractor implements ICommentExtractor{
	
	private final DataDslGrammarAccess ga;
	
	@Inject
	public CommentExtractor(DataDslGrammarAccess ga) {
		this.ga = ga;
	}
	
	public String commentForModelElement(EObject modelElement){
		ICompositeNode root = NodeModelUtils.getNode(modelElement).getRootNode();
		
		for(INode node: root.getAsTreeIterable()){
			EObject grammarElement = node.getGrammarElement();
			if(grammarElement == ga.getDOC_COMMENTRule())
			{
				EObject e = node.getNextSibling().getSemanticElement();
				String comment = node.getText();
				System.out.println(comment);
				if(e == modelElement){
					
				}
			}
		}
		
		return null;
	}
}
