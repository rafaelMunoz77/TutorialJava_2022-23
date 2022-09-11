package tutorialJava.capitulo5_Arrays_y_Colecciones.ejemplo02_ListYArrayList;

public class CromoBaloncesto {
	private int id;
	private String nombre;
	/**
	 * @param id
	 * @param nombre
	 */
	public CromoBaloncesto(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "CromoBaloncesto [id=" + id + ", nombre=" + nombre + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
