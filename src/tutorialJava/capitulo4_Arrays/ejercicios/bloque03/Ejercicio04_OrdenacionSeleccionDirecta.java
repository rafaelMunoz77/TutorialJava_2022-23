package tutorialJava.capitulo4_Arrays.ejercicios.bloque03;

public class Ejercicio04_OrdenacionSeleccionDirecta {

	public static void main(String[] args) {
		int posicionMenor, aux;
//		int array[] = new int[10];
		
//		for (int i = 0; i < array.length; i++) {
//			array[i] = (int) Math.round(Math.random() * 100);
//		}

		int array[] = new int[] {90, 17, 23, 15, 39, 7, 80, 72};
		
		System.out.println("Original");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");

		
		// Ordeno por Selección directa
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
			
		}
		
		
		
		System.out.println("Ordenado");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");

		
	}

}
