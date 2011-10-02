package de.dubmas.modulob.tests;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.junit.validation.ValidatorTester;

import de.dubmas.modulob.Annotation;
import de.dubmas.modulob.ConfigOption;
import de.dubmas.modulob.ConfigValue;
import de.dubmas.modulob.DataDslStandaloneSetup;
import de.dubmas.modulob.Entity;
import de.dubmas.modulob.Feature;
import de.dubmas.modulob.ModulobFactory;
import de.dubmas.modulob.common.DslStandaloneSetup;
import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.Module;
import de.dubmas.modulob.system.SystemFactory;
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
}
