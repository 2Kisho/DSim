package de.nerdfactory.dsim.skat.ui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import de.nerdfactory.dsim.ui.Tab;

public class SkatPanel extends JPanel implements Tab {

	private static final long serialVersionUID = 5884900919556951388L;

	public SkatPanel() {
		super();
		add(new JLabel("Test!"));
	}
	
	@Override
	public String getTitle() {
		return "Skat"; //TODO i18n
	}

	@Override
	public JPanel getPanel() {
		return this;
	}

}
