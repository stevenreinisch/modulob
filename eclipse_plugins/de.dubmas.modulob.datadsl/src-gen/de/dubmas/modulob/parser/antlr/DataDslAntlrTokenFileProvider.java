/*
* generated by Xtext
*/
package de.dubmas.modulob.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DataDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.tokens");
	}
}
