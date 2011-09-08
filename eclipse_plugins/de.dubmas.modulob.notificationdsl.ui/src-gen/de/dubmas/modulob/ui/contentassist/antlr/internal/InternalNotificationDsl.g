/*
* generated by Xtext
*/
grammar InternalNotificationDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package de.dubmas.modulob.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.dubmas.modulob.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.dubmas.modulob.services.NotificationDslGrammarAccess;

}

@parser::members {
 
 	private NotificationDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(NotificationDslGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleNotificationModel
entryRuleNotificationModel 
:
{ before(grammarAccess.getNotificationModelRule()); }
	 ruleNotificationModel
{ after(grammarAccess.getNotificationModelRule()); } 
	 EOF 
;

// Rule NotificationModel
ruleNotificationModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNotificationModelAccess().getGroup()); }
(rule__NotificationModel__Group__0)
{ after(grammarAccess.getNotificationModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNotification
entryRuleNotification 
:
{ before(grammarAccess.getNotificationRule()); }
	 ruleNotification
{ after(grammarAccess.getNotificationRule()); } 
	 EOF 
;

// Rule Notification
ruleNotification
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNotificationAccess().getGroup()); }
(rule__Notification__Group__0)
{ after(grammarAccess.getNotificationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRulePrimitive
entryRulePrimitive 
:
{ before(grammarAccess.getPrimitiveRule()); }
	 rulePrimitive
{ after(grammarAccess.getPrimitiveRule()); } 
	 EOF 
;

// Rule Primitive
rulePrimitive
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPrimitiveAccess().getGroup()); }
(rule__Primitive__Group__0)
{ after(grammarAccess.getPrimitiveAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAny
entryRuleAny 
:
{ before(grammarAccess.getAnyRule()); }
	 ruleAny
{ after(grammarAccess.getAnyRule()); } 
	 EOF 
;

// Rule Any
ruleAny
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAnyAccess().getGroup()); }
(rule__Any__Group__0)
{ after(grammarAccess.getAnyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFeature
entryRuleFeature 
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFeatureAccess().getGroup()); }
(rule__Feature__Group__0)
{ after(grammarAccess.getFeatureAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTypeRef
entryRuleTypeRef 
:
{ before(grammarAccess.getTypeRefRule()); }
	 ruleTypeRef
{ after(grammarAccess.getTypeRefRule()); } 
	 EOF 
;

// Rule TypeRef
ruleTypeRef
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeRefAccess().getGroup()); }
(rule__TypeRef__Group__0)
{ after(grammarAccess.getTypeRefAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleValueObject
entryRuleValueObject 
:
{ before(grammarAccess.getValueObjectRule()); }
	 ruleValueObject
{ after(grammarAccess.getValueObjectRule()); } 
	 EOF 
;

// Rule ValueObject
ruleValueObject
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getValueObjectAccess().getAlternatives()); }
(rule__ValueObject__Alternatives)
{ after(grammarAccess.getValueObjectAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStringValue
entryRuleStringValue 
:
{ before(grammarAccess.getStringValueRule()); }
	 ruleStringValue
{ after(grammarAccess.getStringValueRule()); } 
	 EOF 
;

// Rule StringValue
ruleStringValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStringValueAccess().getValueAssignment()); }
(rule__StringValue__ValueAssignment)
{ after(grammarAccess.getStringValueAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEStringObject
entryRuleEStringObject 
:
{ before(grammarAccess.getEStringObjectRule()); }
	 ruleEStringObject
{ after(grammarAccess.getEStringObjectRule()); } 
	 EOF 
;

// Rule EStringObject
ruleEStringObject
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); }
	RULE_STRING
{ after(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIntegerValue
entryRuleIntegerValue 
:
{ before(grammarAccess.getIntegerValueRule()); }
	 ruleIntegerValue
{ after(grammarAccess.getIntegerValueRule()); } 
	 EOF 
;

// Rule IntegerValue
ruleIntegerValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIntegerValueAccess().getValueAssignment()); }
(rule__IntegerValue__ValueAssignment)
{ after(grammarAccess.getIntegerValueAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEIntegerObject
entryRuleEIntegerObject 
:
{ before(grammarAccess.getEIntegerObjectRule()); }
	 ruleEIntegerObject
{ after(grammarAccess.getEIntegerObjectRule()); } 
	 EOF 
;

// Rule EIntegerObject
ruleEIntegerObject
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); }
	RULE_INT
{ after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFloatValue
entryRuleFloatValue 
:
{ before(grammarAccess.getFloatValueRule()); }
	 ruleFloatValue
{ after(grammarAccess.getFloatValueRule()); } 
	 EOF 
;

// Rule FloatValue
ruleFloatValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFloatValueAccess().getValueAssignment()); }
(rule__FloatValue__ValueAssignment)
{ after(grammarAccess.getFloatValueAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEFloatObject
entryRuleEFloatObject 
:
{ before(grammarAccess.getEFloatObjectRule()); }
	 ruleEFloatObject
{ after(grammarAccess.getEFloatObjectRule()); } 
	 EOF 
;

// Rule EFloatObject
ruleEFloatObject
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEFloatObjectAccess().getGroup()); }
(rule__EFloatObject__Group__0)
{ after(grammarAccess.getEFloatObjectAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__ValueObject__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); }
	ruleStringValue
{ after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); }
	ruleIntegerValue
{ after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); }
	ruleFloatValue
{ after(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__NotificationModel__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NotificationModel__Group__0__Impl
	rule__NotificationModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NotificationModel__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationModelAccess().getNotificationsForModuleKeyword_0()); }

	'notifications for module' 

