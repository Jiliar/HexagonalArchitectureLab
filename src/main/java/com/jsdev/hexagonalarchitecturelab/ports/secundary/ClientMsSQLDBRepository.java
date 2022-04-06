package com.jsdev.hexagonalarchitecturelab.ports.secundary;

import com.jsdev.hexagonalarchitecturelab.domain.Client;

public interface ClientMsSQLDBRepository extends ClientRepository{

    Client update(Client client);
    Client getByIdentificacion(String identificacion);
    boolean delete(String id);
}
