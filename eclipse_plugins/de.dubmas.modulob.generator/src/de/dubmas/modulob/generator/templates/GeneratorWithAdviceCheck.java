package de.dubmas.modulob.generator.templates;

import org.eclipse.xpand2.Generator;

public class GeneratorWithAdviceCheck extends Generator{

	/**
	 * @param advice comma separated list of fully qualified
	 *        advice names
	 */
	@Override
	public void addAdvices(String advice) {
		if(advice.equals("")) return;
		super.addAdvice(advice);
	}
}
