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
 * TssV2TransactionsGet200ResponsePaymentInformationBankAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class TssV2TransactionsGet200ResponsePaymentInformationBankAccount {
  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("checkNumber")
  private String checkNumber = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("checkDigit")
  private String checkDigit = null;

  @SerializedName("encoderId")
  private String encoderId = null;

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Last four digits of the customer’s payment account number. 
   * @return suffix
  **/
  @ApiModelProperty(value = "Last four digits of the customer’s payment account number. ")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Bank Identification Number (BIN). This is the initial four to six numbers on a credit card account number. 
   * @return prefix
  **/
  @ApiModelProperty(value = "Bank Identification Number (BIN). This is the initial four to six numbers on a credit card account number. ")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount checkNumber(String checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Check number.  Chase Paymentech Solutions - Optional. CyberSource ACH Service - Not used. RBS WorldPay Atlanta - Optional on debits. Required on credits. TeleCheck - Strongly recommended on debit requests. Optional on credits. 
   * @return checkNumber
  **/
  @ApiModelProperty(value = "Check number.  Chase Paymentech Solutions - Optional. CyberSource ACH Service - Not used. RBS WorldPay Atlanta - Optional on debits. Required on credits. TeleCheck - Strongly recommended on debit requests. Optional on credits. ")
  public String getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Account type.  Possible values:  - **C**: Checking.  - **G**: General ledger. This value is supported only on Wells Fargo ACH.  - **S**: Savings (U.S. dollars only).  - **X**: Corporate checking (U.S. dollars only). 
   * @return type
  **/
  @ApiModelProperty(value = "Account type.  Possible values:  - **C**: Checking.  - **G**: General ledger. This value is supported only on Wells Fargo ACH.  - **S**: Savings (U.S. dollars only).  - **X**: Corporate checking (U.S. dollars only). ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name used on the bank account. You can use this field only when scoring a direct debit transaction 
   * @return name
  **/
  @ApiModelProperty(value = "Name used on the bank account. You can use this field only when scoring a direct debit transaction ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount checkDigit(String checkDigit) {
    this.checkDigit = checkDigit;
    return this;
  }

   /**
   * Code used to validate the customer’s account number. Required for some countries if you do not or are not allowed to provide the IBAN instead. You may use this field only when scoring a direct debit transaction.  For all possible values, see the &#x60;bank_check_digit&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return checkDigit
  **/
  @ApiModelProperty(value = "Code used to validate the customer’s account number. Required for some countries if you do not or are not allowed to provide the IBAN instead. You may use this field only when scoring a direct debit transaction.  For all possible values, see the `bank_check_digit` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getCheckDigit() {
    return checkDigit;
  }

  public void setCheckDigit(String checkDigit) {
    this.checkDigit = checkDigit;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount encoderId(String encoderId) {
    this.encoderId = encoderId;
    return this;
  }

   /**
   * Identifier for the bank that provided the customer’s encoded account number.  To obtain the bank identifier, contact your processor.  For details, see &#x60;account_encoder_id&#x60; request-level field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return encoderId
  **/
  @ApiModelProperty(value = "Identifier for the bank that provided the customer’s encoded account number.  To obtain the bank identifier, contact your processor.  For details, see `account_encoder_id` request-level field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getEncoderId() {
    return encoderId;
  }

  public void setEncoderId(String encoderId) {
    this.encoderId = encoderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationBankAccount tssV2TransactionsGet200ResponsePaymentInformationBankAccount = (TssV2TransactionsGet200ResponsePaymentInformationBankAccount) o;
    return Objects.equals(this.suffix, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.suffix) &&
        Objects.equals(this.prefix, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.prefix) &&
        Objects.equals(this.checkNumber, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.checkNumber) &&
        Objects.equals(this.type, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.type) &&
        Objects.equals(this.name, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.name) &&
        Objects.equals(this.checkDigit, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.checkDigit) &&
        Objects.equals(this.encoderId, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.encoderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix, prefix, checkNumber, type, name, checkDigit, encoderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationBankAccount {\n");
    
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checkDigit: ").append(toIndentedString(checkDigit)).append("\n");
    sb.append("    encoderId: ").append(toIndentedString(encoderId)).append("\n");
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

