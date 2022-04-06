package com.jsdev.hexagonalarchitecturelab.adapters.primary.rest.http.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequestId {

    @NotNull
    @JsonProperty("id")
    private String id;
}
