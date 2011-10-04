package de.dubmas.modulob.util;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class HighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static final String DOC_COMMENT_ID = "doccomment";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(DOC_COMMENT_ID, "Doc Comment", doccommentTextStyle());
	}
	
	public TextStyle doccommentTextStyle() {
		TextStyle textStyle = new TextStyle();
		//textStyle.setBackgroundColor(new RGB(230, 230, 230));
		textStyle.setColor(new RGB(0, 0, 200));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
}
