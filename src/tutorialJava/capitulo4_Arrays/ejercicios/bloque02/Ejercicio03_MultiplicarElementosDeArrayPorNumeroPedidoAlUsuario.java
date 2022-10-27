package tutorialJava.capitulo4_Arrays.ejercicios.bloque02;

import javax.swing.JOptionPane;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio03_MultiplicarElementosDeArrayPorNumeroPedidoAlUsuario {

	/**
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes conseguir 
	 * multiplicar cada uno de los elementos del array por un número determinado, pedido al usuario
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración del array
		int array[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		UtilsArrays.mostrarArray(array);
		
		// Pido un número al usuario
		int numUsuario = Utils.obtenerEnteroConDescripcion(
				"Introduzca un factor para multiplicar elementos del array: ");
		
		// Recorro el array multiplicando por un valor
		for (int i = 0; i < array.length; i++) {
			array[i] *= numUsuario;
		}
		
		UtilsArrays.mostrarArray(array);
	}
	
}
