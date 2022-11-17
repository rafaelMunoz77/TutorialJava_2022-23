package tutorialJava.capitulo4_Arrays.ejercicios.bloque05;

public class Ejercicio01_LongitudImparDeArray {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int[] {1, 2, 3, 4};

		int variable = valorPosicionMediaDeArray(array);
		System.out.println(variable);
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int valorPosicionMediaDeArray (int array[]) {
		if (array.length % 2 == 1) {
			return array[array.length / 2];
		}
		else { // El array tiene una longitud par, se devuelve -1
			return -1;
		}
	}

}
