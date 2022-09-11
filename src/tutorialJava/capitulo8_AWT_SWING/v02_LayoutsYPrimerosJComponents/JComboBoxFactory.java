package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class JComboBoxFactory {

	/**
	 * 
	 * @return
	 */
	public static JComboBox instance () {
		String opciones[] = new String[10];
		
		for (int i = 0; i < opciones.length; i++) {
			opciones[i] = "JComboBox Option " + i;
		}		
		return instance (opciones);
	}
	
	/**
	 * 
	 * @param texto
	 * @return
	 */
	public static JComboBox instance (String opciones[]) {
		JComboBox jcb = new JComboBox(opciones);
		jcb.setSelectedIndex(0);
		return jcb;
	}


}
