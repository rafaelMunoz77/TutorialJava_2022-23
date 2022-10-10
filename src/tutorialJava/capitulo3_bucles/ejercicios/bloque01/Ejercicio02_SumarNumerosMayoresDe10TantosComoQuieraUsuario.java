package tutorialJava.capitulo3_bucles.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio02_SumarNumerosMayoresDe10TantosComoQuieraUsuario {

	public static void main(String[] args) {
		int suma = 0, num, repeticiones;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuántos números va a introduci?");
		repeticiones = sc.nextInt();
		
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if (num > 10) {
				suma += num;
			}
		}

		System.out.println("La suma vale: " + suma);
	}

}
