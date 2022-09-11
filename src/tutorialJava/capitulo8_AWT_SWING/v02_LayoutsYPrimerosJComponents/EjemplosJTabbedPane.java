package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import java.awt.BorderLayout;
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
		
		tabPanel.addTab("01 FlowLayout", icono, getTabFlowLayout(false), "Ejemplo de FlowLayout");
		tabPanel.addTab("02 FlowLayout componentes", icono, getTabFlowLayout(true), "Ejemplo de FlowLayout");
		tabPanel.addTab("03 BorderLayout", icono, getTabBorderLayout(false), "Ejemplo de BorderLayout");
		tabPanel.addTab("04 BorderLayout componentes", icono, getTabBorderLayout(true), "Ejemplo de BorderLayout");
		tabPanel.addTab("05 BoxLayout vertical", icono, getTabBoxLayout(false, true), "Ejemplo de BoxLayout Vertical");
		tabPanel.addTab("06 BoxLayout vertical componentes", icono, getTabBoxLayout(true, true), "Ejemplo de BoxLayout Vertical");
		tabPanel.addTab("07 BoxLayout horizontal", icono, getTabBoxLayout(false, false), "Ejemplo de BoxLayout Horizontal");
		tabPanel.addTab("08 BoxLayout horizontal componentes", icono, getTabBoxLayout(true, false), "Ejemplo de BoxLayout Horizontal");
		tabPanel.addTab("09 GridLayout", icono, getTabGridLayout(false), "Ejemplo de GridLayout");
		tabPanel.addTab("10 GridLayout componentes", icono, getTabGridLayout(true), "Ejemplo de GridLayout");
		tabPanel.addTab("11 GridBagLayout", icono, GridBagLayoutFactory.instance(false), "Ejemplo de GridBagLayout");
		tabPanel.addTab("12 GridBagLayout componentes", icono, GridBagLayoutFactory.instance(true), "Ejemplo de GridBagLayout");
		tabPanel.addTab("13 CardLayout", icono, new CardLayoutEjemplo(), "Ejemplo de CardLayout");
		tabPanel.addTab("14 GroupLayout", icono, new EjemploGroupLayoutPane(), "Ejemplo de GroupLayout");
		tabPanel.setSelectedIndex(0);
		
		return tabPanel;
	}
	
	
	
	/**
	 * 
	 * @param incluirComponentes
	 * @return
	 */
	private static JPanel getTabFlowLayout (boolean incluirComponentes) {
		JPanel pnl = new JPanel();
		for (int i = 0; i < 10; i++) {
			pnl.add((incluirComponentes)? JComponentFactory.getJComponentAzar() : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), pnl);
		}
		return pnl;		
	}
	
	
	/**
	 * 
	 * @param incluirComponentes
	 * @return
	 */
	private static JPanel getTabBorderLayout (boolean incluirComponentes) {
		JPanel pnl = new JPanel();
		
		pnl.setLayout(new BorderLayout());  
		pnl.add((incluirComponentes)? JComponentFactory.getJComponentAzar() : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), BorderLayout.NORTH);
		pnl.add((incluirComponentes)? JComponentFactory.getJComponentAzar() : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), BorderLayout.SOUTH);
		pnl.add((incluirComponentes)? JComponentFactory.getJComponentAzar() : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), BorderLayout.CENTER);
		pnl.add((incluirComponentes)? JComponentFactory.getJComponentAzar() : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), BorderLayout.WEST);
		pnl.add((incluirComponentes)? JComponentFactory.getJComponentAzar() : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), BorderLayout.EAST);
		
		return pnl;		
	}
	
	
	
	/**
	 * 
	 * @param incluirComponentes
	 * @return
	 */
	private static JPanel getTabBoxLayout (boolean incluirComponentes, boolean vertical) {
		JPanel pnl = new JPanel();
		
		pnl.setLayout(new BoxLayout(pnl, (vertical)? BoxLayout.Y_AXIS : BoxLayout.X_AXIS));
		for (int i = 0; i < 10; i++) {
			pnl.add((incluirComponentes)? JComponentFactory.getJComponentAzar() : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), pnl);
		}
		
		return pnl;		
	}

	
	
	/**
	 * 
	 * @param incluirComponentes
	 * @return
	 */
	private static JPanel getTabGridLayout (boolean incluirComponentes) {
		JPanel jpn = new JPanel();
		
		jpn.setLayout(new GridLayout(3, 2));
		
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JLABEL) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JTEXTFIELD) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JLABEL) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JCHECKBOX) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JLABEL) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JTEXTAREA) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		
		return jpn;
	}
	
	
	/**
	 * 
	 * @param incluirComponentes
	 * @return
	 */
	private static JPanel getTabFormLayout (boolean incluirComponentes) {
		JPanel jpn = new JPanel();
		
		jpn.setLayout(new GridLayout(3, 2));
		
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JLABEL) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JTEXTFIELD) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JLABEL) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JCHECKBOX) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JLABEL) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JTEXTAREA) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL));
		
		return jpn;
	}
}
