package tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo02_CRUD_DentroDeJTabbedPane;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelConCheckBox extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelConCheckBox() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JCheckBox checkBox = new JCheckBox("Checkbox de ejemplo");
		GridBagConstraints gbc_checkBox = new GridBagConstraints();
		gbc_checkBox.gridwidth = 2;
		gbc_checkBox.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox.gridx = 0;
		gbc_checkBox.gridy = 0;
		add(checkBox, gbc_checkBox);
		
		JButton btnEstablecerValor = new JButton("Establecer valor");
		btnEstablecerValor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkBox.setSelected(!checkBox.isSelected());
			}
		});
		GridBagConstraints gbc_btnEstablecerValor = new GridBagConstraints();
		gbc_btnEstablecerValor.insets = new Insets(0, 0, 0, 5);
		gbc_btnEstablecerValor.gridx = 0;
		gbc_btnEstablecerValor.gridy = 1;
		add(btnEstablecerValor, gbc_btnEstablecerValor);
		
		JButton btnLeerValor = new JButton("Leer valor");
		btnLeerValor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Valor del checkBox: " + checkBox.isSelected());
			}
		});
		GridBagConstraints gbc_btnLeerValor = new GridBagConstraints();
		gbc_btnLeerValor.gridx = 1;
		gbc_btnLeerValor.gridy = 1;
		add(btnLeerValor, gbc_btnLeerValor);

	}

}
