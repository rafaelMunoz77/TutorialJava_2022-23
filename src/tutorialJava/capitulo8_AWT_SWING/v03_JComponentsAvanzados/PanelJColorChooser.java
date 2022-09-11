package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelJColorChooser extends JPanel {

	JTextField jtfColor = new JTextField();
	JButton jbtSeleccionar = new JButton ("Seleccionar color");
	JPanel jpPanelParaColorear = new JPanel();
	JColorChooser jColorChooser;
	
	/**
	 * 
	 */
	public PanelJColorChooser() {
		super();
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5, 5, 5, 5);
		
		// Incluyo el JTextField del nombre del fichero
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;
		this.add(jtfColor, constraints);
		
		// Incluyo el botón que abrirá el dialogo del JFileChooser
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 0.25;
		this.add(jbtSeleccionar, constraints);
		
		// Incluyo el área de texto que mostrará el fichero
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weighty = 1;
		this.add(this.jpPanelParaColorear, constraints);

		// Funcionalidad al botón
		jbtSeleccionar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				seleccionaColor();
			}
		});
	}
	
	
	/**
	 * 
	 */
	private void seleccionaColor () {
		Color color = jColorChooser.showDialog(null, "Seleccione un Color", Color.gray);
		// Si el usuario pulsa sobre aceptar, el color elegido no será nulo
		if (color != null) {
			String strColor = "#"+Integer.toHexString(color.getRGB()).substring(2);
			this.jtfColor.setText(strColor);
			this.jpPanelParaColorear.setBackground(color);
		}
	}
}
