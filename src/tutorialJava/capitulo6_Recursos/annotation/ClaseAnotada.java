package tutorialJava.capitulo6_Recursos.annotation;

public class ClaseAnotada {

	public void metodoSinAnotacion () {
		System.out.println("Método no anotado");
	}
	
	@EjemploAnotacionMetodo (ejemploValorEntero = 3)
	public void metodoConAnotacion () {
		System.out.println("Método anotado");
	}
}
