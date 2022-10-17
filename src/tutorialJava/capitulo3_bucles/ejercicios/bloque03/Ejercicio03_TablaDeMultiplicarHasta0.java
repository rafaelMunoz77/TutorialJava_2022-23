package tutorialJava.capitulo3_bucles.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio03_TablaDeMultiplicarHasta0 {

	public static void main(String[] args) {
		int num = 1;
		Scanner sc = new Scanner(System.in);

		
		for (;num != 0;) {
			System.out.println("Introduzca número: ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		}

	}

}
