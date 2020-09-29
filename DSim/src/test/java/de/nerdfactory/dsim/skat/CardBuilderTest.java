package de.nerdfactory.dsim.skat;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardBuilderTest {

    private CardBuilder builder;
    
    @Before
    public void init() {
        this.builder = new CardBuilderImpl();
    }
    
    @Test
    public void testBuildSuccess() {
        builder.withCardColor(CardColor.CLUBS);
        builder.withCardType(CardType.ACE);
        Card card = builder.build();
        assertEquals(CardColor.CLUBS, card.getCardColor());
        assertEquals(CardType.ACE, card.getCardType());
    }
    
    @Test (expected = NullPointerException.class)
    public void testBuildWithoutCardColor() {
        builder.withCardType(CardType.ACE);
        builder.build();
    }
    
    @Test (expected = NullPointerException.class)
    public void testBuildWithoutCardType() {
        builder.withCardColor(CardColor.CLUBS);
        builder.build();
    }

}
