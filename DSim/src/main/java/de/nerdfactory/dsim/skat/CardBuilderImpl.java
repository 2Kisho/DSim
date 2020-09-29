package de.nerdfactory.dsim.skat;

import java.util.Objects;

public class CardBuilderImpl implements CardBuilder {

    private CardType cardType;
    private CardColor cardColor;
    
    public CardBuilder withCardType(CardType cardType) {
        this.cardType = cardType;
        return this;
    }

    public CardBuilder withCardColor(CardColor cardColor) {
        this.cardColor = cardColor;
        return this;
    }

    public Card build() {
        Objects.requireNonNull(cardType, "the cardType must not be null!");
        Objects.requireNonNull(cardColor, "the cardColor must not be null!");
        return new CardImpl(cardType, cardColor);
    }

}
