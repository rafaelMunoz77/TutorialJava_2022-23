package tutorialJava.capitulo4_Arrays;

import java.util.Iterator;

import tutorialJava.Utils;

public class Ej04_ComoHacerEjerciciosMatrices {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = new int[] {1, 2, 3, 4, 5};
		int m[][] = new int[][] { 	{1, 	0, 		0, 		0, 		0}, 
									{0, 	6, 		0, 		0, 		0}, 
									{0,		0, 		13, 	0, 		0}, 
									{0, 	0, 		0, 		19, 	0}, 
									{0, 	0, 		9, 		0, 		25} };
//		int m[][] = new int[5][5];
		
//		inicializaMatriz(m);
		imprimeMatriz(m);
	}
	

	public static boolean esMatrizPositiva (int n[][]) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				if (n[i][j] < 0) {
					return false;
				}
			}
		}
		return true;
	}

	

	public static void inicializaMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = Utils.obtenerNumeroAzar();
			}
		}
	}
	
	
	public static void imprimeMatriz (int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
}
