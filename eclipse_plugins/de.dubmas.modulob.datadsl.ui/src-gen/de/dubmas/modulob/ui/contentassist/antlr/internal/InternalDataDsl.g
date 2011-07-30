/*
* generated by Xtext
*/
grammar InternalDataDsl;

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
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.dubmas.modulob.services.DataDslGrammarAccess;

}

@parser::members {
 
 	private DataDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(DataDslGrammarAccess grammarAccess) {
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




// Entry rule entryRuleEntityModel
entryRuleEntityModel 
:
{ before(grammarAccess.getEntityModelRule()); }
	 ruleEntityModel
{ after(grammarAccess.getEntityModelRule()); } 
	 EOF 
;

// Rule EntityModel
ruleEntityModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntityModelAccess().getGroup()); }
(rule__EntityModel__Group__0)
{ after(grammarAccess.getEntityModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEntity
entryRuleEntity 
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntityAccess().getGroup()); }
(rule__Entity__Group__0)
{ after(grammarAccess.getEntityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAnnotation
entryRuleAnnotation 
:
{ before(grammarAccess.getAnnotationRule()); }
	 ruleAnnotation
{ after(grammarAccess.getAnnotationRule()); } 
	 EOF 
;

// Rule Annotation
ruleAnnotation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAnnotationAccess().getGroup()); }
(rule__Annotation__Group__0)
{ after(grammarAccess.getAnnotationAccess().getGroup()); }
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




// Rule ConfigOption
ruleConfigOption
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration()); }
(	'persistency' 
)
{ after(grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule ConfigValue
ruleConfigValue
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration()); }
(	'CoreData' 
)
{ after(grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration()); }
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



rule__EntityModel__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityModel__Group__0__Impl
	rule__EntityModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityModel__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_0()); }

	'entities for module' 

{ after(grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityModel__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityModel__Group__1__Impl
	rule__EntityModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityModel__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityModelAccess().getModuleAssignment_1()); }
(rule__EntityModel__ModuleAssignment_1)
{ after(grammarAccess.getEntityModelAccess().getModuleAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityModel__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityModel__Group__2__Impl
	rule__EntityModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityModel__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityModelAccess().getVersionKeyword_2()); }

	'version' 

{ after(grammarAccess.getEntityModelAccess().getVersionKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityModel__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityModel__Group__3__Impl
	rule__EntityModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityModel__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityModelAccess().getVersionAssignment_3()); }
(rule__EntityModel__VersionAssignment_3)
{ after(grammarAccess.getEntityModelAccess().getVersionAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityModel__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityModel__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getEntityModelAccess().getEntitiesAssignment_4()); }
(rule__EntityModel__EntitiesAssignment_4)
{ after(grammarAccess.getEntityModelAccess().getEntitiesAssignment_4()); }
)
(
{ before(grammarAccess.getEntityModelAccess().getEntitiesAssignment_4()); }
(rule__EntityModel__EntitiesAssignment_4)*
{ after(grammarAccess.getEntityModelAccess().getEntitiesAssignment_4()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Entity__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); }
(rule__Entity__AnnotationsAssignment_0)*
{ after(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getIsAbstractAssignment_1()); }
(rule__Entity__IsAbstractAssignment_1)?
{ after(grammarAccess.getEntityAccess().getIsAbstractAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getEntityKeyword_2()); }

	'entity' 

{ after(grammarAccess.getEntityAccess().getEntityKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameAssignment_3()); }
(rule__Entity__NameAssignment_3)
{ after(grammarAccess.getEntityAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__4__Impl
	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getGroup_4()); }
(rule__Entity__Group_4__0)?
{ after(grammarAccess.getEntityAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__5__Impl
	rule__Entity__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__6__Impl
	rule__Entity__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getFeaturesAssignment_6()); }
(rule__Entity__FeaturesAssignment_6)*
{ after(grammarAccess.getEntityAccess().getFeaturesAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Entity__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_4__0__Impl
	rule__Entity__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getColonKeyword_4_0()); }

	':' 

{ after(grammarAccess.getEntityAccess().getColonKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getSuperAssignment_4_1()); }
(rule__Entity__SuperAssignment_4_1)
{ after(grammarAccess.getEntityAccess().getSuperAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Annotation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group__0__Impl
	rule__Annotation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); }

	'@' 

{ after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group__1__Impl
	rule__Annotation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getOptionAssignment_1()); }
(rule__Annotation__OptionAssignment_1)
{ after(grammarAccess.getAnnotationAccess().getOptionAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getGroup_2()); }
(rule__Annotation__Group_2__0)?
{ after(grammarAccess.getAnnotationAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Annotation__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group_2__0__Impl
	rule__Annotation__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getColonKeyword_2_0()); }

	':' 

{ after(grammarAccess.getAnnotationAccess().getColonKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getValueAssignment_2_1()); }
(rule__Annotation__ValueAssignment_2_1)
{ after(grammarAccess.getAnnotationAccess().getValueAssignment_2_1()); }
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







rule__EntityModel__ModuleAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_1_0()); }
(
{ before(grammarAccess.getEntityModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getEntityModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EntityModel__VersionAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); }
	RULE_STRING{ after(grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EntityModel__EntitiesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_4_0()); }
	ruleEntity{ after(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__AnnotationsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	ruleAnnotation{ after(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__IsAbstractAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_1_0()); }
(
{ before(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_1_0()); }

	'abstract' 

{ after(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_1_0()); }
)

{ after(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__SuperAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getSuperEntityCrossReference_4_1_0()); }
(
{ before(grammarAccess.getEntityAccess().getSuperEntityIDTerminalRuleCall_4_1_0_1()); }
	RULE_ID{ after(grammarAccess.getEntityAccess().getSuperEntityIDTerminalRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getEntityAccess().getSuperEntityCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FeaturesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0()); }
	ruleFeature{ after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__OptionAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); }
	ruleConfigOption{ after(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__ValueAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); }
	ruleConfigValue{ after(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); }
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
{ before(grammarAccess.getFeatureAccess().getInverseFeatureIDTerminalRuleCall_5_1_0_1()); }
	RULE_ID{ after(grammarAccess.getFeatureAccess().getInverseFeatureIDTerminalRuleCall_5_1_0_1()); }
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


