package tutorialJava.capitulo2_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio05_MayorYMenorDeCincoVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, mayor, menor;
		
		System.out.println("Introduce un número: ");
		mayor = sc.nextInt();
		menor = mayor;

		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num > mayor) {
			mayor = num;
		}
		if (num < menor) {
			menor = num;
		}
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num > mayor)
			mayor = num;
		if (num < menor)
			menor = num;
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num > mayor) mayor = num;
		if (num < menor) menor = num;
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num > mayor) mayor = num;
		if (num < menor) menor = num;
		
		
		System.out.println("El mayor es " + mayor + " y el menor es " + menor);
		
	}

}
