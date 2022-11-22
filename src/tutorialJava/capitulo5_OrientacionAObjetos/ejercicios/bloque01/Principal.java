package tutorialJava.capitulo5_OrientacionAObjetos.ejercicios.bloque01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		Persona array[] = new Persona[3];
		
		
		do {
			System.out.println("\n\n\tMenú"
					+ "\n0.- Salir"
					+ "\n1.- Introducir datos"
					+ "\n2.- Ver datos"
					+ "\n\n\tIntroduzca su opcion: ");
			
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1:
				for (int i = 0; i < array.length; i++) {
					System.out.println("Introduzca el nombre de la persona " + i + ": ");
					array[i].setNombre(sc.nextLine());
					System.out.println("Introduzca los apellidos " + i + ": ");
					array[i].setApellidos(sc.nextLine());
					System.out.println("Introduzca el DNI: ");
					array[i].setDni(sc.nextLine());
					System.out.println("Introduzca la dirección: ");
					array[i].setDireccion(sc.nextLine());
					System.out.println("Introduzca el teléfono: ");
					array[i].setTelefono(sc.nextLine());
				}
				break;
				
			case 2:
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i].toString());
				}
			}
			
		} while (opcion != 0);

	}

}
