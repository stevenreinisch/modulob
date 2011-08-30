/*
* generated by Xtext
*/
package de.dubmas.modulob.common.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.dubmas.modulob.common.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {
	
	@Inject
	private DslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.dubmas.modulob.common.ui.contentassist.antlr.internal.InternalDslParser createParser() {
		de.dubmas.modulob.common.ui.contentassist.antlr.internal.InternalDslParser result = new de.dubmas.modulob.common.ui.contentassist.antlr.internal.InternalDslParser(null);
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
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup_4(), "rule__Feature__Group_4__0");
					put(grammarAccess.getFeatureAccess().getGroup_5(), "rule__Feature__Group_5__0");
					put(grammarAccess.getTypeRefAccess().getGroup(), "rule__TypeRef__Group__0");
					put(grammarAccess.getEFloatObjectAccess().getGroup(), "rule__EFloatObject__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getFeatureAccess().getIsIndexedAssignment_0(), "rule__Feature__IsIndexedAssignment_0");
					put(grammarAccess.getFeatureAccess().getIsContainmentAssignment_1(), "rule__Feature__IsContainmentAssignment_1");
					put(grammarAccess.getFeatureAccess().getTypeAssignment_2(), "rule__Feature__TypeAssignment_2");
					put(grammarAccess.getFeatureAccess().getNameAssignment_3(), "rule__Feature__NameAssignment_3");
					put(grammarAccess.getFeatureAccess().getDefaultValueAssignment_4_1(), "rule__Feature__DefaultValueAssignment_4_1");
					put(grammarAccess.getFeatureAccess().getInverseAssignment_5_1(), "rule__Feature__InverseAssignment_5_1");
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
			de.dubmas.modulob.common.ui.contentassist.antlr.internal.InternalDslParser typedParser = (de.dubmas.modulob.common.ui.contentassist.antlr.internal.InternalDslParser) parser;
			typedParser.entryRuleFeature();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}