package tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo02_CRUD_DentroDeJTabbedPane;

public class Fabricante {

	private int id;
	private String cif;
	private String nombre;
	
	/**
	 * 
	 */
	public Fabricante() {
	}

	/**
	 * @param id
	 * @param cif
	 * @param nombre
	 */
	public Fabricante(int id, String cif, String nombre) {
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return cif + " - " + nombre;
	}
	
	
}
