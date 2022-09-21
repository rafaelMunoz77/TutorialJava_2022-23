package tutorialJava.capitulo1;

import java.util.Scanner;

public class Ejemplo04_LecturaDeDatosDelUsuarioConScanner {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un número entero: ");
		int numEntero = sc.nextInt();
		System.out.println("Valor de numEntero: " + numEntero);
		
		System.out.println("Dame un flotante: ");
		float numFlotante = sc.nextFloat();
		System.out.println("Valor de numFlotante: " + numFlotante);
	}
}
