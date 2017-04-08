package com.sepanniemi.bootiful.springfox.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Car}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCar.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Car"})
public final class ImmutableCar implements Car {
  private final String manufacturer;
  private final String model;
  private final String description;

  private ImmutableCar(String manufacturer, String model, String description) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.description = description;
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @JsonProperty
  @Override
  public String manufacturer() {
    return manufacturer;
  }

  /**
   * @return The value of the {@code model} attribute
   */
  @JsonProperty
  @Override
  public String model() {
    return model;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty
  @Override
  public String description() {
    return description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Car#manufacturer() manufacturer} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for manufacturer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCar withManufacturer(String value) {
    if (this.manufacturer.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "manufacturer");
    return new ImmutableCar(newValue, this.model, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Car#model() model} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for model
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCar withModel(String value) {
    if (this.model.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "model");
    return new ImmutableCar(this.manufacturer, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Car#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCar withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "description");
    return new ImmutableCar(this.manufacturer, this.model, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCar} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCar
        && equalTo((ImmutableCar) another);
  }

  private boolean equalTo(ImmutableCar another) {
    return manufacturer.equals(another.manufacturer)
        && model.equals(another.model)
        && description.equals(another.description);
  }

  /**
   * Computes a hash code from attributes: {@code manufacturer}, {@code model}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + manufacturer.hashCode();
    h = h * 17 + model.hashCode();
    h = h * 17 + description.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Car} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Car")
        .omitNullValues()
        .add("manufacturer", manufacturer)
        .add("model", model)
        .add("description", description)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Car {
    String manufacturer;
    String model;
    String description;
    @JsonProperty
    public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
    }
    @JsonProperty
    public void setModel(String model) {
      this.model = model;
    }
    @JsonProperty
    public void setDescription(String description) {
      this.description = description;
    }
    @Override
    public String manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public String model() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCar fromJson(Json json) {
    ImmutableCar.Builder builder = ImmutableCar.builder();
    if (json.manufacturer != null) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.model != null) {
      builder.model(json.model);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Car} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Car instance
   */
  public static ImmutableCar copyOf(Car instance) {
    if (instance instanceof ImmutableCar) {
      return (ImmutableCar) instance;
    }
    return ImmutableCar.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCar ImmutableCar}.
   * @return A new ImmutableCar builder
   */
  public static ImmutableCar.Builder builder() {
    return new ImmutableCar.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCar ImmutableCar}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_MANUFACTURER = 0x1L;
    private static final long INIT_BIT_MODEL = 0x2L;
    private static final long INIT_BIT_DESCRIPTION = 0x4L;
    private long initBits = 0x7L;

    private String manufacturer;
    private String model;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Car} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Car instance) {
      Preconditions.checkNotNull(instance, "instance");
      manufacturer(instance.manufacturer());
      model(instance.model());
      description(instance.description());
      return this;
    }

    /**
     * Initializes the value for the {@link Car#manufacturer() manufacturer} attribute.
     * @param manufacturer The value for manufacturer 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty
    public final Builder manufacturer(String manufacturer) {
      this.manufacturer = Preconditions.checkNotNull(manufacturer, "manufacturer");
      initBits &= ~INIT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the value for the {@link Car#model() model} attribute.
     * @param model The value for model 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty
    public final Builder model(String model) {
      this.model = Preconditions.checkNotNull(model, "model");
      initBits &= ~INIT_BIT_MODEL;
      return this;
    }

    /**
     * Initializes the value for the {@link Car#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty
    public final Builder description(String description) {
      this.description = Preconditions.checkNotNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCar ImmutableCar}.
     * @return An immutable instance of Car
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCar build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCar(manufacturer, model, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_MANUFACTURER) != 0) attributes.add("manufacturer");
      if ((initBits & INIT_BIT_MODEL) != 0) attributes.add("model");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      return "Cannot build Car, some of required attributes are not set " + attributes;
    }
  }
}
