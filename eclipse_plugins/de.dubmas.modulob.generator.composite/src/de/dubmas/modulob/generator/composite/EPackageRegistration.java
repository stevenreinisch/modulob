package de.dubmas.modulob.generator.composite;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe2.runtime.workflow.AbstractCompositeWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class EPackageRegistration extends AbstractCompositeWorkflowComponent{
	
	private List<String> packageClassNames;
	
	public EPackageRegistration() {
		this.packageClassNames = new ArrayList<String>(5);
	}
	
	public void addPackageClassNames(String pkgClassName) {
		this.packageClassNames.add(pkgClassName);
	}
	
	@SuppressWarnings("rawtypes")
	public void invoke(IWorkflowContext ctx) {
		for(String pkgClassName: packageClassNames) {
			Class pkgClass;
			try {
				pkgClass = Class.forName(pkgClassName);

				Field eInstanceField = pkgClass.getField("eINSTANCE");
				EPackage pkg = (EPackage) eInstanceField.get(pkgClass);

				if (!EPackage.Registry.INSTANCE.containsKey(pkg.getNsURI())) {
					EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
