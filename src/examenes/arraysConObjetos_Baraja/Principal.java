package examenes.arraysConObjetos_Baraja;

import java.util.Arrays;

public class Principal {

	public static void main (String args[]) {
		Baraja baraja = new Baraja();
		baraja.pasaUnaCartaDeAbajoHastaArriba();
		baraja.pasaUnaCartaDeArribaHastaAbajo();
		baraja.mezcla();
//		baraja.ordena();
		
		Poker poker = new Poker();
		
		for (int i = 0; i < poker.getJugadores().length; i++) {
			baraja.repartirManoAJugador(poker.getJugadores()[i]);
			System.out.println(
					Arrays.toString(poker.getJugadores()[i].getMano()));
			poker.getJugadores()[i].inspeccionaMano();
		}
		
		System.out.println(baraja.toString());


	}
}
