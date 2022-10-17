package tutorialJava.capitulo3_bucles.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio05_FactorialSinUsarBucleFor {

	public static void main(String[] args) {
		// Declaro las variables
		int num, i, factorial = 1;
		Scanner sc = new Scanner(System.in);
		
		// Pido el número al usuario
		System.out.println("Por favor, introduzca un número y calcularé su factorial: ");
		num = sc.nextInt();
		
		// Realizo el algoritmo de cálculo del factorial
		factorial = num;
		i = num - 1;
		while (i > 1) {
			factorial *= i;
			i--;
		}
		
		// Imprimo el resultado
		System.out.println("Factorial de " + num + " es: " + factorial);
	}

}
