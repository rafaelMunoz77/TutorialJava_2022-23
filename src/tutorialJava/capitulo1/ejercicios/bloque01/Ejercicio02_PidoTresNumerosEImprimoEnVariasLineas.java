package tutorialJava.capitulo1.ejercicios.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02_PidoTresNumerosEImprimoEnVariasLineas {

	public static void main(String[] args) {
		int numEntero;
		float numFlotante;
		double numDoble;
		String resultadoDeJOptionPane;
		
		resultadoDeJOptionPane = JOptionPane.showInputDialog("Introduce num entero");
		numEntero = Integer.parseInt(resultadoDeJOptionPane);
		System.out.println("El número entero es " + numEntero);
		
		resultadoDeJOptionPane = JOptionPane.showInputDialog("Introduce num flotante");
		numFlotante = Float.parseFloat(resultadoDeJOptionPane);
		System.out.println("El número flotante es " + numFlotante);
		
		resultadoDeJOptionPane = JOptionPane.showInputDialog("Introduce num doble");
		numDoble = Double.parseDouble(resultadoDeJOptionPane);
		System.out.println("El número doble es " + numDoble);
		

	}

}
