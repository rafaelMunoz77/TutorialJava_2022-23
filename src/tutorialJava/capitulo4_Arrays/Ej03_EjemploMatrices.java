package tutorialJava.capitulo4_Arrays;

import tutorialJava.Utils;

public class Ej03_EjemploMatrices {

	public static void main(String[] args) {
		// Declaración
		int m[][] = new int[10][10];
		
		// Incialización
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = Utils.obtenerNumeroAzar(0, 100);
			}
		}
		
		// Salida por consola
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
