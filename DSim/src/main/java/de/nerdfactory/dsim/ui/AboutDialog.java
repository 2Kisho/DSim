package de.nerdfactory.dsim.ui;

import java.awt.BorderLayout;
import java.awt.Window;

import javax.swing.JDialog;

import de.nerdfactory.dsim.util.UtilRes;

public class AboutDialog extends JDialog {

	private static final long serialVersionUID = -1650756231996624664L;
	private static final String DIALOG_TITLE = UtilRes.getString(AboutDialog.class, "title");

	public AboutDialog(Window owner) {
		super(owner);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(owner);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle(DIALOG_TITLE);
		init();
		setVisible(true);
	}
	
	private void init() {
		setLayout(new BorderLayout());
		pack();
	}
}
