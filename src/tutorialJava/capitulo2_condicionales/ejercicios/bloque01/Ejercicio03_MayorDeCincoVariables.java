package tutorialJava.capitulo2_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio03_MayorDeCincoVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, mayor;
		
		System.out.println("Introduce un número: ");
		mayor = sc.nextInt();

		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num > mayor) {
			mayor = num;
		}
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num > mayor) {
			mayor = num;
		}
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num > mayor) {
			mayor = num;
		}
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num > mayor) {
			mayor = num;
		}
		
		System.out.println("El mayor es " + mayor);
		
	}

}
