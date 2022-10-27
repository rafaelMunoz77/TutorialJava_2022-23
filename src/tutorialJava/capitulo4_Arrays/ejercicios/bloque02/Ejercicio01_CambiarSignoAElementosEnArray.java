package tutorialJava.capitulo4_Arrays.ejercicios.bloque02;

import tutorialJava.UtilsArrays;

public class Ejercicio01_CambiarSignoAElementosEnArray {

	/**
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y 100. Debes conseguir que 
	 * todos los números pares del array cambien de signo, los positivos deben pasar a negativos y viceversa.
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración de array
		int array[] = UtilsArrays.creaArrayNumerosAzar(150, -100, 100);
		UtilsArrays.mostrarArray(array);
				
		// Recorro el array buscando los pares y cambiando su signo
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] *= -1;
			}
		}

		UtilsArrays.mostrarArray(array); // Vuelvo a imprimir		
	}
	
}
