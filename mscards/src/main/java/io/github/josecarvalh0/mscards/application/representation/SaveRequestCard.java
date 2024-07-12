package io.github.josecarvalh0.mscards.application.representation;

import io.github.josecarvalh0.mscards.domain.Card;
import io.github.josecarvalh0.mscards.domain.CardNetwork;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SaveRequestCard {
    private String name;
    private CardNetwork cardNetwork;
    private BigDecimal amount;
    private BigDecimal rate;

    public Card toModel(){
        return new Card(name, cardNetwork, amount, rate);
    }
}
