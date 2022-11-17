package tutorialJava.capitulo4_Arrays.ejercicios.bloque03;

public class Ejercicio03_OrdenacionShell {

	public static void main(String[] args) {
		int posicionMenor, aux;
		int saltos[] = new int[] {6, 4, 3, 2, 1};
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

		
		// Ordeno por Shell
		for (int i = 0; i < saltos.length; i++) {
			System.out.println("Voy a utilizar salto: " + saltos[i]);
			for (int j = 0; j < array.length; j++) {
				System.out.println("\tj: " + j);
				if (j + saltos[i] < array.length) {
					if (array[j] > array[j + saltos[i]]) {
						aux = array[j];
						array[j] = array[j + saltos[i]];
						array[j + saltos[i]] = aux;
					}
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
