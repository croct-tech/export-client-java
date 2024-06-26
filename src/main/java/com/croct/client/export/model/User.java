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
import com.croct.client.export.model.UserAddress;
import com.croct.client.export.model.UserStatistics;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_USER_ID,
  User.JSON_PROPERTY_EXTERNAL_USER_ID,
  User.JSON_PROPERTY_FIRST_NAME,
  User.JSON_PROPERTY_LAST_NAME,
  User.JSON_PROPERTY_BIRTH_DATE,
  User.JSON_PROPERTY_GENDER,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_ALTERNATE_EMAIL,
  User.JSON_PROPERTY_PHONE,
  User.JSON_PROPERTY_ALTERNATE_PHONE,
  User.JSON_PROPERTY_ADDRESS,
  User.JSON_PROPERTY_AVATAR,
  User.JSON_PROPERTY_COMPANY,
  User.JSON_PROPERTY_COMPANY_URL,
  User.JSON_PROPERTY_JOB_TITLE,
  User.JSON_PROPERTY_ACTIVITIES,
  User.JSON_PROPERTY_INTERESTS,
  User.JSON_PROPERTY_CUSTOM_ATTRIBUTES,
  User.JSON_PROPERTY_LAST_MODIFIED_TIME,
  User.JSON_PROPERTY_STATISTICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class User {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private UUID userId;

  public static final String JSON_PROPERTY_EXTERNAL_USER_ID = "externalUserId";
  private JsonNullable<String> externalUserId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BIRTH_DATE = "birthDate";
  private JsonNullable<Long> birthDate = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_GENDER = "gender";
  private JsonNullable<String> gender = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ALTERNATE_EMAIL = "alternateEmail";
  private JsonNullable<String> alternateEmail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE = "phone";
  private JsonNullable<String> phone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ALTERNATE_PHONE = "alternatePhone";
  private JsonNullable<String> alternatePhone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private UserAddress address;

  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private JsonNullable<String> avatar = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPANY = "company";
  private JsonNullable<String> company = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPANY_URL = "companyUrl";
  private JsonNullable<String> companyUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_TITLE = "jobTitle";
  private JsonNullable<String> jobTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTIVITIES = "activities";
  private JsonNullable<String> activities = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INTERESTS = "interests";
  private JsonNullable<String> interests = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTES = "customAttributes";
  private Map<String, Object> customAttributes = new HashMap<>();

  public static final String JSON_PROPERTY_LAST_MODIFIED_TIME = "lastModifiedTime";
  private Long lastModifiedTime;

  public static final String JSON_PROPERTY_STATISTICS = "statistics";
  private UserStatistics statistics;

  public User() { 
  }

  public User userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The internal ID assigned to the user, unique across the workspace.
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public User externalUserId(String externalUserId) {
    this.externalUserId = JsonNullable.<String>of(externalUserId);
    return this;
  }

   /**
   * The external user ID that is used to identify the user on the application side, unique across the workspace. It is always null for anonymous users.
   * @return externalUserId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getExternalUserId() {
        return externalUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalUserId_JsonNullable() {
    return externalUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_USER_ID)
  public void setExternalUserId_JsonNullable(JsonNullable<String> externalUserId) {
    this.externalUserId = externalUserId;
  }

  public void setExternalUserId(String externalUserId) {
    this.externalUserId = JsonNullable.<String>of(externalUserId);
  }


  public User firstName(String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
    return this;
  }

   /**
   * The first name attribute.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFirstName() {
        return firstName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirstName_JsonNullable() {
    return firstName;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  public void setFirstName_JsonNullable(JsonNullable<String> firstName) {
    this.firstName = firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
  }


  public User lastName(String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    return this;
  }

   /**
   * The last name attribute.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLastName() {
        return lastName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastName_JsonNullable() {
    return lastName;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  public void setLastName_JsonNullable(JsonNullable<String> lastName) {
    this.lastName = lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
  }


  public User birthDate(Long birthDate) {
    this.birthDate = JsonNullable.<Long>of(birthDate);
    return this;
  }

   /**
   * The birth date attribute.
   * @return birthDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getBirthDate() {
        return birthDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BIRTH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getBirthDate_JsonNullable() {
    return birthDate;
  }
  
  @JsonProperty(JSON_PROPERTY_BIRTH_DATE)
  public void setBirthDate_JsonNullable(JsonNullable<Long> birthDate) {
    this.birthDate = birthDate;
  }

  public void setBirthDate(Long birthDate) {
    this.birthDate = JsonNullable.<Long>of(birthDate);
  }


  public User gender(String gender) {
    this.gender = JsonNullable.<String>of(gender);
    return this;
  }

   /**
   * The gender attribute.
   * @return gender
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getGender() {
        return gender.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGender_JsonNullable() {
    return gender;
  }
  
  @JsonProperty(JSON_PROPERTY_GENDER)
  public void setGender_JsonNullable(JsonNullable<String> gender) {
    this.gender = gender;
  }

  public void setGender(String gender) {
    this.gender = JsonNullable.<String>of(gender);
  }


  public User email(String email) {
    this.email = JsonNullable.<String>of(email);
    return this;
  }

   /**
   * The email attribute.
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(String email) {
    this.email = JsonNullable.<String>of(email);
  }


  public User alternateEmail(String alternateEmail) {
    this.alternateEmail = JsonNullable.<String>of(alternateEmail);
    return this;
  }

   /**
   * The alternate email attribute.
   * @return alternateEmail
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAlternateEmail() {
        return alternateEmail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALTERNATE_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAlternateEmail_JsonNullable() {
    return alternateEmail;
  }
  
  @JsonProperty(JSON_PROPERTY_ALTERNATE_EMAIL)
  public void setAlternateEmail_JsonNullable(JsonNullable<String> alternateEmail) {
    this.alternateEmail = alternateEmail;
  }

  public void setAlternateEmail(String alternateEmail) {
    this.alternateEmail = JsonNullable.<String>of(alternateEmail);
  }


  public User phone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
    return this;
  }

   /**
   * The phone attribute.
   * @return phone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPhone() {
        return phone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhone_JsonNullable() {
    return phone;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE)
  public void setPhone_JsonNullable(JsonNullable<String> phone) {
    this.phone = phone;
  }

  public void setPhone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
  }


  public User alternatePhone(String alternatePhone) {
    this.alternatePhone = JsonNullable.<String>of(alternatePhone);
    return this;
  }

   /**
   * The alternate phone attribute.
   * @return alternatePhone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAlternatePhone() {
        return alternatePhone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALTERNATE_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAlternatePhone_JsonNullable() {
    return alternatePhone;
  }
  
  @JsonProperty(JSON_PROPERTY_ALTERNATE_PHONE)
  public void setAlternatePhone_JsonNullable(JsonNullable<String> alternatePhone) {
    this.alternatePhone = alternatePhone;
  }

  public void setAlternatePhone(String alternatePhone) {
    this.alternatePhone = JsonNullable.<String>of(alternatePhone);
  }


  public User address(UserAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(UserAddress address) {
    this.address = address;
  }


  public User avatar(String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
    return this;
  }

   /**
   * The avatar attribute.
   * @return avatar
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAvatar() {
        return avatar.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAvatar_JsonNullable() {
    return avatar;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR)
  public void setAvatar_JsonNullable(JsonNullable<String> avatar) {
    this.avatar = avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
  }


  public User company(String company) {
    this.company = JsonNullable.<String>of(company);
    return this;
  }

   /**
   * The company attribute.
   * @return company
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCompany() {
        return company.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCompany_JsonNullable() {
    return company;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPANY)
  public void setCompany_JsonNullable(JsonNullable<String> company) {
    this.company = company;
  }

  public void setCompany(String company) {
    this.company = JsonNullable.<String>of(company);
  }


  public User companyUrl(String companyUrl) {
    this.companyUrl = JsonNullable.<String>of(companyUrl);
    return this;
  }

   /**
   * The company URL attribute.
   * @return companyUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCompanyUrl() {
        return companyUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPANY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCompanyUrl_JsonNullable() {
    return companyUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPANY_URL)
  public void setCompanyUrl_JsonNullable(JsonNullable<String> companyUrl) {
    this.companyUrl = companyUrl;
  }

  public void setCompanyUrl(String companyUrl) {
    this.companyUrl = JsonNullable.<String>of(companyUrl);
  }


  public User jobTitle(String jobTitle) {
    this.jobTitle = JsonNullable.<String>of(jobTitle);
    return this;
  }

   /**
   * The job title attribute.
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getJobTitle() {
        return jobTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJobTitle_JsonNullable() {
    return jobTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_TITLE)
  public void setJobTitle_JsonNullable(JsonNullable<String> jobTitle) {
    this.jobTitle = jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = JsonNullable.<String>of(jobTitle);
  }


  public User activities(String activities) {
    this.activities = JsonNullable.<String>of(activities);
    return this;
  }

   /**
   * The activities attribute.
   * @return activities
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getActivities() {
        return activities.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTIVITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getActivities_JsonNullable() {
    return activities;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTIVITIES)
  public void setActivities_JsonNullable(JsonNullable<String> activities) {
    this.activities = activities;
  }

  public void setActivities(String activities) {
    this.activities = JsonNullable.<String>of(activities);
  }


  public User interests(String interests) {
    this.interests = JsonNullable.<String>of(interests);
    return this;
  }

   /**
   * The interests attribute.
   * @return interests
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getInterests() {
        return interests.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInterests_JsonNullable() {
    return interests;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERESTS)
  public void setInterests_JsonNullable(JsonNullable<String> interests) {
    this.interests = interests;
  }

  public void setInterests(String interests) {
    this.interests = JsonNullable.<String>of(interests);
  }


  public User customAttributes(Map<String, Object> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public User putCustomAttributesItem(String key, Object customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new HashMap<>();
    }
    this.customAttributes.put(key, customAttributesItem);
    return this;
  }

   /**
   * The custom attributes.
   * @return customAttributes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getCustomAttributes() {
    return customAttributes;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomAttributes(Map<String, Object> customAttributes) {
    this.customAttributes = customAttributes;
  }


  public User lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * The timestamp when the user was last modified, in milliseconds since epoch. It is not updated on sync.
   * @return lastModifiedTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }


  public User statistics(UserStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserStatistics getStatistics() {
    return statistics;
  }


  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatistics(UserStatistics statistics) {
    this.statistics = statistics;
  }


  /**
   * Return true if this User object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userId, user.userId) &&
        equalsNullable(this.externalUserId, user.externalUserId) &&
        equalsNullable(this.firstName, user.firstName) &&
        equalsNullable(this.lastName, user.lastName) &&
        equalsNullable(this.birthDate, user.birthDate) &&
        equalsNullable(this.gender, user.gender) &&
        equalsNullable(this.email, user.email) &&
        equalsNullable(this.alternateEmail, user.alternateEmail) &&
        equalsNullable(this.phone, user.phone) &&
        equalsNullable(this.alternatePhone, user.alternatePhone) &&
        Objects.equals(this.address, user.address) &&
        equalsNullable(this.avatar, user.avatar) &&
        equalsNullable(this.company, user.company) &&
        equalsNullable(this.companyUrl, user.companyUrl) &&
        equalsNullable(this.jobTitle, user.jobTitle) &&
        equalsNullable(this.activities, user.activities) &&
        equalsNullable(this.interests, user.interests) &&
        Objects.equals(this.customAttributes, user.customAttributes) &&
        Objects.equals(this.lastModifiedTime, user.lastModifiedTime) &&
        Objects.equals(this.statistics, user.statistics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, hashCodeNullable(externalUserId), hashCodeNullable(firstName), hashCodeNullable(lastName), hashCodeNullable(birthDate), hashCodeNullable(gender), hashCodeNullable(email), hashCodeNullable(alternateEmail), hashCodeNullable(phone), hashCodeNullable(alternatePhone), address, hashCodeNullable(avatar), hashCodeNullable(company), hashCodeNullable(companyUrl), hashCodeNullable(jobTitle), hashCodeNullable(activities), hashCodeNullable(interests), customAttributes, lastModifiedTime, statistics);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    alternateEmail: ").append(toIndentedString(alternateEmail)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    alternatePhone: ").append(toIndentedString(alternatePhone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    companyUrl: ").append(toIndentedString(companyUrl)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

