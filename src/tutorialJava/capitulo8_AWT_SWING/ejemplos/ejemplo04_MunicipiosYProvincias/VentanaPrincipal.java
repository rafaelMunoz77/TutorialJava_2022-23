package tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo04_MunicipiosYProvincias;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;

import tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo04_MunicipiosYProvincias.controladores.MunicipioControlador;
import tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo04_MunicipiosYProvincias.controladores.ProvinciaControlador;
import tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo04_MunicipiosYProvincias.modelo.Municipio;
import tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo04_MunicipiosYProvincias.modelo.Provincia;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaPrincipal {

	private JFrame frmGestinDeMunicipios;
	private JTextField jtfFiltro;
	private JTextField jtfNombreMunicipio;
	private JComboBox<Municipio> jcbMunicipiosFiltrados;
	private JComboBox<Provincia> jcbProvincias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmGestinDeMunicipios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestinDeMunicipios = new JFrame();
		frmGestinDeMunicipios.setTitle("Gestión de municipios");
		frmGestinDeMunicipios.setBounds(100, 100, 450, 300);
		frmGestinDeMunicipios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frmGestinDeMunicipios.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_3 = new JLabel("Búsqueda de municipios");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 2;
		gbc_lblNewLabel_3.insets = new Insets(10, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		frmGestinDeMunicipios.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfFiltro = new JTextField();
		GridBagConstraints gbc_jtfFiltro = new GridBagConstraints();
		gbc_jtfFiltro.insets = new Insets(0, 0, 5, 5);
		gbc_jtfFiltro.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFiltro.gridx = 0;
		gbc_jtfFiltro.gridy = 1;
		frmGestinDeMunicipios.getContentPane().add(jtfFiltro, gbc_jtfFiltro);
		jtfFiltro.setColumns(10);
		
		JButton btnFiltrar = new JButton("Filtrar municipios");
		btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filtraMunicipios();
			}
		});
		GridBagConstraints gbc_btnFiltrar = new GridBagConstraints();
		gbc_btnFiltrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnFiltrar.gridx = 1;
		gbc_btnFiltrar.gridy = 1;
		frmGestinDeMunicipios.getContentPane().add(btnFiltrar, gbc_btnFiltrar);
		
		jcbMunicipiosFiltrados = new JComboBox<Municipio>();
		GridBagConstraints gbc_jcbMunicipiosFiltrados = new GridBagConstraints();
		gbc_jcbMunicipiosFiltrados.insets = new Insets(0, 0, 5, 5);
		gbc_jcbMunicipiosFiltrados.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMunicipiosFiltrados.gridx = 0;
		gbc_jcbMunicipiosFiltrados.gridy = 2;
		frmGestinDeMunicipios.getContentPane().add(jcbMunicipiosFiltrados, gbc_jcbMunicipiosFiltrados);
		
		JButton btnSeleccionar = new JButton("Seleccionar municipio");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionarMunicipio();
			}
		});
		GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
		gbc_btnSeleccionar.insets = new Insets(0, 0, 5, 0);
		gbc_btnSeleccionar.gridx = 1;
		gbc_btnSeleccionar.gridy = 2;
		frmGestinDeMunicipios.getContentPane().add(btnSeleccionar, gbc_btnSeleccionar);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		frmGestinDeMunicipios.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("Municipio seleccionado");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(10, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nombre del municipio:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		jtfNombreMunicipio = new JTextField();
		GridBagConstraints gbc_jtfNombreMunicipio = new GridBagConstraints();
		gbc_jtfNombreMunicipio.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombreMunicipio.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombreMunicipio.gridx = 1;
		gbc_jtfNombreMunicipio.gridy = 1;
		panel.add(jtfNombreMunicipio, gbc_jtfNombreMunicipio);
		jtfNombreMunicipio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Provincia:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jcbProvincias = new JComboBox<Provincia>();
		GridBagConstraints gbc_jcbProvincias = new GridBagConstraints();
		gbc_jcbProvincias.insets = new Insets(0, 0, 5, 0);
		gbc_jcbProvincias.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbProvincias.gridx = 1;
		gbc_jcbProvincias.gridy = 2;
		panel.add(jcbProvincias, gbc_jcbProvincias);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarMunicipio();
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 3;
		panel.add(btnGuardar, gbc_btnGuardar);
		
		cargarProvincias();
	}

	
	
	/**
	 * 
	 */
	private void cargarProvincias() {
		List<Provincia> provincias = ProvinciaControlador.findAll();
		
		for (Provincia p : provincias) {
			this.jcbProvincias.addItem(p);
		}
	}
	
	
	/**
	 * 
	 */
	private void filtraMunicipios () {
		List<Municipio> municipiosFiltrados = MunicipioControlador.filterByNombre(this.jtfFiltro.getText());
		
		this.jcbMunicipiosFiltrados.removeAllItems();
		
		for (Municipio m : municipiosFiltrados) {
			this.jcbMunicipiosFiltrados.addItem(m);
		}
	}
	
	
	/**
	 * 
	 */
	private void seleccionarMunicipio() {
		// Obtengo el muncipio, desde la lista del JComboBox
		Municipio m = (Municipio) this.jcbMunicipiosFiltrados.getSelectedItem();
		
		this.jtfNombreMunicipio.setText(m.getNombre());
		
		for (int i = 0; i < this.jcbProvincias.getItemCount(); i++) {
			if (this.jcbProvincias.getItemAt(i).getId() == m.getIdProvincia()) {
				this.jcbProvincias.setSelectedIndex(i);
			}
		}
	}
	
	
	/**
	 * 
	 */
	private void modificarMunicipio() {
		Municipio m = (Municipio) this.jcbMunicipiosFiltrados.getSelectedItem();
		
		m.setNombre(this.jtfNombreMunicipio.getText());
		m.setIdProvincia(((Provincia) this.jcbProvincias.getSelectedItem()).getId());
		
		try {
			MunicipioControlador.modificar(m);
			JOptionPane.showMessageDialog(null, "Modificado correctamente");
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Error, no ha podido modificarse");
			ex.printStackTrace();
		}
	}
}
