package tutorialJava.capitulo2_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio06_ComprobarNumeroPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca el número: ");
		num = sc.nextInt();
		
		System.out.print("El número es ");
		if (num % 2 == 0) {
			System.out.println("par");
		}
		else {
			System.out.println("impar");
		}

	}

}
