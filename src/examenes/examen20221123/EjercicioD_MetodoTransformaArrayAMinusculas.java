package examenes.examen20221123;

public class EjercicioD_MetodoTransformaArrayAMinusculas {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		char array[] = new char[] {'H', 'o', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o'};

		System.out.println(aMinusculas(array));
	}

	
	/**
	 * 
	 * @return
	 */
	public static String aMinusculas (char array[]) {
		String str = "";
		
		for (int i = 0; i < array.length; i++) {
			int codigoDeCaracter = (int) array[i];
			// Compruebo si es una mayúscula 65-A y 90-Z
			if (codigoDeCaracter >= 65 && codigoDeCaracter <= 90) {
				codigoDeCaracter += 32;
			}
			str += (char) codigoDeCaracter;
		}
		
		return str;
	}
}
