package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque01_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tutorialJava.Utils;

public class FicheroTextoConListaDeStrings {

	private static List<String> fichero = new ArrayList<String>();
	private static List<String> portapapeles = new ArrayList<String>();
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion;
		
		do {
			opcion = mostrarMenu();
			
			switch (opcion) {
			case 1: // Agregar una línea al final del fichero
				fichero.add(Utils.obtenerCadenaConDescripcion("Inserte la nueva línea: "));
				break;
			case 2: // Insertar una línea en cualquier lugar del fichero
				fichero.add(
						Utils.obtenerEnteroConDescripcion("Dame una posición para insertar la línea:"), 
						Utils.obtenerCadenaConDescripcion("Dame la nueva línea: "));
				break;
			case 3: // Editar una línea
				int posicionAEditar = Utils.obtenerEnteroConDescripcion("Posición a editar: ");
				fichero.remove(posicionAEditar);
				fichero.add(
						posicionAEditar, 
						Utils.obtenerCadenaConDescripcion("Dame la nueva línea: "));
				break;
			case 4: // elimiar una línea
				fichero.remove(Utils.obtenerEnteroConDescripcion("Indica la línea a eliminar: "));
				break;
			case 5: // Llevar al portapapeles un conjunto de líneas
				int lineaIni = Utils.obtenerEnteroConDescripcion("Primera línea a cortar: ");
				int lineaFin = Utils.obtenerEnteroConDescripcion("Última línea a cortar: ");
				
				portapapeles.clear();
				for (int i = lineaIni; i <= lineaFin; i++) {
					portapapeles.add(fichero.get(lineaIni));
					fichero.remove(lineaIni);
				}
				break;
			case 6:
				fichero.addAll(
						Utils.obtenerEnteroConDescripcion("Indica dónde quieres insertar "
								+ "las linás cortadas: "),
						portapapeles);
				break;
			case 7: // Ver el fichero
				System.out.println("Contenido del fichero: ");
				for (String linea : fichero) {
					System.out.println(linea);
				}
				System.out.println("\n");
								
				break;
			}
		} while (opcion != 0);

	}

	
	
	/**
	 * 
	 * @return
	 */
	private static int mostrarMenu() {
		System.out.println("MENÚ DEL PROGRAMA");
		System.out.println("0.- Abandonar programa");
		System.out.println("1.- Agregar una línea al texto");
		System.out.println("2.- Insertar una línea en cualquier posición del texto.");
		System.out.println("3.- Editar una línea (reescribir su contenido)");
		System.out.println("4.- Borrar una línea");
		System.out.println("5.- Cortar un conjunto de líneas, (marcadas por su posición inicial y final).");
		System.out.println("6.- Pegar un conjunto de líneas, (marcadas por su posición).");
		System.out.println("7.- Imprimir el fichero");
		
		System.out.println("Escribe la opción (0-7):");
		return new Scanner(System.in).nextInt();
	}

}
