package de.nerdfactory.dsim;

import java.util.List;

import de.nerdfactory.dsim.skat.Card;
import de.nerdfactory.dsim.skat.CardDeckBuilderImpl;

public class StartDSim {

    public static void main(String[] args) {
        List<Card> cards = new CardDeckBuilderImpl().setThirtyTwo(true).build();
        cards.forEach(e -> System.out.println(e));
        System.out.println(cards.size());
    }
}
