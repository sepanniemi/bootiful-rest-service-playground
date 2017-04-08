package com.sepanniemi.bootiful.sample.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

/**
 * Created by sepanniemi on 08/12/16.
 */
@JacksonValue
@Value.Immutable
public interface Car {

    @JsonProperty
    public abstract String manufacturer();

    @JsonProperty
    public abstract String model();

    @JsonProperty
    public abstract String description();

}
