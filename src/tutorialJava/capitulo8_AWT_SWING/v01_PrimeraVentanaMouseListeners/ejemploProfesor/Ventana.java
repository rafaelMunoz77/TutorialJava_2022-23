package tutorialJava.capitulo8_AWT_SWING.v01_PrimeraVentanaMouseListeners.ejemploProfesor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	
	
	public Ventana () {
		this.setBounds(0, 0, 800, 600);
		
		this.setContentPane(getPanelPrincipal());		
		this.setVisible(true);
	}
	
	/**
	 * 
	 * @return
	 */
	public JPanel getPanelPrincipal() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// Panel para el nombre
		JPanel pnlNombre = new JPanel();
		pnlNombre.add(new JLabel("Nombre:"));
		JTextField jtfNombre = new JTextField(40);
		pnlNombre.add(jtfNombre);
		// Inserto el pnlNombre en el panel principal
		panel.add(pnlNombre);
		
		// Panel para el nombre
		JPanel pnlPrimerAp = new JPanel();
		pnlPrimerAp.add(new JLabel("Primer Apellido:"));
		JTextField jtfPrimerAp = new JTextField(40);
		pnlPrimerAp.add(jtfPrimerAp);
		// Inserto el pnlNombre en el panel principal
		panel.add(pnlPrimerAp);
		
		return panel;
	}
	
	

	public static void main(String[] args) {
		Ventana v = new Ventana();
	}

}
