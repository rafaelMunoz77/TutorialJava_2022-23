package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.JButton;
import javax.swing.JLabel;

public class JLabelFactory {


	public static JLabel instance () {
		return instance ("JLabel");
	}
	
	
	/**
	 * 
	 * @param texto
	 * @return
	 */
	public static JLabel instance (String texto) {
		JLabel jl = new JLabel(texto);
		return jl;
	}

}
