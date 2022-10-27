package tutorialJava;

/**
 * 
 * @author rafae
 *
 */
public class UtilsArrays {

	
	public static void inicializaArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();
		}
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void mostrarArray (int[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limInf, limSup);
		}
		return array;
	}

	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] creaArrayNumerosUsuario (int longitud) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerEntero();
		}
		return array;
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int sumaDelArray (int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static float mediaDelArray (int array[]) {
		return sumaDelArray(array) / (float) array.length;
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int menorDelArray (int array[]) {
		int menor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < menor) menor = array[i];
		}
		return menor;
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int mayorDelArray (int array[]) {
		int mayor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > mayor) mayor = array[i];
		}
		return mayor;
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void ordenaArray (int array[]) {

	
		
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i+1] < array[i]) {
					// Entonces hago un intercambio
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios);

	}

}
