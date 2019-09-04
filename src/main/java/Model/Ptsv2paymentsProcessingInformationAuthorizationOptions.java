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
import Model.Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator;
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
 * Ptsv2paymentsProcessingInformationAuthorizationOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-26T18:32:32.437+05:30")
public class Ptsv2paymentsProcessingInformationAuthorizationOptions {
  @SerializedName("authType")
  private String authType = null;

  @SerializedName("verbalAuthCode")
  private String verbalAuthCode = null;

  @SerializedName("verbalAuthTransactionId")
  private String verbalAuthTransactionId = null;

  @SerializedName("authIndicator")
  private String authIndicator = null;

  @SerializedName("partialAuthIndicator")
  private Boolean partialAuthIndicator = null;

  @SerializedName("balanceInquiry")
  private Boolean balanceInquiry = null;

  @SerializedName("ignoreAvsResult")
  private Boolean ignoreAvsResult = false;

  @SerializedName("declineAvsFlags")
  private List<String> declineAvsFlags = null;

  @SerializedName("ignoreCvResult")
  private Boolean ignoreCvResult = false;

  @SerializedName("initiator")
  private Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator initiator = null;

  @SerializedName("billPayment")
  private Boolean billPayment = null;

  @SerializedName("billPaymentType")
  private String billPaymentType = null;

  public Ptsv2paymentsProcessingInformationAuthorizationOptions authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Authorization type. Possible values:   - &#x60;AUTOCAPTURE&#x60;: automatic capture.  - &#x60;STANDARDCAPTURE&#x60;: standard capture.  - &#x60;VERBAL&#x60;: forced capture. Include it in the payment request for a forced capture. Include it in the capture request for a verbal payment.  #### Asia, Middle East, and Africa Gateway; Cielo; Comercio Latino; and CyberSource Latin American Processing Set this field to &#x60;AUTOCAPTURE&#x60; and include it in a bundled request to indicate that you are requesting an automatic capture. If your account is configured to enable automatic captures, set this field to &#x60;STANDARDCAPTURE&#x60; and include it in a standard authorization or bundled request to indicate that you are overriding an automatic capture. For more information, see the &#x60;auth_type&#x60; field description in [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### Forced Capture Set this field to &#x60;VERBAL&#x60; and include it in the authorization request to indicate that you are performing a forced capture; therefore, you receive the authorization code outside the CyberSource system.  For more information, see \&quot;Forced Captures\&quot; in [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm).  #### Verbal Authorization Set this field to &#x60;VERBAL&#x60; and include it in the capture request to indicate that the request is for a verbal authorization. For more information, see \&quot;Verbal Authorizations\&quot; in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html).  For processor-specific information, see the &#x60;auth_type&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return authType
  **/
  @ApiModelProperty(value = "Authorization type. Possible values:   - `AUTOCAPTURE`: automatic capture.  - `STANDARDCAPTURE`: standard capture.  - `VERBAL`: forced capture. Include it in the payment request for a forced capture. Include it in the capture request for a verbal payment.  #### Asia, Middle East, and Africa Gateway; Cielo; Comercio Latino; and CyberSource Latin American Processing Set this field to `AUTOCAPTURE` and include it in a bundled request to indicate that you are requesting an automatic capture. If your account is configured to enable automatic captures, set this field to `STANDARDCAPTURE` and include it in a standard authorization or bundled request to indicate that you are overriding an automatic capture. For more information, see the `auth_type` field description in [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### Forced Capture Set this field to `VERBAL` and include it in the authorization request to indicate that you are performing a forced capture; therefore, you receive the authorization code outside the CyberSource system.  For more information, see \"Forced Captures\" in [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm).  #### Verbal Authorization Set this field to `VERBAL` and include it in the capture request to indicate that the request is for a verbal authorization. For more information, see \"Verbal Authorizations\" in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html).  For processor-specific information, see the `auth_type` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions verbalAuthCode(String verbalAuthCode) {
    this.verbalAuthCode = verbalAuthCode;
    return this;
  }

