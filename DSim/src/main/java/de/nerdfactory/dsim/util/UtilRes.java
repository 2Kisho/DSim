package de.nerdfactory.dsim.util;

import java.util.ResourceBundle;

public class UtilRes {

	private static final String BASE_NAME = "DSim";
	
	public static String getString(String key) {
		ResourceBundle bundle = ResourceBundle.getBundle(BASE_NAME);
		return bundle.getString(key);
	}
}
