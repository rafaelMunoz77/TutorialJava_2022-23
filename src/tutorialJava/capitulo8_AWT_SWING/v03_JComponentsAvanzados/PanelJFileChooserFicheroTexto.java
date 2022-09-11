package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

public class PanelJFileChooserFicheroTexto extends JPanel {

	JTextField jtfNombre = new JTextField();
	JButton jbtAbrir = new JButton ("Abrir fichero");
	JTextArea jtaContenidoFichero = new JTextArea();
	JFileChooser jfileChooser;
	
	/**
	 * 
	 */
	public PanelJFileChooserFicheroTexto() {
		super();
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5, 5, 5, 5);
		
		// Incluyo el JTextField del nombre del fichero
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;
		this.add(jtfNombre, constraints);
		
		// Incluyo el botón que abrirá el dialogo del JFileChooser
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 0.25;
		this.add(jbtAbrir, constraints);
		
		// Incluyo el área de texto que mostrará el fichero
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		this.add(new JLabel("Contenido del fichero:"), constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weighty = 1;
		this.add(jtaContenidoFichero, constraints);

		// Funcionalidad al botón
		jbtAbrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				seleccionaFichero();
			}
		});
	}

	
	/**
	 * 
	 */
	private void seleccionaFichero () {
		this.jfileChooser = new JFileChooser();
		
		// Configurando el componente
		
		// Establecimiento de la carpeta de inicio
		this.jfileChooser.setCurrentDirectory(new File("C:\\"));
		
		// Tipo de selección que se hace en el diálogo
		this.jfileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // Sólo selecciona ficheros
		//this.jfileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Sólo selecciona ficheros
		//this.jfileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // Selecciona ficheros y carpetas
		
		// Filtro del tipo de ficheros que puede abrir
		this.jfileChooser.setFileFilter(new FileFilter() {
			
			@Override
			public String getDescription() {
				return "Archivos de texto *.txt";
			}
			
			@Override
			public boolean accept(File f) {
				if (f.isFile() && f.getAbsolutePath().endsWith(".txt")) 
					return true;
				return false;
			}
		});
		
		// Abro el diálogo para la elección del usuario
		int seleccionUsuario = jfileChooser.showOpenDialog(null);
		
		if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
			File fichero = this.jfileChooser.getSelectedFile();
			
			// Vuelco el nombre del fichero sobre el JTextField
			this.jtfNombre.setText(fichero.getAbsolutePath());
			
			if (fichero.isFile()) {
				try {
					FileReader fileReader = new FileReader(fichero);
					BufferedReader bufferedReader = new BufferedReader(fileReader);
			
					StringBuffer sb = new StringBuffer();
					String lineaDelFichero;
			
					// Lectura del fichero línea a línea
					while ((lineaDelFichero = bufferedReader.readLine()) != null) {
						sb.append(lineaDelFichero + "\n");
					}
					
					// Volcamos el contenido del fichero al JTextArea
					this.jtaContenidoFichero.setText(sb.toString());
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	
}
