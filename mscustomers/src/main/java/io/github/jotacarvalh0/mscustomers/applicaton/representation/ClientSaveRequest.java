package io.github.jotacarvalh0.mscustomers.applicaton.representation;

import io.github.jotacarvalh0.mscustomers.domain.Client;
import lombok.Data;

@Data
public class ClientSaveRequest {
    private String cpf;
    private String name;
    private Integer age;

    public Client toModel(){
        return new Client(cpf, name, age);
    }
}
