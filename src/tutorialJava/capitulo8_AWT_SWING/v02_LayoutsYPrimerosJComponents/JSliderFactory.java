package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.JSlider;

import tutorialJava.Utils;

public class JSliderFactory {

	static final int MIN = 0;
	static final int MAX = 30;
	static final int INIT = 15;
	
	public static JSlider instance() {
		return instance ((Utils.obtenerNumeroAzar(0, 1) == 0) ? JSlider.HORIZONTAL : JSlider.VERTICAL, MIN, MAX, INIT);
	}
	
	
	/**
	 * 
	 * @param texto
	 * @return
	 */
	public static JSlider instance (int tipo, int min, int max, int init) {
		JSlider js = new JSlider (tipo, min, max, init);
		js.setMajorTickSpacing(10);
		js.setMinorTickSpacing(1);
		js.setPaintTicks(true);
		js.setPaintLabels(true);
		return js;
	}


}
