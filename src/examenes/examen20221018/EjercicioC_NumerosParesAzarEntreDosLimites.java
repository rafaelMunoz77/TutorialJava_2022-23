package examenes.examen20221018;

public class EjercicioC_NumerosParesAzarEntreDosLimites {

	public static void main(String[] args) {
		int num, contNumerosValidos = 0;
		
		do {
			num = (int) Math.round(Math.random() * (50 - 20) + 20);
			if (num % 2 == 0 && ( (num >= 20 && num <= 30) || (num >= 40 && num <= 50)  )) {
				System.out.print(num + " ");
				contNumerosValidos++;
			}
		} while (contNumerosValidos < 10);
		
		
		
//		for (int i = 0; i < 10; i++) {
//			num = (int) Math.round(Math.random() * (50 - 20) + 20);
//			if (num % 2 == 0 && ( (num >= 20 && num <= 30) || (num >= 40 && num <= 50)  )) {
//				System.out.print(num + " ");
//			}
//			else {
//				i--;
//			}
//		}

	}

}
