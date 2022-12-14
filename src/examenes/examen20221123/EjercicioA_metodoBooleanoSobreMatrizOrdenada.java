package examenes.examen20221123;

import java.util.Iterator;

public class EjercicioA_metodoBooleanoSobreMatrizOrdenada {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int[][] {{1, 	2, 	3, 	4}, 
									  {5, 	6, 	5, 	8},
									  {9,	10, 11, 12}, 
									  {13, 	14, 15, 16}};

		System.out.println(estaMatrizOrdenada(matriz));

	}
	
	


	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean estaMatrizOrdenada (int matriz[][]) {
		boolean estaOrdenada = true;
		int anterior = matriz[0][0];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
//				System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] < anterior) {
					estaOrdenada = false;
				}
				anterior = matriz[i][j];
			}
		}
		
		return estaOrdenada;
	}
}
