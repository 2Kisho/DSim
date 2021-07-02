package de.nerdfactory.dsim.skat;

import java.util.Optional;

import javax.swing.JPanel;

import de.nerdfactory.dsim.ui.Tab;
import de.nerdfactory.dsim.util.UtilRes;

public class SkatPanelPresenter implements Tab {

	private final SkatPanelModel model;
	private final SkatPanelView view;

	public SkatPanelPresenter(SkatPanelModel model, SkatPanelView view) {
		this.model = model;
		this.view = view;
	}

	public void present() {
		
	}

	@Override
	public String getTitle() {
		return UtilRes.getString(SkatPanelPresenter.class, "title");
	}

	@Override
	public JPanel getPanel() {
		return view;
	}
}
