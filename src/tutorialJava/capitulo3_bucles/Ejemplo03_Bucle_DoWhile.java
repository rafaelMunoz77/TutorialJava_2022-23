package tutorialJava.capitulo3_bucles;

import tutorialJava.Utils;

public class Ejemplo03_Bucle_DoWhile {
	
	/**
	 * 
	 */
	public static void cuentaAdelante () {
		int i;
		
		i = 0;
		do {
			System.out.println("Valor de la i: " + i);
			i++;  // Equivalente a   i += 1     o      i = i + 1
		} while (i < 11);
	}

	
	/**
	 * 
	 */
	public static void cuentaAtras () {
		int i;
		
		i = 10;
		do {
			System.out.println("Valor de la i: " + i);
			i--;
		} while (i > -1);

	}	
	
	
	
	/**
	 * 
	 */
	public static void pedirNumerosAlUsuario () {
		int numero;
		
		do  { // Vas a ejecutar las instrucciones del bucle al menos una vez.
			System.out.println("Por favor, introduzca un n�mero (0 para terminar): ");
			numero = Utils.obtenerEntero();
		} while (numero != 0);
		
		System.out.println("Fin de la petici�n de n�meros");
	}
	
}
