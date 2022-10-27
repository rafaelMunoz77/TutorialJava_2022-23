package tutorialJava.capitulo4_Arrays.ejercicios.bloque01;

import java.util.Scanner;

import tutorialJava.UtilsArrays;

public class Ejercicio06_InicializaArrayYSumaElementosConIndicePar {

	public static void main(String[] args) {
		int array[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		int sumaElementosIndicePar = 0;
		
		UtilsArrays.mostrarArray(array);

		// Ahora busco el valor buscado
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) sumaElementosIndicePar += array[i];
		}
		
		// Ponemos resultados
		System.out.println("Suma elementos con índice par: " + sumaElementosIndicePar);
	}

}
