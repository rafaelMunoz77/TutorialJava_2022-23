package tutorialJava.capitulo5_OrientacionAObjetos.primerEjemploPersona;

public class Principal {

	public static void main(String[] args) {

		
		Persona rafa = new Persona("Rafael Carlos", 165f);
		System.out.println(rafa.toString());

		Persona joaquin = new Persona();
		joaquin.setNombre("Joaquín");
		System.out.println("El nombre del objeto es: " + joaquin.getNombre());
	}

}
