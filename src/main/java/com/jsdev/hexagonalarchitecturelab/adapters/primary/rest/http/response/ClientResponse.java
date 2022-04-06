package com.jsdev.hexagonalarchitecturelab.adapters.primary.rest.http.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {

    @JsonProperty("code")
    private String code;

    @JsonProperty("output")
    private String output;

}
