package tutorialJava.capitulo5_Arrays_y_Colecciones.ejemplo01_arraysPrimitivos;

import java.util.Iterator;

import tutorialJava.Utils;

public class ComoHacerEjerciciosMatrices {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int[][] {  {1,		2, 		3, 		4, 		5},
										{6, 	7, 		8, 		9, 		10},
										{10, 	11, 	12, 	13, 	14},
										{15, 	16, 	17, 	18, 	19},
										{20, 	21, 	22, 	23, 	24}};

//		inicializaMatriz(matriz);
		mostrarMatriz(matriz);
		
		// Comprobación de si la matriz es positiva
		System.out.println("Matriz positiva: " + esMatrizPositiva(matriz));
	}

	
	/**
	 * 
	 * @param matriz
	 */
	public static void inicializaMatriz (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
			}
		}
	}
	
	
	/**
	 * 
	 * @param matriz
	 */
	public static void mostrarMatriz (int matriz[][]) {
		System.out.println("Contenido de la matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esMatrizPositiva (int matriz[][]) {
		boolean esPositiva = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					esPositiva = false;
				}
			}
		}
		return esPositiva;
	}
}
