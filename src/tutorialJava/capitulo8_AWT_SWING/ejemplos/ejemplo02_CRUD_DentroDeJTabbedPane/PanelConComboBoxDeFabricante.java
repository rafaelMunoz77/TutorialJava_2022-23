package tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo02_CRUD_DentroDeJTabbedPane;

import javax.swing.JPanel;

import tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo01_CRUD_Fabricante.ConnectionManager;

import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelConComboBoxDeFabricante extends JPanel {

	JComboBox<Fabricante> comboBox;
	
	/**
	 * Create the panel.
	 */
	public PanelConComboBoxDeFabricante() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		comboBox = new JComboBox<Fabricante>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 0;
		add(comboBox, gbc_comboBox);
		
		
		JButton btnNewButton = new JButton("Cargar valores");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Leer valor");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 1;
		add(btnNewButton_1, gbc_btnNewButton_1);

		
		cargarValoresFabricantesEnJComboBox();
	}
	
	/**
	 * 
	 */
	private void cargarValoresFabricantesEnJComboBox () {
		// Cargamos valores dentro del combobox
		List<Fabricante> lista = ControladorFabricante.obtenerTodosLosFabricantes();
		for (int i = 0; i < lista.size(); i++) {
			comboBox.addItem(lista.get(i));
		}

	}

	/**
	 * 
	 * @param idFabricante
	 */
	private void seleccionarFabricanteEnJComboBox (int idFabricante) {
		for (int i = 0; i < comboBox.getItemCount(); i++) {
			if ( ((Fabricante) comboBox.getItemAt(i)).getId() == idFabricante) {
				comboBox.setSelectedIndex(i);
			}
		}
	}
	
	
	private int getIdFabricanteSeleccionadoEnJComboBox () {
		return ((Fabricante) comboBox.getSelectedItem()).getId();
	}
	
	
	
}
