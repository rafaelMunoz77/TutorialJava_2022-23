package tutorialJava.capitulo3_bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio02_MayorYMenorTantosComoQuieraUsuario {

	public static void main(String[] args) {
		int suma = 0, num, repeticiones, mayor = 0, menor = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuántos números va a introducir?");
		repeticiones = sc.nextInt();
		
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			// Sólo vamos a entrar en el siguiente if en la primera iteración
			// del bucle. Aprovechamos para inicializar las variables mayor y
			// menor
			if (i == 0) {
				mayor = num;
				menor = num;
			}
			// En el caso else no estamos en la primera iteración del bucle
			else {
				if (num > mayor) mayor = num;
				if (num < menor) menor = num;
			}
		}

		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
	}

}
