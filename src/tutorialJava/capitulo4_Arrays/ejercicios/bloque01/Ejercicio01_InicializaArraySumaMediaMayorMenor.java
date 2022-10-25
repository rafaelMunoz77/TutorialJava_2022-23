package tutorialJava.capitulo4_Arrays.ejercicios.bloque01;

import tutorialJava.Utils;

public class Ejercicio01_InicializaArraySumaMediaMayorMenor {

	public static void main(String[] args) {
		int array[] = new int[5];
		int suma = 0, mayor = 0, menor = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();
			System.out.print(array[i] + " ");
			suma += array[i];
			
			if (i == 0) { // Primer número del array
				mayor = array[i];
				menor = array[i];
			}
			else {
				if (array[i] > mayor) mayor = array[i];
				if (array[i] < menor) menor = array[i];
			}
		}
		System.out.println();
		
		System.out.println("Suma vale: " + suma);
		System.out.println("Media vale: " + (suma / (float) array.length));
		System.out.println("Mayor vale: " + mayor);
		System.out.println("Menor vale: " + menor);
	}

	
}
