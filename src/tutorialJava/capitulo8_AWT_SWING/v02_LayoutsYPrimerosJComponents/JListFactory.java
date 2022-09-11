package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class JListFactory {

	/**
	 * 
	 * @return
	 */
	public static JList instance () {
		String opciones[] = new String[10];
		
		for (int i = 0; i < opciones.length; i++) {
			opciones[i] = "JList Option " + i;
		}		
		return instance (opciones);
	}
	
	/**
	 * 
	 * @param texto
	 * @return
	 */
	public static JList instance (String opciones[]) {
		JList jl = new JList(opciones);
		jl.setSelectedIndex(0);
		jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jl.setLayoutOrientation(JList.VERTICAL);
		jl.setVisibleRowCount(5);
		return jl;
	}



}
