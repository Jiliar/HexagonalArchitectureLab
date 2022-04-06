package com.jsdev.hexagonalarchitecturelab.adapters.secundary.impl;

import com.jsdev.hexagonalarchitecturelab.domain.Client;
import com.jsdev.hexagonalarchitecturelab.ports.secundary.ClientCosmosDBRepository;
import org.springframework.stereotype.Service;


@Service
public class CosmoDBClientRepostoryImpl implements ClientCosmosDBRepository {

    @Override
    public boolean save(Client client) {
        return false;
    }

    @Override
    public Client get(String id) {
        return null;
    }

}
