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

import de.dubmas.modulob.services.InterfaceDslGrammarAccess;

public class InterfaceDslParser extends AbstractContentAssistParser {
	
	@Inject
	private InterfaceDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.dubmas.modulob.ui.contentassist.antlr.internal.InternalInterfaceDslParser createParser() {
		de.dubmas.modulob.ui.contentassist.antlr.internal.InternalInterfaceDslParser result = new de.dubmas.modulob.ui.contentassist.antlr.internal.InternalInterfaceDslParser(null);
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
					put(grammarAccess.getInterfaceModelAccess().getGroup(), "rule__InterfaceModel__Group__0");
					put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
					put(grammarAccess.getInterfaceAccess().getGroup_2(), "rule__Interface__Group_2__0");
					put(grammarAccess.getInterfaceAccess().getGroup_2_2(), "rule__Interface__Group_2_2__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup_4(), "rule__Feature__Group_4__0");
					put(grammarAccess.getFeatureAccess().getGroup_5(), "rule__Feature__Group_5__0");
					put(grammarAccess.getTypeRefAccess().getGroup(), "rule__TypeRef__Group__0");
					put(grammarAccess.getEFloatObjectAccess().getGroup(), "rule__EFloatObject__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getInterfaceModelAccess().getModuleAssignment_1(), "rule__InterfaceModel__ModuleAssignment_1");
					put(grammarAccess.getInterfaceModelAccess().getVersionAssignment_3(), "rule__InterfaceModel__VersionAssignment_3");
					put(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4(), "rule__InterfaceModel__InterfacesAssignment_4");
					put(grammarAccess.getInterfaceAccess().getNameAssignment_1(), "rule__Interface__NameAssignment_1");
					put(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_1(), "rule__Interface__RequiredInterfacesAssignment_2_1");
					put(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_2_1(), "rule__Interface__RequiredInterfacesAssignment_2_2_1");
					put(grammarAccess.getInterfaceAccess().getMethodsAssignment_4(), "rule__Interface__MethodsAssignment_4");
					put(grammarAccess.getMethodAccess().getIsStaticAssignment_0(), "rule__Method__IsStaticAssignment_0");
					put(grammarAccess.getMethodAccess().getTypeAssignment_1(), "rule__Method__TypeAssignment_1");
					put(grammarAccess.getMethodAccess().getNameAssignment_2(), "rule__Method__NameAssignment_2");
					put(grammarAccess.getMethodAccess().getParametersAssignment_3(), "rule__Method__ParametersAssignment_3");
					put(grammarAccess.getParameterAccess().getSignaturePartAssignment_0(), "rule__Parameter__SignaturePartAssignment_0");
					put(grammarAccess.getParameterAccess().getTypeAssignment_2(), "rule__Parameter__TypeAssignment_2");
					put(grammarAccess.getParameterAccess().getNameAssignment_3(), "rule__Parameter__NameAssignment_3");
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
			de.dubmas.modulob.ui.contentassist.antlr.internal.InternalInterfaceDslParser typedParser = (de.dubmas.modulob.ui.contentassist.antlr.internal.InternalInterfaceDslParser) parser;
			typedParser.entryRuleInterfaceModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public InterfaceDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(InterfaceDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
