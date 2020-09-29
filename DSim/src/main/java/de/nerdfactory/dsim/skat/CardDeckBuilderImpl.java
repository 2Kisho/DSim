package de.nerdfactory.dsim.skat;

import java.util.LinkedList;
import java.util.List;

public class CardDeckBuilderImpl implements CardDeckBuilder {

    private boolean thirtyTwo;
    
    public CardDeckBuilder setThirtyTwo(boolean thirtyTwo) {
        this.thirtyTwo = thirtyTwo;
        return this;
    }
    
    public List<Card> build() {
        List<Card> cardList = new LinkedList<>();
        for (CardColor color : CardColor.values()) {
            for (CardType type : CardType.values()) {
                if (thirtyTwo && !CardType.SIX.equals(type)) {
                    cardList.add(new CardBuilderImpl().withCardColor(color).withCardType(type).build());
                }
            }
        }
        return cardList;
    }

}
