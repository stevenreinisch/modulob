package de.dubmas.modulob.util

import org.eclipse.emf.ecore.*
import org.eclipse.xtext.validation.Check

class CheckUtil {
	
	def <T extends EObject> nameIsUnique(Object o, Iterable<T> inCollection)
	{
		!inCollection.exists(e | e != o && e.name == o.name)
	}
	
	def name(Object o){
		o.^class.methods.filter(m | m.name == "getName").
			map(m | try { m.invoke(o, null) } catch(Exception e){}).head as String
	}
}