package tutorialJava.capitulo3_bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio01_MediaTantosComoQuieraUsuario {

	public static void main(String[] args) {
		int suma = 0, num, repeticiones;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuántos números va a introducir?");
		repeticiones = sc.nextInt();
		
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			suma += num;
		}

		System.out.println("Media de los números: " + (suma / (float) repeticiones));
	}

}
