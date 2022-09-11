package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class PanelJFileChooserFicheroImagen extends JPanel {
	private JTextField jtfSeleccionaFichero;
	private JScrollPane scrollPane;
	byte[] imagenEnArrayDeBytes;

	/**
	 * Create the panel.
	 */
	public PanelJFileChooserFicheroImagen() { 
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Fichero seleccionado:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnSeleccionaFichero = new JButton("Selecciona fichero");
		btnSeleccionaFichero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionaImagen();
			}
		});
		GridBagConstraints gbc_btnSeleccionaFichero = new GridBagConstraints();
		gbc_btnSeleccionaFichero.insets = new Insets(0, 0, 5, 0);
		gbc_btnSeleccionaFichero.gridx = 2;
		gbc_btnSeleccionaFichero.gridy = 0;
		add(btnSeleccionaFichero, gbc_btnSeleccionaFichero);
		
		jtfSeleccionaFichero = new JTextField();
		GridBagConstraints gbc_jtfSeleccionaFichero = new GridBagConstraints();
		gbc_jtfSeleccionaFichero.insets = new Insets(0, 0, 5, 5);
		gbc_jtfSeleccionaFichero.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfSeleccionaFichero.gridx = 1;
		gbc_jtfSeleccionaFichero.gridy = 0;
		add(jtfSeleccionaFichero, gbc_jtfSeleccionaFichero);
		jtfSeleccionaFichero.setColumns(10);
		
		JButton btnInsertarEnTabla = new JButton("Insertar en una tabla");
		btnInsertarEnTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarImagenEnTabla();
			}
		});
		GridBagConstraints gbc_btnInsertarEnTabla = new GridBagConstraints();
		gbc_btnInsertarEnTabla.gridwidth = 3;
		gbc_btnInsertarEnTabla.insets = new Insets(0, 0, 5, 5);
		gbc_btnInsertarEnTabla.gridx = 0;
		gbc_btnInsertarEnTabla.gridy = 2;
		add(btnInsertarEnTabla, gbc_btnInsertarEnTabla);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);

	}

	
	/**
	 * 
	 */
	private void seleccionaImagen () {
		JFileChooser jfileChooser = new JFileChooser();
		
		// Configurando el componente
		
		// Tipo de selección que se hace en el diálogo
		jfileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // Sólo selecciona ficheros

		// Filtro del tipo de ficheros que puede abrir
		jfileChooser.setFileFilter(new FileFilter() {
			
			@Override
			public String getDescription() {
				return "Archivos de imagen *.jpg *.png *.gif";
			}
			
			@Override
			public boolean accept(File f) {
				if (f.isDirectory() || (f.isFile() &&
						(f.getAbsolutePath().endsWith(".jpg") || 
								f.getAbsolutePath().endsWith(".jpeg")|| 
								f.getAbsolutePath().endsWith(".png")|| 
								f.getAbsolutePath().endsWith(".gif")))) 
					return true;
				return false;
			}
		});
		
		// Abro el diálogo para la elección del usuario
		int seleccionUsuario = jfileChooser.showOpenDialog(null);
		
		if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
			File fichero = jfileChooser.getSelectedFile();
			
			if (fichero.isFile()) {
				try {
					this.imagenEnArrayDeBytes = Files.readAllBytes(fichero.toPath());
					mostrarImagen();
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
		
	
	/**
	 * 
	 */
	private void mostrarImagen () {
		if (imagenEnArrayDeBytes != null && imagenEnArrayDeBytes.length > 0) {
			ImageIcon icono = new ImageIcon(imagenEnArrayDeBytes);
			JLabel lblIcono = new JLabel(icono);
			scrollPane.setViewportView(lblIcono);
		}
		else {
			JLabel lblIcono = new JLabel("Sin imagen");
			scrollPane.setViewportView(lblIcono);
		}

	}
	
	
	/**
	 * 
	 */
	private void actualizarImagenEnTabla() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centroeducativo?serverTimezone=UTC","java", "Abcdefgh.1");
		   
			PreparedStatement ps = (PreparedStatement) conexion.
					prepareStatement("UPDATE centroeducativo.estudiante set imagen=? where id=?");
			
			ps.setBytes(1, imagenEnArrayDeBytes);
			ps.setInt(2, 1);
		   
			int registrosAfectados = ps.executeUpdate();
			if (registrosAfectados > 0) {
				JOptionPane.showMessageDialog(null, "Inserción correcta en la tabla");
			}
			
			// Cierre de los elementos
			ps.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
