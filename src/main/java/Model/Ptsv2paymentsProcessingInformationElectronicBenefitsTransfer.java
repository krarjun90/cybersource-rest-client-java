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
 * Ptsv2paymentsProcessingInformationElectronicBenefitsTransfer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class Ptsv2paymentsProcessingInformationElectronicBenefitsTransfer {
  @SerializedName("category")
  private String category = null;

  @SerializedName("voucherSerialNumber")
  private String voucherSerialNumber = null;

  public Ptsv2paymentsProcessingInformationElectronicBenefitsTransfer category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Flag that specifies the category for the EBT transaction.  Possible values: - &#x60;CASH&#x60;: Cash benefits, which can be used to purchase any item at a participating retailer, as well as to obtain cash-back or make a cash withdrawal from a participating ATM. - &#x60;FOOD&#x60;: Food stamp benefits, which can be used only to purchase food items authorized by the USDA SNAP program. 
   * @return category
  **/
  @ApiModelProperty(value = "Flag that specifies the category for the EBT transaction.  Possible values: - `CASH`: Cash benefits, which can be used to purchase any item at a participating retailer, as well as to obtain cash-back or make a cash withdrawal from a participating ATM. - `FOOD`: Food stamp benefits, which can be used only to purchase food items authorized by the USDA SNAP program. ")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Ptsv2paymentsProcessingInformationElectronicBenefitsTransfer voucherSerialNumber(String voucherSerialNumber) {
    this.voucherSerialNumber = voucherSerialNumber;
    return this;
  }

   /**
   * The serial number printed on the EBT voucher. 
   * @return voucherSerialNumber
  **/
  @ApiModelProperty(value = "The serial number printed on the EBT voucher. ")
  public String getVoucherSerialNumber() {
    return voucherSerialNumber;
  }

  public void setVoucherSerialNumber(String voucherSerialNumber) {
    this.voucherSerialNumber = voucherSerialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationElectronicBenefitsTransfer ptsv2paymentsProcessingInformationElectronicBenefitsTransfer = (Ptsv2paymentsProcessingInformationElectronicBenefitsTransfer) o;
    return Objects.equals(this.category, ptsv2paymentsProcessingInformationElectronicBenefitsTransfer.category) &&
        Objects.equals(this.voucherSerialNumber, ptsv2paymentsProcessingInformationElectronicBenefitsTransfer.voucherSerialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, voucherSerialNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationElectronicBenefitsTransfer {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    voucherSerialNumber: ").append(toIndentedString(voucherSerialNumber)).append("\n");
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

