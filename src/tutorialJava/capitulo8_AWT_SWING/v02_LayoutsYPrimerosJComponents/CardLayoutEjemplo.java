package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutEjemplo extends JPanel {

	CardLayout cardLayout;
	JPanel pnlSup, pnlInf, pnlInfOpcion1, pnlInfOpcion2, pnlInfOpcion3;
    JComboBox jcb;

    /**
     * 
     */
    public CardLayoutEjemplo () {
    	super();
        
    	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    	
    	construyePanelSuperior();
        construyePanelInf1();
        construyePanelInf2();
        construyePanelInf3();
        construyePanelInferior();
        
        this.add(pnlSup);
        this.add(pnlInf);
    }

    /**
     * 
     */
    public void construyePanelSuperior(){
        pnlSup = new JPanel();
        pnlSup.setBorder(BorderFactory.createTitledBorder("Ejemplo de CardLayout"));
        pnlSup.setLayout(new FlowLayout());
        pnlSup.add(JLabelFactory.instance("Elegir Opci�n"));
        jcb = JComboBoxFactory.instance(new String[] {"Panel 1", "Panel 2", "Panel 3"});
        jcb.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jcb.getSelectedIndex() == 0){
	    	    	 cardLayout.show(pnlInf, "pnlInfOpcion1");
	    	     }
	    	     if (jcb.getSelectedIndex() == 1){
	    	    	 cardLayout.show(pnlInf, "pnlInfOpcion2");
	    	     }
	    	     if (jcb.getSelectedIndex()==2){
	    	    	 cardLayout.show(pnlInf, "pnlInfOpcion3");
	    	     }
			}});
        pnlSup.add(jcb);
    }
    
    
    /**
     * 
     */
    public void construyePanelInferior(){
        pnlInf = new JPanel();
        pnlInf.setBorder(BorderFactory.createTitledBorder("Panel Inferior"));
        cardLayout = new CardLayout();
        pnlInf.setLayout(cardLayout);
        /*Al agregar necesitamos 2 argumentos, el objeto a agregar y un nombre referencial */
        pnlInf.add(pnlInfOpcion1, "pnlInfOpcion1");
        pnlInf.add(pnlInfOpcion2, "pnlInfOpcion2");
        pnlInf.add(pnlInfOpcion3, "pnlInfOpcion3");
    }

    /**
     * 
     */
    public void construyePanelInf1(){
        pnlInfOpcion1 = new JPanel(new FlowLayout());
        pnlInfOpcion1.setBackground(Color.white);
        pnlInfOpcion1.add(JLabelFactory.instance("Has Seleccionado el Panel 1"));
    }
    
    /**
     * 
     */
    public void construyePanelInf2(){
        pnlInfOpcion2 = new JPanel(new FlowLayout());
        pnlInfOpcion2.setBackground(Color.orange);
        pnlInfOpcion2.add(JLabelFactory.instance("Has Seleccionado el Panel 2. Magia!!!!"));
    }

    /**
     * 
     */
    public void construyePanelInf3(){
        pnlInfOpcion3 = new JPanel(new FlowLayout());
        pnlInfOpcion3.setBackground(Color.green);
        pnlInfOpcion3.add(JLabelFactory.instance("Increíble!!!!. Has Seleccionado el Panel 3."));
    }
    
    
    
    
    
    
    /**
     * 
     * @author R
     *
     */
    class ControlCardLayout implements ActionListener{

    	CardLayoutEjemplo ejemplo;
    	
    	public ControlCardLayout( CardLayoutEjemplo ejemplo){
    		ejemplo = ejemplo ;
    	}
    	
    	public void actionPerformed (ActionEvent evento){
    	  if (evento.getSource() == ejemplo.jcb) {
    	     if (ejemplo.jcb.getSelectedIndex()==0){
    	    	 ejemplo.cardLayout.show(ejemplo.pnlInf, "panel1");
    	     }
    	     if (ejemplo.jcb.getSelectedIndex()==1){
    	    	 ejemplo.cardLayout.show(ejemplo.pnlInf, "panel2");
    	     }
    	     if (ejemplo.jcb.getSelectedIndex()==2){
    	    	 ejemplo.cardLayout.show(ejemplo.pnlInf, "panel3");
    	     }
    	   }
    	}
    }
}
