/*
* generated by Xtext
*/
grammar InternalBehaviourDsl;

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
import de.dubmas.modulob.services.BehaviourDslGrammarAccess;

}

@parser::members {
 
 	private BehaviourDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(BehaviourDslGrammarAccess grammarAccess) {
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




// Entry rule entryRuleBehaviouralModel
entryRuleBehaviouralModel 
:
{ before(grammarAccess.getBehaviouralModelRule()); }
	 ruleBehaviouralModel
{ after(grammarAccess.getBehaviouralModelRule()); } 
	 EOF 
;

// Rule BehaviouralModel
ruleBehaviouralModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBehaviouralModelAccess().getGroup()); }
(rule__BehaviouralModel__Group__0)
{ after(grammarAccess.getBehaviouralModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBehaviour
entryRuleBehaviour 
:
{ before(grammarAccess.getBehaviourRule()); }
	 ruleBehaviour
{ after(grammarAccess.getBehaviourRule()); } 
	 EOF 
;

// Rule Behaviour
ruleBehaviour
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBehaviourAccess().getGroup()); }
(rule__Behaviour__Group__0)
{ after(grammarAccess.getBehaviourAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleReaction
entryRuleReaction 
:
{ before(grammarAccess.getReactionRule()); }
	 ruleReaction
{ after(grammarAccess.getReactionRule()); } 
	 EOF 
;

// Rule Reaction
ruleReaction
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getReactionAccess().getGroup()); }
(rule__Reaction__Group__0)
{ after(grammarAccess.getReactionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleReferenceableMethodName
entryRuleReferenceableMethodName 
:
{ before(grammarAccess.getReferenceableMethodNameRule()); }
	 ruleReferenceableMethodName
{ after(grammarAccess.getReferenceableMethodNameRule()); } 
	 EOF 
;

// Rule ReferenceableMethodName
ruleReferenceableMethodName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getReferenceableMethodNameAccess().getGroup()); }
(rule__ReferenceableMethodName__Group__0)
{ after(grammarAccess.getReferenceableMethodNameAccess().getGroup()); }
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







rule__BehaviouralModel__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BehaviouralModel__Group__0__Impl
	rule__BehaviouralModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviouralModel__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviouralModelAccess().getBehavioursForSystemKeyword_0()); }

	'behaviours for system' 

{ after(grammarAccess.getBehaviouralModelAccess().getBehavioursForSystemKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BehaviouralModel__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BehaviouralModel__Group__1__Impl
	rule__BehaviouralModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviouralModel__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviouralModelAccess().getSystemAssignment_1()); }
(rule__BehaviouralModel__SystemAssignment_1)
{ after(grammarAccess.getBehaviouralModelAccess().getSystemAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BehaviouralModel__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BehaviouralModel__Group__2__Impl
	rule__BehaviouralModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviouralModel__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviouralModelAccess().getVersionKeyword_2()); }

	'version' 

{ after(grammarAccess.getBehaviouralModelAccess().getVersionKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BehaviouralModel__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BehaviouralModel__Group__3__Impl
	rule__BehaviouralModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviouralModel__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviouralModelAccess().getVersionAssignment_3()); }
(rule__BehaviouralModel__VersionAssignment_3)
{ after(grammarAccess.getBehaviouralModelAccess().getVersionAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BehaviouralModel__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BehaviouralModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviouralModel__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviouralModelAccess().getBehavioursAssignment_4()); }
(rule__BehaviouralModel__BehavioursAssignment_4)*
{ after(grammarAccess.getBehaviouralModelAccess().getBehavioursAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Behaviour__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Behaviour__Group__0__Impl
	rule__Behaviour__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Behaviour__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviourAccess().getBehaviourKeyword_0()); }

	'behaviour' 

{ after(grammarAccess.getBehaviourAccess().getBehaviourKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Behaviour__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Behaviour__Group__1__Impl
	rule__Behaviour__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Behaviour__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviourAccess().getNameAssignment_1()); }
(rule__Behaviour__NameAssignment_1)
{ after(grammarAccess.getBehaviourAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Behaviour__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Behaviour__Group__2__Impl
	rule__Behaviour__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Behaviour__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviourAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getBehaviourAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Behaviour__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Behaviour__Group__3__Impl
	rule__Behaviour__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Behaviour__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviourAccess().getReactionsAssignment_3()); }
(rule__Behaviour__ReactionsAssignment_3)*
{ after(grammarAccess.getBehaviourAccess().getReactionsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Behaviour__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Behaviour__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Behaviour__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviourAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getBehaviourAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Reaction__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reaction__Group__0__Impl
	rule__Reaction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getInterfaceKeyword_0()); }

	'interface' 

{ after(grammarAccess.getReactionAccess().getInterfaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reaction__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reaction__Group__1__Impl
	rule__Reaction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getInterfaceAssignment_1()); }
