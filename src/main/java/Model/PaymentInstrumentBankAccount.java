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
 * PaymentInstrumentBankAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class PaymentInstrumentBankAccount {
  /**
   * Checking account type. Possible values:   * C: checking   * S: savings (USD only)   * X: corporate checking (USD only)   * G: general ledger 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CHECKING("checking"),
    
    SAVINGS("savings"),
    
    CORPORATE_CHECKING("corporate checking"),
    
    GENERAL_LEDGER("general ledger");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public PaymentInstrumentBankAccount type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Checking account type. Possible values:   * C: checking   * S: savings (USD only)   * X: corporate checking (USD only)   * G: general ledger 
   * @return type
  **/
  @ApiModelProperty(example = "savings", value = "Checking account type. Possible values:   * C: checking   * S: savings (USD only)   * X: corporate checking (USD only)   * G: general ledger ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentBankAccount paymentInstrumentBankAccount = (PaymentInstrumentBankAccount) o;
    return Objects.equals(this.type, paymentInstrumentBankAccount.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentBankAccount {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

