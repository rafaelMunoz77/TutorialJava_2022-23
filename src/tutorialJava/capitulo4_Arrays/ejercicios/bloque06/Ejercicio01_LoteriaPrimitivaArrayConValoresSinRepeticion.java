package tutorialJava.capitulo4_Arrays.ejercicios.bloque06;

public class Ejercicio01_LoteriaPrimitivaArrayConValoresSinRepeticion {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración de variables
		int apuesta[] = new int[7];
		boolean numEncontradoEnPosicionesPrevias;
		
		// Un bucle que recorre el array de izquiera a derecha
		for (int i = 0; i < apuesta.length; i++) {
			
			// No sé cuántas veces tendré que genera un número al azar para asegurarme
			// de que no existe en los valores que se sitúan a la izquierda de la
			// posición marcada por el valor de la "i".
			do {
				numEncontradoEnPosicionesPrevias = false;
				apuesta[i] = (int) Math.round(Math.random() * (49 - 1) + 1);
				
				// Busco el valor de la posición de "i" en las posiciones a la izquierda
				// de ese valor
				for (int j = 0; j < i; j++) {
					if (apuesta[i] == apuesta[j]) {
						numEncontradoEnPosicionesPrevias = true;
					}
				}
			} while (numEncontradoEnPosicionesPrevias == true);
		}

		// Recorro y muestro el array
		for (int i = 0; i < apuesta.length; i++) {
			System.out.print(apuesta[i] + " ");
		}
	}

}
