package tutorialJava.capitulo3_bucles.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio04_ImprimirEnteroEnBinario {

	public static void main(String[] args) {
		// Declaro las variables
		int numAImprimirEnBinario;
		Scanner sc = new Scanner(System.in);
		int numDescubrimientoBits;
		
		// Pido el número al usuario
		System.out.println("Por favor, introduzca un número y lo imprimiré en binario: ");
		numAImprimirEnBinario = sc.nextInt();
		
		// Voy a hacer la operación "&" para ir detectando los bits del número
		numDescubrimientoBits = 128;
		while (numDescubrimientoBits > 0) {
			
			if ( (numDescubrimientoBits & numAImprimirEnBinario) != 0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
			
			// Acualizo el valor del numDescubrimientoBits para que apunte al siguiente bit por descubrir
			numDescubrimientoBits /= 2;
		}

	}

}
