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

import de.dubmas.modulob.services.NotificationDslGrammarAccess;

public class NotificationDslParser extends AbstractContentAssistParser {
	
	@Inject
	private NotificationDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.dubmas.modulob.ui.contentassist.antlr.internal.InternalNotificationDslParser createParser() {
		de.dubmas.modulob.ui.contentassist.antlr.internal.InternalNotificationDslParser result = new de.dubmas.modulob.ui.contentassist.antlr.internal.InternalNotificationDslParser(null);
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
					put(grammarAccess.getNotificationModelAccess().getGroup(), "rule__NotificationModel__Group__0");
					put(grammarAccess.getNotificationAccess().getGroup(), "rule__Notification__Group__0");
					put(grammarAccess.getTypeLibAccess().getGroup(), "rule__TypeLib__Group__0");
					put(grammarAccess.getPrimitiveAccess().getGroup(), "rule__Primitive__Group__0");
					put(grammarAccess.getAnyAccess().getGroup(), "rule__Any__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup_4(), "rule__Feature__Group_4__0");
					put(grammarAccess.getFeatureAccess().getGroup_5(), "rule__Feature__Group_5__0");
					put(grammarAccess.getTypeRefAccess().getGroup(), "rule__TypeRef__Group__0");
					put(grammarAccess.getEFloatObjectAccess().getGroup(), "rule__EFloatObject__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getNotificationModelAccess().getModuleAssignment_1(), "rule__NotificationModel__ModuleAssignment_1");
					put(grammarAccess.getNotificationModelAccess().getVersionAssignment_3(), "rule__NotificationModel__VersionAssignment_3");
					put(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4(), "rule__NotificationModel__NotificationsAssignment_4");
					put(grammarAccess.getNotificationAccess().getNameAssignment_1(), "rule__Notification__NameAssignment_1");
					put(grammarAccess.getNotificationAccess().getFeaturesAssignment_3(), "rule__Notification__FeaturesAssignment_3");
					put(grammarAccess.getTypeLibAccess().getPrimitiveTypesAssignment_0(), "rule__TypeLib__PrimitiveTypesAssignment_0");
					put(grammarAccess.getTypeLibAccess().getAnyTypeAssignment_1(), "rule__TypeLib__AnyTypeAssignment_1");
					put(grammarAccess.getPrimitiveAccess().getNameAssignment_1(), "rule__Primitive__NameAssignment_1");
					put(grammarAccess.getAnyAccess().getNameAssignment_1(), "rule__Any__NameAssignment_1");
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
			de.dubmas.modulob.ui.contentassist.antlr.internal.InternalNotificationDslParser typedParser = (de.dubmas.modulob.ui.contentassist.antlr.internal.InternalNotificationDslParser) parser;
			typedParser.entryRuleNotificationModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public NotificationDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(NotificationDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
