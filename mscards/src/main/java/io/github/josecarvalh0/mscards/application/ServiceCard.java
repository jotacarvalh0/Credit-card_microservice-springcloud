package io.github.josecarvalh0.mscards.application;

import io.github.josecarvalh0.mscards.domain.Card;
import io.github.josecarvalh0.mscards.infra.repository.RepositoryCard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceCard {

    private final RepositoryCard repository;

    @Transactional
    public Card save(Card card) {
        return repository.save(card);
    }

    public List<Card> getLowerIncomeCardEqual(Long income) {
        var incomeBigDecimal = BigDecimal.valueOf(income);
        return repository.findByIncomeLessThanEqual(incomeBigDecimal);
    }
}
