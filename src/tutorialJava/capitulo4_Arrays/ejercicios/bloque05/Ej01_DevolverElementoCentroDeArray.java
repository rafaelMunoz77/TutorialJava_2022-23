package tutorialJava.capitulo4_Arrays.ejercicios.bloque05;

import tutorialJava.UtilsArrays;

public class Ej01_DevolverElementoCentroDeArray {

	public static void main(String[] args) {
		int a[] = UtilsArrays.creaArrayNumerosAzar(6, 0, 100);
		UtilsArrays.mostrarArray(a);

		System.out.println("Elemento central del array: " + getMiddleItem(a));
	}
	
	/*
	 * 
	 */
	public static int getMiddleItem (int a[]) {
		if (a.length % 2 == 0) {
			return -1;
		}
		else {
			return a[a.length / 2];
		}
	}

}
