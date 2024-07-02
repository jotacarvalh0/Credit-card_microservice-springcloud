package io.github.josecarvalh0.mscards.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cards")
public class ResourceCards {

    @GetMapping
    public String status(){
        return "ok";
    }
}
