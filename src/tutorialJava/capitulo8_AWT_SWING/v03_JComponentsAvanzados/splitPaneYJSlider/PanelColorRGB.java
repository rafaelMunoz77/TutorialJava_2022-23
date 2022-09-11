package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados.splitPaneYJSlider;

import java.awt.Color;

import javax.swing.JPanel;

public class PanelColorRGB extends JPanel implements CambioColorListener {

	/**
	 * 
	 */
	public PanelColorRGB () {
		// Inicio con color en negro
		this.setBackground(Color.BLACK);
		// Doy de alta este componente como escuchador del cambio de color del panel de JSliders
		PanelJSlidersRGB.addCambioColorListener(this);
	}

	/**
	 * 
	 */
	@Override
	public void cambioColor(CambioColorEvent evento) {
		// Cuando se reciba el evento de cambio de color, se cambia el color de fondo del panel actual
		this.setBackground(evento.getColor());
	}
}
