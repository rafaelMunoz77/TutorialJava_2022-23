package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class JCheckBoxFactory {

	
	/**
	 * 
	 * @return
	 */
	public static JCheckBox instance () {
		return instance ("JCheckBox");
	}
	
	/**
	 * 
	 * @param texto
	 * @return
	 */
	public static JCheckBox instance (String texto) {
		JCheckBox jl = new JCheckBox(texto);
		return jl;
	}

}
