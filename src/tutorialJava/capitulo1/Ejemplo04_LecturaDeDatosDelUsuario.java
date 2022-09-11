package tutorialJava.capitulo1;

import javax.swing.JOptionPane;

public class Ejemplo04_LecturaDeDatosDelUsuario {

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		lecturaDatosEnterosConError();
	}

	/**
	 * Método lecturaCadenaDeCaracteres
	 */
	public static void lecturaCadenaDeCaracteres() {
		String str; // Creo una variable String, para almacenar la palabra introducida por el usuario
		str = JOptionPane.showInputDialog("Introduzca una palabra o frase, ya!"); // Saca en pantalla una ventana y obtiene un string
		System.out.println("Palabra o frase introducida: " + str); // Imprime en la consola la palabra introducida
	}


	
	/**
	 * Método lecturaDatosEnteros
	 */
	public static void lecturaDatosEnteros() {
		String str = "1732"; // Sacamos ventana en pantalla y obtenemos un String
		int var1 = Integer.parseInt(str); // Convierto la variable escrita en un número entero
		System.out.println("Número introducido: " + var1); // Muestro el número en pantalla
		// Se repiten los pasos anteriores
		str = JOptionPane.showInputDialog("Introduzca otro número entero: ");
		int var2 = Integer.parseInt(str);
		System.out.println("Número introducido: " + var2);

		// sumo las variables.
		int suma = var1 + var2;
		System.out.println("Suma de los dos valores introducidos: " + suma);
	}

	/**
	 * Método lecturaDatosEnterosConError
	 */
	public static void lecturaDatosEnterosConError() {
		// En este caso hacemos lo mismo que el método anterior, pero teniendo en cuenta que algo puede fallar.
		String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		try { // Intento realizar la siguiente acción
			int var1 = Integer.parseInt(str); // Convertir el String en un número entero
			System.out.println("Número introducido: " + var1); 
		} catch (Exception ex) { // En caso de que ocurra algún error.
			System.out.println("Error, no has introducido un número entero");
		}
	}


	/**
	 * Método lecturaDatossFlotantes. Hace lo mismo de los otros métodos pero con números flotantes
	 */
	public static void lecturaDatosFlotantes() {
		String str = JOptionPane.showInputDialog("Introduzca un número flotante: ");
		float var1 = Float.parseFloat(str);
		System.out.println("Número introducido: " + var1);

		str = JOptionPane.showInputDialog("Introduzca otro número flotante: ");
		float var2 = Float.parseFloat(str);
		System.out.println("Número introducido: " + var2);

		float suma = var1 + var2;
		System.out.println("Suma de los dos valores introducidos: " + suma);
	}

}
