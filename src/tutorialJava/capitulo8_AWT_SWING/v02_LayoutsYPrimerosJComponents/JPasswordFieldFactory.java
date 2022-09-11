package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.JPasswordField;

public class JPasswordFieldFactory {
	/**
	 * 
	 * @return
	 */
	public static JPasswordField instance () {
		return instance (1);
	}
	
	/**
	 * 
	 * @param longitud
	 * @return
	 */
	public static JPasswordField instance (int longitud) {
		return instance ("JPasswordField", longitud);
	}
	
	/**
	 * 
	 * @param texto
	 * @return
	 */
	public static JPasswordField instance (String texto) {
		return instance (texto, 10);
	}
	
	/**
	 * 
	 * @param texto
	 * @param longitud
	 * @return
	 */
	public static JPasswordField instance (String texto, int longitud) {
		JPasswordField jtf = new JPasswordField (texto, longitud);
		
		return jtf;
	}

}
