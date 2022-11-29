package tutorialJava.capitulo5_OrientacionAObjetos.segundoEjemploAnimales;

public class Animal {

	protected String raza;
	
	/**
	 * 
	 */
	public Animal() {
		
	}
	
	/**
	 * 
	 * @param raza
	 */
	public Animal(String raza) {
		this.raza = raza;
	}
	
	
	public String getRaza() {
		return this.raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	/**
	 * 
	 */
	public String toString() {
		return "Animal - raza: " + this.raza;
	}
}
