package tutorialJava.capitulo2_condicionales.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio05_DevolucionEnMonedas {

	public static void main(String[] args) {
		int precio, paga, cambioADevolver;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca precio: ");
		precio = sc.nextInt();
		System.out.println("Introduzca unidades con las que paga: ");
		paga = sc.nextInt();
		
		cambioADevolver = paga - precio;
		
		System.out.println((cambioADevolver / 100) + " Monedas de 100");
		cambioADevolver %= 100;
		System.out.println((cambioADevolver / 50) + " Monedas de 50");
		cambioADevolver %= 50;
		System.out.println((cambioADevolver / 25) + " Monedas de 25");
		cambioADevolver %= 25;
		System.out.println((cambioADevolver / 5) + " Monedas de 5");
		cambioADevolver %= 5;
		System.out.println(cambioADevolver + " Monedas de 1");

	}

}
