package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PanelJSpinner extends JPanel {

	private int VALOR_INICIAL = 50;
	private int MAX = 100;

	private JSpinner spinner = new JSpinner();
	private JSlider slider = new JSlider(0, MAX, VALOR_INICIAL);

	/**
	 * 
	 */
	public PanelJSpinner() {
		super();

		// Personalizo los valores mostrados en los dos elementos
		this.spinner.setValue(VALOR_INICIAL);
		Dimension dimension = new Dimension(100, 20);
		this.spinner.setMinimumSize(dimension);
		this.spinner.setPreferredSize(dimension);

		this.slider.setValue(VALOR_INICIAL);

		// Personalizo el cambio de valor de los dos elementos
		this.spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				slider.setValue((Integer) spinner.getValue());
			}
		});

		this.slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				spinner.setValue(slider.getValue());
			}
		});

		// Disponemos los elementos sobre el panel
		// Creo una etiqueta para indicar al usuario que debe hacer clic en cualquier
		// sitio
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weighty = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		this.add(spinner, constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		this.add(slider, constraints);

	}

}
