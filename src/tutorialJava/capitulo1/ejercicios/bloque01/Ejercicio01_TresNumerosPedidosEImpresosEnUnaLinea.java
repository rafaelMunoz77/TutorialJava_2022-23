package tutorialJava.capitulo1.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio01_TresNumerosPedidosEImpresosEnUnaLinea {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numEntero;
		float numFlotante;
		double numDoble;

		System.out.println("Introduce un número entero: ");
		numEntero = sc.nextInt();
		System.out.println("Introduce un número float: ");
		numFlotante = sc.nextFloat();
		System.out.println("Introduce un número double: ");
		numDoble = sc.nextDouble();

		System.out.println("Número entero: " + numEntero + 
				" - Número flotante: " + numFlotante + 
				" - Número doble: " + numDoble);
	}

}
