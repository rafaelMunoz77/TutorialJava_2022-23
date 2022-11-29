package tutorialJava.capitulo5_OrientacionAObjetos.segundoEjemploAnimales;

public class Perro extends Animal {
	private String pelaje;
	
	public Perro() {
		
	}
	
	public Perro(String pelaje) {
		this.pelaje = pelaje;
	}
	
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}
	
	public String getPelaje() {
		return this.pelaje;
	}
	
	public String toString () {
		return "Perro: pelaje: " + this.pelaje + " - Raza: " + this.raza;
	}
}
