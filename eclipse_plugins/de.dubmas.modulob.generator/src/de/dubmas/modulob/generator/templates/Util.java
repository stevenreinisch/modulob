package de.dubmas.modulob.generator.templates;

import java.util.List;

import de.dubmas.modulob.Method;
import de.dubmas.modulob.StringValue;
import de.dubmas.modulob.Parameter;
import de.dubmas.modulob.types.Any;
import de.dubmas.modulob.types.TypesFactory;

public class Util {
	
	/**
	 * the name of the primitive type 'id'
	 */
	public static final Any ANY_TYPE_INSTANCE = TypesFactory.eINSTANCE.createAny();
	
	static{
		ANY_TYPE_INSTANCE.setName("id");
	}
	
	public static String stringDefaultValue(StringValue sv) {
		return sv.getValue().substring(1, sv.getValue().length() - 1);
	}
	
	public static String selector(Method m){
		StringBuffer buffer = new StringBuffer();
		buffer.append(m.getName());
		for(Parameter param: m.getParameters()){
			if(param.getSignaturePart() != null){
				buffer.append(param.getSignaturePart());
			}
			buffer.append(":");
		}
		return buffer.toString();
	}
	
	public static String selectorParamString(List<Parameter> params) {
		StringBuffer buffer = new StringBuffer();
		for(Parameter param: params){
			if(param.getSignaturePart() != null){
				buffer.append(param.getSignaturePart());
			}
			buffer.append(":");
		}
		return buffer.toString();
	}
}
