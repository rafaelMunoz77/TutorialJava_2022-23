package tutorialJava.capitulo3_bucles.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio02_NumerosPrimosOCompuestoEntreLimitesSinFor {

	public static void main(String[] args) {
		// Creo las variables necesarias
		int limiteInf, limiteSup, numInvestigado, i;
		Scanner sc = new Scanner(System.in);
		boolean numeroTieneDivisores;
		
		// Pido los límites al usuario
		System.out.println("Por favor, introduzca un límite inferior: ");
		limiteInf = sc.nextInt();
		System.out.println("Por favor, introduzca un límite superior: ");
		limiteSup = sc.nextInt();
		
		// Utilizo un bucle diferente al for, con la variable "numInvestigado"
		numInvestigado = limiteInf;
		// Pasaré por todos los número entre el límite inferior y el superior, comprobando siempre el 
		// numInvestigado
		while (numInvestigado <= limiteSup) {
			// Supongo que el número investigado es primo e intento demostrar que tiene algún divisor.
			numeroTieneDivisores = false;
			i = 2;
			// Pasaré con la variable "i" por todos los números entre el 2 y el anterior al número
			// que ha introducido el usuario, buscando divisores
			while (i < numInvestigado) {
				if (numInvestigado % i == 0) { // He encontrado un divisor
					numeroTieneDivisores = true;
					break;
				}
				i++;
			}
			
			// Si el número tiene divisores se trata de un compuesto, si no se trata de un primo
			if (numeroTieneDivisores == true) {
				System.out.println("El número " + numInvestigado + " es compuesto");
			}
			else {
				System.out.println("El número " + numInvestigado + " es primo");
			}
			
			// Sumamos uno al número investigado para comprobar el siguiente número
			numInvestigado++;
		}
		
		
	}

}
