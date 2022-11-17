package tutorialJava.capitulo4_Arrays.ejercicios.bloque05;

import java.util.Iterator;

import tutorialJava.Utils;

public class Ejercicio04_Matrices {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int[][] {  {1,		0, 		0, 		0, 		0},
										{0, 	7, 		0, 		0, 		0},
										{0, 	0, 		6, 		0, 		0},
										{0, 	0, 		0, 		18, 	0},
										{0, 	0, 		0, 		0, 		19}};

//		inicializaMatriz(matriz);
		mostrarMatriz(matriz);
		
		// Comprobación de los diferentes métodos
		System.out.println("Matriz positiva: " + esMatrizPositiva(matriz));
		System.out.println("Matriz diagonal: " + esMatrizDiagonal(matriz));
		System.out.println("Matriz triangular superior: " + esMatrizTriangularSuperior(matriz));
		
		int array2[] = arrayFromMatriz(matriz);
		
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
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esMatrizDiagonal (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j && matriz[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esMatrizTriangularSuperior (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < i; j++) {
				if (matriz[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	
	public static boolean esMatrizDispersa (int matriz[][]) {
		// Voy a comprobar cada una de las líneas
		for (int i = 0; i < matriz.length; i++) {
			// Voy a suponer que no hay ceros en esta línea
			boolean hayCeroEnLinea = false;
			// Comienzo a buscar un cero en cada línea
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0) {
					hayCeroEnLinea = true;
					break;
				}
			}
			// Cuando llego a esta línea de código tengo una variable booleana que
			// me indica si hay o no al menos un cero en la línea
			if (!hayCeroEnLinea) {
				return false;
			}
		}
		
		// Voy a comprobar cada una de las columnas
		for (int i = 0; i < matriz[0].length; i++) {
			boolean hayCeroEnColumna = false;
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 0) {
					hayCeroEnColumna = true;
					break;
				}
			}
			if (!hayCeroEnColumna) {
				return false;
			}
		}
		
		// Si llego hasta aquí la matriz es dispersa
		return true;
	}
	
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static int[] arrayFromMatriz (int matriz[][]) {
		int array[] = new int[matriz.length * matriz[0].length];
		
		int k = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[k] = matriz[i][j];
				k++;
			}
		}
		
		return array;
	}

	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esMatrizSimetrica (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j && matriz[i][j] != matriz[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static int[][] getMatrizTraspuesta (int matriz[][]) {
		int traspuesta[][] = new int[matriz[0].length][matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				traspuesta[i][j] = matriz[j][i];
			}
		}
		
		return traspuesta;
	}

	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static int[][] getMatrizOpuesta (int matriz[][]) {
		int opuesta[][] = new int[matriz.length][matriz[0].length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				opuesta[i][j] = -matriz[i][j];
			}
		}
		
		return opuesta;
	}

	
	public static int[][] removeRowFromMatriz (int matriz[][], int numRow) {
		int newMatriz[][] = new int[matriz.length-1][matriz[0].length];
		int k = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			if (i != numRow) {
				for (int j = 0; j < matriz[i].length; j++) {
					newMatriz[k][j] = matriz[i][j];
				}
				// Después de haber copiado los elementos de una fila
				// aumento el valor de k, para apuntar a una nueva fila de la nueva matriz
				k++;
			}
		}
		
		return newMatriz;
	}
}
