package tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo04_MunicipiosYProvincias.modelo;

public class Municipio {
	private int id;
	private int idProvincia;
	private String nombre;
	
	/**
	 * 
	 */
	public Municipio() {
	}

	/**
	 * @param id
	 * @param idProvincia
	 * @param nombre
	 */
	public Municipio(int id, int idProvincia, String nombre) {
		this.id = id;
		this.idProvincia = idProvincia;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
