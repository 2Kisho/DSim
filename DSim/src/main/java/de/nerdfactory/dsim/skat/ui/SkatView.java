package de.nerdfactory.dsim.skat.ui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import de.nerdfactory.dsim.ui.Tab;
import de.nerdfactory.dsim.util.UtilRes;

public class SkatView extends JPanel implements Tab {

	private static final long serialVersionUID = 5884900919556951388L;

	public SkatView() {
		super();
		add(new JLabel("Test!"));
	}
	
	@Override
	public String getTitle() {
		return UtilRes.getString(SkatView.class, "title");
	}

	@Override
	public JPanel getPanel() {
		return this;
	}

}
