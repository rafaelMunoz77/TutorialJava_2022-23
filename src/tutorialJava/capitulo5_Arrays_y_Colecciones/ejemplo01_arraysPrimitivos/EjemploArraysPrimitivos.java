package tutorialJava.capitulo5_Arrays_y_Colecciones.ejemplo01_arraysPrimitivos;

import java.util.Iterator;

import tutorialJava.Utils;

public class EjemploArraysPrimitivos {
	
	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
//		primerEjemploArray();
//		segundoEjemploArray();
		tercerEjemploArray();
	}
	
	
	/**
	 * Ejemplo de declaración de un array, inicialización de valores al azar y mostrar el array en consola
	 */
	public static void primerEjemploArray () {
		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[10];
		
		
		// Inicialización de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar();
		}

		// Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		} 
	}
	
	
	/**
	 * Ejemplo de una segunda forma de crear un array, en este caso lo creamos con unos valores directamente, en
	 * lugar de inicializarlo con valores al azar.
	 */
	public static void segundoEjemploArray() {
		// Otra forma de inicializar el array
		int array2[] = new int[] {88, 89, 90, 4, 5, 6, 7, 8, 9, 10};

		// Recorrido del array para imprimir sus valores en pantalla.
		// Este tipo de bucle se conoce como "for each".
		for (int i : array2) {
			System.out.println(i);
		}
	}

	
	/**
	 * Método que crea e inicializa un array con 100 elementos al azar entre 0 y 100.
	 * Después calcula la suma, la media, el mayor y el menor de todos.
	 */
	public static void tercerEjemploArray() {
		int suma = 0, mayor, menor;
		float media;
		
		// Declaración del array
		int array[] = new int[1000000];
		
		// Recorro para inicializar el array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
		}
		
		// Recorro e imprimo en pantalla
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		
		// Recorro para obtener la suma
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		// Calculo la media
		media = suma / ((float) array.length);
		
		// Mayor y menor
		mayor = array[0];
		menor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > mayor) mayor = array[i];
			if (array[i] < menor) menor = array[i];
		}
		
		// Impresión de resultados
		System.out.println("suma: " + suma + " - media: " + media +
				" - mayor: " + mayor + " - menor: " + menor);
	}
}
