package tutorialJava.capitulo4_Arrays.ejercicios.bloque01;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio02_InicializaArrayEntreLimites {

	public static void main(String[] args) {
		int limiteInferior = Utils.obtenerEnteroConDescripcion("Límite inferior: ");
		int limiteSuperior = Utils.obtenerEnteroConDescripcion("Límite superior: ");
		int array[] = UtilsArrays.creaArrayNumerosAzar(5, limiteInferior, limiteSuperior);
		
		UtilsArrays.mostrarArray(array);
	}

	
}
