/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentinstrumentsBillTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class PaymentinstrumentsBillTo {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  public PaymentinstrumentsBillTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Bill to First Name.
   * @return firstName
  **/
  @ApiModelProperty(example = "John", value = "Bill to First Name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PaymentinstrumentsBillTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Bill to Last Name.
   * @return lastName
  **/
  @ApiModelProperty(example = "Smith", value = "Bill to Last Name.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PaymentinstrumentsBillTo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Bill to Company.
   * @return company
  **/
  @ApiModelProperty(example = "CyberSource", value = "Bill to Company.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public PaymentinstrumentsBillTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Bill to Address Line 1.
   * @return address1
  **/
  @ApiModelProperty(example = "12 Main Street", value = "Bill to Address Line 1.")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public PaymentinstrumentsBillTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Bill to Address Line 2.
   * @return address2
  **/
  @ApiModelProperty(example = "20 My Street", value = "Bill to Address Line 2.")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public PaymentinstrumentsBillTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Bill to City.
   * @return locality
  **/
  @ApiModelProperty(example = "Foster City", value = "Bill to City.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public PaymentinstrumentsBillTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Bill to State.
   * @return administrativeArea
  **/
  @ApiModelProperty(example = "CA", value = "Bill to State.")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public PaymentinstrumentsBillTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Bill to Postal Code.
   * @return postalCode
  **/
  @ApiModelProperty(example = "90200", value = "Bill to Postal Code.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PaymentinstrumentsBillTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Bill to Country. Accepts input in the ISO 3166-1 standard, stores as ISO 3166-1-Alpha-2
   * @return country
  **/
  @ApiModelProperty(example = "US", value = "Bill to Country. Accepts input in the ISO 3166-1 standard, stores as ISO 3166-1-Alpha-2")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PaymentinstrumentsBillTo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Valid Bill to Email.
   * @return email
  **/
  @ApiModelProperty(example = "john.smith@example.com", value = "Valid Bill to Email.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PaymentinstrumentsBillTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Bill to Phone Number.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "555123456", value = "Bill to Phone Number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentinstrumentsBillTo paymentinstrumentsBillTo = (PaymentinstrumentsBillTo) o;
    return Objects.equals(this.firstName, paymentinstrumentsBillTo.firstName) &&
        Objects.equals(this.lastName, paymentinstrumentsBillTo.lastName) &&
        Objects.equals(this.company, paymentinstrumentsBillTo.company) &&
        Objects.equals(this.address1, paymentinstrumentsBillTo.address1) &&
        Objects.equals(this.address2, paymentinstrumentsBillTo.address2) &&
        Objects.equals(this.locality, paymentinstrumentsBillTo.locality) &&
        Objects.equals(this.administrativeArea, paymentinstrumentsBillTo.administrativeArea) &&
        Objects.equals(this.postalCode, paymentinstrumentsBillTo.postalCode) &&
        Objects.equals(this.country, paymentinstrumentsBillTo.country) &&
        Objects.equals(this.email, paymentinstrumentsBillTo.email) &&
        Objects.equals(this.phoneNumber, paymentinstrumentsBillTo.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, company, address1, address2, locality, administrativeArea, postalCode, country, email, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentinstrumentsBillTo {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
