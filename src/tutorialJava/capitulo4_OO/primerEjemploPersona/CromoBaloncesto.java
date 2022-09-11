package tutorialJava.capitulo4_OO.primerEjemploPersona;

public class CromoBaloncesto {

	private int id;
	private String nombre;
	
	/**
	 * 
	 */
	public CromoBaloncesto() {
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public CromoBaloncesto(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "CromoBaloncesto [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
