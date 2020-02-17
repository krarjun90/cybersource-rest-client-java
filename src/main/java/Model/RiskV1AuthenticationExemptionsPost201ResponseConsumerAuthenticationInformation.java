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
import Model.RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformationStrongAuthentication;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformation {
  @SerializedName("strongAuthentication")
  private RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformationStrongAuthentication strongAuthentication = null;

  public RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformation strongAuthentication(RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformationStrongAuthentication strongAuthentication) {
    this.strongAuthentication = strongAuthentication;
    return this;
  }

   /**
   * Get strongAuthentication
   * @return strongAuthentication
  **/
  @ApiModelProperty(value = "")
  public RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformationStrongAuthentication getStrongAuthentication() {
    return strongAuthentication;
  }

  public void setStrongAuthentication(RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformationStrongAuthentication strongAuthentication) {
    this.strongAuthentication = strongAuthentication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformation riskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformation = (RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformation) o;
    return Objects.equals(this.strongAuthentication, riskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformation.strongAuthentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strongAuthentication);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AuthenticationExemptionsPost201ResponseConsumerAuthenticationInformation {\n");
    
    sb.append("    strongAuthentication: ").append(toIndentedString(strongAuthentication)).append("\n");
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

