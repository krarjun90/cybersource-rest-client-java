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
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBankAccount;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedCard;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedMerchantInformation;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation;
import Model.TmsV1InstrumentIdentifiersPost200ResponseMetadata;
import Model.Tmsv1paymentinstrumentsInstrumentIdentifier;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdatePaymentInstrumentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class UpdatePaymentInstrumentRequest {
  @SerializedName("bankAccount")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBankAccount bankAccount = null;

  @SerializedName("card")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedCard card = null;

  @SerializedName("buyerInformation")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation buyerInformation = null;

  @SerializedName("billTo")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo billTo = null;

  @SerializedName("processingInformation")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation processingInformation = null;

  @SerializedName("merchantInformation")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedMerchantInformation merchantInformation = null;

  @SerializedName("metaData")
  private TmsV1InstrumentIdentifiersPost200ResponseMetadata metaData = null;

  @SerializedName("instrumentIdentifier")
  private Tmsv1paymentinstrumentsInstrumentIdentifier instrumentIdentifier = null;

  public UpdatePaymentInstrumentRequest bankAccount(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public UpdatePaymentInstrumentRequest card(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedCard getCard() {
    return card;
  }

  public void setCard(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedCard card) {
    this.card = card;
  }

  public UpdatePaymentInstrumentRequest buyerInformation(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public UpdatePaymentInstrumentRequest billTo(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo billTo) {
    this.billTo = billTo;
  }

  public UpdatePaymentInstrumentRequest processingInformation(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public UpdatePaymentInstrumentRequest merchantInformation(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public UpdatePaymentInstrumentRequest metaData(TmsV1InstrumentIdentifiersPost200ResponseMetadata metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseMetadata getMetaData() {
    return metaData;
  }

  public void setMetaData(TmsV1InstrumentIdentifiersPost200ResponseMetadata metaData) {
    this.metaData = metaData;
  }

  public UpdatePaymentInstrumentRequest instrumentIdentifier(Tmsv1paymentinstrumentsInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
    return this;
  }

   /**
   * Get instrumentIdentifier
   * @return instrumentIdentifier
  **/
  @ApiModelProperty(value = "")
  public Tmsv1paymentinstrumentsInstrumentIdentifier getInstrumentIdentifier() {
    return instrumentIdentifier;
  }

  public void setInstrumentIdentifier(Tmsv1paymentinstrumentsInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentInstrumentRequest updatePaymentInstrumentRequest = (UpdatePaymentInstrumentRequest) o;
    return Objects.equals(this.bankAccount, updatePaymentInstrumentRequest.bankAccount) &&
        Objects.equals(this.card, updatePaymentInstrumentRequest.card) &&
        Objects.equals(this.buyerInformation, updatePaymentInstrumentRequest.buyerInformation) &&
        Objects.equals(this.billTo, updatePaymentInstrumentRequest.billTo) &&
        Objects.equals(this.processingInformation, updatePaymentInstrumentRequest.processingInformation) &&
        Objects.equals(this.merchantInformation, updatePaymentInstrumentRequest.merchantInformation) &&
        Objects.equals(this.metaData, updatePaymentInstrumentRequest.metaData) &&
        Objects.equals(this.instrumentIdentifier, updatePaymentInstrumentRequest.instrumentIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, card, buyerInformation, billTo, processingInformation, merchantInformation, metaData, instrumentIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentInstrumentRequest {\n");
    
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    instrumentIdentifier: ").append(toIndentedString(instrumentIdentifier)).append("\n");
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

