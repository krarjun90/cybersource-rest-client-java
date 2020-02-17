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
import Model.PtsV2PaymentsPost201ResponsePaymentInformationBank;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2CreditsPost201ResponsePaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class PtsV2CreditsPost201ResponsePaymentInformation {
  @SerializedName("bank")
  private PtsV2PaymentsPost201ResponsePaymentInformationBank bank = null;

  public PtsV2CreditsPost201ResponsePaymentInformation bank(PtsV2PaymentsPost201ResponsePaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(PtsV2PaymentsPost201ResponsePaymentInformationBank bank) {
    this.bank = bank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2CreditsPost201ResponsePaymentInformation ptsV2CreditsPost201ResponsePaymentInformation = (PtsV2CreditsPost201ResponsePaymentInformation) o;
    return Objects.equals(this.bank, ptsV2CreditsPost201ResponsePaymentInformation.bank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2CreditsPost201ResponsePaymentInformation {\n");
    
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
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

