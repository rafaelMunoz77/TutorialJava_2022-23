package tutorialJava.capitulo4_Arrays.ejercicios.bloque02;

import javax.swing.JOptionPane;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio06_CicloEnArrayTantosLugaresComoDigaUsuarioConDireccionElegida {

	/**
	 * Realiza un ejercicio igual al anterior, en el que el usuario también pueda deteminar la dirección del movimiento.
	 * @param args
	 */
	public static void main(String[] args) {		
		// Declaración del array
		int array[] = UtilsArrays.creaArrayNumerosAzar(5, -100, 100);
		
		UtilsArrays.mostrarArray(array);
		
		// Pido los datos al usuario, la dirección y la cantidad de ciclos a realizar
		int direccion = Utils.obtenerEnteroConDescripcion("Indique dirección de ciclo\n"
				+ "\n0.- Ciclo a derecha"
				+ "\n1.- Ciclo a izquierda");
		int numCiclos = Utils.obtenerEnteroConDescripcion("Elija cuántos ciclos debe realizar");

		// Bucle que repite tantas veces como ha dicho el usuario
		for (int i = 0; i < numCiclos; i++) {
			switch (direccion) {
			case 0: // a derecha
				// Comienzo el algoritmo de ciclo
				int aux = array[array.length - 1];
				for (int j = array.length - 1; j > 0; j--) {
					array[j] = array[j-1];
				}
				array[0] = aux;
				// Finalizo el algotitmo del ciclo
				break;
			case 1: // a izquierda
				// Salvaguardo la primera posición del array
				aux = array[0];
				// Recorro las posiciones del array de primera a penúltima
				for (int j = 0; j < array.length - 1; j++) {
					array[j] = array[j+1];
				}
				// La primera posición, guardada en aux, pasa a ser la última
				array[array.length-1] = aux;
				break;
			}

		}
		
		UtilsArrays.mostrarArray(array);
	}
	
}
