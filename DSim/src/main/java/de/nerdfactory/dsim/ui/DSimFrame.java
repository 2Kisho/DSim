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
public class DSimFrame {

	private final JFrame frame;
	private TabbedPanel tabbedPanel;

	/**
	 * Creates a new {@link DSimFrame}.
	 */
	public DSimFrame() {
		this.frame = new JFrame();
		this.tabbedPanel = new TabbedPanel();
		init();
	}

	/**
	 * @see JFrame#dispose()
	 */
	public void dispose() {
		frame.dispose();
	}

	private void init() {
		initMenubar();
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(UtilRes.getString(DSimFrame.class, "title"));
		frame.setSize(new Dimension(800, 600));
		frame.setLocationRelativeTo(null);
		frame.add(tabbedPanel);
		frame.setVisible(true);
	}

	private void initMenubar() {
		DSimMenuBuilder builder = new DSimMenuBuilder(this);
		this.frame.setJMenuBar(builder.build());
	}
	
}
