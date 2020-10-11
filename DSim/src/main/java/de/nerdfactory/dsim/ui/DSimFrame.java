package de.nerdfactory.dsim.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import de.nerdfactory.dsim.util.UtilRes;

public class DSimFrame {

	private final JFrame frame;
	private JMenuBar menubar;
	private DSimPanel mainPanel;
	
	public DSimFrame() {
		this.frame = new JFrame();
		init();
	}
	
	private void init() {
		initMenubar();
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(UtilRes.getString(DSimFrame.class, "title"));
		frame.setSize(new Dimension(800, 600));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	private void initMenubar() {
		menubar = new JMenuBar();
		JMenu menu = new JMenu(UtilRes.getString(DSimFrame.class, "menuData"));
		JMenuItem menuItemExit = new JMenuItem(UtilRes.getString(DSimFrame.class, "menuItemExit"));
		menuItemExit.addActionListener(e -> dispose());
		menu.add(menuItemExit);
		menubar.add(menu);
		frame.setJMenuBar(menubar);
	}
	
	public DSimPanel getMainPanel() {
		return mainPanel;
	}
	
	public void setMainPanel(DSimPanel panel) {
		this.mainPanel = panel;
		JPanel jpanel = panel.getJPanel();
		if (panel.getTitle().isPresent()) {
			jpanel.setBorder(new TitledBorder(panel.getTitle().get()));
		}
		frame.add(jpanel, BorderLayout.CENTER);
	}
	
	public void dispose() {
		frame.dispose();
	}
}
