package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import java.awt.Color;

import javax.swing.JPanel;

import tutorialJava.Utils;

public class JPanelFactory {

	private static char digitosHexadecimales[] = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	
	/**
	 * 
	 * @return
	 */
	public static JPanel instanceJPanelColorAzar () {
		JPanel pnl = new JPanel();
		pnl.setBackground(Color.decode(getColorAzar()));
		return pnl;
	}
	
	
	/**
	 * 
	 * @return
	 */
	private static String getColorAzar () {
		StringBuffer sb = new StringBuffer ("#");
		for (int i = 0; i < 6; i++) {
			sb.append(digitosHexadecimales[Utils.obtenerNumeroAzar(0, digitosHexadecimales.length-1)]);
		}
		return sb.toString();
	}
	


}
