package io.github.josecarvalh0.mscards.infra.repository;

import io.github.josecarvalh0.mscards.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface RepositoryCard extends JpaRepository<Card, Long> {
    List<Card> findByIncomeLessThanEqual(BigDecimal incomeBigDecimal);
}
