package examenes.arraysConObjetos_Diana;

public class Jugador {

	String nombre;
	int puntuacion;
	
	/**
	 * 
	 */
	public Jugador() {
		super();
	}

	/**
	 * @param nombre
	 * @param puntuacion
	 */
	public Jugador(String nombre, int puntuacion) {
		super();
		this.nombre = nombre;
		this.puntuacion = puntuacion;
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

	/**
	 * @return the puntuacion
	 */
	public int getPuntuacion() {
		return puntuacion;
	}

	/**
	 * @param puntuacion the puntuacion to set
	 */
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
	}
	
	
}
