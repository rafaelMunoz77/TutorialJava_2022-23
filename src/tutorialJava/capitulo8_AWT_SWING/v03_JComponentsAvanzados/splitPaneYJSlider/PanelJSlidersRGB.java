package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados.splitPaneYJSlider;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PanelJSlidersRGB extends JPanel {

	// Deslizadores encargados de graduar la cantidad de los colores básicos
	private JSlider sliderRed = null;
	private JSlider sliderGreen = null;
	private JSlider sliderBlue = null;
	
	// Propiedades usadas para el evento de cambio de color
	private static List<CambioColorListener> cambioColorListeners = new ArrayList<CambioColorListener>();
	
	/**
	 * 
	 */
	public PanelJSlidersRGB () {
		// En principio establezco el negro como color de fondo
		this.setBackground(Color.black);
		
		// Layout y componentes sobre el panel
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.sliderRed = getNuevoJSlider();
		this.add(getPanelJSlider("Rojo", sliderRed));
		this.sliderGreen = getNuevoJSlider();
		this.add(getPanelJSlider("Verde", sliderGreen));
		this.sliderBlue = getNuevoJSlider();
		this.add(getPanelJSlider("Azul", sliderBlue));

	}
	
	/**
	 * 
	 * @param textoEtiqueta
	 * @param slider
	 * @return
	 */
	private JPanel getPanelJSlider (String textoEtiqueta, JSlider slider) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		panel.add(new JLabel(textoEtiqueta));
		panel.add(slider);

		return panel;
	}
	
	/**
	 * 
	 * @return
	 */
	private JSlider getNuevoJSlider () {
		JSlider slider = new JSlider();
		
		slider = new JSlider(0, 255, 0);
		slider.setMinorTickSpacing(50);
		slider.setMajorTickSpacing(50);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		// Necesito mantener un puntero al panel actual. Necesito mantener una referencia a this
		PanelJSlidersRGB panelJSliders = this;
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				fireCambioColorListener(panelJSliders);
			}
		});
		
		return slider;
	}
	
	/**
	 * 
	 * @param listener
	 */
	public static void addCambioColorListener (CambioColorListener listener) {
		cambioColorListeners.add(listener);
	}
	
	/**
	 * 
	 * @param listener
	 */
	public static void removeCambioColorListener (CambioColorListener listener) {
		cambioColorListeners.remove(listener);
	}
	
	/**
	 * 
	 * @param sliderRed
	 * @param sliderGreen
	 * @param sliderBlue
	 */
	public static void fireCambioColorListener (PanelJSlidersRGB panelJSliders) {
		// Genero el nuevo color, a partir de los tres JSliders
		String strRed = Integer.toHexString(panelJSliders.sliderRed.getValue());
		if (strRed.length() < 2) strRed = "0" + strRed;
		String strGreen = Integer.toHexString(panelJSliders.sliderGreen.getValue());
		if (strGreen.length() < 2) strGreen = "0" + strGreen;
		String strBlue = Integer.toHexString(panelJSliders.sliderBlue.getValue());
		if (strBlue.length() < 2) strBlue = "0" + strBlue;
		
		// Construyo el nuevo color, construyo el nuevo evento y lo envio a todos los listeners
		Color nuevoColor = Color.decode("#" + strRed + strGreen + strBlue);
		CambioColorEvent nuevoEvento = new CambioColorEvent(nuevoColor);
		for (CambioColorListener listener : cambioColorListeners) {
			listener.cambioColor(nuevoEvento);
		}
	}
}