   /**
   * Authorization code.  #### Forced Capture Use this field to send the authorization code you received from a payment that you authorized outside the CyberSource system.  #### Verbal Authorization Use this field in CAPTURE API to send the verbally received authorization code.  For processor-specific information, see the &#x60;auth_code&#x60; field description in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html). 
   * @return verbalAuthCode
  **/
  @ApiModelProperty(value = "Authorization code.  #### Forced Capture Use this field to send the authorization code you received from a payment that you authorized outside the CyberSource system.  #### Verbal Authorization Use this field in CAPTURE API to send the verbally received authorization code.  For processor-specific information, see the `auth_code` field description in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html). ")
  public String getVerbalAuthCode() {
    return verbalAuthCode;
  }

  public void setVerbalAuthCode(String verbalAuthCode) {
    this.verbalAuthCode = verbalAuthCode;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions verbalAuthTransactionId(String verbalAuthTransactionId) {
    this.verbalAuthTransactionId = verbalAuthTransactionId;
    return this;
  }

   /**
   * Transaction ID (TID).  #### FDMS South This field is required for verbal authorizations and forced captures with the American Express card type to comply with the CAPN requirements: - Forced capture: Obtain the value for this field from the authorization response. - Verbal authorization: You cannot obtain a value for this field so CyberSource uses the default value of &#x60;000000000000000&#x60; (15 zeros).  For more information about using this default value, see \&quot;Verbal Authorizations\&quot; in [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return verbalAuthTransactionId
  **/
  @ApiModelProperty(value = "Transaction ID (TID).  #### FDMS South This field is required for verbal authorizations and forced captures with the American Express card type to comply with the CAPN requirements: - Forced capture: Obtain the value for this field from the authorization response. - Verbal authorization: You cannot obtain a value for this field so CyberSource uses the default value of `000000000000000` (15 zeros).  For more information about using this default value, see \"Verbal Authorizations\" in [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getVerbalAuthTransactionId() {
    return verbalAuthTransactionId;
  }

  public void setVerbalAuthTransactionId(String verbalAuthTransactionId) {
    this.verbalAuthTransactionId = verbalAuthTransactionId;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions authIndicator(String authIndicator) {
    this.authIndicator = authIndicator;
    return this;
  }

   /**
   * Flag that specifies the purpose of the authorization.  Possible values:  - **0**: Preauthorization  - **1**: Final authorization  To set the default for this field, contact CyberSource Customer Support. For details, see \&quot;Final Authorization Indicator\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm).  #### Barclays and Elavon The default for Barclays and Elavon is 1 (final authorization). To change the default for this field, contact CyberSource Customer Support.  #### CyberSource through VisaNet When the value for this field is 0, it corresponds to the following data in the TC 33 capture file5:  - Record: CP01 TCR0  - Position: 164  - Field: Additional Authorization Indicators When the value for this field is 1, it does not correspond to any data in the TC 33 capture file.  For processor-specific information, see the &#x60;auth_indicator&#x60; field in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html). 
   * @return authIndicator
  **/
  @ApiModelProperty(value = "Flag that specifies the purpose of the authorization.  Possible values:  - **0**: Preauthorization  - **1**: Final authorization  To set the default for this field, contact CyberSource Customer Support. For details, see \"Final Authorization Indicator\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm).  #### Barclays and Elavon The default for Barclays and Elavon is 1 (final authorization). To change the default for this field, contact CyberSource Customer Support.  #### CyberSource through VisaNet When the value for this field is 0, it corresponds to the following data in the TC 33 capture file5:  - Record: CP01 TCR0  - Position: 164  - Field: Additional Authorization Indicators When the value for this field is 1, it does not correspond to any data in the TC 33 capture file.  For processor-specific information, see the `auth_indicator` field in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html). ")
  public String getAuthIndicator() {
    return authIndicator;
  }

  public void setAuthIndicator(String authIndicator) {
    this.authIndicator = authIndicator;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions partialAuthIndicator(Boolean partialAuthIndicator) {
    this.partialAuthIndicator = partialAuthIndicator;
    return this;
  }

   /**
   * Flag that indicates whether the transaction is enabled for partial authorization or not. When your request includes this field, this value overrides the information in your CyberSource account.  For processor-specific information, see the &#x60;auth_partial_auth_indicator&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  #### CyberSource through VisaNet To set the default for this field, contact CyberSource Customer Support. The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR0 - Position: 164 - Field: Additional Authorization Indicators  Possible values: - **true** Enable the transaction for partial authorization. - **false** Do not enable the transaction for partial authorization. 
   * @return partialAuthIndicator
  **/
  @ApiModelProperty(value = "Flag that indicates whether the transaction is enabled for partial authorization or not. When your request includes this field, this value overrides the information in your CyberSource account.  For processor-specific information, see the `auth_partial_auth_indicator` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  #### CyberSource through VisaNet To set the default for this field, contact CyberSource Customer Support. The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR0 - Position: 164 - Field: Additional Authorization Indicators  Possible values: - **true** Enable the transaction for partial authorization. - **false** Do not enable the transaction for partial authorization. ")
  public Boolean getPartialAuthIndicator() {
    return partialAuthIndicator;
  }

  public void setPartialAuthIndicator(Boolean partialAuthIndicator) {
    this.partialAuthIndicator = partialAuthIndicator;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions balanceInquiry(Boolean balanceInquiry) {
    this.balanceInquiry = balanceInquiry;
    return this;
  }

   /**
   * Flag that indicates whether to return balance information.  Possible values: - **true** - **false** 
   * @return balanceInquiry
  **/
  @ApiModelProperty(value = "Flag that indicates whether to return balance information.  Possible values: - **true** - **false** ")
  public Boolean getBalanceInquiry() {
    return balanceInquiry;
  }

  public void setBalanceInquiry(Boolean balanceInquiry) {
    this.balanceInquiry = balanceInquiry;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions ignoreAvsResult(Boolean ignoreAvsResult) {
    this.ignoreAvsResult = ignoreAvsResult;
    return this;
  }

   /**
   * Flag that indicates whether to allow the capture service to run, even when the payment receives an AVS decline.  Possible values: - **true**  Ignore the results of AVS checking and run the capture service. - **false**  (default): If the authorization receives an AVS decline, do not run the capture service. 
   * @return ignoreAvsResult
  **/
  @ApiModelProperty(value = "Flag that indicates whether to allow the capture service to run, even when the payment receives an AVS decline.  Possible values: - **true**  Ignore the results of AVS checking and run the capture service. - **false**  (default): If the authorization receives an AVS decline, do not run the capture service. ")
  public Boolean getIgnoreAvsResult() {
    return ignoreAvsResult;
  }

  public void setIgnoreAvsResult(Boolean ignoreAvsResult) {
    this.ignoreAvsResult = ignoreAvsResult;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions declineAvsFlags(List<String> declineAvsFlags) {
    this.declineAvsFlags = declineAvsFlags;
    return this;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions addDeclineAvsFlagsItem(String declineAvsFlagsItem) {
    if (this.declineAvsFlags == null) {
      this.declineAvsFlags = new ArrayList<String>();
    }
    this.declineAvsFlags.add(declineAvsFlagsItem);
    return this;
  }

   /**
   * Comma-separated list of AVS flags that cause the reply flag &#x60;DAVSNO&#x60; to be returned.  **Important** To receive declines for the AVS code &#x60;N&#x60;, you must include the value &#x60;N&#x60; in the comma-separated list.  ### AVS Codes for Cielo 3.0 and CyberSource Latin American Processing  **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this section is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports.  |AVS Code|Description| |--- |--- | |D|Partial match: postal code and address match.| |E|Not supported: AVS is not supported for this card type. _or_ Invalid: the acquirer returned an unrecognized value for the AVS response.| |F|Partial match: postal code matches, but CPF and address do not match.*| |G|Not supported: AVS not supported or not verified.| |I|No match: AVS information is not available.| |K|Partial match: CPF matches, but postal code and address do not match.*| |L|Partial match: postal code and CPF match, but address does not match.*| |N|No match: postal code, CPF, and address do not match.*| |O|Partial match: CPF and address match, but postal code does not match.*| |R|Not supported: your implementation does not support AVS _or_ System unavailable.| |T|Partial match: address matches, but postal code and CPF do not match.*| |V|Match: postal code, CPF, and address match.*| |* CPF (Cadastro de Pessoas Fisicas) is required only for Redecard in Brazil.||  ### AVS Codes for All Other Processors  **Note** The list of AVS codes for all other processors follows these descriptions of the processor-specific information for these codes.  #### American Express Cards For American Express cards only, you can receive Visa and CyberSource AVS codes in addition to the American Express AVS codes.  **Note** For CyberSource through VisaNet, the American Express AVS codes are converted to Visa AVS codes before they are returned to you. As a result, you will not receive American Express AVS codes for the American Express card type.&lt;br/&gt;&lt;br/&gt;  _American Express Card codes_: &#x60;F&#x60;, &#x60;H&#x60;, &#x60;K&#x60;, &#x60;L&#x60;, &#x60;O&#x60;, &#x60;T&#x60;, &#x60;V&#x60;  #### Domestic and International Visa Cards The international and domestic alphabetic AVS codes are the Visa standard AVS codes. CyberSource maps the standard AVS return codes for other types of payment cards, including American Express cards, to the Visa standard AVS codes.  AVS is considered either domestic or international, depending on the location of the bank that issued the customer&#39;s payment card: - When the bank is in the U.S., the AVS is domestic. - When the bank is outside the U.S., the AVS is international.  You should be prepared to handle both domestic and international AVS result codes: - For international cards, you can receive domestic AVS codes in addition to the international AVS codes. - For domestic cards, you can receive international AVS codes in addition to the domestic AVS codes.  _International Visa Codes_: &#x60;B&#x60;, &#x60;C&#x60;, &#x60;D&#x60;, &#x60;G&#x60;, &#x60;I&#x60;, &#x60;M&#x60;, &#x60;P&#x60;  _Domestic Visa Codes_: &#x60;A&#x60;, &#x60;E&#x60;,&#x60;N&#x60;, &#x60;R&#x60;, &#x60;S&#x60;, &#x60;U&#x60;, &#x60;W&#x60;, &#x60;X&#x60;, &#x60;Y&#x60;, &#x60;Z&#x60;  #### CyberSource Codes The numeric AVS codes are created by CyberSource and are not standard Visa codes. These AVS codes can be returned for any card type.  _CyberSource Codes_: &#x60;1&#x60;, &#x60;2&#x60;, &#x60;3&#x60;, &#x60;4&#x60;  ### Table of AVS Codes for All Other Processors  |AVS Code|Description| |--- |--- | |A|Partial match: street address matches, but 5-digit and 9-digit postal codes do not match.| |B|Partial match: street address matches, but postal code is not verified. Returned only for Visa cards not issued in the U.S.| |C|No match: street address and postal code do not match. Returned only for Visa cards not issued in the U.S.| |D &amp; M|Match: street address and postal code match. Returned only for Visa cards not issued in the U.S.| |E|Invalid: AVS data is invalid or AVS is not allowed for this card type.| |F|Partial match: card member’s name does not match, but billing postal code matches.| |G|Not supported: issuing bank outside the U.S. does not support AVS.| |H|Partial match: card member’s name does not match, but street address and postal code match. Returned only for the American Express card type.| |I|No match: address not verified. Returned only for Visa cards not issued in the U.S.| |K|Partial match: card member’s name matches, but billing address and billing postal code do not match. Returned only for the American Express card type.| |L|Partial match: card member’s name and billing postal code match, but billing address does not match. Returned only for the American Express card type.| |M|See the entry for D &amp; M.| |N|No match: one of the following: street address and postal code do not match _or_ (American Express card type only) card member’s name, street address, and postal code do not match.| |O|Partial match: card member’s name and billing address match, but billing postal code does not match. Returned only for the American Express card type.| |P|Partial match: postal code matches, but street address not verified. Returned only for Visa cards not issued in the U.S.| |R|System unavailable.| |S|Not supported: issuing bank in the U.S. does not support AVS.| |T|Partial match: card member’s name does not match, but street address matches. Returned only for the American Express card type.| |U|System unavailable: address information unavailable for one of these reasons: The U.S. bank does not support AVS outside the U.S. _or_ The AVS in a U.S. bank is not functioning properly.| |V|Match: card member’s name, billing address, and billing postal code match. Returned only for the American Express card type.| |W|Partial match: street address does not match, but 9-digit postal code matches.| |X|Match: street address and 9-digit postal code match.| |Y|Match: street address and 5-digit postal code match.| |Z|Partial match: street address does not match, but 5-digit postal code matches.| |1|Not supported: one of the following: AVS is not supported for this processor or card type _or_ AVS is disabled for your CyberSource account. To enable AVS, contact CyberSource Customer Support.| |2|Unrecognized: the processor returned an unrecognized value for the AVS response.| |3|Match: address is confirmed. Returned only for PayPal Express Checkout.| |4|No match: address is not confirmed. Returned only for PayPal Express Checkout.| |5|No match: no AVS code was returned by the processor.| 
   * @return declineAvsFlags
  **/
  @ApiModelProperty(value = "Comma-separated list of AVS flags that cause the reply flag `DAVSNO` to be returned.  **Important** To receive declines for the AVS code `N`, you must include the value `N` in the comma-separated list.  ### AVS Codes for Cielo 3.0 and CyberSource Latin American Processing  **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this section is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports.  |AVS Code|Description| |--- |--- | |D|Partial match: postal code and address match.| |E|Not supported: AVS is not supported for this card type. _or_ Invalid: the acquirer returned an unrecognized value for the AVS response.| |F|Partial match: postal code matches, but CPF and address do not match.*| |G|Not supported: AVS not supported or not verified.| |I|No match: AVS information is not available.| |K|Partial match: CPF matches, but postal code and address do not match.*| |L|Partial match: postal code and CPF match, but address does not match.*| |N|No match: postal code, CPF, and address do not match.*| |O|Partial match: CPF and address match, but postal code does not match.*| |R|Not supported: your implementation does not support AVS _or_ System unavailable.| |T|Partial match: address matches, but postal code and CPF do not match.*| |V|Match: postal code, CPF, and address match.*| |* CPF (Cadastro de Pessoas Fisicas) is required only for Redecard in Brazil.||  ### AVS Codes for All Other Processors  **Note** The list of AVS codes for all other processors follows these descriptions of the processor-specific information for these codes.  #### American Express Cards For American Express cards only, you can receive Visa and CyberSource AVS codes in addition to the American Express AVS codes.  **Note** For CyberSource through VisaNet, the American Express AVS codes are converted to Visa AVS codes before they are returned to you. As a result, you will not receive American Express AVS codes for the American Express card type.<br/><br/>  _American Express Card codes_: `F`, `H`, `K`, `L`, `O`, `T`, `V`  #### Domestic and International Visa Cards The international and domestic alphabetic AVS codes are the Visa standard AVS codes. CyberSource maps the standard AVS return codes for other types of payment cards, including American Express cards, to the Visa standard AVS codes.  AVS is considered either domestic or international, depending on the location of the bank that issued the customer's payment card: - When the bank is in the U.S., the AVS is domestic. - When the bank is outside the U.S., the AVS is international.  You should be prepared to handle both domestic and international AVS result codes: - For international cards, you can receive domestic AVS codes in addition to the international AVS codes. - For domestic cards, you can receive international AVS codes in addition to the domestic AVS codes.  _International Visa Codes_: `B`, `C`, `D`, `G`, `I`, `M`, `P`  _Domestic Visa Codes_: `A`, `E`,`N`, `R`, `S`, `U`, `W`, `X`, `Y`, `Z`  #### CyberSource Codes The numeric AVS codes are created by CyberSource and are not standard Visa codes. These AVS codes can be returned for any card type.  _CyberSource Codes_: `1`, `2`, `3`, `4`  ### Table of AVS Codes for All Other Processors  |AVS Code|Description| |--- |--- | |A|Partial match: street address matches, but 5-digit and 9-digit postal codes do not match.| |B|Partial match: street address matches, but postal code is not verified. Returned only for Visa cards not issued in the U.S.| |C|No match: street address and postal code do not match. Returned only for Visa cards not issued in the U.S.| |D & M|Match: street address and postal code match. Returned only for Visa cards not issued in the U.S.| |E|Invalid: AVS data is invalid or AVS is not allowed for this card type.| |F|Partial match: card member’s name does not match, but billing postal code matches.| |G|Not supported: issuing bank outside the U.S. does not support AVS.| |H|Partial match: card member’s name does not match, but street address and postal code match. Returned only for the American Express card type.| |I|No match: address not verified. Returned only for Visa cards not issued in the U.S.| |K|Partial match: card member’s name matches, but billing address and billing postal code do not match. Returned only for the American Express card type.| |L|Partial match: card member’s name and billing postal code match, but billing address does not match. Returned only for the American Express card type.| |M|See the entry for D & M.| |N|No match: one of the following: street address and postal code do not match _or_ (American Express card type only) card member’s name, street address, and postal code do not match.| |O|Partial match: card member’s name and billing address match, but billing postal code does not match. Returned only for the American Express card type.| |P|Partial match: postal code matches, but street address not verified. Returned only for Visa cards not issued in the U.S.| |R|System unavailable.| |S|Not supported: issuing bank in the U.S. does not support AVS.| |T|Partial match: card member’s name does not match, but street address matches. Returned only for the American Express card type.| |U|System unavailable: address information unavailable for one of these reasons: The U.S. bank does not support AVS outside the U.S. _or_ The AVS in a U.S. bank is not functioning properly.| |V|Match: card member’s name, billing address, and billing postal code match. Returned only for the American Express card type.| |W|Partial match: street address does not match, but 9-digit postal code matches.| |X|Match: street address and 9-digit postal code match.| |Y|Match: street address and 5-digit postal code match.| |Z|Partial match: street address does not match, but 5-digit postal code matches.| |1|Not supported: one of the following: AVS is not supported for this processor or card type _or_ AVS is disabled for your CyberSource account. To enable AVS, contact CyberSource Customer Support.| |2|Unrecognized: the processor returned an unrecognized value for the AVS response.| |3|Match: address is confirmed. Returned only for PayPal Express Checkout.| |4|No match: address is not confirmed. Returned only for PayPal Express Checkout.| |5|No match: no AVS code was returned by the processor.| ")
  public List<String> getDeclineAvsFlags() {
    return declineAvsFlags;
  }

  public void setDeclineAvsFlags(List<String> declineAvsFlags) {
    this.declineAvsFlags = declineAvsFlags;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions ignoreCvResult(Boolean ignoreCvResult) {
    this.ignoreCvResult = ignoreCvResult;
    return this;
  }

   /**
   * Flag that indicates whether to allow the capture service to run even when the payment receives a CVN decline.  Possible values: - **true**  Ignore the results of CVN checking and run the capture service. - **false**  (default) If the authorization receives a CVN decline, do not run the capture service. 
   * @return ignoreCvResult
  **/
  @ApiModelProperty(value = "Flag that indicates whether to allow the capture service to run even when the payment receives a CVN decline.  Possible values: - **true**  Ignore the results of CVN checking and run the capture service. - **false**  (default) If the authorization receives a CVN decline, do not run the capture service. ")
  public Boolean getIgnoreCvResult() {
    return ignoreCvResult;
  }

  public void setIgnoreCvResult(Boolean ignoreCvResult) {
    this.ignoreCvResult = ignoreCvResult;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions initiator(Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Get initiator
   * @return initiator
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator getInitiator() {
    return initiator;
  }

  public void setInitiator(Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator initiator) {
    this.initiator = initiator;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions billPayment(Boolean billPayment) {
    this.billPayment = billPayment;
    return this;
  }

   /**
   * Flag that indicates that this is a payment for a bill or for an existing contractual loan. For processor-specific details, see the &#x60;bill_payment&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  Possible values: - &#x60;true&#x60;: Bill payment or loan payment. - &#x60;false&#x60; (default): Not a bill payment or loan payment. 
   * @return billPayment
  **/
  @ApiModelProperty(value = "Flag that indicates that this is a payment for a bill or for an existing contractual loan. For processor-specific details, see the `bill_payment` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  Possible values: - `true`: Bill payment or loan payment. - `false` (default): Not a bill payment or loan payment. ")
  public Boolean getBillPayment() {
    return billPayment;
  }

  public void setBillPayment(Boolean billPayment) {
    this.billPayment = billPayment;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptions billPaymentType(String billPaymentType) {
    this.billPaymentType = billPaymentType;
    return this;
  }

   /**
   * Reason for the payment.  Possible values: - 001: Utility payment - 002: Government services - 003: Mobile phone top-up - 004: Coupon payment  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR0 - Position: 48-50 - Field: Bill Payment Transaction Type Identifier  This field is supported only for bill payments in Brazil with Mastercard on CyberSource through VisaNet.  **Note** For details about Mastercard bill payments or bill payments with Visa, see &#x60;bill_payment_type&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return billPaymentType
  **/
  @ApiModelProperty(value = "Reason for the payment.  Possible values: - 001: Utility payment - 002: Government services - 003: Mobile phone top-up - 004: Coupon payment  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR0 - Position: 48-50 - Field: Bill Payment Transaction Type Identifier  This field is supported only for bill payments in Brazil with Mastercard on CyberSource through VisaNet.  **Note** For details about Mastercard bill payments or bill payments with Visa, see `bill_payment_type` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getBillPaymentType() {
    return billPaymentType;
  }

  public void setBillPaymentType(String billPaymentType) {
    this.billPaymentType = billPaymentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationAuthorizationOptions ptsv2paymentsProcessingInformationAuthorizationOptions = (Ptsv2paymentsProcessingInformationAuthorizationOptions) o;
    return Objects.equals(this.authType, ptsv2paymentsProcessingInformationAuthorizationOptions.authType) &&
        Objects.equals(this.verbalAuthCode, ptsv2paymentsProcessingInformationAuthorizationOptions.verbalAuthCode) &&
        Objects.equals(this.verbalAuthTransactionId, ptsv2paymentsProcessingInformationAuthorizationOptions.verbalAuthTransactionId) &&
        Objects.equals(this.authIndicator, ptsv2paymentsProcessingInformationAuthorizationOptions.authIndicator) &&
        Objects.equals(this.partialAuthIndicator, ptsv2paymentsProcessingInformationAuthorizationOptions.partialAuthIndicator) &&
        Objects.equals(this.balanceInquiry, ptsv2paymentsProcessingInformationAuthorizationOptions.balanceInquiry) &&
        Objects.equals(this.ignoreAvsResult, ptsv2paymentsProcessingInformationAuthorizationOptions.ignoreAvsResult) &&
        Objects.equals(this.declineAvsFlags, ptsv2paymentsProcessingInformationAuthorizationOptions.declineAvsFlags) &&
        Objects.equals(this.ignoreCvResult, ptsv2paymentsProcessingInformationAuthorizationOptions.ignoreCvResult) &&
        Objects.equals(this.initiator, ptsv2paymentsProcessingInformationAuthorizationOptions.initiator) &&
        Objects.equals(this.billPayment, ptsv2paymentsProcessingInformationAuthorizationOptions.billPayment) &&
        Objects.equals(this.billPaymentType, ptsv2paymentsProcessingInformationAuthorizationOptions.billPaymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, verbalAuthCode, verbalAuthTransactionId, authIndicator, partialAuthIndicator, balanceInquiry, ignoreAvsResult, declineAvsFlags, ignoreCvResult, initiator, billPayment, billPaymentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationAuthorizationOptions {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    verbalAuthCode: ").append(toIndentedString(verbalAuthCode)).append("\n");
    sb.append("    verbalAuthTransactionId: ").append(toIndentedString(verbalAuthTransactionId)).append("\n");
    sb.append("    authIndicator: ").append(toIndentedString(authIndicator)).append("\n");
    sb.append("    partialAuthIndicator: ").append(toIndentedString(partialAuthIndicator)).append("\n");
    sb.append("    balanceInquiry: ").append(toIndentedString(balanceInquiry)).append("\n");
    sb.append("    ignoreAvsResult: ").append(toIndentedString(ignoreAvsResult)).append("\n");
    sb.append("    declineAvsFlags: ").append(toIndentedString(declineAvsFlags)).append("\n");
    sb.append("    ignoreCvResult: ").append(toIndentedString(ignoreCvResult)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    billPayment: ").append(toIndentedString(billPayment)).append("\n");
    sb.append("    billPaymentType: ").append(toIndentedString(billPaymentType)).append("\n");
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

