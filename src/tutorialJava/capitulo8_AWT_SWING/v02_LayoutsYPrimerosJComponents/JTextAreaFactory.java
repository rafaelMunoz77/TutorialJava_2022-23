package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class JTextAreaFactory {

	
	public static JTextArea instance() {
		return instance ("JTextArea");
	}
	
	
	/**
	 * 
	 * @param texto
	 * @return
	 */
	public static JTextArea instance (String texto) {
		JTextArea jta = new JTextArea (5, 20);
		jta.setText(texto);
		jta.setLineWrap(true);
		return jta;
	}

}
