package de.nerdfactory.dsim.rkub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RummikubFieldList {

	private final List<RummikubToken> tokens = new ArrayList<>();
	
	public RummikubFieldList(List<RummikubToken> tokens) {
		checkValidFieldList(tokens);
	}
	
	public RummikubFieldList(RummikubToken ...tokens) {
		checkValidFieldList(Arrays.asList(tokens));
	}
	
	private void checkValidFieldList(List<RummikubToken> tokens) {
		
	}
	
}
