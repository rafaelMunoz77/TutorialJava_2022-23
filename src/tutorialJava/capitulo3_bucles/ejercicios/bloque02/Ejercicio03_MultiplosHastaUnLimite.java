package tutorialJava.capitulo3_bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio03_MultiplosHastaUnLimite {

	public static void main(String[] args) {
		int num, repeticiones;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Número al que calcular sus múltiplos: ");
		num = sc.nextInt();
		
		// Otra forma de hacer los múltiplos
		for (int i = 0; i < 100; i+=num) {
			System.out.println("Múltiplo de " + num + ": " + i);
		}
	}

}
