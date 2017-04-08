package com.sepanniemi.bootiful.sample.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

import java.util.List;

/**
 * Created by sepanniemi on 08/12/16.
 */
@JacksonValue
@Value.Immutable
public interface Cars {
    @JsonProperty
    List<Car> cars();
}
