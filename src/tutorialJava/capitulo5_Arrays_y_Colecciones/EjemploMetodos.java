package tutorialJava.capitulo5_Arrays_y_Colecciones;

public class EjemploMetodos {

	public static void main(String[] args) {
		int resultadoDeLaSuma, num1 = 10, num2 = 12;
		resultadoDeLaSuma = suma(num1, num2);
		imprimeUnValor(resultadoDeLaSuma);
	}
	
	public static void imprimeUnValor(int numeroAImprimir) {
		System.out.println("El valor es: " + numeroAImprimir);
	}
	
	
	public static int suma (int num1, int num2) {
		int nuevaVariable = num1 + num2;
		return nuevaVariable;
	}

}
