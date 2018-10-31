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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * V2paymentsidrefundsOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2paymentsidrefundsOrderInformationLineItems {
  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("productSku")
  private String productSku = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("unitPrice")
  private String unitPrice = null;

  @SerializedName("unitOfMeasure")
  private String unitOfMeasure = null;

  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("taxRate")
  private String taxRate = null;

  @SerializedName("taxAppliedAfterDiscount")
  private String taxAppliedAfterDiscount = null;

  @SerializedName("taxStatusIndicator")
  private String taxStatusIndicator = null;

  @SerializedName("taxTypeCode")
  private String taxTypeCode = null;

  @SerializedName("amountIncludesTax")
  private Boolean amountIncludesTax = null;

  @SerializedName("typeOfSupply")
  private String typeOfSupply = null;

  @SerializedName("commodityCode")
  private String commodityCode = null;

  @SerializedName("discountAmount")
  private String discountAmount = null;

  @SerializedName("discountApplied")
  private Boolean discountApplied = null;

  @SerializedName("discountRate")
  private String discountRate = null;

  @SerializedName("invoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("taxDetails")
  private List<V2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails = null;

  public V2paymentsidrefundsOrderInformationLineItems productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Type of product. This value is used to determine the category that the product is in: electronic, handling, physical, service, or shipping. The default value is **default**.  For a payment, when you set this field to a value other than default or any of the values related to shipping and handling, below fields _quantity_, _productName_, and _productSKU_ are required. 
   * @return productCode
  **/
  @ApiModelProperty(value = "Type of product. This value is used to determine the category that the product is in: electronic, handling, physical, service, or shipping. The default value is **default**.  For a payment, when you set this field to a value other than default or any of the values related to shipping and handling, below fields _quantity_, _productName_, and _productSKU_ are required. ")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public V2paymentsidrefundsOrderInformationLineItems productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * For PAYMENT and CAPTURE API, this field is required when above _productCode_ is not **default** or one of the values related to shipping and handling. 
   * @return productName
  **/
  @ApiModelProperty(value = "For PAYMENT and CAPTURE API, this field is required when above _productCode_ is not **default** or one of the values related to shipping and handling. ")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public V2paymentsidrefundsOrderInformationLineItems productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

   /**
   * Identification code for the product. For PAYMENT and CAPTURE API, this field is required when above _productCode_ is not **default** or one of the values related to shipping and/or handling. 
   * @return productSku
  **/
  @ApiModelProperty(value = "Identification code for the product. For PAYMENT and CAPTURE API, this field is required when above _productCode_ is not **default** or one of the values related to shipping and/or handling. ")
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }

  public V2paymentsidrefundsOrderInformationLineItems quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * For a payment or capture, this field is required when _productCode_ is not **default** or one of the values related to shipping and handling. 
   * minimum: 1
   * maximum: 9999999999
   * @return quantity
  **/
  @ApiModelProperty(value = "For a payment or capture, this field is required when _productCode_ is not **default** or one of the values related to shipping and handling. ")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public V2paymentsidrefundsOrderInformationLineItems unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return unitPrice
  **/
  @ApiModelProperty(value = "Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  public V2paymentsidrefundsOrderInformationLineItems unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * Unit of measure, or unit of measure code, for the item. 
   * @return unitOfMeasure
  **/
  @ApiModelProperty(value = "Unit of measure, or unit of measure code, for the item. ")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public V2paymentsidrefundsOrderInformationLineItems totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount for the item. Normally calculated as the unit price x quantity. 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Total amount for the item. Normally calculated as the unit price x quantity. ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public V2paymentsidrefundsOrderInformationLineItems taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount&#x3D;10.00, quantity&#x3D;1, and taxAmount&#x3D;0.80  ..- 2nd line item has amount&#x3D;20.00, quantity&#x3D;1, and taxAmount&#x3D;1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  This field is frequently used for Level II and Level III transactions. 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount=10.00, quantity=1, and taxAmount=0.80  ..- 2nd line item has amount=20.00, quantity=1, and taxAmount=1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  This field is frequently used for Level II and Level III transactions. ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public V2paymentsidrefundsOrderInformationLineItems taxRate(String taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Tax rate applied to the item. See \&quot;Numbered Elements,\&quot; page 14.  Visa: Valid range is 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated).  Mastercard: Valid range is 0.00001 to 0.99999 (0.001% to 99.999%). 
   * @return taxRate
  **/
  @ApiModelProperty(value = "Tax rate applied to the item. See \"Numbered Elements,\" page 14.  Visa: Valid range is 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated).  Mastercard: Valid range is 0.00001 to 0.99999 (0.001% to 99.999%). ")
  public String getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }

  public V2paymentsidrefundsOrderInformationLineItems taxAppliedAfterDiscount(String taxAppliedAfterDiscount) {
    this.taxAppliedAfterDiscount = taxAppliedAfterDiscount;
    return this;
  }

   /**
   * Flag to indicate how you handle discount at the line item level.   - 0: no line level discount provided  - 1: tax was calculated on the post-discount line item total  - 2: tax was calculated on the pre-discount line item total  &#x60;Note&#x60; Visa will inset 0 (zero) if an invalid value is included in this field.  This field relates to the value in the _lineItems[].discountAmount_ field. 
   * @return taxAppliedAfterDiscount
  **/
  @ApiModelProperty(value = "Flag to indicate how you handle discount at the line item level.   - 0: no line level discount provided  - 1: tax was calculated on the post-discount line item total  - 2: tax was calculated on the pre-discount line item total  `Note` Visa will inset 0 (zero) if an invalid value is included in this field.  This field relates to the value in the _lineItems[].discountAmount_ field. ")
  public String getTaxAppliedAfterDiscount() {
    return taxAppliedAfterDiscount;
  }

  public void setTaxAppliedAfterDiscount(String taxAppliedAfterDiscount) {
    this.taxAppliedAfterDiscount = taxAppliedAfterDiscount;
  }

  public V2paymentsidrefundsOrderInformationLineItems taxStatusIndicator(String taxStatusIndicator) {
    this.taxStatusIndicator = taxStatusIndicator;
    return this;
  }

   /**
   * Flag to indicate whether tax is exempted or not included.   - 0: tax not included  - 1: tax included  - 2: transaction is not subject to tax 
   * @return taxStatusIndicator
  **/
  @ApiModelProperty(value = "Flag to indicate whether tax is exempted or not included.   - 0: tax not included  - 1: tax included  - 2: transaction is not subject to tax ")
  public String getTaxStatusIndicator() {
    return taxStatusIndicator;
  }

  public void setTaxStatusIndicator(String taxStatusIndicator) {
    this.taxStatusIndicator = taxStatusIndicator;
  }

  public V2paymentsidrefundsOrderInformationLineItems taxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
    return this;
  }

   /**
   * Type of tax being applied to the item. Possible values:  Below values are used by **RBS WorldPay Atlanta**, **FDC Nashville Global**, **Litle**   - 0000: unknown tax type  - 0001: federal/national sales tax  - 0002: state sales tax  - 0003: city sales tax  - 0004: local sales tax  - 0005: municipal sales tax  - 0006: other tax  - 0010: value-added tax  - 0011: goods and services tax  - 0012: provincial sales tax  - 0013: harmonized sales tax  - 0014: Quebec sales tax (QST)  - 0020: room tax  - 0021: occupancy tax  - 0022: energy tax  - Blank: Tax not supported on line item. 
   * @return taxTypeCode
  **/
  @ApiModelProperty(value = "Type of tax being applied to the item. Possible values:  Below values are used by **RBS WorldPay Atlanta**, **FDC Nashville Global**, **Litle**   - 0000: unknown tax type  - 0001: federal/national sales tax  - 0002: state sales tax  - 0003: city sales tax  - 0004: local sales tax  - 0005: municipal sales tax  - 0006: other tax  - 0010: value-added tax  - 0011: goods and services tax  - 0012: provincial sales tax  - 0013: harmonized sales tax  - 0014: Quebec sales tax (QST)  - 0020: room tax  - 0021: occupancy tax  - 0022: energy tax  - Blank: Tax not supported on line item. ")
  public String getTaxTypeCode() {
    return taxTypeCode;
  }

  public void setTaxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
  }

  public V2paymentsidrefundsOrderInformationLineItems amountIncludesTax(Boolean amountIncludesTax) {
    this.amountIncludesTax = amountIncludesTax;
    return this;
  }

   /**
   * Flag that indicates whether the tax amount is included in the Line Item Total. 
   * @return amountIncludesTax
  **/
  @ApiModelProperty(value = "Flag that indicates whether the tax amount is included in the Line Item Total. ")
  public Boolean getAmountIncludesTax() {
    return amountIncludesTax;
  }

  public void setAmountIncludesTax(Boolean amountIncludesTax) {
    this.amountIncludesTax = amountIncludesTax;
  }

  public V2paymentsidrefundsOrderInformationLineItems typeOfSupply(String typeOfSupply) {
    this.typeOfSupply = typeOfSupply;
    return this;
  }

   /**
   * Flag to indicate whether the purchase is categorized as goods or services. Possible values:   - 00: goods  - 01: services 
   * @return typeOfSupply
  **/
  @ApiModelProperty(value = "Flag to indicate whether the purchase is categorized as goods or services. Possible values:   - 00: goods  - 01: services ")
  public String getTypeOfSupply() {
    return typeOfSupply;
  }

  public void setTypeOfSupply(String typeOfSupply) {
    this.typeOfSupply = typeOfSupply;
  }

  public V2paymentsidrefundsOrderInformationLineItems commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * Commodity code or International description code used to classify the item. Contact your acquirer for a list of codes. 
   * @return commodityCode
  **/
  @ApiModelProperty(value = "Commodity code or International description code used to classify the item. Contact your acquirer for a list of codes. ")
  public String getCommodityCode() {
    return commodityCode;
  }

  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  public V2paymentsidrefundsOrderInformationLineItems discountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Discount applied to the item.
   * @return discountAmount
  **/
  @ApiModelProperty(value = "Discount applied to the item.")
  public String getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }

  public V2paymentsidrefundsOrderInformationLineItems discountApplied(Boolean discountApplied) {
    this.discountApplied = discountApplied;
    return this;
  }

   /**
   * Flag that indicates whether the amount is discounted.  If you do not provide a value but you set Discount Amount to a value greater than zero, then CyberSource sets this field to **true**. 
   * @return discountApplied
  **/
  @ApiModelProperty(value = "Flag that indicates whether the amount is discounted.  If you do not provide a value but you set Discount Amount to a value greater than zero, then CyberSource sets this field to **true**. ")
  public Boolean getDiscountApplied() {
    return discountApplied;
  }

  public void setDiscountApplied(Boolean discountApplied) {
    this.discountApplied = discountApplied;
  }

  public V2paymentsidrefundsOrderInformationLineItems discountRate(String discountRate) {
    this.discountRate = discountRate;
    return this;
  }

   /**
   * Rate the item is discounted. Maximum of 2 decimal places.  Example 5.25 (&#x3D;5.25%) 
   * @return discountRate
  **/
  @ApiModelProperty(value = "Rate the item is discounted. Maximum of 2 decimal places.  Example 5.25 (=5.25%) ")
  public String getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(String discountRate) {
    this.discountRate = discountRate;
  }

  public V2paymentsidrefundsOrderInformationLineItems invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Field to support an invoice number for a transaction. You must specify the number of line items that will include an invoice number. By default, the first line item will include an invoice number field. The invoice number field can be included for up to 10 line items. 
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "Field to support an invoice number for a transaction. You must specify the number of line items that will include an invoice number. By default, the first line item will include an invoice number field. The invoice number field can be included for up to 10 line items. ")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public V2paymentsidrefundsOrderInformationLineItems taxDetails(List<V2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public V2paymentsidrefundsOrderInformationLineItems addTaxDetailsItem(V2paymentsOrderInformationAmountDetailsTaxDetails taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<V2paymentsOrderInformationAmountDetailsTaxDetails>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Get taxDetails
   * @return taxDetails
  **/
  @ApiModelProperty(value = "")
  public List<V2paymentsOrderInformationAmountDetailsTaxDetails> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<V2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2paymentsidrefundsOrderInformationLineItems v2paymentsidrefundsOrderInformationLineItems = (V2paymentsidrefundsOrderInformationLineItems) o;
    return Objects.equals(this.productCode, v2paymentsidrefundsOrderInformationLineItems.productCode) &&
        Objects.equals(this.productName, v2paymentsidrefundsOrderInformationLineItems.productName) &&
        Objects.equals(this.productSku, v2paymentsidrefundsOrderInformationLineItems.productSku) &&
        Objects.equals(this.quantity, v2paymentsidrefundsOrderInformationLineItems.quantity) &&
        Objects.equals(this.unitPrice, v2paymentsidrefundsOrderInformationLineItems.unitPrice) &&
        Objects.equals(this.unitOfMeasure, v2paymentsidrefundsOrderInformationLineItems.unitOfMeasure) &&
        Objects.equals(this.totalAmount, v2paymentsidrefundsOrderInformationLineItems.totalAmount) &&
        Objects.equals(this.taxAmount, v2paymentsidrefundsOrderInformationLineItems.taxAmount) &&
        Objects.equals(this.taxRate, v2paymentsidrefundsOrderInformationLineItems.taxRate) &&
        Objects.equals(this.taxAppliedAfterDiscount, v2paymentsidrefundsOrderInformationLineItems.taxAppliedAfterDiscount) &&
        Objects.equals(this.taxStatusIndicator, v2paymentsidrefundsOrderInformationLineItems.taxStatusIndicator) &&
        Objects.equals(this.taxTypeCode, v2paymentsidrefundsOrderInformationLineItems.taxTypeCode) &&
        Objects.equals(this.amountIncludesTax, v2paymentsidrefundsOrderInformationLineItems.amountIncludesTax) &&
        Objects.equals(this.typeOfSupply, v2paymentsidrefundsOrderInformationLineItems.typeOfSupply) &&
        Objects.equals(this.commodityCode, v2paymentsidrefundsOrderInformationLineItems.commodityCode) &&
        Objects.equals(this.discountAmount, v2paymentsidrefundsOrderInformationLineItems.discountAmount) &&
        Objects.equals(this.discountApplied, v2paymentsidrefundsOrderInformationLineItems.discountApplied) &&
        Objects.equals(this.discountRate, v2paymentsidrefundsOrderInformationLineItems.discountRate) &&
        Objects.equals(this.invoiceNumber, v2paymentsidrefundsOrderInformationLineItems.invoiceNumber) &&
        Objects.equals(this.taxDetails, v2paymentsidrefundsOrderInformationLineItems.taxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, productName, productSku, quantity, unitPrice, unitOfMeasure, totalAmount, taxAmount, taxRate, taxAppliedAfterDiscount, taxStatusIndicator, taxTypeCode, amountIncludesTax, typeOfSupply, commodityCode, discountAmount, discountApplied, discountRate, invoiceNumber, taxDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2paymentsidrefundsOrderInformationLineItems {\n");
    
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAppliedAfterDiscount: ").append(toIndentedString(taxAppliedAfterDiscount)).append("\n");
    sb.append("    taxStatusIndicator: ").append(toIndentedString(taxStatusIndicator)).append("\n");
    sb.append("    taxTypeCode: ").append(toIndentedString(taxTypeCode)).append("\n");
    sb.append("    amountIncludesTax: ").append(toIndentedString(amountIncludesTax)).append("\n");
    sb.append("    typeOfSupply: ").append(toIndentedString(typeOfSupply)).append("\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountApplied: ").append(toIndentedString(discountApplied)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
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
