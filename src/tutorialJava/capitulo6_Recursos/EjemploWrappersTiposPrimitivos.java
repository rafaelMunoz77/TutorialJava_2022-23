package tutorialJava.capitulo6_Recursos;

public class EjemploWrappersTiposPrimitivos {

	public static void main (String args[]) {
	
		// Wrapper para el tipo de datos "int"
		Integer integer = new Integer(15);
		System.out.println("\nForma rápida de creación de un Integer: " + Integer.valueOf(15));
		System.out.println("Valor entero de 15: " + integer.intValue());
		System.out.println("Valor long de 15: " + integer.longValue());
		System.out.println("Valor short de 15: " + integer.shortValue());
		System.out.println("Valor float de 15: " + integer.floatValue());
		System.out.println("Valor double de 15: " + integer.doubleValue());
		System.out.println("Valor máximo para un Integer: " + Integer.MAX_VALUE);
		System.out.println("Valor mínimo para un Integer: " + Integer.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Integer: " + Integer.SIZE);
		System.out.println("Decodificicación base decimal 255: " + Integer.decode("255"));
		System.out.println("Decodificicación base hexadecimal 0xFF: " + Integer.decode("0xFF"));
		System.out.println("Decodificicación base hexadecimal 0XFF: " + Integer.decode("0XFF"));
		System.out.println("Decodificicación base hexadecimal #FF: " + Integer.decode("#FF"));
		System.out.println("Decodificicación base octal O377: " + Integer.decode("0377"));
		System.out.println("Parseo de una cadena de caracteres \"123456789\": " + Integer.parseInt("123456789"));
		System.out.println("Otra forma de parsear cadenas de caracteres a Integer: " + Integer.valueOf("12345678"));
		

		// Wrapper para el tipo de datos "long"
		System.out.println("\nValor máximo para un Long: " + Long.MAX_VALUE);
		System.out.println("Valor mínimo para un Long: " + Long.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Long: " + Long.SIZE);

		// Wrapper para el tipo de datos "short"
		System.out.println("\nValor máximo para un Short: " + Short.MAX_VALUE);
		System.out.println("Valor mínimo para un Short: " + Short.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Short: " + Short.SIZE);
		
		// Wrapper para el tipo de datos "boolean"
		System.out.println("\nForma rápida de creación de un Boolean: " + Boolean.valueOf(true));
		System.out.println("Parseo de una cadena de caracteres \"true\" a Boolean: " + Boolean.parseBoolean("true"));
		
		// Wrapper para el tipo de datos "float"
		System.out.println("\nValor máximo para un Float: " + Float.MAX_VALUE);
		System.out.println("Valor mínimo para un Float: " + Float.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Float: " + Float.SIZE);
		
		// Wrapper para el tipo de datos "double"
		System.out.println("\nValor máximo para un Double: " + Double.MAX_VALUE);
		System.out.println("Valor mínimo para un Double: " + Double.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Double: " + Double.SIZE);
		
		// Wrapper para el tipo de datos "Character"
		char cadenaTexto[] = new char[] {'H', 'o', 'l', 'a', ' ', 'A', 'm', 'i', 'g', 'o', ' ', '2', '5', '5', '\n'};
		System.out.println ("\nAnalizaré el array de caracteres: " + cadenaTexto.toString());
		for (int i = 0; i < cadenaTexto.length; i++) {
			System.out.println("'" + cadenaTexto[i] + "' es dígito: " + Character.isDigit(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es letra: " + Character.isLetter(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es letra o dígito: " + Character.isLetterOrDigit(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es minúscula: " + Character.isLowerCase(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es mayúscula: " + Character.isUpperCase(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es un caracter similar a espacio en blanco: " + Character.isWhitespace(cadenaTexto[i]));
		}
		
	}
}
