package de.nerdfactory.dsim.skat;

public interface CardBuilder {

    CardBuilder withCardType(CardType cardType);
    
    CardBuilder withCardColor(CardColor cardColor);
    
    Card build();
}
