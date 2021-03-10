package de.nerdfactory.dsim.rkub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RummikubTokenBuilder {

	private int playerCnt;
	
	public RummikubTokenBuilder setPlayerCnt(int playerCnt) {
		if (playerCnt < 1 || playerCnt > 6) {
			throw new IllegalArgumentException("The playerCnt(" + playerCnt + ") must not be less than 1 or above 6");
		}
		this.playerCnt = playerCnt;
		return this;
	}
	
	public List<RummikubToken> build() {
		List<RummikubToken> allTokens = new ArrayList<>();
		int maxSeries = 2; // two series of four colors. two jokers.
		if (playerCnt > 4) {
			//three series of four colors. four jokers. 
			maxSeries = 3;
		}
		for (int series = 0; series < maxSeries; series++) {
			for (RummikubTokenColor color : RummikubTokenColor.values()) {
				for (int value = 1; value <= 12; value++) {
					allTokens.add(new RummikubToken(color, value));
				}
			}
		}
		allTokens.add(new RummikubToken(RummikubTokenColor.BLACK, 0));
		allTokens.add(new RummikubToken(RummikubTokenColor.RED, 0));
		if (maxSeries == 3) {
			allTokens.add(new RummikubToken(RummikubTokenColor.BLACK, 0));
			allTokens.add(new RummikubToken(RummikubTokenColor.RED, 0));			
		}
		Collections.shuffle(allTokens);
		return allTokens;
	}
}
