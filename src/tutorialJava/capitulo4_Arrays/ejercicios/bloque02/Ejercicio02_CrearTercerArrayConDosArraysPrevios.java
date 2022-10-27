package tutorialJava.capitulo4_Arrays.ejercicios.bloque02;

import tutorialJava.UtilsArrays;

public class Ejercicio02_CrearTercerArrayConDosArraysPrevios {

	/**
	 * Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al azar entre 0 y 100. Debes crear 
	 * un tercer array, compuesto de la siguiente forma: en los elementos de índice impar del tercer array debes copiar 
	 * los elementos de índice impar del primer array; en los elementos de índice par del tercer array debes copiar los 
	 * elementos de índice par del segundo array.
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración de arrays
		int primerArray[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		int segundoArray[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		int tercerArray[] = new int[150];

		UtilsArrays.mostrarArray(primerArray);
		UtilsArrays.mostrarArray(segundoArray);

		// Recorro los dos arrays, pasando elementos al tercer array, dependiendo del par o no par del índice de cada elemento
		for (int i = 0; i < tercerArray.length; i++) {
			if (i % 2 == 0) {
				tercerArray[i] = primerArray[i];
			}
			else {
				tercerArray[i] = segundoArray[i];
			}
		}
		
		UtilsArrays.mostrarArray(tercerArray);
	}
	
}
