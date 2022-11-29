package tutorialJava.capitulo5_OrientacionAObjetos.segundoEjemploAnimales;

public class Principal {

	public static void main(String[] args) {
		Animal nona = new Animal("Perro");
		
		Animal rambo = new Animal();
		rambo.setRaza("Pez");
		
		
		Perro perro1 = new Perro("Largo");
		
		Perro perro2 = new Perro();
		perro2.setPelaje("Corto");
		perro2.setRaza("Perro");
		
		System.out.println("Perro2: " + perro2.toString());

	}

}
