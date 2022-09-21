package tutorialJava.capitulo1;

import javax.swing.JOptionPane;

public class Ejemplo04_LecturaDeDatosDelUsuarioConJOptionPane {

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		// Petición de un número entero
		String stringNumero = JOptionPane.showInputDialog("Introduzca un número entero");
		int numero = Integer.parseInt(stringNumero);
		System.out.println("Valor de numero: " + numero);

		// Petición de un número flotante
		String stringNumeroFlotante = JOptionPane.showInputDialog("Introduzca un número flotante");
		float numeroFlotante = Float.parseFloat(stringNumeroFlotante);
		System.out.println("Valor de numeroFlotante: " + numeroFlotante);
	}
}
