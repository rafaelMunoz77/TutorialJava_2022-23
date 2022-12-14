package examenes.examen20221123;

public class EjercicioC_SerieRafanacci {

	public static void main(String[] args) {
		float serie[] = new float[10];
		
		serie[0] = 1;
		serie[1] = 0.5f;
		
		for (int i = 2; i < serie.length; i++) {
			serie[i] = serie[i-1] * serie[i-2] + serie[i-1]/2;
		}

		for (int i = 0; i < serie.length; i++) {
			System.out.print(serie[i] + " ");
		}
	}

}