{ after(grammarAccess.getNotificationModelAccess().getNotificationsForModuleKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NotificationModel__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NotificationModel__Group__1__Impl
	rule__NotificationModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NotificationModel__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationModelAccess().getModuleAssignment_1()); }
(rule__NotificationModel__ModuleAssignment_1)
{ after(grammarAccess.getNotificationModelAccess().getModuleAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NotificationModel__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NotificationModel__Group__2__Impl
	rule__NotificationModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NotificationModel__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationModelAccess().getVersionKeyword_2()); }

	'version' 

{ after(grammarAccess.getNotificationModelAccess().getVersionKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NotificationModel__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NotificationModel__Group__3__Impl
	rule__NotificationModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NotificationModel__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationModelAccess().getVersionAssignment_3()); }
(rule__NotificationModel__VersionAssignment_3)
{ after(grammarAccess.getNotificationModelAccess().getVersionAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NotificationModel__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NotificationModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NotificationModel__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); }
(rule__NotificationModel__NotificationsAssignment_4)
{ after(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); }
)
(
{ before(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); }
(rule__NotificationModel__NotificationsAssignment_4)*
{ after(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Notification__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Notification__Group__0__Impl
	rule__Notification__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Notification__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationAccess().getNotificationKeyword_0()); }

	'notification' 

{ after(grammarAccess.getNotificationAccess().getNotificationKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Notification__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Notification__Group__1__Impl
	rule__Notification__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Notification__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationAccess().getNameAssignment_1()); }
(rule__Notification__NameAssignment_1)
{ after(grammarAccess.getNotificationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Notification__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Notification__Group__2__Impl
	rule__Notification__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Notification__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Notification__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Notification__Group__3__Impl
	rule__Notification__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Notification__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationAccess().getFeaturesAssignment_3()); }
(rule__Notification__FeaturesAssignment_3)*
{ after(grammarAccess.getNotificationAccess().getFeaturesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Notification__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Notification__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Notification__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}













rule__Primitive__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Primitive__Group__0__Impl
	rule__Primitive__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); }

	'primitive type' 

{ after(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Primitive__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Primitive__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); }
(rule__Primitive__NameAssignment_1)
{ after(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Any__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Any__Group__0__Impl
	rule__Any__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); }

	'any type' 

