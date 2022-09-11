package tutorialJava.capitulo4_OO.primerEjemploPersona;


public class GestionaPersonas {

	public static void main(String[] args) {
		// Creación y manejo de una persona
		Persona persona1 = new Persona(154, "Hombre", 44, true);

		Persona persona2 = new Persona(178, "Mujer", 24, true);		
		
		System.out.println(persona1.toString() + "\n" + persona2.toString());
		
	}
	
}
