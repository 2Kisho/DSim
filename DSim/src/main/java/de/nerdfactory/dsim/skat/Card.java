package de.nerdfactory.dsim.skat;

import com.google.common.base.Objects;

public class Card implements CardInterface {

	private final CardColor cardColor;
	private final CardValue cardValue;
	
	public Card(CardColor color, CardValue value) {
		this.cardColor = color;
		this.cardValue = value;
	}

	@Override
	public CardColor getCardColor() {
		return cardColor;
	}

	@Override
	public CardValue getCardValue() {
		return cardValue;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(cardColor, cardValue);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!Card.class.equals(obj.getClass())) {
			return false;
		}
		Card other = (Card) obj;
		return this.cardColor.equals(other.cardColor)
				&& this.cardValue.equals(other.cardValue);
	}
	
	@Override
	public String toString() {
		return "Card[cardColor=" + cardColor.name() + ", cardValue=" + cardValue.name();
	}
}
