package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import tutorialJava.capitulo8_AWT_SWING.utils.CacheImagenes;

public class PanelJTextPane extends JPanel {

	/**
	 * 
	 */
	public PanelJTextPane() {
		super();

		// Disponemos los elementos sobre el panel
		// Creo una etiqueta para indicar al usuario que debe hacer clic en cualquier
		// sitio
		this.setLayout(new BorderLayout());
		this.add(getEjemploJTextPane(), BorderLayout.CENTER);

	}

	/**
	 * EJemplo obtenido de
	 * https://jairogarciarincon.com/clase/interfaces-de-usuario-con-java-swing/componentes-jeditorpane-y-jtextpane
	 * 
	 * @return
	 */
	private JTextPane getEjemploJTextPane() {
		JTextPane text = new JTextPane(); // Incializamos el textPane

		/*
		 * Instanciamos una clase SimpleAttributeSet, que guardar� los atributos para un
		 * determinado texto: si es negrita, cursiva, fuente, etc.
		 */
		SimpleAttributeSet attrs = new SimpleAttributeSet();

		// Texto en negrita + nueva línea
		textoNegrita(attrs, text, "Esto es un texto en negrita");
		nuevaLinea(text);

		// Texto en rojo + nueva línea
		textoRojo(attrs, text, "esto es un texto de color rojo");
		nuevaLinea(text);

		/*INSERTAR UN ICONO *************************************************************************
		El método para ello es insertIcon(). Este método reemplaza lo que hay seleccioado en el 
		JTextPane por el icono. Si sólo queremos insertarlo al final, debemos cambiar la selección 
		del texto al final, sin seleccionar nada. Eso se hace con el m�todo setCaretPosition().
		Después generamos el icono desde la imagen y lo añadimos con insertIcon
		*/
		text.setCaretPosition(text.getStyledDocument().getLength());
		text.insertIcon(CacheImagenes.getCacheImagenes().getIcono("ruedadentada.png"));
		nuevaLinea(text);

		/*
		 * INSERTAR UN BOT�N
		 * ************************************************************************* El
		 * m�todo es insertComponent() y, al igual que en el caso anterior, reemplaza el
		 * texto que haya seleccionado por el Component. Al igual que antes, con
		 * setCaretPosition() nos vamos al final del texto e insertamos el JButton.
		 */
		text.setCaretPosition(text.getStyledDocument().getLength());
		JButton boton = new JButton("Púlsame");
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha hecho clic en el botón del TextPane");
			}
		});
		text.insertComponent(boton);
		nuevaLinea(text);

		// Devuelvo el textPane
		return text;
	}

	/**
	 * 
	 * @param attrs
	 * @param text
	 * @param string
	 */
	private void textoNegrita(SimpleAttributeSet attrs, JTextPane text, String string) {

		/*
		 * Para modificar el valor de estos atributos, nos ayuda la clase
		 * StyleConstants. Esta clase tiene muchos métodos para cambiar valores a una
		 * clase SimpleAttributeSet. En este caso concreto hemos usado setBold() para
		 * ponerlo en negrita.
		 */
		StyleConstants.setBold(attrs, true);

		/*
		 * Obtenemos el StyledDocument, que es lo que el JTextPane tiene dentro y
		 * representa al texto que estamos viendo. El StyledDocument tiene un m�todo
		 * insert() que admite tres parámetros: - Posición en la que se quiere insetar
		 * el texto dentro del documento. - El texto - Los atributos del texto. Como
		 * queremos insertar al final, la posici�n es justo la longitud del texto, esto
		 * se obtiene con el m�todo getLength().
		 */
		try {
			text.getStyledDocument().insertString(text.getStyledDocument().getLength(), string, attrs);
		} catch (BadLocationException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 
	 * @param attrs
	 * @param text
	 * @param string
	 */
	private void textoRojo(SimpleAttributeSet attrs, JTextPane text, String string) {

		StyleConstants.setForeground(attrs, Color.red);

		try {
			text.getStyledDocument().insertString(text.getStyledDocument().getLength(), string, attrs);
		} catch (BadLocationException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * 
	 * @param text
	 */
	private void nuevaLinea(JTextPane text) {

		try {
			text.getStyledDocument().insertString(text.getStyledDocument().getLength(),
					System.getProperty("line.separator"), null);
		} catch (BadLocationException ex) {
			ex.printStackTrace();
		}

	}
}
