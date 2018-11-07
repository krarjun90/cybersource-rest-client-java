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
import Model.InlineResponse201ErrorInformationDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20012ErrorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse20012ErrorInformation {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<InlineResponse201ErrorInformationDetails> details = null;

  public InlineResponse20012ErrorInformation reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return reason
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public InlineResponse20012ErrorInformation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return message
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse20012ErrorInformation details(List<InlineResponse201ErrorInformationDetails> details) {
    this.details = details;
    return this;
  }

  public InlineResponse20012ErrorInformation addDetailsItem(InlineResponse201ErrorInformationDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<InlineResponse201ErrorInformationDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse201ErrorInformationDetails> getDetails() {
    return details;
  }

  public void setDetails(List<InlineResponse201ErrorInformationDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012ErrorInformation inlineResponse20012ErrorInformation = (InlineResponse20012ErrorInformation) o;
    return Objects.equals(this.reason, inlineResponse20012ErrorInformation.reason) &&
        Objects.equals(this.message, inlineResponse20012ErrorInformation.message) &&
        Objects.equals(this.details, inlineResponse20012ErrorInformation.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012ErrorInformation {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
