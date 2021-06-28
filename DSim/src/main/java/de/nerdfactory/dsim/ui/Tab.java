package de.nerdfactory.dsim.ui;

import javax.swing.JPanel;

/**
 * This interface describes a {@link Tab} that can be used with the
 * {@link TabbedPanel}.
 * 
 * @author basti
 *
 */
public interface Tab {

	/**
	 * Gets the title of this {@link Tab} as {@link String}.
	 * 
	 * @return The title of this {@link Tab}.
	 */
	String getTitle();

	/**
	 * Gets the panel of this {@link Tab} as {@link JPanel}.
	 * 
	 * @return A {@link JPanel} of this {@link Tab}.
	 */
	JPanel getPanel();
}
