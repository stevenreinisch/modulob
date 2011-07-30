/*
* generated by Xtext
*/
grammar InternalInterfaceDsl;

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
import de.dubmas.modulob.services.InterfaceDslGrammarAccess;

}

@parser::members {
 
 	private InterfaceDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(InterfaceDslGrammarAccess grammarAccess) {
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




// Entry rule entryRuleInterfaceModel
entryRuleInterfaceModel 
:
{ before(grammarAccess.getInterfaceModelRule()); }
	 ruleInterfaceModel
{ after(grammarAccess.getInterfaceModelRule()); } 
	 EOF 
;

// Rule InterfaceModel
ruleInterfaceModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInterfaceModelAccess().getGroup()); }
(rule__InterfaceModel__Group__0)
{ after(grammarAccess.getInterfaceModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInterface
entryRuleInterface 
:
{ before(grammarAccess.getInterfaceRule()); }
	 ruleInterface
{ after(grammarAccess.getInterfaceRule()); } 
	 EOF 
;

// Rule Interface
ruleInterface
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInterfaceAccess().getGroup()); }
(rule__Interface__Group__0)
{ after(grammarAccess.getInterfaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMethod
entryRuleMethod 
:
{ before(grammarAccess.getMethodRule()); }
	 ruleMethod
{ after(grammarAccess.getMethodRule()); } 
	 EOF 
;

// Rule Method
ruleMethod
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMethodAccess().getGroup()); }
(rule__Method__Group__0)
{ after(grammarAccess.getMethodAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParameter
entryRuleParameter 
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParameterAccess().getGroup()); }
(rule__Parameter__Group__0)
{ after(grammarAccess.getParameterAccess().getGroup()); }
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



rule__InterfaceModel__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__InterfaceModel__Group__0__Impl
	rule__InterfaceModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceModel__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceModelAccess().getInterfacesForModuleKeyword_0()); }

	'interfaces for module' 

{ after(grammarAccess.getInterfaceModelAccess().getInterfacesForModuleKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__InterfaceModel__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__InterfaceModel__Group__1__Impl
	rule__InterfaceModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceModel__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceModelAccess().getModuleAssignment_1()); }
(rule__InterfaceModel__ModuleAssignment_1)
{ after(grammarAccess.getInterfaceModelAccess().getModuleAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__InterfaceModel__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__InterfaceModel__Group__2__Impl
	rule__InterfaceModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceModel__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceModelAccess().getVersionKeyword_2()); }

	'version' 

{ after(grammarAccess.getInterfaceModelAccess().getVersionKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__InterfaceModel__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__InterfaceModel__Group__3__Impl
	rule__InterfaceModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceModel__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceModelAccess().getVersionAssignment_3()); }
(rule__InterfaceModel__VersionAssignment_3)
{ after(grammarAccess.getInterfaceModelAccess().getVersionAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__InterfaceModel__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__InterfaceModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceModel__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4()); }
(rule__InterfaceModel__InterfacesAssignment_4)
{ after(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4()); }
)
(
{ before(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4()); }
(rule__InterfaceModel__InterfacesAssignment_4)*
{ after(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Interface__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__0__Impl
	rule__Interface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); }

	'interface' 

{ after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__1__Impl
	rule__Interface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); }
(rule__Interface__NameAssignment_1)
{ after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__2__Impl
	rule__Interface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getGroup_2()); }
(rule__Interface__Group_2__0)?
{ after(grammarAccess.getInterfaceAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__3__Impl
	rule__Interface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__4__Impl
	rule__Interface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getMethodsAssignment_4()); }
(rule__Interface__MethodsAssignment_4)*
{ after(grammarAccess.getInterfaceAccess().getMethodsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Interface__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_2__0__Impl
	rule__Interface__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRequiresKeyword_2_0()); }

	'requires' 

{ after(grammarAccess.getInterfaceAccess().getRequiresKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_2__1__Impl
	rule__Interface__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_1()); }
(rule__Interface__RequiredInterfacesAssignment_2_1)
{ after(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getGroup_2_2()); }
(rule__Interface__Group_2_2__0)*
{ after(grammarAccess.getInterfaceAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Interface__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_2_2__0__Impl
	rule__Interface__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getInterfaceAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_2_1()); }
(rule__Interface__RequiredInterfacesAssignment_2_2_1)
{ after(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Method__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__0__Impl
	rule__Method__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getIsStaticAssignment_0()); }
(rule__Method__IsStaticAssignment_0)?
{ after(grammarAccess.getMethodAccess().getIsStaticAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__1__Impl
	rule__Method__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getTypeAssignment_1()); }
(rule__Method__TypeAssignment_1)
{ after(grammarAccess.getMethodAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__2__Impl
	rule__Method__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getNameAssignment_2()); }
(rule__Method__NameAssignment_2)
{ after(grammarAccess.getMethodAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__3__Impl
	rule__Method__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getParametersAssignment_3()); }
(rule__Method__ParametersAssignment_3)*
{ after(grammarAccess.getMethodAccess().getParametersAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getSemicolonKeyword_4()); }
(
	';' 
)?
{ after(grammarAccess.getMethodAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Parameter__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__0__Impl
	rule__Parameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getSignaturePartAssignment_0()); }
(rule__Parameter__SignaturePartAssignment_0)?
{ after(grammarAccess.getParameterAccess().getSignaturePartAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__1__Impl
	rule__Parameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getParameterAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__2__Impl
	rule__Parameter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getTypeAssignment_2()); }
(rule__Parameter__TypeAssignment_2)
{ after(grammarAccess.getParameterAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameAssignment_3()); }
(rule__Parameter__NameAssignment_3)
{ after(grammarAccess.getParameterAccess().getNameAssignment_3()); }
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







rule__InterfaceModel__ModuleAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceModelAccess().getModuleModuleCrossReference_1_0()); }
(
{ before(grammarAccess.getInterfaceModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getInterfaceModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getInterfaceModelAccess().getModuleModuleCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceModel__VersionAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); }
	RULE_STRING{ after(grammarAccess.getInterfaceModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceModel__InterfacesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceModelAccess().getInterfacesInterfaceParserRuleCall_4_0()); }
	ruleInterface{ after(grammarAccess.getInterfaceModelAccess().getInterfacesInterfaceParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__RequiredInterfacesAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_2_1_0()); }
(
{ before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__RequiredInterfacesAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__MethodsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_4_0()); }
	ruleMethod{ after(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Method__IsStaticAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_0_0()); }
(
{ before(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_0_0()); }

	'static' 

{ after(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_0_0()); }
)

{ after(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Method__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getTypeTypeRefParserRuleCall_1_0()); }
	ruleTypeRef{ after(grammarAccess.getMethodAccess().getTypeTypeRefParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Method__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Method__ParametersAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); }
	ruleParameter{ after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__SignaturePartAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getSignaturePartIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getParameterAccess().getSignaturePartIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_2_0()); }
	ruleTypeRef{ after(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); }
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


