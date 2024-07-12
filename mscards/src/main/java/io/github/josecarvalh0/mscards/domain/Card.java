package io.github.josecarvalh0.mscards.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private CardNetwork cardNetwork;
    private BigDecimal income;
    private BigDecimal basicLimit;

    public Card(String name,
                CardNetwork cardNetwork,
                BigDecimal income,
                BigDecimal basicLimit) {
        this.name = name;
        this.cardNetwork = cardNetwork;
        this.income = income;
        this.basicLimit = basicLimit;
    }
}
