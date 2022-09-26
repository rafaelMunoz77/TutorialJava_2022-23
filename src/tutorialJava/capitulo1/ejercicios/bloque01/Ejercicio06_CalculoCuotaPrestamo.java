package tutorialJava.capitulo1.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio06_CalculoCuotaPrestamo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int meses;
		float diferencial, euribor, capital, interesAnual;
		float interesMensual, calculoIntermedio, cuota;
		
		System.out.println("Introduce capital: ");
		capital = sc.nextFloat();
		System.out.println("Introduce euribor: ");
		euribor = sc.nextFloat();
		System.out.println("Introduce diferencial: ");
		diferencial = sc.nextFloat();
		System.out.println("Introduce meses: ");
		meses = sc.nextInt();

		interesAnual = euribor + diferencial;
		interesMensual = interesAnual / 12 / 100;
		calculoIntermedio = (float) Math.pow(1 + interesMensual, meses);
		cuota = capital * (interesMensual * calculoIntermedio) / (calculoIntermedio - 1);
		System.out.println("Cuota: " + cuota);
	}

}
