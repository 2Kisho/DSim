package de.nerdfactory.dsim.ui;

import java.util.Optional;

import javax.swing.JPanel;

public interface DSimPanel {

	Optional<String> getTitle();
	
	void dispose();
	
	JPanel getJPanel();
}
