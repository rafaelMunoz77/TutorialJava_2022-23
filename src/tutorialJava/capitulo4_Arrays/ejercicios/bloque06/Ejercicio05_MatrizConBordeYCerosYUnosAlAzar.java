package tutorialJava.capitulo4_Arrays.ejercicios.bloque06;

public class Ejercicio05_MatrizConBordeYCerosYUnosAlAzar {

	public static void main(String[] args) {
		// Declaración de variables
		char matriz[][] = new char[20][10];
		int probabilidad50;
		
		// La relleno de espacios en blanco
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0 || i == (matriz.length - 1) || j == 0 || j == (matriz[0].length - 1)) {
					matriz[i][j] = '*';
				}
				else {
					// Relleno de 0 y 1 al 50% de probabilidad
					probabilidad50 = (int) Math.round(Math.random());
					if (probabilidad50 == 0) {
						matriz[i][j] = '0';
					}
					else {
						matriz[i][j] = '1';
					}
				}
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
