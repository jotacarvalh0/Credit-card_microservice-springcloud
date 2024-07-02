package io.github.jotacarvalh0.mscustomers.applicaton;

import io.github.jotacarvalh0.mscustomers.applicaton.representation.ClientSaveRequest;
import io.github.jotacarvalh0.mscustomers.domain.Client;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("customers")
@RequiredArgsConstructor
@Slf4j
public class CustomersResource {

    private final ClientService service;

    @GetMapping
    public String status(){
        log.info("Get customers status");
        return "OK";
    }

    // requisição onde salvo os dados do cliente(cpf, nome e idade) e 
    // retorna o headerlocatio com url do cliente.
    @PostMapping
    public ResponseEntity save(@RequestBody ClientSaveRequest request){
        var client = request.toModel();
        service.save(client);
        URI headerLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("cpf={cpf}")
                .buildAndExpand(client.getCpf())
                .toUri();
        return ResponseEntity.created(headerLocation).build();
    }

    @GetMapping(params = "cpf")
    public ResponseEntity clientData(@RequestParam("cpf") String cpf){
        var client = service.getByCPF(cpf);
        if(client.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(client);
    }
}
