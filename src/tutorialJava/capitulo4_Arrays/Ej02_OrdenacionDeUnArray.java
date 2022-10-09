package tutorialJava.capitulo4_Arrays;

public class Ej02_OrdenacionDeUnArray {

	public static void main(String[] args) {
//		int array[] = new int[] {50, 100, 23, 2, 48, 66, 4};
		int array[] = new int[100]; 
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
		}
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Voy con la posición i=" + i);
			// Simplemente muestro el array
			System.out.print("El array está así: ");
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j] + " ");
			}
			System.out.println("");

			
			// Empieza el algoritmo de ordenación de un intervalo desde
			// el valor de "i" hasta el final del array
			int indiceMenor = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[indiceMenor]) {
					indiceMenor = j;
				}
			}
			
			// Intercambio de variables
			if (i != indiceMenor) {
				int aux = array[i];
				array[i] = array[indiceMenor];
				array[indiceMenor] = aux;
			}
			
			
		}
	}

}
