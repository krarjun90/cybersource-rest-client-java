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
 * Riskv1authenticationsConsumerAuthenticationInformationStrongAuthentication
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class Riskv1authenticationsConsumerAuthenticationInformationStrongAuthentication {
  @SerializedName("authenticationIndicator")
  private String authenticationIndicator = null;

  public Riskv1authenticationsConsumerAuthenticationInformationStrongAuthentication authenticationIndicator(String authenticationIndicator) {
    this.authenticationIndicator = authenticationIndicator;
    return this;
  }

   /**
   * Indicates the type of Authentication request  01 - Payment transaction  02 - Recurring transaction  03 - Installment transaction  04 - Add card  05 - Maintain card  06 - Cardholder verification as part of EMV token ID and V 
   * @return authenticationIndicator
  **/
  @ApiModelProperty(value = "Indicates the type of Authentication request  01 - Payment transaction  02 - Recurring transaction  03 - Installment transaction  04 - Add card  05 - Maintain card  06 - Cardholder verification as part of EMV token ID and V ")
  public String getAuthenticationIndicator() {
    return authenticationIndicator;
  }

  public void setAuthenticationIndicator(String authenticationIndicator) {
    this.authenticationIndicator = authenticationIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsConsumerAuthenticationInformationStrongAuthentication riskv1authenticationsConsumerAuthenticationInformationStrongAuthentication = (Riskv1authenticationsConsumerAuthenticationInformationStrongAuthentication) o;
    return Objects.equals(this.authenticationIndicator, riskv1authenticationsConsumerAuthenticationInformationStrongAuthentication.authenticationIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsConsumerAuthenticationInformationStrongAuthentication {\n");
    
    sb.append("    authenticationIndicator: ").append(toIndentedString(authenticationIndicator)).append("\n");
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

