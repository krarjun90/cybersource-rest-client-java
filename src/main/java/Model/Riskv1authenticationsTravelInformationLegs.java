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
 * Riskv1authenticationsTravelInformationLegs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class Riskv1authenticationsTravelInformationLegs {
  @SerializedName("origination")
  private String origination = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("carrierCode")
  private String carrierCode = null;

  @SerializedName("departureDate")
  private String departureDate = null;

  public Riskv1authenticationsTravelInformationLegs origination(String origination) {
    this.origination = origination;
    return this;
  }

   /**
   * Use to specify the airport code for the origin of the leg of the trip, which is designated by the pound (#) symbol in the field name. This code is usually three digits long, for example: SFO &#x3D; San Francisco. Do not use the colon (:) or the dash (-). For airport codes, see the IATA Airline and Airport Code Search. The leg number can be a positive integer from 0 to N. For example: &#x60;travelInformation.legs.0.origination&#x3D;SFO&#x60; &#x60;travelInformation.legs.1.origination&#x3D;SFO&#x60;  **Note** In your request, send either the complete route or the individual legs (&#x60;legs.0.origination&#x60; and &#x60;legs.n.destination&#x60;). If you send all the fields, the complete route takes precedence over the individual legs.  For details, see the &#x60;decision_manager_travel_leg#_orig&#x60; field description in [Decision Manager Using the SCMP API Developer Guide.](https://www.cybersource.com/developers/documentation/fraud_management/) 
   * @return origination
  **/
  @ApiModelProperty(value = "Use to specify the airport code for the origin of the leg of the trip, which is designated by the pound (#) symbol in the field name. This code is usually three digits long, for example: SFO = San Francisco. Do not use the colon (:) or the dash (-). For airport codes, see the IATA Airline and Airport Code Search. The leg number can be a positive integer from 0 to N. For example: `travelInformation.legs.0.origination=SFO` `travelInformation.legs.1.origination=SFO`  **Note** In your request, send either the complete route or the individual legs (`legs.0.origination` and `legs.n.destination`). If you send all the fields, the complete route takes precedence over the individual legs.  For details, see the `decision_manager_travel_leg#_orig` field description in [Decision Manager Using the SCMP API Developer Guide.](https://www.cybersource.com/developers/documentation/fraud_management/) ")
  public String getOrigination() {
    return origination;
  }

  public void setOrigination(String origination) {
    this.origination = origination;
  }

  public Riskv1authenticationsTravelInformationLegs destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Use to specify the airport code for the destination of the leg of the trip, which is designated by the pound (#) symbol in the field name. This code is usually three digits long, for example: SFO &#x3D; San Francisco. Do not use the colon (:) or the dash (-). For airport codes, see [IATA Airline and Airport Code Search](https://www.iata.org/publications/Pages/code-search.aspx). The leg number can be a positive integer from 0 to N. For example:  &#x60;travelInformation.legs.0.destination&#x3D;SFO&#x60; &#x60;travelInformation.legs.1.destination&#x3D;SFO&#x60;  **Note** In your request, send either the complete route or the individual legs (&#x60;legs.0.origination&#x60; and &#x60;legs.n.destination&#x60;). If you send all the fields, the complete route takes precedence over the individual legs.  For details, see the &#x60;decision_manager_travel_leg#_dest&#x60; field description in [Decision Manager Using the SCMP API Developer Guide.](https://www.cybersource.com/developers/documentation/fraud_management/) 
   * @return destination
  **/
  @ApiModelProperty(value = "Use to specify the airport code for the destination of the leg of the trip, which is designated by the pound (#) symbol in the field name. This code is usually three digits long, for example: SFO = San Francisco. Do not use the colon (:) or the dash (-). For airport codes, see [IATA Airline and Airport Code Search](https://www.iata.org/publications/Pages/code-search.aspx). The leg number can be a positive integer from 0 to N. For example:  `travelInformation.legs.0.destination=SFO` `travelInformation.legs.1.destination=SFO`  **Note** In your request, send either the complete route or the individual legs (`legs.0.origination` and `legs.n.destination`). If you send all the fields, the complete route takes precedence over the individual legs.  For details, see the `decision_manager_travel_leg#_dest` field description in [Decision Manager Using the SCMP API Developer Guide.](https://www.cybersource.com/developers/documentation/fraud_management/) ")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public Riskv1authenticationsTravelInformationLegs carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * International Air Transport Association (IATA) code for the carrier for this leg of the trip. Required for each leg. Required for American Express SafeKey (U.S.) for travel-related requests.  For details, see &#x60;airline_leg#_carrier_code&#x60; in [Airline Processing Using the SCMP API.] (https://apps.cybersource.com/library/documentation/dev_guides/Airline_SCMP_API/Airline_SCMP_API.pdf) 
   * @return carrierCode
  **/
  @ApiModelProperty(value = "International Air Transport Association (IATA) code for the carrier for this leg of the trip. Required for each leg. Required for American Express SafeKey (U.S.) for travel-related requests.  For details, see `airline_leg#_carrier_code` in [Airline Processing Using the SCMP API.] (https://apps.cybersource.com/library/documentation/dev_guides/Airline_SCMP_API/Airline_SCMP_API.pdf) ")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public Riskv1authenticationsTravelInformationLegs departureDate(String departureDate) {
    this.departureDate = departureDate;
    return this;
  }

   /**
   * Departure date for the first leg of the trip. Format: YYYYMMDD. Required for American Express SafeKey (U.S.) for travel-related requests.  For details, see &#x60;airline_leg#_leg_departure_date&#x60; in [Airline Processing Using the SCMP API.] (https://apps.cybersource.com/library/documentation/dev_guides/Airline_SCMP_API/Airline_SCMP_API.pdf) 
   * @return departureDate
  **/
  @ApiModelProperty(value = "Departure date for the first leg of the trip. Format: YYYYMMDD. Required for American Express SafeKey (U.S.) for travel-related requests.  For details, see `airline_leg#_leg_departure_date` in [Airline Processing Using the SCMP API.] (https://apps.cybersource.com/library/documentation/dev_guides/Airline_SCMP_API/Airline_SCMP_API.pdf) ")
  public String getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsTravelInformationLegs riskv1authenticationsTravelInformationLegs = (Riskv1authenticationsTravelInformationLegs) o;
    return Objects.equals(this.origination, riskv1authenticationsTravelInformationLegs.origination) &&
        Objects.equals(this.destination, riskv1authenticationsTravelInformationLegs.destination) &&
        Objects.equals(this.carrierCode, riskv1authenticationsTravelInformationLegs.carrierCode) &&
        Objects.equals(this.departureDate, riskv1authenticationsTravelInformationLegs.departureDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origination, destination, carrierCode, departureDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsTravelInformationLegs {\n");
    
    sb.append("    origination: ").append(toIndentedString(origination)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
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
