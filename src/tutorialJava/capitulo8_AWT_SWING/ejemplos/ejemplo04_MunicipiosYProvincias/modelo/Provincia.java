package tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo04_MunicipiosYProvincias.modelo;

public class Provincia {
	private int id;
	private String provincia;
	
	/**
	 * 
	 */
	public Provincia() {
	}

	/**
	 * @param id
	 * @param provincia
	 */
	public Provincia(int id, String provincia) {
		this.id = id;
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return provincia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}
