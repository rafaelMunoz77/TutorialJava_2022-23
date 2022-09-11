package tutorialJava.capitulo6_Recursos.creacionEventosOfertasVuelo;

public class Persona implements OfertaListener {

	@Override
	public void ofertaRecibida(OfertaEvent event) {
		System.out.println("Soy una persona y he recibido una oferta con precios " +
				event.getPrecioIda() + " - " + event.getPrecioVuelta());		
	}

}
