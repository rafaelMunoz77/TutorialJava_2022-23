package tutorialJava.capitulo3_bucles.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio01_SumarNumerosMayoresDe10 {

	public static void main(String[] args) {
		int suma = 0, num;
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if (num > 10) {
				suma += num;
			}
		}

		System.out.println("La suma vale: " + suma);
	}

}
