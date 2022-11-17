package tutorialJava.capitulo4_Arrays.ejercicios.bloque05;

public class Ejercicio02_PorcentajeDeAprobados {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int[20];
		int contadorAprobados = 0;
		float porcentajeAprobados = 0;
		
		// Inicializa y muestra un array
		inicializaArrayConNumerosAzar(array);
		visualizaArray(array);
		
		// Recorro el array buscando números iguales o mayores a 5
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 5) {
				contadorAprobados++;
			}
		}
		
		// Imprimo los resultados
		porcentajeAprobados = contadorAprobados / (float) array.length * 100;
		System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
		System.out.println("Porcentaje de aprobados: " + (100 - porcentajeAprobados) + "%");
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void inicializaArrayConNumerosAzar(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 10);
		}
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void visualizaArray(int array[]) {
		System.out.print("Contenido del array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println();
	}

}
