package de.nerdfactory.dsim.skat;

import java.util.List;

public interface CardDeckBuilder {
    
    CardDeckBuilder setThirtyTwo(boolean thirtyTwo);
    
    List<Card> build();
}
