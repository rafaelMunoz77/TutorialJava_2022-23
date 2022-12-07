package examenes.arraysConObjetos_Diana;

public class Tirada {
	String descripcion;
	int puntos;
	int probabilidad;
	
	/**
	 * 
	 */
	public Tirada() {
		super();
	}

	/**
	 * @param descripcion
	 * @param puntos
	 * @param probabilidad
	 */
	public Tirada(String descripcion, int puntos, int probabilidad) {
		super();
		this.descripcion = descripcion;
		this.puntos = puntos;
		this.probabilidad = probabilidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getProbabilidad() {
		return probabilidad;
	}

	public void setProbabilidad(int probabilidad) {
		this.probabilidad = probabilidad;
	}

	@Override
	public String toString() {
		return "Tirada [descripcion=" + descripcion + ", puntos=" + puntos + ", probabilidad=" + probabilidad + "]";
	}
	
	
}
