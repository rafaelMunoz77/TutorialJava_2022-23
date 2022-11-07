package tutorialJava.capitulo4_Arrays.ejercicios.bloque04;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ej02_CiclicoEnArrayRespetandoIntervaloInterior {

	public static void main(String[] args) {
		int posIni, posFin;
		int a[] = UtilsArrays.creaArrayNumerosAzar(10, 0, 9);
		UtilsArrays.mostrarArray(a);

		do {
			posIni = Utils.obtenerEnteroEntreLimites("Introduzca posición Inicial: ", 0, 9);
			posFin = Utils.obtenerEnteroEntreLimites("Introduzca posición Final: ", 0, 9);
			if (posIni >= posFin) {
				System.out.println("Error. La posición inicial no puede ser mayor que "
						+ " la posición final");
			}
		} while (posIni >= posFin);

		int aux = a[a.length - 1];
		
		for (int i = a.length - 2; i > -1; i--) {
			if (i < posIni || i > posFin) {
				if (i == (posIni - 1)){
					a[i + posFin - posIni + 2] = a[i];
				}
				else {
					a[i + 1] = a[i];
				}
			}
		}

		a[0] = aux;
		
		UtilsArrays.mostrarArray(a);
	}

}
