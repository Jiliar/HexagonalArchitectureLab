package com.jsdev.hexagonalarchitecturelab.ports.primary.use_cases;

import com.jsdev.hexagonalarchitecturelab.adapters.primary.rest.http.requests.ClientRequest;
import com.jsdev.hexagonalarchitecturelab.adapters.primary.rest.http.response.ClientResponse;
import com.jsdev.hexagonalarchitecturelab.domain.Client;

import java.util.List;

public interface ClientUseCase {

    boolean createClient(ClientRequest clientRequest);
    ClientResponse getClient(String id);
    boolean deleteClient(String id);
    ClientResponse putClient(ClientRequest clientRequest);
    List<Client> listAllClients();

}
