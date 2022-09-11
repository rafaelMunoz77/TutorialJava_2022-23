package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import tutorialJava.capitulo8_AWT_SWING.utils.Apariencia;
import tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados.JPanelIntoJDialog.PanelConBoton;
import tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados.splitPaneYJSlider.SplitPanel;

public class VentanaPrincipal extends JFrame {

	static {
		Apariencia.setAparienciasOrdenadas(Apariencia.aparienciasOrdenadas);
	}

	/**
	 * 
	 */
	public VentanaPrincipal() {
		super("JComponents Avanzados");
		this.setBounds(0, 0, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Menú de la aplicación
		this.setJMenuBar(new Menu());

		// Establezco el panel principal de la aplicación y la barra de herramientas
		this.setLayout(new BorderLayout());
		this.add(new ToolBar(), BorderLayout.NORTH);
		this.add(getTabbedPane(), BorderLayout.CENTER);
	}

	/**
	 * 
	 * @return
	 */
	private JTabbedPane getTabbedPane() {
		JTabbedPane tabbedPane = new JTabbedPane();

		tabbedPane.add("JFileChooser - Fichero Texto", new PanelJFileChooserFicheroTexto());
		tabbedPane.add("JFileChooser - Fichero Binario", new PanelJFileChooserFicheroImagen());
		tabbedPane.add("JColorChooser", new PanelJColorChooser());
		tabbedPane.add("JSplitPane y JSlider", new SplitPanel());
		tabbedPane.add("JScroolPane con imagen", new JScroolPaneConImagen("dukeGrande.png"));
		tabbedPane.add("JPopupMenu", new PanelPopUpMenu());
		tabbedPane.add("JSpinner con JSlider", new PanelJSpinner());
		tabbedPane.add("JFormattedTextField", new PanelJFormattedTextField());
		tabbedPane.add("JTextPane", new PanelJTextPane());
		tabbedPane.add("JEditorPane", new PanelJEditorPane());
		tabbedPane.add("JPanel into JDialog", new PanelConBoton());

		return tabbedPane;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}

}
