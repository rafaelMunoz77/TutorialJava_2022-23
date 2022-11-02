package tutorialJava.capitulo4_Arrays.ejercicios.bloque02;

import javax.swing.JOptionPane;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio05_CicloEnArrayHaciaDerechaTantosLugaresComoDigaUsuario {

	/**
	 * Realiza un ejercicio igual al anterior, pero en el que el usuario pueda indicar la cantidad de posiciones que 
	 * deseamos desplazar.
	 * @param args
	 */
	public static void main(String[] args) {		
		// Declaración del array
		int array[] = UtilsArrays.creaArrayNumerosAzar(5, -100, 100);
		
		UtilsArrays.mostrarArray(array);
		
		// Pido al usuario un número de veces a desplazar los elementos
		int numCiclos = Utils.obtenerEnteroConDescripcion("Introduzca un número de veces a desplazar los elementos ");
		
		for (int i = 0; i < numCiclos; i++) {
			// Comienzo el algoritmo de ciclo del ejercicio anterior.
			int aux = array[array.length - 1];
			for (int j = array.length - 1; j > 0; j--) {
				array[j] = array[j-1];
			}
			array[0] = aux;
			// Finalizo el algotitmo del ciclo
		}
		
		UtilsArrays.mostrarArray(array);		
	}
}
