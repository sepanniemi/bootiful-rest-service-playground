package com.sepanniemi.bootiful.springfox.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Cars}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCars.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Cars"})
public final class ImmutableCars implements Cars {
  private final ImmutableList<Car> cars;

  private ImmutableCars(ImmutableList<Car> cars) {
    this.cars = cars;
  }

  /**
   * @return The value of the {@code cars} attribute
   */
  @JsonProperty
  @Override
  public ImmutableList<Car> cars() {
    return cars;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Cars#cars() cars}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCars withCars(Car... elements) {
    ImmutableList<Car> newValue = ImmutableList.copyOf(elements);
    return new ImmutableCars(newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Cars#cars() cars}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of cars elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCars withCars(Iterable<? extends Car> elements) {
    if (this.cars == elements) return this;
    ImmutableList<Car> newValue = ImmutableList.copyOf(elements);
    return new ImmutableCars(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCars} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCars
        && equalTo((ImmutableCars) another);
  }

  private boolean equalTo(ImmutableCars another) {
    return cars.equals(another.cars);
  }

  /**
   * Computes a hash code from attributes: {@code cars}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + cars.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Cars} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Cars")
        .omitNullValues()
        .add("cars", cars)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Cars {
    List<Car> cars = ImmutableList.of();
    @JsonProperty
    public void setCars(List<Car> cars) {
      this.cars = cars;
    }
    @Override
    public List<Car> cars() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCars fromJson(Json json) {
    ImmutableCars.Builder builder = ImmutableCars.builder();
    if (json.cars != null) {
      builder.addAllCars(json.cars);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Cars} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Cars instance
   */
  public static ImmutableCars copyOf(Cars instance) {
    if (instance instanceof ImmutableCars) {
      return (ImmutableCars) instance;
    }
    return ImmutableCars.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCars ImmutableCars}.
   * @return A new ImmutableCars builder
   */
  public static ImmutableCars.Builder builder() {
    return new ImmutableCars.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCars ImmutableCars}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private ImmutableList.Builder<Car> cars = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Cars} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Cars instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllCars(instance.cars());
      return this;
    }

    /**
     * Adds one element to {@link Cars#cars() cars} list.
     * @param element A cars element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCars(Car element) {
      this.cars.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Cars#cars() cars} list.
     * @param elements An array of cars elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCars(Car... elements) {
      this.cars.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Cars#cars() cars} list.
     * @param elements An iterable of cars elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty
    public final Builder cars(Iterable<? extends Car> elements) {
      this.cars = ImmutableList.builder();
      return addAllCars(elements);
    }

    /**
     * Adds elements to {@link Cars#cars() cars} list.
     * @param elements An iterable of cars elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllCars(Iterable<? extends Car> elements) {
      this.cars.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableCars ImmutableCars}.
     * @return An immutable instance of Cars
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCars build() {
      return new ImmutableCars(cars.build());
    }
  }
}
