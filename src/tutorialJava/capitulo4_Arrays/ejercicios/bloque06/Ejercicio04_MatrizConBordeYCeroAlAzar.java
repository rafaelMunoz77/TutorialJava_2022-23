package tutorialJava.capitulo4_Arrays.ejercicios.bloque06;

public class Ejercicio04_MatrizConBordeYCeroAlAzar {

	public static void main(String[] args) {
		// Declaración de variables
		char matriz[][] = new char[20][10];
		int posicionAzarFila, posicionAzarColumna;
		
		// La relleno de espacios en blanco
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0 || i == (matriz.length - 1) || j == 0 || j == (matriz[0].length - 1)) {
					matriz[i][j] = '*';
				}
				else {
					matriz[i][j] = ' ';
				}
			}
		}

		// Posición del 0 con valores al azar en fila y columna
		posicionAzarFila = (int) Math.round(Math.random() * (matriz.length - 2 - 1) + 1);
		posicionAzarColumna = (int) Math.round(Math.random() * (matriz[0].length - 2 - 1) + 1);
		// Coloco el cero
		matriz[posicionAzarFila][posicionAzarColumna] = '0';
		
		// Imprimo en consola
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		

	}

}
