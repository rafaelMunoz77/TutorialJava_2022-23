package tutorialJava.capitulo4_Arrays.ejercicios.bloque06;

public class Ejercicio02_OndaDeAsteriscosAlAzar {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración de variables
		char matriz[][] = new char[10][30];
		int asteriscosEnCadaLinea;

		// Relleno toda la matriz de espacios en blanco
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ' ';
			}
		}
		
		// Recorro todas las filas
		for (int i = 0; i < matriz.length; i++) {
			// Determina la cantidad de asteriscos a introducir en cada línea
			asteriscosEnCadaLinea = (int) Math.round(Math.random() * 30);
			
			// Llenar tantos asteriscos desde la izquierda como indique la variable
			for (int j = 0; j < asteriscosEnCadaLinea; j++) {
				matriz[i][j] = '*';
			}
			
		}

		// Imprimo en consola
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
	
	}

}
