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
 * Riskv1authenticationexemptionsAcquirerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class Riskv1authenticationexemptionsAcquirerInformation {
  @SerializedName("acquirerBin")
  private String acquirerBin = null;

  public Riskv1authenticationexemptionsAcquirerInformation acquirerBin(String acquirerBin) {
    this.acquirerBin = acquirerBin;
    return this;
  }

   /**
   * Acquirer bank ID number that  corresponds to a certificate that Cybersource already has.This ID has this format. 4XXXXX for Visa and 5XXXXX for Mastercard. 
   * @return acquirerBin
  **/
  @ApiModelProperty(value = "Acquirer bank ID number that  corresponds to a certificate that Cybersource already has.This ID has this format. 4XXXXX for Visa and 5XXXXX for Mastercard. ")
  public String getAcquirerBin() {
    return acquirerBin;
  }

  public void setAcquirerBin(String acquirerBin) {
    this.acquirerBin = acquirerBin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationexemptionsAcquirerInformation riskv1authenticationexemptionsAcquirerInformation = (Riskv1authenticationexemptionsAcquirerInformation) o;
    return Objects.equals(this.acquirerBin, riskv1authenticationexemptionsAcquirerInformation.acquirerBin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirerBin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationexemptionsAcquirerInformation {\n");
    
    sb.append("    acquirerBin: ").append(toIndentedString(acquirerBin)).append("\n");
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

