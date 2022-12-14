package examenes.examen20221123;

public class EjercicioB_MoverAleatoriamenteElementosEnArray {

	public static void main(String[] args) {
		int array[] = new int[5];
		int array2[] = new int[5];
		
		// Inicializo los elementos del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		// Imprimo en consola el array original
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Copio el array en array2
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}

		// Genero intercambios aleatorios
		for (int i = 0; i < array.length; i++) {
			int posicionAleatoria1 = (int) Math.round(Math.random() * (array.length - 1));
			int posicionAleatoria2 = (int) Math.round(Math.random() * (array.length - 1));
			int aux = array2[posicionAleatoria1];
			array2[posicionAleatoria1] = array2[posicionAleatoria2];
			array2[posicionAleatoria2] = aux;
		}
		
		// Imprimo en consola el array modificado
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}

}
