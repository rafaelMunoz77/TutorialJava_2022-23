package tutorialJava.capitulo8_AWT_SWING.v02_LayoutsYPrimerosJComponents;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EjemploGroupLayoutPane extends JPanel {
	
	JLabel label = new JLabel("Find What:");;
    JTextField textField = new JTextField();
    JCheckBox caseCheckBox = new JCheckBox("Match Case");
    JCheckBox wrapCheckBox = new JCheckBox("Wrap Around");
    JCheckBox wholeCheckBox = new JCheckBox("Whole Words");
    JCheckBox backCheckBox = new JCheckBox("Search Backwards");
    JButton findButton = new JButton("Find");
    JButton cancelButton = new JButton("Cancel");
    
    /**
     * 
     */
    public EjemploGroupLayoutPane () {
    	// remove redundant default border of check boxes - they would hinder
        // correct spacing and aligning (maybe not needed on some look and feels)
        caseCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        wrapCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        wholeCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        backCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(label)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(textField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(caseCheckBox)
                            .addComponent(wholeCheckBox))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(wrapCheckBox)
                            .addComponent(backCheckBox))))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(findButton)
                    .addComponent(cancelButton))
        		);
        
        layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);
        
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(textField)
                    .addComponent(findButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(caseCheckBox)
                            .addComponent(wrapCheckBox))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(wholeCheckBox)
                            .addComponent(backCheckBox)))
                    .addComponent(cancelButton))
            );
    }
}
