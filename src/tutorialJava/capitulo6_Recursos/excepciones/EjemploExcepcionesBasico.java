package tutorialJava.capitulo6_Recursos.excepciones;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class EjemploExcepcionesBasico {

	/**
	 * Ejemplo de Exception general
	 */
	private static void ejemploExceptionGeneral () {
		String str = null;
		
		try {
			System.out.println ("Contenido de str: " + str.toLowerCase());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
		System.out.println("Terminando");
	}
	
	
	/**
	 * 
	 */
	private static void ejemploNullPointerException () {
		Persona persona = new Persona (null, new Pierna(Pierna.IZQUIERDA));
		
		try {
			System.out.println ("Pierna izquierda de la persona: " + persona.getPiernaIzquierda().toString());
			System.out.println ("Pierna derecha de la persona: " + persona.getPiernaDerecha().toString());
			String cadenas[] = new String[2];
			System.out.println("cadena: " + cadenas[3]);
		}
		catch (NullPointerException ex) {
			System.out.println("Exception NullPointer recogida");
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Exception IndexOutOfBoundsException recogida");
		}
		catch (Exception ex) {
			System.out.println("Exception general recogida");
		}
		
		System.out.println("Fuera del catch");
	}
	
	
	/**
	 * 
	 */
	private static void ejemploArithmeticException () {
		try {
			int divisor = 0; 
			System.out.println ("Divisi�n: " + (50/divisor));
		}
		catch (ArithmeticException ex) {
			System.out.println("Error aritmético");
			System.out.println("Mensaje de error: " + ex.getMessage() + "\n\n");
			ex.printStackTrace();
		}
	}
	

	
	
	/**
	 * 
	 */
	private static void ejemploClassCastException () {
		try {
			Object persona = new Object(); 
			Pierna pierna = (Pierna) persona;
		}
		catch (ClassCastException ex) {
			System.out.println("Error de casting");
			System.out.println("Mensaje de error: " + ex.getMessage() + "\n\n");
			ex.printStackTrace();
		}
	}
	

	
	
	/**
	 * 
	 */
	private static void ejemploIndexOutOfBoundsException () {
		try {
			List<Pierna> piernas = new ArrayList<Pierna>();
			piernas.add(new Pierna(Pierna.DERECHA));
			
			System.out.println ("Pierna en array: " + piernas.get(1).toString());
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Error de índice de acceso a un elemento en un array");
			System.out.println("Mensaje de error: " + ex.getMessage() + "\n\n");
			ex.printStackTrace();
		}
	}
	

	
	
	/**
	 * 
	 */
	private static void ejemploNumberFormatException () {
		try {
			System.out.println("Parseo de n�mero: " + Integer.parseInt("rafa"));
		}
		catch (NumberFormatException ex) {
			System.out.println("Error de parseo a un número");
			System.out.println("Mensaje de error: " + ex.getMessage() + "\n\n");
			ex.printStackTrace();
		}
	}
	

	
	
	/**
	 * 
	 */
	private static void ejemploClassNotFoundException () {
		try {
			// Ejemplo de instanciaci�n de un objeto
			Persona persona = (Persona) Class.forName("tutorialJava.capitulo6_Recursos.excepciones.Persona").newInstance();
			System.out.println("Objeto instanciado: " + persona);
			
			// Ejemplo de obtenci�n de las propiedades de un objeto
			Field propiedades[] = persona.getClass().getDeclaredFields();
			System.out.println("\nListado de propiedades del objeto: ");
			for (int i = 0; i < propiedades.length; i++) {
				System.out.println("Campo: " +	propiedades[i].getName());
			}
			
			// Ejemplo de obtenci�n de los m�todos de un objeto
			Method metodos[] = persona.getClass().getMethods();
			System.out.println("\nListado de métodos del objeto: ");
			for (int i = 0; i < metodos.length; i++) {
				System.out.println("Método: " + metodos[i].getName() + "()");
			}
			
			// Ejemplo de invocaci�n de un m�todo de un objeto
			System.out.println("\nInvocación pierna derecha: " + Persona.class.getMethod("getPiernaDerecha", null).invoke(persona, null));
			
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Error por no encontrar una clase");
			System.out.println("Mensaje de error: " + ex.getMessage() + "\n\n");
			ex.printStackTrace();
		} catch (InstantiationException e) {
			System.out.println("Error de instanciaci�n de una clase");
			System.out.println("Mensaje de error: " + e.getMessage() + "\n\n");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("Error de acceso ilegal a una clase");
			System.out.println("Mensaje de error: " + e.getMessage() + "\n\n");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException Error en la invocación de un método");
			System.out.println("Mensaje de error: " + e.getMessage() + "\n\n");
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			System.out.println("InvocationTargetException Error en la invocación de un método");
			System.out.println("Mensaje de error: " + e.getMessage() + "\n\n");
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.out.println("NoSuchMethodException Error en la invocación de un método");
			System.out.println("Mensaje de error: " + e.getMessage() + "\n\n");
			e.printStackTrace();
		} catch (SecurityException e) {
			System.out.println("SecurityException Error en la invocación de un método");
			System.out.println("Mensaje de error: " + e.getMessage() + "\n\n");
			e.printStackTrace();
		} catch(Exception ex) {
			System.out.println("Exception no controlada");
			System.out.println("Mensaje de error: " + ex.getMessage() + "\n\n");
			ex.printStackTrace();
		}
		
	}
	

	
	
	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		
		ejemploExceptionGeneral();
		//ejemploNullPointerException();
		//ejemploArithmeticException();
		//ejemploClassCastException();
		//ejemploIndexOutOfBoundsException();
		//ejemploNumberFormatException();
		//ejemploClassNotFoundException();	
	}
}
