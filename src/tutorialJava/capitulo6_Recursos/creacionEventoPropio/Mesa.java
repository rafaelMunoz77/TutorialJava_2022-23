package tutorialJava.capitulo6_Recursos.creacionEventoPropio;

public class Mesa implements NumeroImparIntroducidoListener {

	public String id;
	
	
	public Mesa (String newId) {
		this.id = newId;
	}
	
	
	@Override
	public void nuevoNumeroImparIntroducido(NumeroImparIntroducidoEvent event) {
		System.out.println("Soy una mesa con identificador " + this.id + " y he recidibo un número impar con valor: " + event.numeroIntroducido);

	}

}
