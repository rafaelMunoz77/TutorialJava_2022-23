package tutorialJava.capitulo2_condicionales;

import javax.swing.JOptionPane;

import tutorialJava.Utils;


public class Ejemplo01_Condicionales {

	 
	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {		
		primerEjemploCondicionalSimple();
//		ejemploCondicionalCompuesto();
//		ejemploCondicionalAnidado();
//		ejemploCondicionalMultiple();
//		ejemploOperadorTernario();
	}
	
	
	/**
	 * Cómo utilizar simplemente un operador if
	 */
	public static void primerEjemploCondicionalSimple () {
		int numero = Utils.obtenerNumeroAzar(); // Pido un número entre 0 y 100
		System.out.println(numero); // Lo imprimo
		
		// Determino si el número está entre unos límites
		if ( (numero >= 10 && numero <= 50) || (numero >= 70 && numero <= 90) ) {
			System.out.println("Bingooooooooo");
			}
	}
	
	
	/**
	 * Ejemplo de operador if con else	
	 */
	public static void ejemploCondicionalCompuesto () {
		int numero = Utils.obtenerNumeroAzar(); // Obtengo número al azar
		System.out.println("Var número: " + numero);
		
		// Determino si es mayor de 50 o no lo es
		if (numero > 50) {
			System.out.println("El número es mayor de 50");
		}
		else {
			System.out.println("El número es 50 o menor de 50");
		}
	}
	
	
	/**
	 * Los condicionales pueden anidarse unos dentro de otros
	 */
	public static void ejemploCondicionalAnidado () {
//		int numero = Utils.obtenerNumeroAzar(); // Pido número al azar
		int numero = 50;
		System.out.println("Var número: " + numero);
		
		if (numero == 50) {
			System.out.println("lo que sea");
		}
		else {
			if (numero < 50) {
				System.out.println("lo que sea");
			}		
		}
		
		
		// Con un condicional anidado determino muchas posibles situaciones
		if (numero > 50) { // El número es mayor de 50
			System.out.println("El número es mayor de 50");
		}
		else { // No s� si el número es igual o menor a 50
			if (numero == 50) { // El número es igual a 50
				System.out.println("El número es 50");
			}
			else { // El número es menor a 50
				System.out.println("El número es menor de 50");
			}
		}
	}

	
	/**
	 * Ejemplo de switch
	 */
	public static void ejemploCondicionalMultiple () {
		int nota = 20;
		
		// switch decidirá el camino a tomar en función del valor
		// de la variable
		switch (nota) {
			case 0:
			case 1:
			case 2:
				System.out.println("Muy deficiente"); // Se llega en los cases 0, 1 y 2
				break; // Con esta instrucción salimos del switch
			case 3:
			case 4:
				System.out.println("Deficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Error, el valor no pertenece a ninguna nota");
		}
	}
	
	
	
	/**
	 * Operador ternario, muy utilizado
	 */
	public static void ejemploOperadorTernario () {
		int valor;
		boolean esValorPositivo;
		
		// Forma habitual de asignar valor a una variable en función de una condición
		valor = 1;
		if (valor >= 0) {
			esValorPositivo = true;
		}
		else { // valor < 0
			esValorPositivo = false;
		}
		
		// Otra forma de hacerlo, a través del operador ternario
		esValorPositivo = (valor >= 0)? true : false ;
			
	}
	
}
