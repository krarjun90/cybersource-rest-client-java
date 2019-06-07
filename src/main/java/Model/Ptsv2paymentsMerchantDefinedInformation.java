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
 * Ptsv2paymentsMerchantDefinedInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class Ptsv2paymentsMerchantDefinedInformation {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  public Ptsv2paymentsMerchantDefinedInformation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The name you assign for your merchant-defined data field.  #### CyberSource through VisaNet For installment payments with Mastercard in Brazil, use &#x60;merchantDefinedInformation[0].key&#x60; and &#x60;merchantDefinedInformation[1].key&#x60; for data that you want to provide to the issuer to identify the transaction.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return key
  **/
  @ApiModelProperty(value = "The name you assign for your merchant-defined data field.  #### CyberSource through VisaNet For installment payments with Mastercard in Brazil, use `merchantDefinedInformation[0].key` and `merchantDefinedInformation[1].key` for data that you want to provide to the issuer to identify the transaction.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Ptsv2paymentsMerchantDefinedInformation value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value you assign for your merchant-defined data field.  For details, see &#x60;merchant_defined_data1&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  **Warning** Merchant-defined data fields are not intended to and must not be used to capture personally identifying information. Accordingly, merchants are prohibited from capturing, obtaining, and/or transmitting any personally identifying information in or via the merchant-defined data fields. Personally identifying information includes, but is not limited to, address, credit card number, social security number, driver&#39;s license number, state-issued identification number, passport number, and card verification numbers (CVV, CVC2, CVV2, CID, CVN). In the event CyberSource discovers that a merchant is capturing and/or transmitting personally identifying information via the merchant-defined data fields, whether or not intentionally, CyberSource will immediately suspend the merchant&#39;s account, which will result in a rejection of any and all transaction requests submitted by the merchant after the point of suspension.  #### CyberSource through VisaNet For installment payments with Mastercard in Brazil, use &#x60;merchantDefinedInformation[0].value&#x60; and &#x60;merchantDefinedInformation[1].value&#x60; for data that you want to provide to the issuer to identify the transaction. For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  For installment payments with Mastercard in Brazil: - The value for merchantDefinedInformation[0].value corresponds to the following data in the TC 33 capture file5:   - Record: CP07 TCR5   - Position: 25-44   - Field: Reference Field 2 - The value for merchantDefinedInformation[1].value corresponds to the following data in the TC 33 capture file5:   - Record: CP07 TCR5   - Position: 45-64   - Field: Reference Field 3 
   * @return value
  **/
  @ApiModelProperty(value = "The value you assign for your merchant-defined data field.  For details, see `merchant_defined_data1` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  **Warning** Merchant-defined data fields are not intended to and must not be used to capture personally identifying information. Accordingly, merchants are prohibited from capturing, obtaining, and/or transmitting any personally identifying information in or via the merchant-defined data fields. Personally identifying information includes, but is not limited to, address, credit card number, social security number, driver's license number, state-issued identification number, passport number, and card verification numbers (CVV, CVC2, CVV2, CID, CVN). In the event CyberSource discovers that a merchant is capturing and/or transmitting personally identifying information via the merchant-defined data fields, whether or not intentionally, CyberSource will immediately suspend the merchant's account, which will result in a rejection of any and all transaction requests submitted by the merchant after the point of suspension.  #### CyberSource through VisaNet For installment payments with Mastercard in Brazil, use `merchantDefinedInformation[0].value` and `merchantDefinedInformation[1].value` for data that you want to provide to the issuer to identify the transaction. For details, see \"Installment Payments on CyberSource through VisaNet\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  For details, see \"Installment Payments on CyberSource through VisaNet\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  For installment payments with Mastercard in Brazil: - The value for merchantDefinedInformation[0].value corresponds to the following data in the TC 33 capture file5:   - Record: CP07 TCR5   - Position: 25-44   - Field: Reference Field 2 - The value for merchantDefinedInformation[1].value corresponds to the following data in the TC 33 capture file5:   - Record: CP07 TCR5   - Position: 45-64   - Field: Reference Field 3 ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsMerchantDefinedInformation ptsv2paymentsMerchantDefinedInformation = (Ptsv2paymentsMerchantDefinedInformation) o;
    return Objects.equals(this.key, ptsv2paymentsMerchantDefinedInformation.key) &&
        Objects.equals(this.value, ptsv2paymentsMerchantDefinedInformation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsMerchantDefinedInformation {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

