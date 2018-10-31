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

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse2002 {
  @SerializedName("_links")
  private InlineResponse201Links links = null;

  @SerializedName("_embedded")
  private InlineResponse201Embedded embedded = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  /**
   * The status of the submitted transaction.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AUTHORIZED("AUTHORIZED"),
    
    PARTIAL_AUTHORIZED("PARTIAL_AUTHORIZED"),
    
    AUTHORIZED_PENDING_REVIEW("AUTHORIZED_PENDING_REVIEW"),
    
    DECLINED("DECLINED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("errorInformation")
  private InlineResponse201ErrorInformation errorInformation = null;

  @SerializedName("clientReferenceInformation")
  private InlineResponse201ClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private InlineResponse2002ProcessingInformation processingInformation = null;

  @SerializedName("processorInformation")
  private InlineResponse2002ProcessorInformation processorInformation = null;

  @SerializedName("paymentInformation")
  private InlineResponse2002PaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private InlineResponse2002OrderInformation orderInformation = null;

  @SerializedName("buyerInformation")
  private InlineResponse2002BuyerInformation buyerInformation = null;

  @SerializedName("merchantInformation")
  private InlineResponse2002MerchantInformation merchantInformation = null;

  @SerializedName("deviceInformation")
  private InlineResponse2002DeviceInformation deviceInformation = null;

  public InlineResponse2002 links(InlineResponse201Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links object.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201Links getLinks() {
    return links;
  }

  public void setLinks(InlineResponse201Links links) {
    this.links = links;
  }

  public InlineResponse2002 embedded(InlineResponse201Embedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded  value.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201Embedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(InlineResponse201Embedded embedded) {
    this.embedded = embedded;
  }

  public InlineResponse2002 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request.
   * @return id - getId.
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify the submitted request.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2002 submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return submitTimeUtc Time of request in UTC.
  **/
  @ApiModelProperty(value = "Time of request in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public InlineResponse2002 status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.
   * @return status The status of the submitted transaction.
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InlineResponse2002 reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * The reconciliation id for the submitted transaction. This value is not returned for all processors. 
   * @return reconciliationId The reconciliation id for the submitted transaction.
  **/
  @ApiModelProperty(value = "The reconciliation id for the submitted transaction. This value is not returned for all processors. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public InlineResponse2002 errorInformation(InlineResponse201ErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation object.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201ErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(InlineResponse201ErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }

  public InlineResponse2002 clientReferenceInformation(InlineResponse201ClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation object.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201ClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(InlineResponse201ClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public InlineResponse2002 processingInformation(InlineResponse2002ProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation object.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2002ProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(InlineResponse2002ProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public InlineResponse2002 processorInformation(InlineResponse2002ProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation object.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2002ProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(InlineResponse2002ProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public InlineResponse2002 paymentInformation(InlineResponse2002PaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation object.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2002PaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(InlineResponse2002PaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public InlineResponse2002 orderInformation(InlineResponse2002OrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation object.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2002OrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(InlineResponse2002OrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public InlineResponse2002 buyerInformation(InlineResponse2002BuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation object.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2002BuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(InlineResponse2002BuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public InlineResponse2002 merchantInformation(InlineResponse2002MerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation object.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2002MerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(InlineResponse2002MerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public InlineResponse2002 deviceInformation(InlineResponse2002DeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation object.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2002DeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(InlineResponse2002DeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.links, inlineResponse2002.links) &&
        Objects.equals(this.embedded, inlineResponse2002.embedded) &&
        Objects.equals(this.id, inlineResponse2002.id) &&
        Objects.equals(this.submitTimeUtc, inlineResponse2002.submitTimeUtc) &&
        Objects.equals(this.status, inlineResponse2002.status) &&
        Objects.equals(this.reconciliationId, inlineResponse2002.reconciliationId) &&
        Objects.equals(this.errorInformation, inlineResponse2002.errorInformation) &&
        Objects.equals(this.clientReferenceInformation, inlineResponse2002.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, inlineResponse2002.processingInformation) &&
        Objects.equals(this.processorInformation, inlineResponse2002.processorInformation) &&
        Objects.equals(this.paymentInformation, inlineResponse2002.paymentInformation) &&
        Objects.equals(this.orderInformation, inlineResponse2002.orderInformation) &&
        Objects.equals(this.buyerInformation, inlineResponse2002.buyerInformation) &&
        Objects.equals(this.merchantInformation, inlineResponse2002.merchantInformation) &&
        Objects.equals(this.deviceInformation, inlineResponse2002.deviceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, embedded, id, submitTimeUtc, status, reconciliationId, errorInformation, clientReferenceInformation, processingInformation, processorInformation, paymentInformation, orderInformation, buyerInformation, merchantInformation, deviceInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
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
