package tutorialJava.capitulo6_Recursos.creacionEventoPropio;

public class EscuchadorNumeros implements NumeroImparIntroducidoListener {

	public int identificador;
	
	
	public EscuchadorNumeros (int newIdentificador) {
		this.identificador = newIdentificador;
	}
	
	
	
	@Override
	public void nuevoNumeroImparIntroducido(NumeroImparIntroducidoEvent event) {
		System.out.println("Escuchador. Mi id es " + this.identificador + 
				" y he recidibo evento por el número " + event.numeroIntroducido);
	}

}
