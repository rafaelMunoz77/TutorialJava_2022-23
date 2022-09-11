package tutorialJava.capitulo5_Arrays_y_Colecciones.HashMap;

public class Persona {

	private String Dni;
	private String Apellidos;
	private String Nombre;
	
	
	public Persona(String dni, String apellidos, String nombre) {
		super();
		Dni = dni;
		Apellidos = apellidos;
		Nombre = nombre;
	}


	public String getDni() {
		return Dni;
	}


	public void setDni(String dni) {
		Dni = dni;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	@Override
	public String toString() {
		return "Persona [Dni=" + Dni + ", Apellidos=" + Apellidos + ", Nombre=" + Nombre + "]";
	}
	
	
	
}
