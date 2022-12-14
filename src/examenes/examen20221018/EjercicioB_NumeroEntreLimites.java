package examenes.examen20221018;

import java.util.Scanner;

public class EjercicioB_NumeroEntreLimites {

	public static void main(String[] args) {
		int num, limiteInf, limiteSup;
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("Introduzca límite inferior: ");
			limiteInf = sc.nextInt();
			if (limiteInf >= 0) {
				System.out.println("El límite inferior debe ser negativo");
			}
		} while (limiteInf >= 0);
		
		do {
			System.out.println("Introduzca límite superior: ");
			limiteSup = sc.nextInt();
		} while (!(limiteSup > 0));
		
		
		for (int i = 0; i < 10; i++) {
			num = (int) Math.round(Math.random() * (limiteSup - limiteInf) + limiteInf);
			System.out.print(num + " ");
		}

	}

}
