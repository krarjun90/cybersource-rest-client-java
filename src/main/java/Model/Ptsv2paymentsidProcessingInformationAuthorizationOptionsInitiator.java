/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidProcessingInformationAuthorizationOptionsInitiator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class Ptsv2paymentsidProcessingInformationAuthorizationOptionsInitiator {
  @SerializedName("storedCredentialUsed")
  private Boolean storedCredentialUsed = null;

  public Ptsv2paymentsidProcessingInformationAuthorizationOptionsInitiator storedCredentialUsed(Boolean storedCredentialUsed) {
    this.storedCredentialUsed = storedCredentialUsed;
    return this;
  }

   /**
   * Indicates to an issuing bank whether a merchant-initiated transaction came from a card that was already stored on file.  Possible values: - **true** means the merchant-initiated transaction came from a card that was already stored on file. - **false**  means the merchant-initiated transaction came from a card that was not stored on file. 
   * @return storedCredentialUsed
  **/
  @ApiModelProperty(value = "Indicates to an issuing bank whether a merchant-initiated transaction came from a card that was already stored on file.  Possible values: - **true** means the merchant-initiated transaction came from a card that was already stored on file. - **false**  means the merchant-initiated transaction came from a card that was not stored on file. ")
  public Boolean getStoredCredentialUsed() {
    return storedCredentialUsed;
  }

  public void setStoredCredentialUsed(Boolean storedCredentialUsed) {
    this.storedCredentialUsed = storedCredentialUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidProcessingInformationAuthorizationOptionsInitiator ptsv2paymentsidProcessingInformationAuthorizationOptionsInitiator = (Ptsv2paymentsidProcessingInformationAuthorizationOptionsInitiator) o;
    return Objects.equals(this.storedCredentialUsed, ptsv2paymentsidProcessingInformationAuthorizationOptionsInitiator.storedCredentialUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storedCredentialUsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidProcessingInformationAuthorizationOptionsInitiator {\n");
    
    sb.append("    storedCredentialUsed: ").append(toIndentedString(storedCredentialUsed)).append("\n");
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

