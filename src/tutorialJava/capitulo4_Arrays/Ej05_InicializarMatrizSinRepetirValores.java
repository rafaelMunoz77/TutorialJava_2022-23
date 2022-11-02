package tutorialJava.capitulo4_Arrays;

import java.util.Iterator;

import tutorialJava.Utils;

public class Ej05_InicializarMatrizSinRepetirValores {

	public static void main(String[] args) {
		
		int m[][] = new int[5][5];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				int num;
				do {
					num = Utils.obtenerNumeroAzar(0, 100);
				} while (valorEstaEnMatriz(num, m));
				m[i][j] = num;
			}
		}
	}

	
	public static boolean valorEstaEnMatriz (int valor, int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (valor == m[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
