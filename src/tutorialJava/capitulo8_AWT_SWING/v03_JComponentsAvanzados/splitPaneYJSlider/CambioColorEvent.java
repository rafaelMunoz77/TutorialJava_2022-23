package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados.splitPaneYJSlider;

import java.awt.Color;

public class CambioColorEvent {

	Color color = null;

	/**
	 * @param color
	 */
	public CambioColorEvent(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
