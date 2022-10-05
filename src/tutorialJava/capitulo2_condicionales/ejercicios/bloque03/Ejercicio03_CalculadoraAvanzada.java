package tutorialJava.capitulo2_condicionales.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio03_CalculadoraAvanzada {

	public static void main(String[] args) {
		int opcion, num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\tMenú\n"
				+ "\n1.- Raíz"
				+ "\n2.- Potencia"
				+ "\n3.- Módulo"
				+ "\n\nIntroduzca su opción: ");
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Introduzca índice: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca radicando: ");
			num2 = sc.nextInt();
			System.out.println("Resultado = " + Math.pow(num2, 1f/num1));
			break;
		case 2:
			System.out.println("Introduzca exponente: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca base: ");
			num2 = sc.nextInt();
			System.out.println("Resultado = " + Math.pow(num2, num1));
			break;
		case 3:
			System.out.println("Introduzca dividendo: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca divisor: ");
			num2 = sc.nextInt();
			System.out.println("Resultado = " + (num1 % num2));
			break;
			
			
			
		}

	}

}
