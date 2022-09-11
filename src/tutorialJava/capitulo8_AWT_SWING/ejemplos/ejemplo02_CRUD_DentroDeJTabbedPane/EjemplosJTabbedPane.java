package tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo02_CRUD_DentroDeJTabbedPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import tutorialJava.capitulo8_AWT_SWING.utils.CacheImagenes;

public class EjemplosJTabbedPane {


	/**
	 * 
	 * @return
	 */
	public static JTabbedPane getPanelesTabulados () {
	
		JTabbedPane tabPanel = new JTabbedPane();		
		ImageIcon icono = CacheImagenes.getCacheImagenes().getIcono("duke1-32x32.png");
		
		JPanel panelVerde = new JPanel();
		panelVerde.setBackground(Color.GREEN);
		
		JPanel panelRojo = new JPanel();
		panelRojo.setBackground(Color.RED);
		
		tabPanel.addTab("Pestaña 01", icono, CRUD_Fabricante.getInstance(), "Panel verde");
		tabPanel.addTab("Pestaña 02", icono, new PanelConCheckBox(), "Panel rojo");
		tabPanel.addTab("Pestaña 02", icono, new PanelConComboBoxDeFabricante(), "Panel rojo");
		tabPanel.setSelectedIndex(0);
		
		return tabPanel;
	}
	
	
	
}
