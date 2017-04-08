package com.sepanniemi.bootiful.springfox.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by sepanniemi on 08/12/16.
 */
@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@JsonSerialize // Jackson automatic integration, why not?
@Value.Style(
        typeAbstract = "*",
        typeImmutable = "Immutable*",
        visibility = Value.Style.ImplementationVisibility.PUBLIC)
@interface JacksonValue {
}
