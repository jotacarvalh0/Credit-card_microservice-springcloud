package io.github.jotacarvalh0.mscustomers.applicaton;

import io.github.jotacarvalh0.mscustomers.domain.Client;
import io.github.jotacarvalh0.mscustomers.infra.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository repository;

    @Transactional
    public Client save(Client client) {
        return repository.save(client);
    }
    public Optional<Client> getByCPF(String cpf){
        return repository.findByCpf(cpf);
    }
}
