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
 * The category of the device.
 */
public enum DeviceCategory {
  
  DESKTOP("DESKTOP"),
  
  TABLET("TABLET"),
  
  MOBILE("MOBILE"),
  
  BOT("BOT"),
  
  OTHER("OTHER"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  DeviceCategory(String value) {
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
  public static DeviceCategory fromValue(String value) {
    for (DeviceCategory b : DeviceCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

