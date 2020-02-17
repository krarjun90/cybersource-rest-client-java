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
 * Ptsv2paymentsidMerchantInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class Ptsv2paymentsidMerchantInformation {
  @SerializedName("transactionLocalDateTime")
  private String transactionLocalDateTime = null;

  public Ptsv2paymentsidMerchantInformation transactionLocalDateTime(String transactionLocalDateTime) {
    this.transactionLocalDateTime = transactionLocalDateTime;
    return this;
  }

   /**
   * Local date and time at your physical location. Include both the date and time in this field or leave it blank. This field is supported only for **CyberSource through VisaNet**.  For processor-specific information, see the &#x60;transaction_local_date_time&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  Format: &#x60;YYYYMMDDhhmmss&#x60;, where:   - YYYY &#x3D; year  - MM &#x3D; month  - DD &#x3D; day  - hh &#x3D; hour  - mm &#x3D; minutes  - ss &#x3D; seconds   For processor-specific information, see the &#x60;transaction_local_date_time&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return transactionLocalDateTime
  **/
  @ApiModelProperty(value = "Local date and time at your physical location. Include both the date and time in this field or leave it blank. This field is supported only for **CyberSource through VisaNet**.  For processor-specific information, see the `transaction_local_date_time` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  Format: `YYYYMMDDhhmmss`, where:   - YYYY = year  - MM = month  - DD = day  - hh = hour  - mm = minutes  - ss = seconds   For processor-specific information, see the `transaction_local_date_time` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getTransactionLocalDateTime() {
    return transactionLocalDateTime;
  }

  public void setTransactionLocalDateTime(String transactionLocalDateTime) {
    this.transactionLocalDateTime = transactionLocalDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidMerchantInformation ptsv2paymentsidMerchantInformation = (Ptsv2paymentsidMerchantInformation) o;
    return Objects.equals(this.transactionLocalDateTime, ptsv2paymentsidMerchantInformation.transactionLocalDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionLocalDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidMerchantInformation {\n");
    
    sb.append("    transactionLocalDateTime: ").append(toIndentedString(transactionLocalDateTime)).append("\n");
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

