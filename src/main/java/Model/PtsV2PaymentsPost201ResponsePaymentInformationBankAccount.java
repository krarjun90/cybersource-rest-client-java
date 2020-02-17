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
 * PtsV2PaymentsPost201ResponsePaymentInformationBankAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class PtsV2PaymentsPost201ResponsePaymentInformationBankAccount {
  @SerializedName("correctedAccountNumber")
  private String correctedAccountNumber = null;

  public PtsV2PaymentsPost201ResponsePaymentInformationBankAccount correctedAccountNumber(String correctedAccountNumber) {
    this.correctedAccountNumber = correctedAccountNumber;
    return this;
  }

   /**
   * Corrected account number from the ACH verification service.  For details, see &#x60;ecp_debit_corrected_account_number&#x60; or &#x60;ecp_credit_corrected_account_number&#x60; field descriptions in [Electronic Check Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) 
   * @return correctedAccountNumber
  **/
  @ApiModelProperty(value = "Corrected account number from the ACH verification service.  For details, see `ecp_debit_corrected_account_number` or `ecp_credit_corrected_account_number` field descriptions in [Electronic Check Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) ")
  public String getCorrectedAccountNumber() {
    return correctedAccountNumber;
  }

  public void setCorrectedAccountNumber(String correctedAccountNumber) {
    this.correctedAccountNumber = correctedAccountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformationBankAccount ptsV2PaymentsPost201ResponsePaymentInformationBankAccount = (PtsV2PaymentsPost201ResponsePaymentInformationBankAccount) o;
    return Objects.equals(this.correctedAccountNumber, ptsV2PaymentsPost201ResponsePaymentInformationBankAccount.correctedAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correctedAccountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformationBankAccount {\n");
    
    sb.append("    correctedAccountNumber: ").append(toIndentedString(correctedAccountNumber)).append("\n");
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

