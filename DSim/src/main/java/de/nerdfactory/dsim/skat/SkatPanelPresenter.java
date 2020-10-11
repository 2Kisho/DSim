package de.nerdfactory.dsim.skat;

import java.util.Optional;

import javax.swing.JPanel;

import de.nerdfactory.dsim.ui.DSimPanel;
import de.nerdfactory.dsim.util.UtilRes;

public class SkatPanelPresenter implements DSimPanel {

	private final SkatPanelModel model;
	private final SkatPanelView view;

	public SkatPanelPresenter(SkatPanelModel model, SkatPanelView view) {
		this.model = model;
		this.view = view;
	}

	public void present() {
		
	}

	@Override
	public Optional<String> getTitle() {
		return Optional.of(UtilRes.getString(SkatPanelPresenter.class, "title"));
	}

	@Override
	public void dispose() {
	}

	@Override
	public JPanel getJPanel() {
		return view;
	}
}
