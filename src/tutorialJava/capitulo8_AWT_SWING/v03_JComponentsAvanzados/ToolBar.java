package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import tutorialJava.capitulo8_AWT_SWING.utils.CacheImagenes;



public class ToolBar extends JToolBar {

	
	public ToolBar () {
        this.add(creaBoton("", "exit.png", "Salir del programa"));
        this.add(creaBoton("", "conectado.png", "Conectado con el servidor"));
        this.add(creaBoton("", "desconectado.png", "Desconectado del servidor"));
        this.addSeparator();
        this.add(creaComboBox(new String[] {"Opción 1", "Opción 2", "Opción 3", "Opción 4", "Opción 5"}));
        this.add(creaBoton("", "gotostart.png", "Primero"));
        this.add(creaBoton("", "previous.png", "Anterior"));
        this.add(creaBoton("", "next.png", "Siguiente"));
        this.add(creaBoton("", "gotoend.png", "último"));
        this.addSeparator();
        this.add(creaToggleBoton("", "ruedadentada.png", "Ver opciones"));
	}

	
	/**
	 * 
	 * @param titulo
	 * @param icono
	 * @return
	 */
	private JButton creaBoton(String titulo, String icono, String toolTip) {
        JButton jbt = new JButton();
        
        jbt.setText(titulo);
        jbt.setToolTipText(toolTip);
        
        jbt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Has hecho clic en el botón: \"" + toolTip + "\"");
            }
        });
        
        try {
        	jbt.setIcon(CacheImagenes.getCacheImagenes().getIcono(icono));  
          } catch (Exception ex) {
        	  ex.printStackTrace();
          }
        return jbt;
	}
	
	
	/**
	 * 
	 * @param titulo
	 * @param icono
	 * @return
	 */
	private JToggleButton creaToggleBoton(String titulo, String icono, String toolTip) {
        JToggleButton jbt = new JToggleButton();
        
        jbt.setText(titulo);
        jbt.setToolTipText(toolTip);
        
        jbt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Has hecho clic en el toggle botón: \"" + toolTip + "\" - Ahora está seleccionado: " + jbt.isSelected());
            }
        });
        
        try {
        	jbt.setIcon(CacheImagenes.getCacheImagenes().getIcono(icono));  
          } catch (Exception ex) {
        	  ex.printStackTrace();
          }
        return jbt;
	}
	
	
	/**
	 * 
	 * @param opciones
	 * @return
	 */
	private JComboBox creaComboBox (String opciones[]) {
		JComboBox<String> jcb = new JComboBox<String>(opciones);
		jcb.setMaximumSize(new Dimension(100, 75));
		return jcb;
	}
}
