package tutorialJava.capitulo3_bucles.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio01_NumeroPrimoOCompuestoSinFor {

	public static void main(String[] args) {
		// Creo las variables necesarias
		int numUsuario, i;
		Scanner sc = new Scanner(System.in);
		boolean numeroTieneDivisores;
		
		// Pido el número al usuario
		System.out.println("Por favor, introduzca un número y comprobaré si es primo: ");
		numUsuario = sc.nextInt();
		
		// Utilizo un bucle diferente al for, pero le imito con una variable "i"
		i = 2;
		numeroTieneDivisores = false;
		// Pasaré con la variable "i" por todos los números entre el 2 y el anterior al número
		// que ha introducido el usuario, buscando divisores
		while (i < numUsuario) {
			if (numUsuario % i == 0) { // He encontrado un divisor
				numeroTieneDivisores = true;
				break;
			}
			i++;
		}
		
		// Si el número tiene divisores se trata de un compuesto, si no se trata de un primo
		if (numeroTieneDivisores == true) {
			System.out.println("El número " + numUsuario + " es compuesto");
		}
		else {
			System.out.println("El número " + numUsuario + " es primo");
		}
	}

}
