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
import Model.RiskV1DecisionsPost201ResponseRiskInformationProvidersProviderName;
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
 * RiskV1DecisionsPost201ResponseRiskInformationProviders
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class RiskV1DecisionsPost201ResponseRiskInformationProviders {
  @SerializedName("providerName")
  private List<RiskV1DecisionsPost201ResponseRiskInformationProvidersProviderName> providerName = null;

  public RiskV1DecisionsPost201ResponseRiskInformationProviders providerName(List<RiskV1DecisionsPost201ResponseRiskInformationProvidersProviderName> providerName) {
    this.providerName = providerName;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationProviders addProviderNameItem(RiskV1DecisionsPost201ResponseRiskInformationProvidersProviderName providerNameItem) {
    if (this.providerName == null) {
      this.providerName = new ArrayList<RiskV1DecisionsPost201ResponseRiskInformationProvidersProviderName>();
    }
    this.providerName.add(providerNameItem);
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  @ApiModelProperty(value = "")
  public List<RiskV1DecisionsPost201ResponseRiskInformationProvidersProviderName> getProviderName() {
    return providerName;
  }

  public void setProviderName(List<RiskV1DecisionsPost201ResponseRiskInformationProvidersProviderName> providerName) {
    this.providerName = providerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost201ResponseRiskInformationProviders riskV1DecisionsPost201ResponseRiskInformationProviders = (RiskV1DecisionsPost201ResponseRiskInformationProviders) o;
    return Objects.equals(this.providerName, riskV1DecisionsPost201ResponseRiskInformationProviders.providerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost201ResponseRiskInformationProviders {\n");
    
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
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

