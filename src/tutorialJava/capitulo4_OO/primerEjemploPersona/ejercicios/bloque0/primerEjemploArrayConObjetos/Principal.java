package tutorialJava.capitulo4_OO.primerEjemploPersona.ejercicios.bloque0.primerEjemploArrayConObjetos;

public class Principal {

	public static void main(String[] args) {
		// Inicializa el array de numeros enteros que hay dentro de un objeto de tipo
		// ArrayEnteros
		ArrayEnteros arrayEnteros = new ArrayEnteros();
		
		// Muéstralo por pantalla
		arrayEnteros.mostrar();
		
		// Muestro suma
	
		System.out.println("La suma vale: " + arrayEnteros.sumaDelArray());
	}

}
