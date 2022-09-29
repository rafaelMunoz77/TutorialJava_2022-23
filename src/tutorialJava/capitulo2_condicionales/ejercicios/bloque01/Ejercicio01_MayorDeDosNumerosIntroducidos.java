package tutorialJava.capitulo2_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio01_MayorDeDosNumerosIntroducidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.println("Introduce el número 1: ");
		num1 = sc.nextInt();

		System.out.println("Introduce el número 2: ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("El mayor es " + num1);
		} 
		else {
			if (num2 > num1) {
				System.out.println("El mayor es " + num2);
			} 
			else {
				System.out.println("Los números son iguales");
			}
		}
	}

}
