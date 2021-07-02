package de.nerdfactory.dsim.ui;

import javax.swing.JPanel;

public interface DSimDialog {

	String getTitle();
	
	JPanel getPanel();
	
	void dispose();
}
