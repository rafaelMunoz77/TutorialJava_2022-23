package tutorialJava.capitulo3_bucles.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio04_ContadorPositivosYNegativosHasta0 {

	public static void main(String[] args) {
		int num = 1, contadorPos = 0, contadorNeg = 0;
		Scanner sc = new Scanner(System.in);

		
		for (;num != 0;) {
			System.out.println("Introduzca número: ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}
			
			if (num > 0) contadorPos++;
			if (num < 0) contadorNeg++;
		}

		System.out.println("Positivos: " + contadorPos + " - Negativos: " + contadorNeg);
	}

}
