package tutorialJava.capitulo5_OrientacionAObjetos.primerEjemploPersona;

public class Persona {
	
	// Propiedades de la clase. Fields - Propiedades.
	private String nombre;
	private float estatura;
	
	/**
	 * Método constructor por defecto
	 */
	public Persona () {
	}
	
	/**
	 * Método constructor
	 * @param nombre
	 * @param estatura
	 */
	public Persona (String nombre, float estatura) {
		this.nombre = nombre;
		this.estatura = estatura;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public float getEstatura() {
		return this.estatura;
	}
	
	public void setEstatura (float estatura) {
		this.estatura = estatura;
	}
	
	public String toString() {
		return "Nombre: " + this.nombre + " - Estatura: " + this.estatura;
	}
	
	
	
	
	
	
	
	
	
}
