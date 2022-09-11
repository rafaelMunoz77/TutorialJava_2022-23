package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class PanelJFormattedTextField extends JPanel {

	/**
	 * 
	 */
	public PanelJFormattedTextField() {
		super();

		// Disponemos los elementos sobre el panel
		// Creo una etiqueta para indicar al usuario que debe hacer clic en cualquier
		// sitio
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5, 5, 5, 5);

		// Inserto el formattedtextfield para números enteros
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weighty = 1;
		constraints.anchor = GridBagConstraints.SOUTHEAST;
		this.add(new JLabel("JFormattedTextField para n�meros enteros - Por defecto"), constraints);

		constraints.gridx = 1;
		constraints.anchor = GridBagConstraints.SOUTHWEST;
		this.add(getJFormattedTextFieldInteger(), constraints);

		// Inserto el formattedtextfield para números flotantes
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.weighty = 0;
		constraints.anchor = GridBagConstraints.SOUTHEAST;
		this.add(new JLabel("JFormattedTextField para n�meros flotantes - Por defecto"), constraints);

		constraints.gridx = 1;
		constraints.anchor = GridBagConstraints.SOUTHWEST;
		this.add(getJFormattedTextFieldFloat(), constraints);

		// Inserto el formattedtextfield para números flotantes
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.SOUTHEAST;
		this.add(new JLabel("JFormattedTextField para fechas - Por defecto"), constraints);

		constraints.gridx = 1;
		constraints.anchor = GridBagConstraints.SOUTHWEST;
		this.add(getJFormattedTextFieldDate(), constraints);

		// Inserto el formattedtextfield para fechas personalizadas
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.SOUTHEAST;
		this.add(new JLabel("JFormattedTextField para fechas - Personalizado"), constraints);

		constraints.gridx = 1;
		constraints.anchor = GridBagConstraints.SOUTHWEST;
		this.add(getJFormattedTextFieldDatePersonalizado(), constraints);

		// Inserto el formattedtextfield para números flotantes personalizados
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.weighty = 1;
		constraints.anchor = GridBagConstraints.NORTHEAST;
		this.add(new JLabel("JFormattedTextField para flotantes - Personalizado"), constraints);

		constraints.gridx = 1;
		constraints.anchor = GridBagConstraints.NORTHWEST;
		this.add(getJFormattedTextFieldFloatPersonalizado(), constraints);

	}

	/**
	 * 
	 * @return
	 */
	private JFormattedTextField getJFormattedTextFieldInteger() {
		JFormattedTextField jftf = new JFormattedTextField(new Integer(0));
		jftf.setColumns(20);
		return jftf;
	}

	/**
	 * 
	 * @return
	 */
	private JFormattedTextField getJFormattedTextFieldFloat() {
		JFormattedTextField jftf = new JFormattedTextField(new Float(0f));
		jftf.setColumns(20);
		return jftf;
	}

	/**
	 * 
	 * @return
	 */
	private JFormattedTextField getJFormattedTextFieldDate() {
		JFormattedTextField jftf = new JFormattedTextField(new Date());
		jftf.setColumns(20);
		return jftf;
	}

	/**
	 * 
	 * @return
	 */
	private JFormattedTextField getJFormattedTextFieldDatePersonalizado() {
		JFormattedTextField jftf = new JFormattedTextField(new JFormattedTextField.AbstractFormatter() {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			@Override
			public String valueToString(Object value) throws ParseException {
				if (value != null && value instanceof Date) {
					return sdf.format(((Date) value));
				}
				return "";
			}

			@Override
			public Object stringToValue(String text) throws ParseException {
				try {
					return sdf.parse(text);
				} catch (Exception e) {
					return null;
				}
			}
		});
		jftf.setColumns(20);
		jftf.setValue(new Date());
		return jftf;
	}

	/**
	 * 
	 * @return
	 */
	private JFormattedTextField getJFormattedTextFieldFloatPersonalizado() {
		try {
			MaskFormatter mascara = new MaskFormatter("##.##");
			// Para aprender m�s sobre formatos de números puedes mirar la javadoc de la
			// clase DecimalFormat
			// https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html
			JFormattedTextField jftf = new JFormattedTextField(mascara);
			jftf.setColumns(20);
			jftf.setValue(new Float("12.34"));
			return jftf;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
