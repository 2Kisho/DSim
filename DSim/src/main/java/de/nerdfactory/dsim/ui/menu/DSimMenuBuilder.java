package de.nerdfactory.dsim.ui.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import de.nerdfactory.dsim.ui.DSimFrame;
import de.nerdfactory.dsim.util.UtilRes;

/**
 * This class describes the {@link DSimMenuBuilder} that will be used to
 * {@link DSimMenuBuilder#build} the {@link JMenuBar} for the {@link DSimFrame}.
 * 
 * @author basti
 *
 */
public class DSimMenuBuilder {

	private DSimFrame frame;

	/**
	 * Creates the {@link DSimMenuBuilder}.
	 * 
	 * @param frame the {@link DSimFrame} for that the builder will be used.
	 */
	public DSimMenuBuilder(DSimFrame frame) {
		this.frame = frame;
	}

	/**
	 * Builds the {@link JMenuBar} for this {@link DSimMenuBuilder}.
	 * 
	 * @return The {@link JMenuBar} for this {@link DSimMenuBuilder}.
	 */
	public JMenuBar build() {
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu(UtilRes.getString(DSimFrame.class, "menuData"));
		JMenuItem menuItemExit = new JMenuItem(UtilRes.getString(DSimMenuBuilder.class, "menuItemExit"));
		menuItemExit.addActionListener(e -> frame.dispose());
		menu.add(menuItemExit);
		menubar.add(menu);

		JMenu menuAbout = new JMenu("?");
		JMenuItem menuItemAbout = new JMenuItem(UtilRes.getString(DSimMenuBuilder.class, "about"));
		menuItemAbout.addActionListener(e -> openAbout());
		menuAbout.add(menuItemAbout);
		menubar.add(menuAbout);

		return menubar;
	}

	private void openAbout() {

	}
}
