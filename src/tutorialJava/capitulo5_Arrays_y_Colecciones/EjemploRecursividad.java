package tutorialJava.capitulo5_Arrays_y_Colecciones;

public class EjemploRecursividad {

	public static void main(String[] args) {
		int resultado = factorial (6);
		System.out.println("Resultado: " + resultado);
	}

	
	public static int factorial (int num) {
		if (num == 1) {
			return 1;
		}
		else {
			return num * factorial(num - 1);
		}
	}
}
