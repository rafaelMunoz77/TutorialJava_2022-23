package tutorialJava.capitulo1.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio05_IntercambioValoresDosVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Introduce el número 1: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el número 2: ");
		num2 = sc.nextInt();
		
		System.out.println("num1: " + num1 + " - num2: " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("num1: " + num1 + " - num2: " + num2);
	}

}
