package tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo03_CRUD_5_entidades;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import tutorialJava.capitulo8_AWT_SWING.utils.CacheImagenes;

public class Principal {


	/**
	 * 
	 * @return
	 */
	public static JTabbedPane getPanelesTabulados () {
	
		JTabbedPane tabPanel = new JTabbedPane();		
//		ImageIcon icono = CacheImagenes.getCacheImagenes().getIcono("duke1-32x32.png");
		
		tabPanel.addTab("Fabricantes", null, new PanelCRUD_Fabricante(), "Fabricante");
		tabPanel.setSelectedIndex(0);
		
		return tabPanel;
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		JFrame ventana = new JFrame("Gestión");
		ventana.setBounds(0, 0, 800, 600);
		
		ventana.getContentPane().setLayout(new BorderLayout());
		ventana.add(getPanelesTabulados(), BorderLayout.CENTER);
		ventana.setVisible(true);
	}
	
}
