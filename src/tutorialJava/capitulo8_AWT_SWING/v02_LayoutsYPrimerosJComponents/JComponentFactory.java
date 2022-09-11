package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.JComponent;

import tutorialJava.Utils;

public class JComponentFactory {

	public static int JPANEL = 0;
	public static int JTEXTFIELD = 1;
	public static int JBUTTON = 2;
	public static int JLABEL = 3;
	public static int JCHECKBOX = 4;
	public static int JCOMBOBOX = 5;
	public static int JLIST = 6;
	public static int JRADIOBUTTON = 7;
	public static int JTEXTAREA = 8;
	public static int JSLIDER = 9;
	public static int JPASSWORD = 10;
	public static int JPROGRESSBAR = 11;
	
	

	
	public static JComponent getJComponentAzar () {
		return instanceJComponent (Utils.obtenerNumeroAzar(1, 11));
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static JComponent instanceJComponent (int id) {
		
		if (id == JPANEL) {
			return JPanelFactory.instanceJPanelColorAzar();
		}
		if (id == JTEXTFIELD) {
			return JTextFieldFactory.instance(10);
		}
		if (id == JBUTTON) {
			return JButtonFactory.instance();
		}
		if (id == JLABEL) {
			return JLabelFactory.instance();
		}
		if (id == JCHECKBOX) {
			return JCheckBoxFactory.instance();
		}
		if (id == JCOMBOBOX) {
			return JComboBoxFactory.instance();
		}
		if (id == JLIST) {
			return JListFactory.instance();
		}
		if (id == JRADIOBUTTON) {
			return JRadioButtonFactory.instance();
		}
		if (id == JTEXTAREA) {
			return JTextAreaFactory.instance();
		}
		if (id == JSLIDER) {
			return JSliderFactory.instance();
		}
		if (id == JPASSWORD) {
			return JPasswordFieldFactory.instance();
		}
		if (id == JPROGRESSBAR) {
			return JProgressBarFactory.instance();
		}
		
		return null;
	}
	
	
}
