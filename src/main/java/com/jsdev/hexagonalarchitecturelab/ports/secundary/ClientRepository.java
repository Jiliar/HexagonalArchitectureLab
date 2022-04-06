package com.jsdev.hexagonalarchitecturelab.ports.secundary;

import com.jsdev.hexagonalarchitecturelab.domain.Client;
import org.springframework.stereotype.Component;


@Component
public interface ClientRepository {

    boolean save(Client client);
    Client get(String id);

}
