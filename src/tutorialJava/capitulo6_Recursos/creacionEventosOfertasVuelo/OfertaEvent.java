package tutorialJava.capitulo6_Recursos.creacionEventosOfertasVuelo;

public class OfertaEvent {
	private float precioIda;
	private float precioVuelta;
	/**
	 * 
	 */
	public OfertaEvent() {
	}
	/**
	 * @param precioIda
	 * @param precioVuelta
	 */
	public OfertaEvent(float precioIda, float precioVuelta) {
		this.precioIda = precioIda;
		this.precioVuelta = precioVuelta;
	}
	@Override
	public String toString() {
		return "OfertaEvent [precioIda=" + precioIda + ", precioVuelta=" + precioVuelta + "]";
	}
	public float getPrecioIda() {
		return precioIda;
	}
	public void setPrecioIda(float precioIda) {
		this.precioIda = precioIda;
	}
	public float getPrecioVuelta() {
		return precioVuelta;
	}
	public void setPrecioVuelta(float precioVuelta) {
		this.precioVuelta = precioVuelta;
	}
	
	
}
