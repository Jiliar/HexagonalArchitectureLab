package com.jsdev.hexagonalarchitecturelab.adapters.primary.rest;

import com.jsdev.hexagonalarchitecturelab.adapters.primary.rest.http.requests.ClientRequest;
import com.jsdev.hexagonalarchitecturelab.adapters.primary.rest.http.requests.ClientRequestId;
import com.jsdev.hexagonalarchitecturelab.adapters.primary.rest.http.response.ClientResponse;
import com.jsdev.hexagonalarchitecturelab.ports.primary.ClientService;
import com.jsdev.hexagonalarchitecturelab.ports.primary.use_cases.ClientUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("clients")
public class ClientController {

    ClientUseCase clientUseCase = new ClientService();

    @PostMapping(value = "store", produces = "application/hal+json;charset=utf8")
    public ResponseEntity<ClientResponse> createClient(@Valid @RequestBody ClientRequest clientRequest){
        return new ResponseEntity("¡Store Data!", HttpStatus.OK);
    }

    @GetMapping(value = "get", produces = "application/hal+json;charset=utf8")
    public ResponseEntity<ClientResponse> getClient(@Valid @RequestBody ClientRequestId clientRequest){
        return new ResponseEntity("¡Get Data!", HttpStatus.OK);
    }

    @PutMapping(value = "update", produces = "application/hal+json;charset=utf8")
    public ResponseEntity<ClientResponse> putClient(@Valid @RequestBody  ClientRequest clientRequest){
        return new ResponseEntity("¡Update Data!", HttpStatus.OK);
    }

    @DeleteMapping(value = "remove", produces = "application/hal+json;charset=utf8")
    public ResponseEntity<ClientResponse> deleteClient(@Valid @RequestBody ClientRequestId clientRequest){
        return new ResponseEntity("¡Remove Data!", HttpStatus.OK);
    }

    @GetMapping(value = "all", produces = "application/hal+json;charset=utf8")
    public ResponseEntity<ClientResponse> listClient(){
        return new ResponseEntity("¡List data", HttpStatus.OK);
    }

}
