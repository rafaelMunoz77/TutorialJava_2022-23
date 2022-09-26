package tutorialJava.capitulo1.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio03_PidoTresNumerosYSumo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Introduce el número 1: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el número 2: ");
		num2 = sc.nextInt();
		System.out.println("Introduce el número 3: ");
		num3 = sc.nextInt();
		
		System.out.println("La suma vale: " + (num1 + num2 + num3));
	}

}
