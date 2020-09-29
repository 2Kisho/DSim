package de.nerdfactory.dsim.skat;

import java.util.Objects;

public class CardImpl implements Card {

    private final CardType cardType;
    private final CardColor cardColor;

    CardImpl(CardType cardType, CardColor cardColor) {
        this.cardType = cardType;
        this.cardColor = cardColor;
    }

    public CardType getCardType() {
        return cardType;
    }

    public CardColor getCardColor() {
        return cardColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardType, cardColor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        CardImpl other = (CardImpl) obj;
        return this.cardColor.equals(other.cardColor)
                && this.cardType.equals(other.cardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("CardImpl[cardType=");
        sb.append(cardType.name());
        sb.append(", cardColor=");
        sb.append(cardColor.name());
        sb.append("]");
        return sb.toString();
    }

}
