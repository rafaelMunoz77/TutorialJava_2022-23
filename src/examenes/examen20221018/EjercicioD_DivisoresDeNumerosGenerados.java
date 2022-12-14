package examenes.examen20221018;

public class EjercicioD_DivisoresDeNumerosGenerados {

	public static void main(String[] args) {
		int num;
		
		for (int i = 0; i < 10; i++) {
			num = (int) Math.round(Math.random() * 100);
			System.out.println("Voy a buscar divisores del " + num);
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					System.out.println("\tHe encontrado un divisor: " + j);
				}
			}
		}

	}

}
