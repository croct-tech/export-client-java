/*
 * Croct Export
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: apis@croct.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.croct.client.export.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * The detailed information of a product.
 */
@JsonPropertyOrder({
  ProductDetails.JSON_PROPERTY_PRODUCT_ID,
  ProductDetails.JSON_PROPERTY_SKU,
  ProductDetails.JSON_PROPERTY_NAME,
  ProductDetails.JSON_PROPERTY_CATEGORY,
  ProductDetails.JSON_PROPERTY_BRAND,
  ProductDetails.JSON_PROPERTY_VARIANT,
  ProductDetails.JSON_PROPERTY_DISPLAY_PRICE,
  ProductDetails.JSON_PROPERTY_ORIGINAL_PRICE,
  ProductDetails.JSON_PROPERTY_URL,
  ProductDetails.JSON_PROPERTY_IMAGE_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class ProductDetails {
  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private String productId;

  public static final String JSON_PROPERTY_SKU = "sku";
  private String sku;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_VARIANT = "variant";
  private String variant;

  public static final String JSON_PROPERTY_DISPLAY_PRICE = "displayPrice";
  private Double displayPrice;

  public static final String JSON_PROPERTY_ORIGINAL_PRICE = "originalPrice";
  private Double originalPrice;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  private String imageUrl;

  public ProductDetails() { 
  }

  public ProductDetails productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The ID that uniquely identifies the product across the store, non-empty. For example, \&quot;3108\&quot; or \&quot;yO7q4r\&quot;.
   * @return productId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductId(String productId) {
    this.productId = productId;
  }


  public ProductDetails sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The code that uniquely identifies the product variant across the store, non-empty. For example, \&quot;IPH-GRE-64\&quot;.
   * @return sku
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSku() {
    return sku;
  }


  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSku(String sku) {
    this.sku = sku;
  }


  public ProductDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the product, non-empty. For example \&quot;iPhone\&quot;.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ProductDetails category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The category of the product, non-empty. For example, \&quot;Phone\&quot;.
   * @return category
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategory(String category) {
    this.category = category;
  }


  public ProductDetails brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand associated with the product. For example, \&quot;Apple\&quot;.
   * @return brand
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public ProductDetails variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * The variant of the product, such as size, color and style. For example, \&quot;64GB Green\&quot;.
   * @return variant
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVariant() {
    return variant;
  }


  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVariant(String variant) {
    this.variant = variant;
  }


  public ProductDetails displayPrice(Double displayPrice) {
    this.displayPrice = displayPrice;
    return this;
  }

   /**
   * The price of the product displayed in the store. For example, 59.90.
   * @return displayPrice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getDisplayPrice() {
    return displayPrice;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayPrice(Double displayPrice) {
    this.displayPrice = displayPrice;
  }


  public ProductDetails originalPrice(Double originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * The original price of the product. For example, 99.90.
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getOriginalPrice() {
    return originalPrice;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOriginalPrice(Double originalPrice) {
    this.originalPrice = originalPrice;
  }


  public ProductDetails url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the product page. For example, \&quot;https://apple.com/iphone\&quot;.
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ProductDetails imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The URL of the main product image. For example, \&quot;https://img.apple.com/iphone.png\&quot;.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getImageUrl() {
    return imageUrl;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  /**
   * Return true if this ProductDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetails productDetails = (ProductDetails) o;
    return Objects.equals(this.productId, productDetails.productId) &&
        Objects.equals(this.sku, productDetails.sku) &&
        Objects.equals(this.name, productDetails.name) &&
        Objects.equals(this.category, productDetails.category) &&
        Objects.equals(this.brand, productDetails.brand) &&
        Objects.equals(this.variant, productDetails.variant) &&
        Objects.equals(this.displayPrice, productDetails.displayPrice) &&
        Objects.equals(this.originalPrice, productDetails.originalPrice) &&
        Objects.equals(this.url, productDetails.url) &&
        Objects.equals(this.imageUrl, productDetails.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, sku, name, category, brand, variant, displayPrice, originalPrice, url, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetails {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

