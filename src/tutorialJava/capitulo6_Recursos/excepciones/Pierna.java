package tutorialJava.capitulo6_Recursos.excepciones;

public class Pierna {
	
	public static int DERECHA = 0;
	public static int IZQUIERDA = 1;
	
	protected int tipo;

	public Pierna(int tipo) {
		super();
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
