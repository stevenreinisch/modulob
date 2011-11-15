/*
* generated by Xtext
*/

package de.dubmas.modulob.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import de.dubmas.modulob.common.services.DslGrammarAccess;

@Singleton
public class DataDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class EntityModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EntityModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCurrentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cCurrentCurrentKeyword_0_0 = (Keyword)cCurrentAssignment_0.eContents().get(0);
		private final Keyword cEntitiesForModuleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cModuleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cModuleModuleCrossReference_2_0 = (CrossReference)cModuleAssignment_2.eContents().get(0);
		private final RuleCall cModuleModuleQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cModuleModuleCrossReference_2_0.eContents().get(1);
		private final Keyword cVersionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cVersionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cVersionSTRINGTerminalRuleCall_4_0 = (RuleCall)cVersionAssignment_4.eContents().get(0);
		private final Assignment cEntitiesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEntitiesEntityParserRuleCall_5_0 = (RuleCall)cEntitiesAssignment_5.eContents().get(0);
		private final Assignment cEnumsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cEnumsEnumParserRuleCall_6_0 = (RuleCall)cEnumsAssignment_6.eContents().get(0);
		
		//EntityModel returns system::EntityModel:
		//	^current?="current"? "entities for module" module=[system::Module|QualifiedName] "version" version=STRING
		//	entities+=Entity* enums+=Enum*;
		public ParserRule getRule() { return rule; }

		//^current?="current"? "entities for module" module=[system::Module|QualifiedName] "version" version=STRING
		//entities+=Entity* enums+=Enum*
		public Group getGroup() { return cGroup; }

		//^current?="current"?
		public Assignment getCurrentAssignment_0() { return cCurrentAssignment_0; }

		//"current"
		public Keyword getCurrentCurrentKeyword_0_0() { return cCurrentCurrentKeyword_0_0; }

		//"entities for module"
		public Keyword getEntitiesForModuleKeyword_1() { return cEntitiesForModuleKeyword_1; }

		//module=[system::Module|QualifiedName]
		public Assignment getModuleAssignment_2() { return cModuleAssignment_2; }

		//[system::Module|QualifiedName]
		public CrossReference getModuleModuleCrossReference_2_0() { return cModuleModuleCrossReference_2_0; }

		//QualifiedName
		public RuleCall getModuleModuleQualifiedNameParserRuleCall_2_0_1() { return cModuleModuleQualifiedNameParserRuleCall_2_0_1; }

		//"version"
		public Keyword getVersionKeyword_3() { return cVersionKeyword_3; }

		//version=STRING
		public Assignment getVersionAssignment_4() { return cVersionAssignment_4; }

		//STRING
		public RuleCall getVersionSTRINGTerminalRuleCall_4_0() { return cVersionSTRINGTerminalRuleCall_4_0; }

		//entities+=Entity*
		public Assignment getEntitiesAssignment_5() { return cEntitiesAssignment_5; }

		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_5_0() { return cEntitiesEntityParserRuleCall_5_0; }

		//enums+=Enum*
		public Assignment getEnumsAssignment_6() { return cEnumsAssignment_6; }

		//Enum
		public RuleCall getEnumsEnumParserRuleCall_6_0() { return cEnumsEnumParserRuleCall_6_0; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentDOC_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cAnnotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_1_0 = (RuleCall)cAnnotationsAssignment_1.eContents().get(0);
		private final Assignment cIsAbstractAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsAbstractAbstractKeyword_2_0 = (Keyword)cIsAbstractAssignment_2.eContents().get(0);
		private final Keyword cEntityKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSuperAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cSuperEntityCrossReference_5_1_0 = (CrossReference)cSuperAssignment_5_1.eContents().get(0);
		private final RuleCall cSuperEntityQualifiedNameParserRuleCall_5_1_0_1 = (RuleCall)cSuperEntityCrossReference_5_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cFeaturesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cFeaturesFeatureParserRuleCall_7_0 = (RuleCall)cFeaturesAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Entity returns modulob::Entity:
		//	comment=DOC_COMMENT? annotations+=Annotation* isAbstract?="abstract"? "entity" name=ID (":"
		//	super=[modulob::Entity|QualifiedName])? "{" features+=Feature* "}";
		public ParserRule getRule() { return rule; }

		//comment=DOC_COMMENT? annotations+=Annotation* isAbstract?="abstract"? "entity" name=ID (":"
		//super=[modulob::Entity|QualifiedName])? "{" features+=Feature* "}"
		public Group getGroup() { return cGroup; }

		//comment=DOC_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//DOC_COMMENT
		public RuleCall getCommentDOC_COMMENTTerminalRuleCall_0_0() { return cCommentDOC_COMMENTTerminalRuleCall_0_0; }

		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_1() { return cAnnotationsAssignment_1; }

		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_1_0() { return cAnnotationsAnnotationParserRuleCall_1_0; }

		//isAbstract?="abstract"?
		public Assignment getIsAbstractAssignment_2() { return cIsAbstractAssignment_2; }

		//"abstract"
		public Keyword getIsAbstractAbstractKeyword_2_0() { return cIsAbstractAbstractKeyword_2_0; }

		//"entity"
		public Keyword getEntityKeyword_3() { return cEntityKeyword_3; }

		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }

		//(":" super=[modulob::Entity|QualifiedName])?
		public Group getGroup_5() { return cGroup_5; }

		//":"
		public Keyword getColonKeyword_5_0() { return cColonKeyword_5_0; }

		//super=[modulob::Entity|QualifiedName]
		public Assignment getSuperAssignment_5_1() { return cSuperAssignment_5_1; }

		//[modulob::Entity|QualifiedName]
		public CrossReference getSuperEntityCrossReference_5_1_0() { return cSuperEntityCrossReference_5_1_0; }

		//QualifiedName
		public RuleCall getSuperEntityQualifiedNameParserRuleCall_5_1_0_1() { return cSuperEntityQualifiedNameParserRuleCall_5_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }

		//features+=Feature*
		public Assignment getFeaturesAssignment_7() { return cFeaturesAssignment_7; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_7_0() { return cFeaturesFeatureParserRuleCall_7_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Annotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOptionConfigOptionEnumRuleCall_1_0 = (RuleCall)cOptionAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueConfigValueEnumRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//Annotation returns modulob::Annotation:
		//	"@" option=ConfigOption (":" value=ConfigValue)?;
		public ParserRule getRule() { return rule; }

		//"@" option=ConfigOption (":" value=ConfigValue)?
		public Group getGroup() { return cGroup; }

		//"@"
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }

		//option=ConfigOption
		public Assignment getOptionAssignment_1() { return cOptionAssignment_1; }

		//ConfigOption
		public RuleCall getOptionConfigOptionEnumRuleCall_1_0() { return cOptionConfigOptionEnumRuleCall_1_0; }

		//(":" value=ConfigValue)?
		public Group getGroup_2() { return cGroup_2; }

		//":"
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//value=ConfigValue
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }

		//ConfigValue
		public RuleCall getValueConfigValueEnumRuleCall_2_1_0() { return cValueConfigValueEnumRuleCall_2_1_0; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentDOC_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cIsIndexedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsIndexedIndexedKeyword_1_0 = (Keyword)cIsIndexedAssignment_1.eContents().get(0);
		private final Assignment cIsContainmentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0 = (Keyword)cIsContainmentAssignment_2.eContents().get(0);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeRefParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cEqualsSignKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cDefaultValueAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cDefaultValueValueObjectParserRuleCall_5_1_0 = (RuleCall)cDefaultValueAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cLessThanSignHyphenMinusGreaterThanSignKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cInverseAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cInverseFeatureCrossReference_6_1_0 = (CrossReference)cInverseAssignment_6_1.eContents().get(0);
		private final RuleCall cInverseFeatureQualifiedNameParserRuleCall_6_1_0_1 = (RuleCall)cInverseFeatureCrossReference_6_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Feature returns modulob::Feature:
		//	comment=DOC_COMMENT? isIndexed?="indexed"? isContainment?="-["? type=TypeRef name=ID ("=" defaultValue=ValueObject)?
		//	("<->" inverse=[modulob::Feature|QualifiedName])? ";";
		public ParserRule getRule() { return rule; }

		//comment=DOC_COMMENT? isIndexed?="indexed"? isContainment?="-["? type=TypeRef name=ID ("=" defaultValue=ValueObject)?
		//("<->" inverse=[modulob::Feature|QualifiedName])? ";"
		public Group getGroup() { return cGroup; }

		//comment=DOC_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//DOC_COMMENT
		public RuleCall getCommentDOC_COMMENTTerminalRuleCall_0_0() { return cCommentDOC_COMMENTTerminalRuleCall_0_0; }

		//isIndexed?="indexed"?
		public Assignment getIsIndexedAssignment_1() { return cIsIndexedAssignment_1; }

		//"indexed"
		public Keyword getIsIndexedIndexedKeyword_1_0() { return cIsIndexedIndexedKeyword_1_0; }

		//isContainment?="-["?
		public Assignment getIsContainmentAssignment_2() { return cIsContainmentAssignment_2; }

		//"-["
		public Keyword getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0() { return cIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0; }

		//type=TypeRef
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_3_0() { return cTypeTypeRefParserRuleCall_3_0; }

		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }

		//("=" defaultValue=ValueObject)?
		public Group getGroup_5() { return cGroup_5; }

		//"="
		public Keyword getEqualsSignKeyword_5_0() { return cEqualsSignKeyword_5_0; }

		//defaultValue=ValueObject
		public Assignment getDefaultValueAssignment_5_1() { return cDefaultValueAssignment_5_1; }

		//ValueObject
		public RuleCall getDefaultValueValueObjectParserRuleCall_5_1_0() { return cDefaultValueValueObjectParserRuleCall_5_1_0; }

		//("<->" inverse=[modulob::Feature|QualifiedName])?
		public Group getGroup_6() { return cGroup_6; }

		//"<->"
		public Keyword getLessThanSignHyphenMinusGreaterThanSignKeyword_6_0() { return cLessThanSignHyphenMinusGreaterThanSignKeyword_6_0; }

		//inverse=[modulob::Feature|QualifiedName]
		public Assignment getInverseAssignment_6_1() { return cInverseAssignment_6_1; }

		//[modulob::Feature|QualifiedName]
		public CrossReference getInverseFeatureCrossReference_6_1_0() { return cInverseFeatureCrossReference_6_1_0; }

		//QualifiedName
		public RuleCall getInverseFeatureQualifiedNameParserRuleCall_6_1_0_1() { return cInverseFeatureQualifiedNameParserRuleCall_6_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class EnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Enum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLiteralsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLiteralsEnumLiteralParserRuleCall_3_0 = (RuleCall)cLiteralsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLiteralsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cLiteralsEnumLiteralParserRuleCall_4_1_0 = (RuleCall)cLiteralsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Enum returns modulob::Enum:
		//	"enum" name=ID "{" literals+=EnumLiteral ("," literals+=EnumLiteral)* "}";
		public ParserRule getRule() { return rule; }

		//"enum" name=ID "{" literals+=EnumLiteral ("," literals+=EnumLiteral)* "}"
		public Group getGroup() { return cGroup; }

		//"enum"
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//literals+=EnumLiteral
		public Assignment getLiteralsAssignment_3() { return cLiteralsAssignment_3; }

		//EnumLiteral
		public RuleCall getLiteralsEnumLiteralParserRuleCall_3_0() { return cLiteralsEnumLiteralParserRuleCall_3_0; }

		//("," literals+=EnumLiteral)*
		public Group getGroup_4() { return cGroup_4; }

		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }

		//literals+=EnumLiteral
		public Assignment getLiteralsAssignment_4_1() { return cLiteralsAssignment_4_1; }

		//EnumLiteral
		public RuleCall getLiteralsEnumLiteralParserRuleCall_4_1_0() { return cLiteralsEnumLiteralParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class EnumLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumLiteral");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//EnumLiteral returns modulob::EnumLiteral:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	public class ConfigOptionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ConfigOption");
		private final EnumLiteralDeclaration cPersistencyEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cPersistencyPersistencyKeyword_0 = (Keyword)cPersistencyEnumLiteralDeclaration.eContents().get(0);
		
		//enum ConfigOption returns modulob::ConfigOption:
		//	persistency;
		public EnumRule getRule() { return rule; }

		//persistency
		public EnumLiteralDeclaration getPersistencyEnumLiteralDeclaration() { return cPersistencyEnumLiteralDeclaration; }

		//"persistency"
		public Keyword getPersistencyPersistencyKeyword_0() { return cPersistencyPersistencyKeyword_0; }
	}

	public class ConfigValueElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ConfigValue");
		private final EnumLiteralDeclaration cCoreDataEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cCoreDataCoreDataKeyword_0 = (Keyword)cCoreDataEnumLiteralDeclaration.eContents().get(0);
		
		//enum ConfigValue returns modulob::ConfigValue:
		//	CoreData;
		public EnumRule getRule() { return rule; }

		//CoreData
		public EnumLiteralDeclaration getCoreDataEnumLiteralDeclaration() { return cCoreDataEnumLiteralDeclaration; }

		//"CoreData"
		public Keyword getCoreDataCoreDataKeyword_0() { return cCoreDataCoreDataKeyword_0; }
	}
	
	private EntityModelElements pEntityModel;
	private EntityElements pEntity;
	private AnnotationElements pAnnotation;
	private ConfigOptionElements unknownRuleConfigOption;
	private ConfigValueElements unknownRuleConfigValue;
	private FeatureElements pFeature;
	private EnumElements pEnum;
	private EnumLiteralElements pEnumLiteral;
	
	private final GrammarProvider grammarProvider;

	private DslGrammarAccess gaDsl;

	@Inject
	public DataDslGrammarAccess(GrammarProvider grammarProvider,
		DslGrammarAccess gaDsl) {
		this.grammarProvider = grammarProvider;
		this.gaDsl = gaDsl;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public DslGrammarAccess getDslGrammarAccess() {
		return gaDsl;
	}

	
	//EntityModel returns system::EntityModel:
	//	^current?="current"? "entities for module" module=[system::Module|QualifiedName] "version" version=STRING
	//	entities+=Entity* enums+=Enum*;
	public EntityModelElements getEntityModelAccess() {
		return (pEntityModel != null) ? pEntityModel : (pEntityModel = new EntityModelElements());
	}
	
	public ParserRule getEntityModelRule() {
		return getEntityModelAccess().getRule();
	}

	//Entity returns modulob::Entity:
	//	comment=DOC_COMMENT? annotations+=Annotation* isAbstract?="abstract"? "entity" name=ID (":"
	//	super=[modulob::Entity|QualifiedName])? "{" features+=Feature* "}";
	public EntityElements getEntityAccess() {
		return (pEntity != null) ? pEntity : (pEntity = new EntityElements());
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//Annotation returns modulob::Annotation:
	//	"@" option=ConfigOption (":" value=ConfigValue)?;
	public AnnotationElements getAnnotationAccess() {
		return (pAnnotation != null) ? pAnnotation : (pAnnotation = new AnnotationElements());
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}

	//enum ConfigOption returns modulob::ConfigOption:
	//	persistency;
	public ConfigOptionElements getConfigOptionAccess() {
		return (unknownRuleConfigOption != null) ? unknownRuleConfigOption : (unknownRuleConfigOption = new ConfigOptionElements());
	}
	
	public EnumRule getConfigOptionRule() {
		return getConfigOptionAccess().getRule();
	}

	//enum ConfigValue returns modulob::ConfigValue:
	//	CoreData;
	public ConfigValueElements getConfigValueAccess() {
		return (unknownRuleConfigValue != null) ? unknownRuleConfigValue : (unknownRuleConfigValue = new ConfigValueElements());
	}
	
	public EnumRule getConfigValueRule() {
		return getConfigValueAccess().getRule();
	}

	//Feature returns modulob::Feature:
	//	comment=DOC_COMMENT? isIndexed?="indexed"? isContainment?="-["? type=TypeRef name=ID ("=" defaultValue=ValueObject)?
	//	("<->" inverse=[modulob::Feature|QualifiedName])? ";";
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//Enum returns modulob::Enum:
	//	"enum" name=ID "{" literals+=EnumLiteral ("," literals+=EnumLiteral)* "}";
	public EnumElements getEnumAccess() {
		return (pEnum != null) ? pEnum : (pEnum = new EnumElements());
	}
	
	public ParserRule getEnumRule() {
		return getEnumAccess().getRule();
	}

	//EnumLiteral returns modulob::EnumLiteral:
	//	name=ID;
	public EnumLiteralElements getEnumLiteralAccess() {
		return (pEnumLiteral != null) ? pEnumLiteral : (pEnumLiteral = new EnumLiteralElements());
	}
	
	public ParserRule getEnumLiteralRule() {
		return getEnumLiteralAccess().getRule();
	}

	//TypeLib returns types::Lib:
	//	primitiveTypes+=Primitive+ anyType=Any;
	public DslGrammarAccess.TypeLibElements getTypeLibAccess() {
		return gaDsl.getTypeLibAccess();
	}
	
	public ParserRule getTypeLibRule() {
		return getTypeLibAccess().getRule();
	}

	//Primitive returns types::Primitive:
	//	"primitive type" name=ID;
	public DslGrammarAccess.PrimitiveElements getPrimitiveAccess() {
		return gaDsl.getPrimitiveAccess();
	}
	
	public ParserRule getPrimitiveRule() {
		return getPrimitiveAccess().getRule();
	}

	//Any returns types::Any:
	//	"any type" name=ID;
	public DslGrammarAccess.AnyElements getAnyAccess() {
		return gaDsl.getAnyAccess();
	}
	
	public ParserRule getAnyRule() {
		return getAnyAccess().getRule();
	}

	//TypeRef returns types::TypeRef:
	//	referenced=[types::Type|QualifiedName] isMulti?="[]"?;
	public DslGrammarAccess.TypeRefElements getTypeRefAccess() {
		return gaDsl.getTypeRefAccess();
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}

	//ValueObject returns modulob::ValueObject:
	//	StringValue | IntegerValue | FloatValue;
	public DslGrammarAccess.ValueObjectElements getValueObjectAccess() {
		return gaDsl.getValueObjectAccess();
	}
	
	public ParserRule getValueObjectRule() {
		return getValueObjectAccess().getRule();
	}

	//StringValue returns modulob::StringValue:
	//	value=EStringObject;
	public DslGrammarAccess.StringValueElements getStringValueAccess() {
		return gaDsl.getStringValueAccess();
	}
	
	public ParserRule getStringValueRule() {
		return getStringValueAccess().getRule();
	}

	//EStringObject returns ecore::EString:
	//	STRING;
	public DslGrammarAccess.EStringObjectElements getEStringObjectAccess() {
		return gaDsl.getEStringObjectAccess();
	}
	
	public ParserRule getEStringObjectRule() {
		return getEStringObjectAccess().getRule();
	}

	//IntegerValue returns modulob::IntegerValue:
	//	value=EIntegerObject;
	public DslGrammarAccess.IntegerValueElements getIntegerValueAccess() {
		return gaDsl.getIntegerValueAccess();
	}
	
	public ParserRule getIntegerValueRule() {
		return getIntegerValueAccess().getRule();
	}

	//EIntegerObject returns ecore::EIntegerObject:
	//	INT;
	public DslGrammarAccess.EIntegerObjectElements getEIntegerObjectAccess() {
		return gaDsl.getEIntegerObjectAccess();
	}
	
	public ParserRule getEIntegerObjectRule() {
		return getEIntegerObjectAccess().getRule();
	}

	//FloatValue returns modulob::FloatValue:
	//	value=EFloatObject;
	public DslGrammarAccess.FloatValueElements getFloatValueAccess() {
		return gaDsl.getFloatValueAccess();
	}
	
	public ParserRule getFloatValueRule() {
		return getFloatValueAccess().getRule();
	}

	//EFloatObject returns ecore::EFloatObject:
	//	"-"? INT? "." INT;
	public DslGrammarAccess.EFloatObjectElements getEFloatObjectAccess() {
		return gaDsl.getEFloatObjectAccess();
	}
	
	public ParserRule getEFloatObjectRule() {
		return getEFloatObjectAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public DslGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaDsl.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	/// *
	// * DOC_COMMENTs are intended to be written to artifacts
	// * generated by a code generator.
	// * / terminal DOC_COMMENT:
	//	"<*"->"*>";
	public TerminalRule getDOC_COMMENTRule() {
		return gaDsl.getDOC_COMMENTRule();
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaDsl.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaDsl.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaDsl.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaDsl.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaDsl.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaDsl.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaDsl.getANY_OTHERRule();
	} 
}
