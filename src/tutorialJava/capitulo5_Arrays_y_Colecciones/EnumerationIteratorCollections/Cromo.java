package tutorialJava.capitulo5_Arrays_y_Colecciones.EnumerationIteratorCollections;

public class Cromo {
	
	private int id;
	private String descripcion;
	
	public Cromo(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Cromo [id=" + id + ", descripcion=" + descripcion + ", hashcode=" + this.hashCode() + "]";
	}
	
	
	

}