{ after(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Any__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Any__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnyAccess().getNameAssignment_1()); }
(rule__Any__NameAssignment_1)
{ after(grammarAccess.getAnyAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Feature__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getIsIndexedAssignment_0()); }
(rule__Feature__IsIndexedAssignment_0)?
{ after(grammarAccess.getFeatureAccess().getIsIndexedAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getIsContainmentAssignment_1()); }
(rule__Feature__IsContainmentAssignment_1)?
{ after(grammarAccess.getFeatureAccess().getIsContainmentAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__2__Impl
	rule__Feature__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getTypeAssignment_2()); }
(rule__Feature__TypeAssignment_2)
{ after(grammarAccess.getFeatureAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__3__Impl
	rule__Feature__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameAssignment_3()); }
(rule__Feature__NameAssignment_3)
{ after(grammarAccess.getFeatureAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__4__Impl
	rule__Feature__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getGroup_4()); }
(rule__Feature__Group_4__0)?
{ after(grammarAccess.getFeatureAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__5__Impl
	rule__Feature__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getGroup_5()); }
(rule__Feature__Group_5__0)?
{ after(grammarAccess.getFeatureAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getSemicolonKeyword_6()); }
(
	';' 
)?
{ after(grammarAccess.getFeatureAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Feature__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_4__0__Impl
	rule__Feature__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0()); }

	'=' 

{ after(grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getDefaultValueAssignment_4_1()); }
(rule__Feature__DefaultValueAssignment_4_1)
{ after(grammarAccess.getFeatureAccess().getDefaultValueAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Feature__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_5__0__Impl
	rule__Feature__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0()); }

	'<->' 

{ after(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getInverseAssignment_5_1()); }
(rule__Feature__InverseAssignment_5_1)
{ after(grammarAccess.getFeatureAccess().getInverseAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__TypeRef__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeRef__Group__0__Impl
	rule__TypeRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); }
(rule__TypeRef__ReferencedAssignment_0)
{ after(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TypeRef__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeRef__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); }
(rule__TypeRef__IsMultiAssignment_1)?
{ after(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EFloatObject__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EFloatObject__Group__0__Impl
	rule__EFloatObject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EFloatObject__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); }
(
	'-' 
)?
{ after(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EFloatObject__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EFloatObject__Group__1__Impl
	rule__EFloatObject__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EFloatObject__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); }
(	RULE_INT)?
{ after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EFloatObject__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EFloatObject__Group__2__Impl
	rule__EFloatObject__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EFloatObject__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); }

	'.' 

{ after(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EFloatObject__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EFloatObject__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EFloatObject__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); }
	RULE_INT
{ after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__NotificationModel__ModuleAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationModelAccess().getModuleModuleCrossReference_1_0()); }
(
{ before(grammarAccess.getNotificationModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getNotificationModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getNotificationModelAccess().getModuleModuleCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NotificationModel__VersionAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); }
	RULE_STRING{ after(grammarAccess.getNotificationModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NotificationModel__NotificationsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationModelAccess().getNotificationsNotificationParserRuleCall_4_0()); }
	ruleNotification{ after(grammarAccess.getNotificationModelAccess().getNotificationsNotificationParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Notification__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Notification__FeaturesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_3_0()); }
	ruleFeature{ after(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Primitive__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Any__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__IsIndexedAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); }
(
{ before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); }

	'indexed' 

{ after(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); }
)

{ after(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__IsContainmentAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); }
(
{ before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); }

	'-[' 

{ after(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); }
)

{ after(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); }
	ruleTypeRef{ after(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__DefaultValueAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); }
	ruleValueObject{ after(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__InverseAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); }
(
{ before(grammarAccess.getFeatureAccess().getInverseFeatureQualifiedNameParserRuleCall_5_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getFeatureAccess().getInverseFeatureQualifiedNameParserRuleCall_5_1_0_1()); }
)
{ after(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__ReferencedAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); }
(
{ before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); }
)
{ after(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__IsMultiAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); }
(
{ before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); }

	'[]' 

{ after(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); }
)

{ after(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StringValue__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); }
	ruleEStringObject{ after(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValue__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); }
	ruleEIntegerObject{ after(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FloatValue__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); }
	ruleEFloatObject{ after(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


