/*
 * Croct Export
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: apis@croct.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.croct.client.export.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The continent of the location.
 */
public enum LocationContinent {
  
  AF("AF"),
  
  AN("AN"),
  
  AS("AS"),
  
  EU("EU"),
  
  NA("NA"),
  
  OC("OC"),
  
  SA("SA");

  private String value;

  LocationContinent(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LocationContinent fromValue(String value) {
    for (LocationContinent b : LocationContinent.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

