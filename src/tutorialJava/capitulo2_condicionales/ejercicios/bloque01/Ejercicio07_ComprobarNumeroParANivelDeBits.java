package tutorialJava.capitulo2_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio07_ComprobarNumeroParANivelDeBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca el número: ");
		num = sc.nextInt();
		
		System.out.print("El número es ");
		if ((num & 1) == 0) {
			System.out.println("par");
		}
		else {
			System.out.println("impar");
		}

	}

}
