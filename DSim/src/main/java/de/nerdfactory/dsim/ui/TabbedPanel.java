package de.nerdfactory.dsim.ui;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPanel extends JPanel {

	private static final long serialVersionUID = -3843981360447935017L;
	private final JTabbedPane tabbedPane;
	private final List<Tab> tabList = new ArrayList<>();
	
	public TabbedPanel() {
		super(new BorderLayout());
		this.tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(this.tabbedPane, BorderLayout.CENTER);
	}
	
	public void addTab(Tab tab) {
		this.tabList.add(tab);
		this.tabbedPane.addTab(tab.getTitle(), tab.getPanel());
	}
	
	public void closeCurrentTab() {
		int selectedIndex = tabbedPane.getSelectedIndex();
		if (selectedIndex > -1) {
			tabbedPane.removeTabAt(selectedIndex);
			tabList.remove(selectedIndex);
		}
	}
}
