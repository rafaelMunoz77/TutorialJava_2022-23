package tutorialJava.capitulo4_Arrays.ejercicios.bloque03;

public class Ejercicio01_OrdenacionBurbuja {

	public static void main(String[] args) {
		boolean seHanHechoIntercambios;
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
		System.out.println("Original");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");

		
		// Ordeno por la burbuja
		do {
			seHanHechoIntercambios = false;

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					seHanHechoIntercambios = true;
				}
			}

		} while (seHanHechoIntercambios == true);
		
		
		
		System.out.println("Ordenado");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");

		
	}

}
