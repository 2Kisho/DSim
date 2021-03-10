package de.nerdfactory.dsim.rkub;

import java.awt.Color;

public enum RummikubTokenColor {

	BLACK(Color.BLACK),
	RED(Color.RED),
	YELLOW(Color.YELLOW),
	CYAN(Color.CYAN);
	
	private final Color color;
	
	private RummikubTokenColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "RummikubTokenColor[color=" + color.toString() + "]";
	}
	
}
