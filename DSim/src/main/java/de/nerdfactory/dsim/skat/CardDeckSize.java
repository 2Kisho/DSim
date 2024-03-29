package de.nerdfactory.dsim.skat;

public enum CardDeckSize {

	THIRTY_TWO(32),
	THIRTY_SIX(36);
	
	private int deckSize;
	
	private CardDeckSize(int deckSize) {
		this.deckSize = deckSize;
	}
	
	public int getSize() {
		return deckSize;
	}
}
