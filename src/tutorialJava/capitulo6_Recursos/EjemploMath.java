package tutorialJava.capitulo6_Recursos;

public class EjemploMath {

	public static void main(String[] args) {
		// La clase Math tiene una cantidad importante de métodos que podemos utilizar en cálculos muy diversos
		
		// Respecto a las propiedades encontramos dos propiedades estáticas
		System.out.println("Valor de PI: " + Math.PI);
		System.out.println("Valor de E: " + Math.E);
		
		// Métodos de interés
		System.out.println("\nMétodos básicos:\nMáximo de dos números: " + Math.max(3, 4.5));
		System.out.println("Mínimo de dos números: " + Math.min(3.5, 4));
		System.out.println("Valor absoluto de -3: " + Math.abs(-3)); 
		System.out.println("Redondeo del número 3.5: " + Math.round(3.5));
		System.out.println("Número al azar entre 0 y 1: " + Math.random());
		
		System.out.println("\nPotenciación:\nPotencia de base 25 y exponente 0.5 (raiz cuadrada de 25): " + Math.pow(25, 0.5f));
		System.out.println("Raiz cuadrada de 9: " + Math.sqrt(9));
		System.out.println("Raiz cúbica de 27: " + Math.cbrt(27));
		System.out.println("Potencia del número E con exponente 10: " + Math.exp(10));
		System.out.println("Hipotenusa de un triángulo rectángulo, dados dos de los catetos del mismo: " + Math.hypot(3, 4));
		System.out.println("Logaritmos:\nLogaritmo en base 10 del número 100: " + Math.log10(100));
		System.out.println("Logaritmo en base E de la potencia de base E y exponente 2: " + Math.log(Math.pow(Math.E, 2)));

		System.out.println("\nTrigonometría:\nPaso de 90 grados a radianes: " + Math.toRadians(90));
		System.out.println("Paso de 1 radián a grados: " + Math.toDegrees(1));
		System.out.println("Seno del ángulo de 1 radián: " + Math.sin(1));
		System.out.println("Coseno del ángulo de 2 radianes: " + Math.cos(2));
		System.out.println("Tangente del ángulo de 45 grados: " + Math.tan(Math.toRadians(45)));
		System.out.println("Arcoseno del ángulo de 0.85 radianes: " + Math.asin(0.85)); 
		System.out.println("Arcocoseno del ángulo de 0.15 radianes: " + Math.acos(0.15)); 
		System.out.println("Arcotangente del ángulo de 45 grados: " + Math.atan(Math.toRadians(45))); 

		// Existen otros pocos métodos más en la clase Math, si quieres puedes descubrirlos a través de Javadoc Math.
	}

}
