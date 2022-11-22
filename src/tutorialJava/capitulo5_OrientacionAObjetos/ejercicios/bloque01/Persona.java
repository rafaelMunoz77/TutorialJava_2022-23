package tutorialJava.capitulo5_OrientacionAObjetos.ejercicios.bloque01;

public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private String telefono;
	
	/**
	 * 
	 */
	public Persona() {
		super();
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param direccion
	 * @param telefono
	 */
	public Persona(String nombre, String apellidos, String dni, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	
}
