package tutorialJava.capitulo3_bucles.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio01_SumaMediaNumerosHasta0 {

	public static void main(String[] args) {
		int suma = 0, contador = 0, num = 1;
		Scanner sc = new Scanner(System.in);

		
		for (;num != 0;) {
			System.out.println("Introduzca número: ");
			num = sc.nextInt();
			suma += num;
			contador++;
		}
			
		System.out.println("Suma: " + suma + " - Media: " + (suma / (float) (contador-1)));

	}

}
