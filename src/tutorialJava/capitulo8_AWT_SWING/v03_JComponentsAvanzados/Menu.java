package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

import tutorialJava.capitulo8_AWT_SWING.utils.CacheImagenes;


public class Menu extends JMenuBar {

	/**
	 * 
	 */
	public Menu () {
		// Menú Archivo de la aplicación
        JMenu menuArchivo = new JMenu("Archivo");
        menuArchivo.add(crearNuevoMenuItem("Abrir", "ruedadentada.png", KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));
        
        JMenu menuExportar = new JMenu("Exportar");
        menuExportar.add(crearNuevoMenuItem("Como Word", "ruedadentada.png", KeyStroke.getKeyStroke(KeyEvent.VK_W, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));
        menuExportar.add(crearNuevoMenuItem("Como Excel", "ruedadentada.png", KeyStroke.getKeyStroke(KeyEvent.VK_E, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));
        menuArchivo.add(menuExportar);
        
        menuArchivo.add(crearNuevoMenuItem("Cerrar", "conectado.png", KeyStroke.getKeyStroke(KeyEvent.VK_C, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));
        menuArchivo.addSeparator();
        menuArchivo.add(crearNuevoMenuItem("Salir", "exit.png", KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));
        
        this.add(menuArchivo);
        
        // Men� editar
        JMenu menuEditar = new JMenu("Editar");
        menuEditar.add(crearNuevoMenuItem("Cortar", "next.png", KeyStroke.getKeyStroke(KeyEvent.VK_X, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));
        menuEditar.add(crearNuevoMenuItem("Copiar", "previous.png", KeyStroke.getKeyStroke(KeyEvent.VK_C, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));
        menuEditar.addSeparator();
        menuEditar.add(crearNuevoMenuItem("Pegar", "eliminar.png", KeyStroke.getKeyStroke(KeyEvent.VK_V, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));
        
        this.add(menuEditar);
        
        // Men� ejemplo checkbox y radio
        JMenu menuCheckBoxYRadio = new JMenu("CheckBoxYRadio");
        menuCheckBoxYRadio.add(crearNuevoCheckBoxMenuItem("Ejemplo JCheckBoxMenuItem", "valign16.png"));
        menuCheckBoxYRadio.addSeparator();
        // Ejemplo del JRadioButtonMenuItem
        ButtonGroup buttonGroup = new ButtonGroup();
        menuCheckBoxYRadio.add(crearNuevoRadioButtonMenuItem("Radio Button - Opción 1", "previous.png", buttonGroup));
        menuCheckBoxYRadio.add(crearNuevoRadioButtonMenuItem("Radio Button - Opción 2", "previous.png", buttonGroup));
        menuCheckBoxYRadio.add(crearNuevoRadioButtonMenuItem("Radio Button - Opción 3", "previous.png", buttonGroup));
        
        this.add(menuCheckBoxYRadio);
        
	}
	
	
	
	/**
	 * Menú Item para salir de la aplicación
	 * @return
	 */
	private JMenuItem crearNuevoMenuItem (String titulo, String nombreIcono, KeyStroke atajoTeclado) {
        JMenuItem item = new JMenuItem(titulo);
        item.setIcon(CacheImagenes.getCacheImagenes().getIcono(nombreIcono));
        item.setAccelerator(atajoTeclado);
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Han hecho clic en: " + titulo);
            }
        });
        
        return item;
	}
	
	/**
	 * 
	 * @param titulo
	 * @param nombreIcono
	 * @return
	 */
	private JMenuItem crearNuevoCheckBoxMenuItem (String titulo, String nombreIcono) {
        JCheckBoxMenuItem item = new JCheckBoxMenuItem(titulo);
        item.setIcon(CacheImagenes.getCacheImagenes().getIcono(nombreIcono));
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Han hecho clic en el JCheckBox: " + titulo + " - Seleccionado: " + item.isSelected());
            }
        });
        
        return item;
	}

	/**
	 * 
	 * @param titulo
	 * @param nombreIcono
	 * @return
	 */
	private JMenuItem crearNuevoRadioButtonMenuItem (String titulo, String nombreIcono, ButtonGroup buttonGroup) {
        JRadioButtonMenuItem item = new JRadioButtonMenuItem(titulo);
        item.setIcon(CacheImagenes.getCacheImagenes().getIcono(nombreIcono));
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Han hecho clic en el JRadioButton: " + titulo + " - Seleccionado: " + item.isSelected());
            }
        });
        buttonGroup.add(item);
        
        return item;
	}

}
