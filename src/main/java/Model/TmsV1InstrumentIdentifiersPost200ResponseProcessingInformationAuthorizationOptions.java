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
import Model.TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptions {
  @SerializedName("initiator")
  private TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator initiator = null;

  public TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptions initiator(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Get initiator
   * @return initiator
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator getInitiator() {
    return initiator;
  }

  public void setInitiator(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator initiator) {
    this.initiator = initiator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptions tmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptions = (TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptions) o;
    return Objects.equals(this.initiator, tmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptions.initiator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptions {\n");
    
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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

