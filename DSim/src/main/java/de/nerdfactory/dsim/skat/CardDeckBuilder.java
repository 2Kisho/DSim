package de.nerdfactory.dsim.skat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeckBuilder {

	private final CardDeckSize deckSize;
	
	public CardDeckBuilder(CardDeckSize deckSize) {
		this.deckSize = deckSize;
	}
	
	public List<Card> build() {
		List<Card> cards = new ArrayList<>();
		for (CardValue value : CardValue.values()) {
			if (deckSize.equals(CardDeckSize.THIRTY_TWO) && value.equals(CardValue.SIX)) {
				continue;
			}
			for (CardColor color : CardColor.values()) {
				cards.add(new Card(color, value));
			}
		}
		Collections.shuffle(cards);
		return cards;
	}
}
