package io.github.josecarvalh0.mscards.application;

import io.github.josecarvalh0.mscards.application.representation.SaveRequestCard;
import io.github.josecarvalh0.mscards.domain.Card;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cards")
@RequiredArgsConstructor
public class ResourceCard {

    private final ServiceCard service;

    @GetMapping
    public String status(){
        return "OK";
    }

    @PostMapping
    public ResponseEntity register(@RequestBody SaveRequestCard request) {
        Card card = request.toModel();
        service.save(card);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
