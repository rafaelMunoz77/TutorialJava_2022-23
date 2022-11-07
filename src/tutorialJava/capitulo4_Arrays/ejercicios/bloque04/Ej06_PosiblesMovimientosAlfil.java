package tutorialJava.capitulo4_Arrays.ejercicios.bloque04;

import java.util.Scanner;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ej06_PosiblesMovimientosAlfil {

	public static void main(String[] args) {
		int xAlfil, yAlfil;
		int tablero[][] = UtilsArrays.creaEInicializaMatriz(8, 8, 0);

		System.out.println("Tablero del ajedrez");
		UtilsArrays.mostrarMatriz(tablero);
		
		yAlfil = Utils.obtenerEnteroEntreLimites("Introduzca la fila del Alfil", 1, 8) - 1;
		xAlfil = Utils.obtenerEnteroEntreLimites("Introduzca la columna del Alfil", 1, 8) - 1;
		
		// Coloco el alfil en el tablero
		tablero[yAlfil][xAlfil] = 2;
		
		// Coloco valores en Diagonal principal sobre el alfil
		for (int i = yAlfil - 1, j = xAlfil - 1; i > -1 && j > -1; i--, j--) {
			tablero[i][j] = 1;
		}
		
		// Coloco valores en Diagonal principal bajo el alfil
		for (int i = yAlfil + 1, j = xAlfil + 1; i < tablero.length  && j < tablero[i].length ; i++, j++) {
			tablero[i][j] = 1;
		}
		
		// Coloco valores en Diagonal secundaria sobre el alfil
		for (int i = yAlfil - 1, j = xAlfil + 1; i > -1  && j < tablero[i].length ; i--, j++) {
			tablero[i][j] = 1;
		}
		
		// Coloco valores en Diagonal secundaria bajo el alfil
		for (int i = yAlfil + 1, j = xAlfil -1; i < tablero.length  && j > -1 ; i++, j--) {
			tablero[i][j] = 1;
		}
		
		UtilsArrays.mostrarMatriz(tablero);
	}

}
