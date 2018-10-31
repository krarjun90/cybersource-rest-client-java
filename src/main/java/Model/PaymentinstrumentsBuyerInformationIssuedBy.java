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
 * PaymentinstrumentsBuyerInformationIssuedBy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class PaymentinstrumentsBuyerInformationIssuedBy {
  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  public PaymentinstrumentsBuyerInformationIssuedBy administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province where the identification was issued.
   * @return administrativeArea
  **/
  @ApiModelProperty(example = "CA", value = "State or province where the identification was issued.")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentinstrumentsBuyerInformationIssuedBy paymentinstrumentsBuyerInformationIssuedBy = (PaymentinstrumentsBuyerInformationIssuedBy) o;
    return Objects.equals(this.administrativeArea, paymentinstrumentsBuyerInformationIssuedBy.administrativeArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentinstrumentsBuyerInformationIssuedBy {\n");
    
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
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
