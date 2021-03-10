package de.nerdfactory.dsim.rkub;

import java.util.Objects;

public class RummikubToken {

	private final RummikubTokenColor color;
	private final int value;

	public RummikubToken(RummikubTokenColor color, int value) {
		if (value < 0 || value > 13) {
			throw new IllegalArgumentException("The value(" + value + ") must not be below zero(joker) or above 13!");
		}
		this.color = color;
		this.value = value;
	}
	
	public RummikubTokenColor getColor() {
		return color;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isJoker() {
		return value == 0;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(color, value);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!obj.getClass().equals(getClass())) {
			return false;
		}
		RummikubToken other = (RummikubToken) obj;
		return this.color.equals(other.color) && this.value == other.value;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("RummikubToken[color=");
		sb.append(color);
		sb.append(", vlaue=");
		sb.append(String.valueOf(value));
		sb.append("]");
		return sb.toString();
	}
}
