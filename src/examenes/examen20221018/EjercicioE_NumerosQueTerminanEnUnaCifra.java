package examenes.examen20221018;

import java.util.Scanner;

public class EjercicioE_NumerosQueTerminanEnUnaCifra {

	public static void main(String[] args) {
		int terminacion, num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número de una cifra: ");
		terminacion = sc.nextInt();
		
		for (int i = 0; i < 100; i++) {
			num = (int) Math.round(Math.random() * 100);
			if (num % 10 == terminacion) {
				System.out.println("Número válido: " + num);
			}
		}

	}

}
