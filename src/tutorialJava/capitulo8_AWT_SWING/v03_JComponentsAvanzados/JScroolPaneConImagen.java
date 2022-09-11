package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import tutorialJava.capitulo8_AWT_SWING.utils.CacheImagenes;

public class JScroolPaneConImagen extends JScrollPane {

	String imagen = null;

	/**
	 * @param imagen
	 */
	public JScroolPaneConImagen(String imagen) {
		super(new JLabel(CacheImagenes.getCacheImagenes().getIcono(imagen)));
		this.imagen = imagen;
	}
	
	
}
