package tutorialJava.capitulo3_bucles;

import java.awt.JobAttributes;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import tutorialJava.Utils;

public class Ejemplo01_Bucle_For {

	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
//		cuentaAdelanteYAtras();
//		cuentaAdelanteConMultiplos();
//		tablaMultiplicar();
//		mayorDeUnaSerieDeNumeros();
//		numerosPrimos();

		int limInf = 10, limSup = 100;
		
		for (int num = limInf; num <= limSup; num++) {
			boolean esPrimo = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					esPrimo = false;
					break;
				}
				
			}

			if (esPrimo == true) {
				System.out.println("El número " + num + " es primo");
			}
		}
		

	}
	
	
	/**
	 * Ejemplo de como utilizar un bucle For para realizar cuenta delante y hacia atrás
	 */
	public static void cuentaAdelanteYAtras () {
		int i;
		
		// Cuenta hacia delante
		System.out.println("Cuenta adelante con bucle for");
		for (i = 0; i < 10; i++) {
			System.out.println("Valor de i: " + i);
		}

		// Cuenta hacia atrás
		System.out.println("Cuenta hacia atrás con bucle for");
		for (i = 10; i > -1; i--) {
			System.out.println("Valor de i: " + i);
		}
	}
	
	
	/**
	 * Contar múltiplos hacia delante
	 */
	public static void cuentaAdelanteConMultiplos () {
		int limite = 20;
		int factor = 3;	
		
		// Una forma de hacer múltiplos
		for (int i = 0; (i * factor) < limite; i++) {
			System.out.println("Valor de i * factor: " + (i * factor));
		}

		// Otra forma de hacer los múltiplos
		for (int i = 0; i < limite; i+=5) {
			System.out.println("Múltiplo de 5: " + i);
		}
	}
	
	/**
	 * Mostrar una tabla de multiplicar
	 */
	public static void tablaMultiplicar () {
		int factor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número"));;
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " x " + factor + " = " + (i * factor));
		}
	}

	
	/**
	 * Obtener el mayor de varios números
	 */
	public static void mayorDeUnaSerieDeNumeros () {
		int numero = 1, mayor = 0;
		String mensaje = "Introduzca número (0 -> Terminar)";
		
		for (int i = 0; numero != 0; i++) {
			if (i == 0) { // Primera iteraci�n
				mayor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				numero = mayor;
			}
			else { // Resto de iteraciones
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero > mayor && numero != 0) {
					mayor = numero;
				}
			}	
		}
		
		JOptionPane.showMessageDialog(null, "Mayor: " + mayor);
	}
	

	/**
	 * Realizar factorial de un número
	 */
	public static void factorial () {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Introduzca el número cuyo factorial desea conocer: ");
		int factorial = sc.nextInt();
		
		for (int i = factorial-1; i > 1; i--) {
			factorial *= i;
		}
		
		System.out.println("El valor del factorial equivale a " + factorial);
	}
	
	
	
	/**
	 * Obtener números primos
	 */
	public static void numerosPrimos () {
		int limite = 50000;
		
		
		long millisDesde1970 = new Date().getTime();
		
		for (int numero = 2; numero < limite; numero++) {

			
			
			boolean numeroEsPrimo = true;
			for (int i = 2; i < (numero / 2 + 1); i++) {
				if (numero % i == 0) {
					numeroEsPrimo = false;
					break;
				}
			}
			
			if (numeroEsPrimo == true) {
				System.out.println("el número " + numero + " es primo");
			}
			
			
			
			
			
		}
		
		
		long millisDespuesDeBusquedaPrimos = new Date().getTime();
		
		long restaDeMillis = millisDespuesDeBusquedaPrimos - millisDesde1970;
		
		System.out.println("He tardado " + restaDeMillis + " milisegundos - " + (restaDeMillis / 1000) + " segundos");		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
