package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque01_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tutorialJava.Utils;

public class Ejercicio01_ListasConInteger {

	private static List<Integer> enteros = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		int opcionMenu = 0, posicionAInsertar;
		
		do {
			opcionMenu = mostrarMenu();
			
			switch(opcionMenu) {
			case 1: // Crear aleatoriamente la lista de valores
				enteros.clear();
				enteros.addAll(creaLista());
				break;
			case 2: // suma, media, mayor y menor
				calculaSumaMediaMayorMenor();
				break;
			case 3: // agregar una nueva cantidad de valores
				posicionAInsertar = Utils.obtenerEnteroConDescripcion("Dime la posición a "
						+ "insertar los nuevos valores en la lista");
				enteros.addAll(posicionAInsertar, creaLista());
				break;
			case 4: // Eliminar elementos dentro de un intervalo
				int eliminados = eliminarElementosEnIntervalo(
						Utils.obtenerEnteroConDescripcion("Dame un mínimo para eliminar: "), 
						Utils.obtenerEnteroConDescripcion("Dame un máximo para eliminar: "));
				System.out.println("Se han eliminado: " + eliminados);
				break;
			case 5: // Imprime la lista
				for (Integer e : enteros) {
					System.out.print(e.intValue() + " ");
				}
				System.out.println();
			}
		} while(opcionMenu != 0);

	}

	
	/**
	 * Este método....... 
	 * @param min Este parámetro....
	 * @param max
	 */
	private static int eliminarElementosEnIntervalo (int min, int max) {
		int contEliminados = 0;
		for (int i = enteros.size()-1; i > -1 ; i--) {
			if (enteros.get(i).intValue() > min && enteros.get(i).intValue() < max) {
				enteros.remove(i);
				contEliminados++;
			}
		}
		return contEliminados;
	}
	
	/**
	 * 
	 */
	private static void calculaSumaMediaMayorMenor () {
		int suma = 0;
		int mayor = enteros.get(0).intValue();
		int menor = enteros.get(0).intValue();
		
		for (Integer entero : enteros) {
			suma += entero.intValue();
			if (entero.intValue() > mayor) {
				mayor = entero.intValue();
			}
			if (entero.intValue() < menor) {
				menor = entero.intValue();
			}
		}
		
		System.out.println("La suma vale: " + suma);
		System.out.println("La media vale: " + (suma / (float) enteros.size()) );
		System.out.println("El menor es: " + menor);
		System.out.println("El mayor es: " + mayor);
	}
	

	
	
	
	/**
	 * 
	 */
	private static List<Integer> creaLista () {
		List<Integer> lista = new ArrayList<Integer>();
		int longitud = Utils.obtenerEnteroConDescripcion("Dame la longitud de la lista: ");
		int max = Utils.obtenerEnteroConDescripcion("Valor máximo: ");
		int min = Utils.obtenerEnteroConDescripcion("Valor mínimo: ");
		
		for (int i = 0; i < longitud; i++) {
			lista.add(Utils.obtenerNumeroAzar(min, max));
		}
		return lista;
	}
	
	/**
	 * 
	 * @return
	 */
	private static int mostrarMenu() {
		System.out.println("MENÚ DEL PROGRAMA");
		System.out.println("0.- Abandonar programa");
		System.out.println("1.- Crear aleatoriamente lista de valores");
		System.out.println("2.- Calcular suma, media, mínimo y máximo.");
		System.out.println("3.- Agregar cantidad nuevos valores");
		System.out.println("4.- Eliminar elementos en un intervalo");
		System.out.println("5.- Imprimir lista");
		
		System.out.println("Escribe la opción (0-5):");
		return new Scanner(System.in).nextInt();
	}
}
