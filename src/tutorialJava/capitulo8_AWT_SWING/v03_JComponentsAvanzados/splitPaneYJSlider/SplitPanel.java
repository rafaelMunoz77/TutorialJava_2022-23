package tutorialJava.capitulo8_AWT_SWING.v03_JComponentsAvanzados.splitPaneYJSlider;

import javax.swing.JSplitPane;

public class SplitPanel extends JSplitPane {
	
	public SplitPanel () {
		super();
		this.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		this.setLeftComponent(new PanelJSlidersRGB());
		this.setRightComponent(new PanelColorRGB());
	}
	
	

}
