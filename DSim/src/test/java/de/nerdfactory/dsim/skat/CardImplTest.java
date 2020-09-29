package de.nerdfactory.dsim.skat;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardImplTest {

    private final CardColor testColor = CardColor.CLUBS;
    private final CardType testType = CardType.ACE;
    private Card card;
    
    @Before
    public void init() {
        card = new CardImpl(testType, testColor);
    }
    
    @Test
    public void testCardImplGetType() {
        assertEquals(testType, card.getCardType());
    }
    
    @Test
    public void testCardImplGetColor() {
        assertEquals(testColor, card.getCardColor());
    }
    
    @Test
    public void testEqualsSuccess() {
        Card equalCard = new CardImpl(testType, testColor);
        assertEquals(card, equalCard);
    }
    
    @Test
    public void testEqualsFalse() {
        Card notEqualCard = new CardImpl(testType, CardColor.DIAMONDS);
        assertNotEquals(card, notEqualCard);
    }
    
    @Test
    public void testEqualHashCode() {
        Card equalCard = new CardImpl(testType, testColor);
        assertEquals(card.hashCode(), equalCard.hashCode());
    }
    
    @Test
    public void testNotEqualHashCode() {
        Card notEqualCard = new CardImpl(testType, CardColor.DIAMONDS);
        assertNotEquals(card.hashCode(), notEqualCard.hashCode());
    }
}
