package com.jsdev.hexagonalarchitecturelab.adapters.primary.rest.http.requests;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {

    @NotNull
    @JsonProperty("id")
    private String id;

    @NotNull
    @JsonProperty("identification")
    private String identification;

    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("address")
    private String address;

    @JsonProperty("email")
    private String email;

}
