/*
* generated by Xtext
*/
package de.dubmas.modulob.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.dubmas.modulob.services.SystemDslGrammarAccess;

public class SystemDslParser extends AbstractContentAssistParser {
	
	@Inject
	private SystemDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.dubmas.modulob.ui.contentassist.antlr.internal.InternalSystemDslParser createParser() {
		de.dubmas.modulob.ui.contentassist.antlr.internal.InternalSystemDslParser result = new de.dubmas.modulob.ui.contentassist.antlr.internal.InternalSystemDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getValueObjectAccess().getAlternatives(), "rule__ValueObject__Alternatives");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getSystemAccess().getGroup_4(), "rule__System__Group_4__0");
					put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
					put(grammarAccess.getTypeLibAccess().getGroup(), "rule__TypeLib__Group__0");
					put(grammarAccess.getPrimitiveAccess().getGroup(), "rule__Primitive__Group__0");
					put(grammarAccess.getAnyAccess().getGroup(), "rule__Any__Group__0");
					put(grammarAccess.getTypeRefAccess().getGroup(), "rule__TypeRef__Group__0");
					put(grammarAccess.getEFloatObjectAccess().getGroup(), "rule__EFloatObject__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
					put(grammarAccess.getSystemAccess().getModulesAssignment_3(), "rule__System__ModulesAssignment_3");
					put(grammarAccess.getSystemAccess().getModulesAssignment_4_1(), "rule__System__ModulesAssignment_4_1");
					put(grammarAccess.getModuleAccess().getCommentAssignment_0(), "rule__Module__CommentAssignment_0");
					put(grammarAccess.getModuleAccess().getNameAssignment_2(), "rule__Module__NameAssignment_2");
					put(grammarAccess.getTypeLibAccess().getPrimitiveTypesAssignment_0(), "rule__TypeLib__PrimitiveTypesAssignment_0");
					put(grammarAccess.getTypeLibAccess().getAnyTypeAssignment_1(), "rule__TypeLib__AnyTypeAssignment_1");
					put(grammarAccess.getPrimitiveAccess().getNameAssignment_1(), "rule__Primitive__NameAssignment_1");
					put(grammarAccess.getAnyAccess().getNameAssignment_1(), "rule__Any__NameAssignment_1");
					put(grammarAccess.getTypeRefAccess().getReferencedAssignment_0(), "rule__TypeRef__ReferencedAssignment_0");
					put(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1(), "rule__TypeRef__IsMultiAssignment_1");
					put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
					put(grammarAccess.getIntegerValueAccess().getValueAssignment(), "rule__IntegerValue__ValueAssignment");
					put(grammarAccess.getFloatValueAccess().getValueAssignment(), "rule__FloatValue__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.dubmas.modulob.ui.contentassist.antlr.internal.InternalSystemDslParser typedParser = (de.dubmas.modulob.ui.contentassist.antlr.internal.InternalSystemDslParser) parser;
			typedParser.entryRuleSystem();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SystemDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SystemDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
