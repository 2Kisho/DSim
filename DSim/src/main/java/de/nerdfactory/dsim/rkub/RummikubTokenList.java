package de.nerdfactory.dsim.rkub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RummikubTokenList {

	private final List<RummikubToken> tokens = new ArrayList<>();
	
	public RummikubTokenList() {
	}
	
	public RummikubTokenList(List<RummikubToken> tokens) {
		tokens.addAll(tokens);
	}
	
	public List<RummikubToken> getTokens() {
		return Collections.unmodifiableList(tokens);
	}
	
	
}