(rule__Reaction__InterfaceAssignment_1)
{ after(grammarAccess.getReactionAccess().getInterfaceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reaction__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reaction__Group__2__Impl
	rule__Reaction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getReactsToKeyword_2()); }

	'reacts to' 

{ after(grammarAccess.getReactionAccess().getReactsToKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reaction__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reaction__Group__3__Impl
	rule__Reaction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getNotificationAssignment_3()); }
(rule__Reaction__NotificationAssignment_3)
{ after(grammarAccess.getReactionAccess().getNotificationAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reaction__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reaction__Group__4__Impl
	rule__Reaction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getGroup_4()); }
(rule__Reaction__Group_4__0)?
{ after(grammarAccess.getReactionAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reaction__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reaction__Group__5__Impl
	rule__Reaction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getByCallingKeyword_5()); }

	'by calling' 

{ after(grammarAccess.getReactionAccess().getByCallingKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reaction__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reaction__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getMethodAssignment_6()); }
(rule__Reaction__MethodAssignment_6)
{ after(grammarAccess.getReactionAccess().getMethodAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Reaction__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reaction__Group_4__0__Impl
	rule__Reaction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getAsKeyword_4_0()); }

	'as' 

{ after(grammarAccess.getReactionAccess().getAsKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reaction__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reaction__Group_4__1__Impl
	rule__Reaction__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getOrderAssignment_4_1()); }
(rule__Reaction__OrderAssignment_4_1)
{ after(grammarAccess.getReactionAccess().getOrderAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reaction__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reaction__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getFullStopKeyword_4_2()); }

	'.' 

{ after(grammarAccess.getReactionAccess().getFullStopKeyword_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ReferenceableMethodName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReferenceableMethodName__Group__0__Impl
	rule__ReferenceableMethodName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceableMethodName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceableMethodNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getReferenceableMethodNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReferenceableMethodName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReferenceableMethodName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceableMethodName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceableMethodNameAccess().getGroup_1()); }
(rule__ReferenceableMethodName__Group_1__0)*
{ after(grammarAccess.getReferenceableMethodNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ReferenceableMethodName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReferenceableMethodName__Group_1__0__Impl
	rule__ReferenceableMethodName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceableMethodName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceableMethodNameAccess().getColonKeyword_1_0()); }

	':' 

{ after(grammarAccess.getReferenceableMethodNameAccess().getColonKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReferenceableMethodName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReferenceableMethodName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceableMethodName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceableMethodNameAccess().getIDTerminalRuleCall_1_1()); }
(	RULE_ID)?
{ after(grammarAccess.getReferenceableMethodNameAccess().getIDTerminalRuleCall_1_1()); }
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







rule__BehaviouralModel__SystemAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviouralModelAccess().getSystemSystemCrossReference_1_0()); }
(
{ before(grammarAccess.getBehaviouralModelAccess().getSystemSystemQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getBehaviouralModelAccess().getSystemSystemQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getBehaviouralModelAccess().getSystemSystemCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviouralModel__VersionAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviouralModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); }
	RULE_STRING{ after(grammarAccess.getBehaviouralModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviouralModel__BehavioursAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviouralModelAccess().getBehavioursBehaviourParserRuleCall_4_0()); }
	ruleBehaviour{ after(grammarAccess.getBehaviouralModelAccess().getBehavioursBehaviourParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Behaviour__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviourAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getBehaviourAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Behaviour__ReactionsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviourAccess().getReactionsReactionParserRuleCall_3_0()); }
	ruleReaction{ after(grammarAccess.getBehaviourAccess().getReactionsReactionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__InterfaceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getInterfaceInterfaceCrossReference_1_0()); }
(
{ before(grammarAccess.getReactionAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getReactionAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getReactionAccess().getInterfaceInterfaceCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__NotificationAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getNotificationNotificationCrossReference_3_0()); }
(
{ before(grammarAccess.getReactionAccess().getNotificationNotificationQualifiedNameParserRuleCall_3_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getReactionAccess().getNotificationNotificationQualifiedNameParserRuleCall_3_0_1()); }
)
{ after(grammarAccess.getReactionAccess().getNotificationNotificationCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__OrderAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getOrderINTTerminalRuleCall_4_1_0()); }
	RULE_INT{ after(grammarAccess.getReactionAccess().getOrderINTTerminalRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Reaction__MethodAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReactionAccess().getMethodMethodCrossReference_6_0()); }
(
{ before(grammarAccess.getReactionAccess().getMethodMethodReferenceableMethodNameParserRuleCall_6_0_1()); }
	ruleReferenceableMethodName{ after(grammarAccess.getReactionAccess().getMethodMethodReferenceableMethodNameParserRuleCall_6_0_1()); }
)
{ after(grammarAccess.getReactionAccess().getMethodMethodCrossReference_6_0()); }
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

