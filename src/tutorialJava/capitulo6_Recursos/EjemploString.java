package tutorialJava.capitulo6_Recursos;

public class EjemploString {

	public static void main(String[] args) {
		String str = "Cadena de texto de tamaño mediano";  
		str = new String("Cadena de texto de tamaño mediano");
		str = new String(new char[] {'C', 'a', 'd', 'e', 'n', 'a', ' ', 'd', 'e', ' ', 't', 'e', 'x', 't', 'o'});
		str = new String(new StringBuffer("Cadena de texto de tamaño mediano"));
		
		System.out.println("Carácter en la posición 4: " + str.charAt(4));
		System.out.println("Comparación con la cadena \"Hola\": " + str.compareTo("Hola"));
		System.out.println("Concatenación con la cadena \" para practicar\": " + str.concat(" para practicar"));
		System.out.println("Búsqueda booleana de la cadena \"texto\": " + str.contains("texto"));
		System.out.println("Respuesta booleana a la terminación de la cadena con respecto a la cadena \"mediano\": " + str.endsWith("mediano"));
		System.out.println("Comparación de cadena ignorando mayúsculas: " + str.equalsIgnoreCase("CADENA DE TEXTO DE TAMAÑO MEDIANO"));
		System.out.println("Índice en el que se encuentra la cadena \"texto\" (-1 si no se encuentra la cadena): " + str.indexOf("texto"));
		System.out.println("Está la cadena vacía?: " + str.isEmpty());
		System.out.println("Índice de la última aparición del carácter 'a': " + str.lastIndexOf("a"));
		System.out.println("Longitud de una cadena de texto: " + str.length());
		System.out.println("Reemplazar todas las apariciones de 'a' por el carácter 'o': " + str.replace('a', 'o'));
		System.out.println("Remplazo de todas las vocales a través de expresión regular: " + str.replaceAll("[aeiou]", "í"));
		
		// Ejemplo de separación de cadena en cadenas a través de split()
		System.out.println("Separación de una cadena en otras cadenas a través de un espacio en blanco");
		String[] palabras = str.split("[ ]{1,}");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra " + (i + 1) + ": " + palabras[i]);
		}
		
		// Uso de split() con una expresión regular
		System.out.println("Separación de una cadena en otras cadenas a través de la expresión regular [adt]");
		palabras = str.split("[adt]");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra " + (i + 1) + ": " + palabras[i]);
		}
		
		// Uso de split() con una expresión regular
		System.out.println("Separación de una cadena en otras cadenas a través de la expresión regular \" {2,}\", \" \"");
		palabras = new String("Cadena con 2 espacios  en medio").split(" {2,}");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra " + (i + 1) + ": " + palabras[i]);
		}
		
		System.out.println("Subcadena de texto a partir de los índices de inicio y fin: " + str.substring(4, 15));
		System.out.println("Paso a minúsculas: " + str.toLowerCase());
		System.out.println("Paso a mayúsculas: " + str.toUpperCase());
		System.out.println("Eliminación de los espacios en blanco iniciales: " + new String("        Cadena de texto de tamaño mediano").trim());
	}

}
