package de.dubmas.modulob.tests;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.junit.validation.ValidatorTester;

import de.dubmas.modulob.Annotation;
import de.dubmas.modulob.ConfigOption;
import de.dubmas.modulob.ConfigValue;
import de.dubmas.modulob.DataDslStandaloneSetup;
import de.dubmas.modulob.Entity;
import de.dubmas.modulob.Feature;
import de.dubmas.modulob.IntegerValue;
import de.dubmas.modulob.ModulobFactory;
import de.dubmas.modulob.common.DslStandaloneSetup;
import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.Module;
import de.dubmas.modulob.system.SystemFactory;
import de.dubmas.modulob.types.Primitive;
import de.dubmas.modulob.types.TypeRef;
import de.dubmas.modulob.types.TypesFactory;
import de.dubmas.modulob.validation.DataDslJavaValidator;
import de.dubmas.modulob.validation.ValidationIssueCodes;

public class ValidatorTest extends AbstractXtextTests {
	
	private ValidatorTester<DataDslJavaValidator> tester;
	
	@Override
	public void setUp() {
		try {
			super.setUp();
			
			with(DslStandaloneSetup.class);
			with(DataDslStandaloneSetup.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataDslJavaValidator validator = get(DataDslJavaValidator.class); 
		tester = new ValidatorTester<DataDslJavaValidator>(validator, getInjector());
	}
	
	public void testCheckIsIndexed(){
		/*
		 * Build model fragment:
		 * - not persistent entity with indexed feature
		 */
		Entity e = ModulobFactory.eINSTANCE.createEntity();
		e.setName("AnEntity");
		
		Feature f = ModulobFactory.eINSTANCE.createFeature();
		f.setIsIndexed(true);
		
		e.getFeatures().add(f);
		
		/*
		 * do test
		 */
		
		tester.validator().checkIfIndexedAllowed(f);
		tester.diagnose().assertError(ValidationIssueCodes.INDEXED_ALLOWED_CODE);
	}
	
	public void testCheckIfProperFeatures(){
		/*
		 * Build model fragment:
		 * - entity with feature that is of type Interface
		 */
		Entity e = ModulobFactory.eINSTANCE.createEntity();
		e.setName("AnEntity");
	
		Feature f   = ModulobFactory.eINSTANCE.createFeature();
		TypeRef tr  = TypesFactory.eINSTANCE.createTypeRef();
	
		tr.setReferenced(ModulobFactory.eINSTANCE.createInterface());
		f.setType(tr);
		
		e.getFeatures().add(f);
		
		/*
		 * do test
		 */
		tester.validator().checkIfProperFeatures(e);
		tester.diagnose().assertError(ValidationIssueCodes.PROPER_FEATURE_TYPES_CODE);
	}
	
	public void testCheckIfAllEntityFeaturesArePersistent(){
		/*
		 * Build model fragment:
		 * - two entities: one persistent one not persistent
		 * - persistent entity has feature whose type is non persistent entity
		 */
		Entity notPersistent = ModulobFactory.eINSTANCE.createEntity();
		Entity persistent    = ModulobFactory.eINSTANCE.createEntity();
		
		Annotation a         = ModulobFactory.eINSTANCE.createAnnotation();
		a.setOption(ConfigOption.PERSISTENCY);
		a.setValue(ConfigValue.CORE_DATA);
		persistent.getAnnotations().add(a);
		
		Feature f  = ModulobFactory.eINSTANCE.createFeature();
		TypeRef tr = TypesFactory.eINSTANCE.createTypeRef();
		
		tr.setReferenced(notPersistent);
		f.setType(tr);
		
		persistent.getFeatures().add(f);
		
		/*
		 * do test
		 */
		tester.validator().checkIfAllEntityFeaturesArePersistent(persistent);
		tester.diagnose().assertError(ValidationIssueCodes.ENTIYFEATURES_HAVE_SAME_PERSISTENCY_CODE);
	}
	
	public void testCheckPersistentEntityCrossModuleRef() {
		/*
		 * Build model fragment:
		 * - two modules with entity model with one persistent entity each
		 * - one entity references other
		 */
		
		//first module
		Module m1 = SystemFactory.eINSTANCE.createModule();
		EntityModel em1 = SystemFactory.eINSTANCE.createEntityModel();
		m1.setEntityModel(em1);
		em1.setModule(m1);
		Entity e1 = ModulobFactory.eINSTANCE.createEntity();
		em1.getEntities().add(e1);
		
		Annotation a1 = ModulobFactory.eINSTANCE.createAnnotation();
		a1.setOption(ConfigOption.PERSISTENCY);
		a1.setValue(ConfigValue.CORE_DATA);
		e1.getAnnotations().add(a1);
		
		//second module
		Module m2 = SystemFactory.eINSTANCE.createModule();
		EntityModel em2 = SystemFactory.eINSTANCE.createEntityModel();
		m2.setEntityModel(em2);
		em2.setModule(m2);
		Entity e2 = ModulobFactory.eINSTANCE.createEntity();
		em2.getEntities().add(e2);
		
		Annotation a2 = ModulobFactory.eINSTANCE.createAnnotation();
		a2.setOption(ConfigOption.PERSISTENCY);
		a2.setValue(ConfigValue.CORE_DATA);
		e2.getAnnotations().add(a2);
		
		Feature f2 = ModulobFactory.eINSTANCE.createFeature();
		TypeRef tr = TypesFactory.eINSTANCE.createTypeRef();
		
		tr.setReferenced(e1);
		f2.setType(tr);
		
		e2.getFeatures().add(f2);
		
		/*
		 * do test
		 */
		tester.validator().checkPersistentEntityCrossModuleRef(e2);
		tester.diagnose().assertError(ValidationIssueCodes.ENTIY_REF_MODULE_BOUNDARIES_CODE);
	}
	
	public void testCheckIfPersistentEntityHasUUID(){
		/*
		 * Build model fragment:
		 * - two persistent entities related in a inheritance hierarchy
		 */
		Entity superEntity = ModulobFactory.eINSTANCE.createEntity();
	
		Annotation a1 = ModulobFactory.eINSTANCE.createAnnotation();
		a1.setOption(ConfigOption.PERSISTENCY);
		a1.setValue(ConfigValue.CORE_DATA);
		superEntity.getAnnotations().add(a1);
		
		Entity subEntity = ModulobFactory.eINSTANCE.createEntity();
		
		Annotation a2 = ModulobFactory.eINSTANCE.createAnnotation();
		a2.setOption(ConfigOption.PERSISTENCY);
		a2.setValue(ConfigValue.CORE_DATA);
		subEntity.getAnnotations().add(a2);
		
		subEntity.setSuper(superEntity);
		
		/*
		 * do test
		 */
		tester.validator().checkIfPersistentEntityHasUUID(superEntity);
		tester.diagnose().assertError(ValidationIssueCodes.UUID_REQUIRED_CODE);
	}
	
	public void testCheckIfFeatureNotNamedDescription(){
		/*
		 * Build model fragment
		 * - feature with name 'description'
		 */
		Feature f = ModulobFactory.eINSTANCE.createFeature();
		f.setName("description");
		
		/*
		 * do test
		 */
		tester.validator().checkIfFeatureNotNamedDescription(f);
		tester.diagnose().assertError(ValidationIssueCodes.FEATURE_NAME_CODE);
	}
	
	public void testCheckIfDefaultValueAllowed(){
		/*
		 * Build model fragment
		 * - not persistent entity with primitive type feature with default value
		 */
		
		Entity e = ModulobFactory.eINSTANCE.createEntity();
		
		Feature f = ModulobFactory.eINSTANCE.createFeature();
		e.getFeatures().add(f);
		
		TypeRef tr = TypesFactory.eINSTANCE.createTypeRef();
		Primitive string = TypesFactory.eINSTANCE.createPrimitive();
		string.setName("String");
		tr.setReferenced(string);
		f.setType(tr);
		
		IntegerValue val = ModulobFactory.eINSTANCE.createIntegerValue();
		val.setValue(1);
		f.setDefaultValue(val);
		
		/*
		 * do test
		 */
		tester.validator().checkIfDefaultValueAllowed(f);
		tester.diagnose().assertError(ValidationIssueCodes.DEFAULT_VALUE_EXISTENCE_CODE);
		
		/*
		 * Change model fragment:
		 * - make entity persistent
		 * - change feature type (type == entity)
		 */
		Annotation a1 = ModulobFactory.eINSTANCE.createAnnotation();
		a1.setOption(ConfigOption.PERSISTENCY);
		a1.setValue(ConfigValue.CORE_DATA);
		e.getAnnotations().add(a1);
		
		tr.setReferenced(e);
		
		/*
		 * do test
		 */
		tester.validator().checkIfDefaultValueAllowed(f);
		tester.diagnose().assertError(ValidationIssueCodes.DEFAULT_VALUE_EXISTENCE_CODE);
	}
	
	public void testCheckIfInverseAllowed(){
		/*
		 * Build model fragment:
		 * - not persistent entity with feature that has an inverse relation
		 */
		Entity e  = ModulobFactory.eINSTANCE.createEntity();
		Feature f = ModulobFactory.eINSTANCE.createFeature();
		e.getFeatures().add(f);
		Feature inverse = ModulobFactory.eINSTANCE.createFeature();
		f.setInverse(inverse);
		
		/*
		 * do test
		 */
		tester.validator().checkIfInverseAllowed(f);
		tester.diagnose().assertError(ValidationIssueCodes.INVERSE_ALLOWED_CODE);
	}
	
	public void testCheckIfInverseIsEntity(){
		/*
		 * Build model fragment:
		 * - not persistent entity with feature that has an inverse relation to type
		 *   that is not an entity
		 */
		Entity e  = ModulobFactory.eINSTANCE.createEntity();
		Feature f = ModulobFactory.eINSTANCE.createFeature();
		e.getFeatures().add(f);
		
		Feature inverse = ModulobFactory.eINSTANCE.createFeature();
		TypeRef tr = TypesFactory.eINSTANCE.createTypeRef();
		tr.setReferenced(ModulobFactory.eINSTANCE.createInterface());
		inverse.setType(tr);
		
		f.setInverse(inverse);
		
		/*
		 * do test
		 */
		tester.validator().checkIfInverseIsEntity(f);
		tester.diagnose().assertError(ValidationIssueCodes.INVERSE_IS_ENTITY_CODE);
	}
	
	public void testCheckIfInverseNotCrossesModuleBoundaries(){
		/*
		 * Build model fragment:
		 * - two modules with entity model with one persistent entity each
		 * - one entity has feature with inverse that references entity in other module
		 */
		
		//first module
		Module m1 = SystemFactory.eINSTANCE.createModule();
		EntityModel em1 = SystemFactory.eINSTANCE.createEntityModel();
		m1.setEntityModel(em1);
		em1.setModule(m1);
		Entity e1 = ModulobFactory.eINSTANCE.createEntity();
		em1.getEntities().add(e1);
		
		Feature f1 = ModulobFactory.eINSTANCE.createFeature();
		e1.getFeatures().add(f1);
		TypeRef tr1 = TypesFactory.eINSTANCE.createTypeRef();
		tr1.setReferenced(e1);
		f1.setType(tr1);
		
		Annotation a1 = ModulobFactory.eINSTANCE.createAnnotation();
		a1.setOption(ConfigOption.PERSISTENCY);
		a1.setValue(ConfigValue.CORE_DATA);
		e1.getAnnotations().add(a1);
		
		//second module
		Module m2 = SystemFactory.eINSTANCE.createModule();
		EntityModel em2 = SystemFactory.eINSTANCE.createEntityModel();
		m2.setEntityModel(em2);
		em2.setModule(m2);
		Entity e2 = ModulobFactory.eINSTANCE.createEntity();
		em2.getEntities().add(e2);
		
		Feature f2 = ModulobFactory.eINSTANCE.createFeature();
		e2.getFeatures().add(f2);
		TypeRef tr2 = TypesFactory.eINSTANCE.createTypeRef();
		tr2.setReferenced(e2);
		f2.setType(tr2);
		f2.setInverse(f1);
		
		Annotation a2 = ModulobFactory.eINSTANCE.createAnnotation();
		a2.setOption(ConfigOption.PERSISTENCY);
		a2.setValue(ConfigValue.CORE_DATA);
		e2.getAnnotations().add(a2);
		
		/*
		 * do test
		 */
		tester.validator().checkIfInverseNotCrossesModuleBoundaries(f2);
		tester.diagnose().assertError(ValidationIssueCodes.INVERSE_MODULE_BOUNDARIES_CODE);
	}
}
