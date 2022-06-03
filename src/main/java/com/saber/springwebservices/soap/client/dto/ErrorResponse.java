package com.saber.springwebservices.soap.client.dto;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.ToNumberPolicy;
import lombok.Data;

import java.util.List;

@Data
public class ErrorResponse {
    private Integer code;
    private String message;
    @JsonRawValue
    private Object originalMessage;
    private List<ValidationDto> validations;

    public ErrorResponse() {
    }

    public ErrorResponse(Integer code, String message, Object originalMessage) {
        this.code = code;
        this.message = message;
        this.originalMessage = originalMessage;
    }

    @Override
    public String toString() {
        return new GsonBuilder()
                .setLenient()
                .setPrettyPrinting()
                .enableComplexMapKeySerialization()
                .setLongSerializationPolicy(LongSerializationPolicy.DEFAULT)
                .setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)
                .create().toJson(this, ErrorResponse.class);
    }
}
