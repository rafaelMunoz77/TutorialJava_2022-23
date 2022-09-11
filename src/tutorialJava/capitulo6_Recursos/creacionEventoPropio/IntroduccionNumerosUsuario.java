package tutorialJava.capitulo6_Recursos.creacionEventoPropio;

import java.util.ArrayList;
import java.util.List;

import tutorialJava.Utils;

public class IntroduccionNumerosUsuario {

	private static List<NumeroImparIntroducidoListener> numeroImparIntroducidolisteners = new ArrayList<NumeroImparIntroducidoListener> ();
	
	
	
	public static void addNumeroImparIntroducidoListener (NumeroImparIntroducidoListener newListener) {
		numeroImparIntroducidolisteners.add(newListener);
	}
	
	
	public static void removeNumeroImparIntroducidoListener (NumeroImparIntroducidoListener listener) {
		for (int i = 0; i < numeroImparIntroducidolisteners.size(); i++) {
			if (numeroImparIntroducidolisteners.get(i).equals(listener)) {
				numeroImparIntroducidolisteners.remove(i);
			}
		}
	}
	
	
	public static void fireNumeroImparIntroducidoListeners (int numero) {
		for (int i = 0; i < numeroImparIntroducidolisteners.size(); i++) {
			numeroImparIntroducidolisteners.get(i).nuevoNumeroImparIntroducido(new NumeroImparIntroducidoEvent(numero));
		}		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int numUsuario;
		
		EscuchadorNumeros escuchador1 = new EscuchadorNumeros (1);
		addNumeroImparIntroducidoListener(escuchador1);
		EscuchadorNumeros escuchador2 = new EscuchadorNumeros (2);
		addNumeroImparIntroducidoListener(escuchador2);
		EscuchadorNumeros escuchador3 = new EscuchadorNumeros (3);
		addNumeroImparIntroducidoListener(escuchador3);
		
		Mesa mesa1 = new Mesa("Mesa1");
		addNumeroImparIntroducidoListener(mesa1);
		
		
		do {
			numUsuario = Utils.obtenerEntero();
			
			if (numUsuario % 2 == 1) { // Es impar
				fireNumeroImparIntroducidoListeners(numUsuario);
			}
			
		} while (numUsuario != 0);

	}

}
