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
		int m[][] = new int[][] { 	{1, 	2, 		3, 		4, 		0}, 
									{5, 	6, 		0, 		8, 		9}, 
									{10,	0, 		12, 	13, 	14}, 
									{0, 	16,		17, 	18, 	19}, 
									{20, 	21, 	22, 	0, 		24} };
//		int m[][] = new int[5][5];
		
//		inicializaMatriz(m);
		imprimeMatriz(m);
		System.out.println("Es dispersa: " + esmatrizDispersa(m));
	}
	

	public static boolean esmatrizDispersa (int m[][]) {
		boolean dispersa = true;
		for (int i = 0; i < m.length; i++) {
			boolean hayCerosEnEstaFila = false;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 0) {
					hayCerosEnEstaFila = true;
				}
			}
			// Acabo de recorrer una fila
			if (hayCerosEnEstaFila == false) {
				dispersa = false;
			}
		}
		return dispersa;
	}
	
	
	
	public static boolean esmatrizDispersa2 (int m[][]) {
		// Recorro las filas buscando una que no tenga ceros
		for (int i = 0; i < m.length; i++) {
			boolean hayCerosEnEstaFila = false;
			for (int j = 0; j < m[i].length; j++) {
				// Si encuentro un elemento que sea cero lo registro
				if (m[i][j] == 0) { hayCerosEnEstaFila = true; }
			}
			// Acabo de recorrer una fila
			if (!hayCerosEnEstaFila) {
				return false;
			}
		}
		
		// Recorro las columnas buscando una que no tenga ceros
		for (int i = 0; i < m[0].length; i++) {
			boolean hayCerosEnEstaColumna = false;
			for (int j = 0; j < m.length; j++) {
				// Si encuentro un elemento que sea cero lo registro
				if (m[i][j] == 0) { hayCerosEnEstaColumna = true; }
			}
			// Acabo de recorrer una fila
			if (!hayCerosEnEstaColumna) {
				return false;
			}
		}
		
		return true;
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
