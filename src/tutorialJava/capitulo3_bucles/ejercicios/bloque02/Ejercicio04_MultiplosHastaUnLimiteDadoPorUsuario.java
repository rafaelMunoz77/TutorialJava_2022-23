package tutorialJava.capitulo3_bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio04_MultiplosHastaUnLimiteDadoPorUsuario {

	public static void main(String[] args) {
		int num, limite;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Número al que calcular sus múltiplos: ");
		num = sc.nextInt();

		System.out.println("Límite para calcular múltiplos: ");
		limite = sc.nextInt();
		
		
		// Otra forma de hacer los múltiplos
		for (int i = num; i <= limite; i+=num) {
			System.out.println("Múltiplo de " + num + ": " + i);
		}
	}

}
