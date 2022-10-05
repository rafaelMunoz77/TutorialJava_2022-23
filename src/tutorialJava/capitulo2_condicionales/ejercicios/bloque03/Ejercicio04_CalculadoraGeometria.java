package tutorialJava.capitulo2_condicionales.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio04_CalculadoraGeometria {

	public static void main(String[] args) {
		int opcion, num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\tMenú\n"
				+ "\n1.- Hipotenusa de un triángulo."
				+ "\n2.- Superficie de un círculo."
				+ "\n3.- Longitud de una circunferencia."
				+ "\n\nIntroduzca su opción: ");
		opcion = sc.nextInt();
		
		switch (opcion) {
		// Hipotenusa de un triángulo rectángulo
		case 1:
			System.out.println("Introduzca primer cateto: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca segundo cateto: ");
			num2 = sc.nextInt();
			System.out.println("Resultado = " + Math.hypot(num1, num2));
			break;
		// Superficie de un círculo
		case 2:
			System.out.println("Introduzca radio del círculo: ");
			num1 = sc.nextInt();
			System.out.println("Resultado = " + (Math.PI * Math.pow(num1, 2)));
			break;
		// Longitud de una circunferencia
		case 3:
			System.out.println("Introduzca radio del círculo: ");
			num1 = sc.nextInt();
			System.out.println("Resultado = " + (2 * Math.PI * num1));
			break;
			
			
			
		}

	}

}
