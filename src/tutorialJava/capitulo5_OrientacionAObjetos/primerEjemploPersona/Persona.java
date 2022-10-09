package tutorialJava.capitulo5_OrientacionAObjetos.primerEjemploPersona;

public class Persona {

	private float altura = 150;
	private String sexo;
	private int edad;
	private boolean vivo;
	
	/**
	 * Método constructor por defecto - Default Constructor
	 */
	public Persona() {
		System.out.println("Estoy dentro del método constructor");
	}
	
	
	public Persona(float altura, String sexo, int edad, boolean vivo) {
		this.altura = altura;
		this.sexo = sexo;
		this.edad = edad;
		this.vivo = vivo;
	}
	
	
	public String toString () {
		return "Mi altura es: " + this.altura + " - Mi sexo es: " + this.sexo + 
				" - Mi edad es: " + this.edad + " y estoy vivo: " + this.vivo;
	}
	
	
	
	public float getAltura () {
		return this.altura;
	}

	public void setAltura (float altura) {
		this.altura = altura;
	}
	
	
	
}
