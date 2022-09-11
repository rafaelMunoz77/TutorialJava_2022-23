package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class GridBagLayoutFactory {

	/**
	 * 
	 * @param incluirComponentes
	 * @return
	 */
	public static JPanel instance (boolean incluirComponentes) {
		JPanel jpn = new JPanel();
		
		jpn.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
	    c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		c.weighty = 1;
		c.weightx = 1;
	    c.insets = new Insets(5, 5, 5, 5);
	    jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JLABEL) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), c);
		
		c.gridx = 1;
	    c.gridy = 0;
	    jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JTEXTFIELD) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), c);
		
	    // Segunda fila
		//c.fill = GridBagConstraints.NONE;
		c.gridx = 0;
	    c.gridy = 1;
	    c.gridwidth = 2;
	    jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JBUTTON) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), c);

	    // Tercera fila
		c.gridx = 0;
	    c.gridy = 2;
	    //c.gridwidth = 2;
	    jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JBUTTON) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), c);
		
		c.fill = GridBagConstraints.NONE;
		c.gridx = 0;
	    c.gridy = 3;
	    //c.gridwidth = 1;
	    jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JBUTTON) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), c);
		
		//c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
	    c.gridy = 4;
	    c.anchor = GridBagConstraints.SOUTHWEST;
	    jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JBUTTON) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), c);
		/*
		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 1;
	    c.gridy = 3;
	    c.gridheight = 2;
	    c.weighty = 1;
	    c.anchor = GridBagConstraints.CENTER;
	    jpn.add((incluirComponentes)? JComponentFactory.instanceJComponent(JComponentFactory.JBUTTON) : JComponentFactory.instanceJComponent(JComponentFactory.JPANEL), c);
	*/	
		return jpn;
	}

}
