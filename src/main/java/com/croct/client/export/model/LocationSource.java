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
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The source of information used to determine the location.
 */
public enum LocationSource {
  
  UNKNOWN("UNKNOWN"),
  
  IP("IP"),
  
  INPUT("INPUT"),
  
  BROWSER("BROWSER"),
  
  GPS("GPS");

  private String value;

  LocationSource(String value) {
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
  public static LocationSource fromValue(String value) {
    for (LocationSource b : LocationSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

