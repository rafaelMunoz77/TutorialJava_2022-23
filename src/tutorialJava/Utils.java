package tutorialJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Utils {

	/**
	 * Método que obtiene y devuelve un número al azar, entre 0 y 100.
	 * @return Número generado al azar entre 0 y 100
	 */
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}
	

	/**
	 * 
	 * @param min Límite inferior de generación del número al azar
	 * @param max Límite superior de generación del número al azar
	 * @return Número generado al azar entre dos límites.
	 */
	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}
	 
 
	
	/**
	 * Obtiene un número entero introducido por el usuario, por el método de InputStreamReader
	 * @return Número entero introducido por el usuario.
	 */
	public static int obtenerEnteroPorInputStreamReader () {
		int numero = 0;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (isr);
			numero = Integer.parseInt (br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numero;
	}

	
	/**
	 * Obtiene un número entero a través de un objeto Scanner
	 * @return Número entero introducido por el usuario.
	 */
	public static int obtenerEnteroPorScanner() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				return sc.nextInt();
			} catch (Exception ex) {
				System.out.println("Error, introduce un número entero: ");
				sc.nextLine();
			}
		}
		
	}
	
	/**
	 * Obtiene un número entero a través de un JOptionPane
	 * @return Número entero introducido a través de un JOptionPane.
	 */
	public static int obtenerEnteroPorJOptionPane() {
		String str = JOptionPane.showInputDialog("Introduce un número");
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	
	
	/**
	 * 
	 * @param mensaje
	 * @return
	 */
	public static int obtenerEnteroPorJOptionPane (String mensaje) {
		String str = JOptionPane.showInputDialog(mensaje);
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	
	
	public static int obtenerEnteroConDescripcion(String desc) {
		System.out.println(desc);
		int num = obtenerEnteroPorScanner();
		return num;
	}
	
	/**
	 * 
	 * @return Número entero introducido por el usuario
	 */
	public static int obtenerEntero() {
		return obtenerEnteroPorJOptionPane();
	}
}
