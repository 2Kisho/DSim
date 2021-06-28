package de.nerdfactory.dsim.ui;

import java.util.Optional;

import javax.swing.JPanel;

/**
 * Please use the {@link Tab} interface.
 * @author basti
 *
 */
@Deprecated
public interface DSimPanel {

	Optional<String> getTitle();
	
	void dispose();
	
	JPanel getJPanel();
}
