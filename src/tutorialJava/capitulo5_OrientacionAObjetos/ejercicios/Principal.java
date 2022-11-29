package tutorialJava.capitulo5_OrientacionAObjetos.ejercicios;

public class Principal {

	public static void main(String[] args) {
		Animal animales[] = new Animal[4]; 

		Perro p = new Perro();
		
		animales[0] = p;
		
		Gato g  = new Gato();
		
		animales[1] = g;
		
	}

}
