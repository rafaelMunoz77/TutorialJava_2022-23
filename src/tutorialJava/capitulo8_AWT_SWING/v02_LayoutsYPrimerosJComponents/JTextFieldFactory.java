package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.JTextField;

public class JTextFieldFactory {

	/**
	 * 
	 * @return
	 */
	public static JTextField instance () {
		return instance (1);
	}
	
	/**
	 * 
	 * @param longitud
	 * @return
	 */
	public static JTextField instance (int longitud) {
		return instance ("JTextField", longitud);
	}
	
	/**
	 * 
	 * @param texto
	 * @return
	 */
	public static JTextField instance (String texto) {
		return instance (texto, 10);
	}
	
	/**
	 * 
	 * @param texto
	 * @param longitud
	 * @return
	 */
	public static JTextField instance (String texto, int longitud) {
		JTextField jtf = new JTextField (texto, longitud);
		
		return jtf;
	}
}
