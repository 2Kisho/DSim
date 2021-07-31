package de.nerdfactory.dsim.skat.ui;

import de.nerdfactory.dsim.util.Presenter;

public class SkatPresenter implements Presenter {

	private final SkatModel model;
	private final SkatView view;
	
	public SkatPresenter(SkatModel model, SkatView view) {
		this.model = model;
		this.view = view;
	}
	
	@Override
	public void present() {
		
	}

}
