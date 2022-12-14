package examenes.examen20221018;

public class EjercicioA_SumaMultiplos5MediaImpares {

	public static void main(String[] args) {
		int num, sumaMultiplos5 = 0, sumaImpares = 0, contadorImpares = 0;
		
		
		for (int i = 0; i < 10; i++) {
			num = (int) Math.round(Math.random() * 100);
			System.out.print(num + " ");
			if (num % 5 == 0) {
				sumaMultiplos5 += num;
			}
			if (num % 2 == 1) {
				sumaImpares += num;
				contadorImpares++;
			}
		}
		
		// Resultados
		System.out.println("\nSuma múltiplos de 5: " + sumaMultiplos5);
		System.out.println("Media impares: " + (sumaImpares / (float) contadorImpares));
	}

}
