package com.jsdev.hexagonalarchitecturelab.ports.primary;

import com.jsdev.hexagonalarchitecturelab.adapters.primary.rest.http.requests.ClientRequest;
import com.jsdev.hexagonalarchitecturelab.adapters.primary.rest.http.response.ClientResponse;
import com.jsdev.hexagonalarchitecturelab.adapters.secundary.impl.CosmoDBClientRepostoryImpl;
import com.jsdev.hexagonalarchitecturelab.adapters.secundary.impl.MsSQLClientRepositoryImpl;
import com.jsdev.hexagonalarchitecturelab.domain.Client;
import com.jsdev.hexagonalarchitecturelab.ports.primary.use_cases.ClientUseCase;
import com.jsdev.hexagonalarchitecturelab.ports.secundary.ClientMsSQLDBRepository;
import com.jsdev.hexagonalarchitecturelab.ports.secundary.ClientCosmosDBRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientService implements ClientUseCase{

    ClientCosmosDBRepository cosmoDBClientRepostory = new CosmoDBClientRepostoryImpl();
    ClientMsSQLDBRepository msSQLClientRepository = new MsSQLClientRepositoryImpl();


    @Override
    public boolean createClient(ClientRequest clientRequest) {
        //Input: Convert ClientRequests to Client Domain Format
        //Output: Convert Client Domain Format to Client Response Format
        Client client = new Client();
        var flag1 = cosmoDBClientRepostory.save(client);
        var flag2 =msSQLClientRepository.save(client);
        return flag1;
    }

    @Override
    public ClientResponse getClient(String id) {
        Client client1 = cosmoDBClientRepostory.get(id);
        Client client2 = msSQLClientRepository.get(id);
        return null;
    }

    @Override
    public boolean deleteClient(String id) {
        Client client1 = msSQLClientRepository.get(id);
        boolean flag = msSQLClientRepository.delete(client1.getId());
        return flag;
    }

    @Override
    public ClientResponse putClient(ClientRequest clientRequest) {
        //Input: Convert ClientRequests to Client Domain Format
        Client client = new Client();
        Client client1 = msSQLClientRepository.getByIdentificacion(client.getIdentification());
        if(client1 != null){
            client1 = msSQLClientRepository.update(client);
        }
        //Output: Convert Client Domain Format to Client Response Format
        return null;
    }

    @Override
    public List<Client> listAllClients() {
        //Input: Convert ClientRequests to Client Domain Format
        //Output: Convert Client Domain Format to Client Response Format
        return null;
    }
}
