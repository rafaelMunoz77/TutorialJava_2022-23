package tutorialJava.capitulo3_bucles.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio03_PositivosYNegativosTantosComoQuieraUsuario {

	public static void main(String[] args) {
		int suma = 0, num, repeticiones, contPositivos = 0, contNegativos = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuántos números va a introducir?");
		repeticiones = sc.nextInt();
		
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if (num > 0) {
				contPositivos++;
			}
			if (num < 0) {
				contNegativos++;
			}
		}

		System.out.println("Positivos: " + contPositivos);
		System.out.println("Negativos: " + contNegativos);
	}

}
