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
 * Ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class Ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication {
  @SerializedName("lowValueExemptionIndicator")
  private String lowValueExemptionIndicator = null;

  @SerializedName("riskAnalysisExemptionIndicator")
  private String riskAnalysisExemptionIndicator = null;

  @SerializedName("trustedMerchantExemptionIndicator")
  private String trustedMerchantExemptionIndicator = null;

  @SerializedName("secureCorporatePaymentIndicator")
  private String secureCorporatePaymentIndicator = null;

  @SerializedName("delegatedAuthenticationExemptionIndicator")
  private String delegatedAuthenticationExemptionIndicator = null;

  public Ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication lowValueExemptionIndicator(String lowValueExemptionIndicator) {
    this.lowValueExemptionIndicator = lowValueExemptionIndicator;
    return this;
  }

   /**
   * This field will contain the low value exemption indicator with one of the following values: Possible values: - &#x60;0&#x60;  ( low value exemption does not apply to the transaction) - &#x60;1&#x60; (Transaction exempt from SCA as the merchant/acquirer has determined it to be a low value payment) 
   * @return lowValueExemptionIndicator
  **/
  @ApiModelProperty(value = "This field will contain the low value exemption indicator with one of the following values: Possible values: - `0`  ( low value exemption does not apply to the transaction) - `1` (Transaction exempt from SCA as the merchant/acquirer has determined it to be a low value payment) ")
  public String getLowValueExemptionIndicator() {
    return lowValueExemptionIndicator;
  }

  public void setLowValueExemptionIndicator(String lowValueExemptionIndicator) {
    this.lowValueExemptionIndicator = lowValueExemptionIndicator;
  }

  public Ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication riskAnalysisExemptionIndicator(String riskAnalysisExemptionIndicator) {
    this.riskAnalysisExemptionIndicator = riskAnalysisExemptionIndicator;
    return this;
  }

   /**
   * This field will contain the transaction risk analysis exemption indicator with one of the following values: Possible values: - &#x60;0&#x60;  (TRA exemption does not apply to the transaction) - &#x60;1&#x60; (Transaction exempt from SCA as the merchant/acquirer has determined it to be low risk in accordance with the criteria defined by PSD2/RTS) 
   * @return riskAnalysisExemptionIndicator
  **/
  @ApiModelProperty(value = "This field will contain the transaction risk analysis exemption indicator with one of the following values: Possible values: - `0`  (TRA exemption does not apply to the transaction) - `1` (Transaction exempt from SCA as the merchant/acquirer has determined it to be low risk in accordance with the criteria defined by PSD2/RTS) ")
  public String getRiskAnalysisExemptionIndicator() {
    return riskAnalysisExemptionIndicator;
  }

  public void setRiskAnalysisExemptionIndicator(String riskAnalysisExemptionIndicator) {
    this.riskAnalysisExemptionIndicator = riskAnalysisExemptionIndicator;
  }

  public Ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication trustedMerchantExemptionIndicator(String trustedMerchantExemptionIndicator) {
    this.trustedMerchantExemptionIndicator = trustedMerchantExemptionIndicator;
    return this;
  }

   /**
   * Possible values: - &#x60;0&#x60;  (Trusted merchant exemption does not apply to the transaction) - &#x60;1&#x60; (Transaction exempt from SCA as it originated at a merchant trusted by the cardholder) 
   * @return trustedMerchantExemptionIndicator
  **/
  @ApiModelProperty(value = "Possible values: - `0`  (Trusted merchant exemption does not apply to the transaction) - `1` (Transaction exempt from SCA as it originated at a merchant trusted by the cardholder) ")
  public String getTrustedMerchantExemptionIndicator() {
    return trustedMerchantExemptionIndicator;
  }

  public void setTrustedMerchantExemptionIndicator(String trustedMerchantExemptionIndicator) {
    this.trustedMerchantExemptionIndicator = trustedMerchantExemptionIndicator;
  }

  public Ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication secureCorporatePaymentIndicator(String secureCorporatePaymentIndicator) {
    this.secureCorporatePaymentIndicator = secureCorporatePaymentIndicator;
    return this;
  }

   /**
   * This field will contain the secure corporate payment exemption indicator with one of the following values: Possible values: - &#x60;0&#x60;  (SCA exemption does not apply to the transaction) - &#x60;1&#x60; (Transaction exempt from SCA as the merchant/acquirer has determined it as a secure corporate payment) 
   * @return secureCorporatePaymentIndicator
  **/
  @ApiModelProperty(value = "This field will contain the secure corporate payment exemption indicator with one of the following values: Possible values: - `0`  (SCA exemption does not apply to the transaction) - `1` (Transaction exempt from SCA as the merchant/acquirer has determined it as a secure corporate payment) ")
  public String getSecureCorporatePaymentIndicator() {
    return secureCorporatePaymentIndicator;
  }

  public void setSecureCorporatePaymentIndicator(String secureCorporatePaymentIndicator) {
    this.secureCorporatePaymentIndicator = secureCorporatePaymentIndicator;
  }

  public Ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication delegatedAuthenticationExemptionIndicator(String delegatedAuthenticationExemptionIndicator) {
    this.delegatedAuthenticationExemptionIndicator = delegatedAuthenticationExemptionIndicator;
    return this;
  }

   /**
   * This field will contain the delegated authentication exemption indicator with one of the following values: Possible values: - &#x60;0&#x60;  (delegated Authentication exemption does not apply to the transaction) - &#x60;1&#x60; (Transaction exempt from SCA as authentication has been delegated to other provider (PSP,Acquirer)) 
   * @return delegatedAuthenticationExemptionIndicator
  **/
  @ApiModelProperty(value = "This field will contain the delegated authentication exemption indicator with one of the following values: Possible values: - `0`  (delegated Authentication exemption does not apply to the transaction) - `1` (Transaction exempt from SCA as authentication has been delegated to other provider (PSP,Acquirer)) ")
  public String getDelegatedAuthenticationExemptionIndicator() {
    return delegatedAuthenticationExemptionIndicator;
  }

  public void setDelegatedAuthenticationExemptionIndicator(String delegatedAuthenticationExemptionIndicator) {
    this.delegatedAuthenticationExemptionIndicator = delegatedAuthenticationExemptionIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication = (Ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication) o;
    return Objects.equals(this.lowValueExemptionIndicator, ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication.lowValueExemptionIndicator) &&
        Objects.equals(this.riskAnalysisExemptionIndicator, ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication.riskAnalysisExemptionIndicator) &&
        Objects.equals(this.trustedMerchantExemptionIndicator, ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication.trustedMerchantExemptionIndicator) &&
        Objects.equals(this.secureCorporatePaymentIndicator, ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication.secureCorporatePaymentIndicator) &&
        Objects.equals(this.delegatedAuthenticationExemptionIndicator, ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication.delegatedAuthenticationExemptionIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowValueExemptionIndicator, riskAnalysisExemptionIndicator, trustedMerchantExemptionIndicator, secureCorporatePaymentIndicator, delegatedAuthenticationExemptionIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsConsumerAuthenticationInformationStrongAuthentication {\n");
    
    sb.append("    lowValueExemptionIndicator: ").append(toIndentedString(lowValueExemptionIndicator)).append("\n");
    sb.append("    riskAnalysisExemptionIndicator: ").append(toIndentedString(riskAnalysisExemptionIndicator)).append("\n");
    sb.append("    trustedMerchantExemptionIndicator: ").append(toIndentedString(trustedMerchantExemptionIndicator)).append("\n");
    sb.append("    secureCorporatePaymentIndicator: ").append(toIndentedString(secureCorporatePaymentIndicator)).append("\n");
    sb.append("    delegatedAuthenticationExemptionIndicator: ").append(toIndentedString(delegatedAuthenticationExemptionIndicator)).append("\n");
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

