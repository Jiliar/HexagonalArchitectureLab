package com.jsdev.hexagonalarchitecturelab.adapters.secundary.impl;

import com.jsdev.hexagonalarchitecturelab.domain.Client;
import com.jsdev.hexagonalarchitecturelab.ports.secundary.ClientMsSQLDBRepository;
import org.springframework.stereotype.Service;

@Service
public class MsSQLClientRepositoryImpl implements ClientMsSQLDBRepository {

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public Client getByIdentificacion(String identificacion) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public boolean save(Client client) {
        return false;
    }

    @Override
    public Client get(String id) {
        return null;
    }
}
