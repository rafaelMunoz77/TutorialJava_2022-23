package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.JProgressBar;

public class JProgressBarFactory {

	
	/**
	 * 
	 * @return
	 */
	public static JProgressBar instance () {
		return instance (0, 1432, 568);
	}
	
	/**
	 * 
	 * @param min
	 * @param max
	 * @param valor
	 * @return
	 */
	public static JProgressBar instance (int min, int max, int valor) {
		JProgressBar jpb = new JProgressBar (min, max);
		jpb.setValue(valor);
		jpb.setStringPainted(true);
		
		return jpb;
	}

}
