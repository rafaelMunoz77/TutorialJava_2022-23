package tutorialJava.capitulo4_Arrays.ejercicios.bloque05;


public class Ejercicio03_CrearNumerosDecimales {

	public static void main(String[] args) {
		float array[] = new float[20];
		int contador = 0;
		
		// Creo el array
		for (int i = 0; i < array.length; i++) {
			// Para crear el número flotante sumo una parte entera entre 0 y 100 y una
			// parte decimal entre 0 y 100, dividida entre 100.
			array[i] = numeroAzar() + numeroAzar() / 100f;
		}
		
		// Muestro el array
		muestraArray(array);

		// Contar cuantos números tienen su parte decimal menor o igual a 0.49
		for (int i = 0; i < array.length; i++) {
			if ( (array[i] - ((int) array[i]))   <= 0.49) {
				contador++;
			}
		}
		
		System.out.println("Números encontrados con parte decimal menor o igual a 0.49: " + contador);
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static int numeroAzar () {
		return (int) Math.round(Math.random() * 100);
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void muestraArray(float array[]) {
		System.out.println("Contenido del array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
