package tutorialJava.capitulo3_bucles;

import tutorialJava.Utils;

public class Ejemplo02_Bucle_While {
	
	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		pedirNumerosAlUsuario();
	}
	

	/**
	 * 
	 */
	public static void cuentaAdelanteYCuentaAtras() {
		int i;
		
		// Cuenta adelante
		i = 0;
		while (i < 10) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		// Cuenta atr�s
		i = 10;
		while (i >= 0) {
			System.out.println("Valor de i: " + i);
			i--;
		}
	}
	
	
	/**
	 * 
	 */
	public static void pedirNumerosAlUsuario () {
		int numero = -1;
		
		while (numero != 0) {
			System.out.println("Por favor, introduzca un n�mero (0 para terminar): ");
			numero = Utils.obtenerEntero();
		}
		System.out.println("Fin de la petici�n de n�meros");
	}
	
	
	/**
	 * 
	 */
	public static void pedirNumerosAlUsuarioYObtenerSuma () {
		int numero = -1, acumulador = 0;
		
		while (numero != 0) {
			System.out.println("Por favor, introduzca un n�mero (0 para terminar): ");
			numero = Utils.obtenerEntero();
			acumulador += numero;  // igual a      acumulador = acumulador + numero;
		}
		System.out.println("Suma de todos los n�meros: " + acumulador);
	}
	
	
}
