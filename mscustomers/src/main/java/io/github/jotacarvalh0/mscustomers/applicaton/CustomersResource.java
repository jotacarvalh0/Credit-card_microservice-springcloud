package io.github.jotacarvalh0.mscustomers.applicaton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomersResource {

    @GetMapping
    public String status(){
        return "OK";
    }
}
