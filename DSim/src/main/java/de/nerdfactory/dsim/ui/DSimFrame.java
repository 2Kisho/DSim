package de.nerdfactory.dsim.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import de.nerdfactory.dsim.ui.menu.DSimMenuBuilder;
import de.nerdfactory.dsim.util.UtilRes;

/**
 * The {@link DSimFrame} describes the main frame as it would be under the
 * {@link JFrame} specification.
 * 
 * @author basti
 *
 */
public class DSimFrame extends JFrame {
	
	private static final long serialVersionUID = 267252436684046767L;
	private TabbedPanel tabbedPanel;

	/**
	 * Creates a new {@link DSimFrame}.
	 */
	public DSimFrame() {
		this.tabbedPanel = new TabbedPanel();
		init();
	}

	private void init() {
		initMenubar();
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(UtilRes.getString(DSimFrame.class, "title"));
		setSize(new Dimension(800, 600));
		setLocationRelativeTo(null);
		add(tabbedPanel);
		setVisible(true);
	}

	private void initMenubar() {
		DSimMenuBuilder builder = new DSimMenuBuilder(this);
		setJMenuBar(builder.build());
	}
	
}
