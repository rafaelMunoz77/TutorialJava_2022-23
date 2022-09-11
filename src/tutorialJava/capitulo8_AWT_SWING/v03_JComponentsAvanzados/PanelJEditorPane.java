package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelJEditorPane extends JPanel {

	/**
	 * 
	 */
	public PanelJEditorPane() {
		super();

		// Disponemos los elementos sobre el panel
		// Creo una etiqueta para indicar al usuario que debe hacer clic en cualquier
		// sitio
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5, 5, 5, 5);

		// Inserto el JEdtiorPane con texto en formato HTML
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weighty = 1;
		constraints.anchor = GridBagConstraints.EAST;
		this.add(new JLabel("JEditorPane con contenido HTML"), constraints);

		constraints.gridx = 1;
		constraints.weightx = 1;
		constraints.fill = GridBagConstraints.BOTH;
		this.add(getHTMLJEditorPane(), constraints);

		// Inserto el JEdtiorPane con texto en formato RTF
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.weightx = 0;
		constraints.fill = GridBagConstraints.NONE;
		this.add(new JLabel("JEditorPane con contenido RTF"), constraints);

		constraints.gridx = 1;
		constraints.weightx = 1;
		constraints.fill = GridBagConstraints.BOTH;
		this.add(getRtfJEditorPane(), constraints);

		// Inserto el JEdtiorPane con texto en formato plano
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.weighty = 1;
		constraints.weightx = 0;
		constraints.fill = GridBagConstraints.NONE;
		this.add(new JLabel("JEditorPane con contenido texto plano"), constraints);

		constraints.gridx = 1;
		constraints.weightx = 1;
		constraints.fill = GridBagConstraints.BOTH;
		this.add(getTextoPlanoJEditorPane(), constraints);

	}

	/**
	 * EJemplo obtenido de
	 * http://www.chuidiang.org/java/ejemplos/JEditorPane-JTextPane/JEditorPane-JTextPane.php
	 * 
	 * @return
	 */
	private JEditorPane getHTMLJEditorPane() {
		JEditorPane editor = new JEditorPane();

		// Marco el editor para que use HTML
		editor.setContentType("text/html");
		// Inserto un texto
		editor.setText("<b>hola</b><br>" + "<i>adios</i><br>" + "<font face=\"arial\">fuente arial</font><br>"
				+ "<font face=\"courier\">fuente courier</font><br>" + "<font size=\"24\">fuente grande</font><br>"
				+ "<font color=\"red\">color rojo</font><br>"
				+ "<img src=\"http://webdidacticarafaelmunoz.appspot.com/java/CursodeSpaceInvaders/res/nave.gif\"></img>");
		return editor;
	}

	/**
	 * EJemplo obtenido de
	 * http://www.chuidiang.org/java/ejemplos/JEditorPane-JTextPane/JEditorPane-JTextPane.php
	 * 
	 * @return
	 */
	private JEditorPane getRtfJEditorPane() {
		JEditorPane editor = new JEditorPane();

		// Marco el editor para que use HTML
		editor.setContentType("text/rtf");
		// Inserto un texto
		editor.setText("{\\rtf1" + "{\\colortbl ;\\red255\\green0\\blue0;}" + "Esto\\par "
				+ "es una \\b prueba\\b0  de \\i cursiva\\i0\\par " + "y \\cf1 todo\\cf0 \\par" + "}");
		return editor;
	}

	/**
	 * EJemplo obtenido de
	 * http://www.chuidiang.org/java/ejemplos/JEditorPane-JTextPane/JEditorPane-JTextPane.php
	 * 
	 * @return
	 */
	private JEditorPane getTextoPlanoJEditorPane() {
		JEditorPane editor = new JEditorPane();

		// Marco el editor para que use HTML
		editor.setContentType("text/plain");
		// Inserto un texto
		editor.setText("Ejemplo de texto plano");
		return editor;
	}
}
