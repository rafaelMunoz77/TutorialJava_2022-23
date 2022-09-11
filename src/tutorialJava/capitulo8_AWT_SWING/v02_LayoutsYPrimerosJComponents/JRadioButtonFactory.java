package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonFactory {

	
	
	/**
	 * 
	 * @return
	 */
	public static JPanel instance () {
		String opciones[] = new String[5];
		
		for (int i = 0; i < opciones.length; i++) {
			opciones[i] = "JRadioButton Option " + i;
		}		
		return instance (opciones);
	}

	
	/**
	 * 
	 * @param opciones
	 * @return
	 */
	public static JPanel instance (String opciones[]) {
		JPanel jpn = new JPanel();
		jpn.setLayout(new BoxLayout(jpn, BoxLayout.Y_AXIS));
		
		ButtonGroup grupoOpciones = new ButtonGroup();
		
		for (int i = 0; i < opciones.length; i++) {
			JRadioButton jrb = new JRadioButton (opciones[i]);
			jrb.setSelected(true);
			grupoOpciones.add(jrb);
			jpn.add(jrb);
		}
		
		return jpn;
	}




}
