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
 * Ptsv2paymentsDeviceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T12:35:22.882+05:30")
public class Ptsv2paymentsDeviceInformation {
  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("userAgent")
  private String userAgent = null;

  public Ptsv2paymentsDeviceInformation hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * DNS resolved hostname from &#x60;ipAddress&#x60;.
   * @return hostName
  **/
  @ApiModelProperty(value = "DNS resolved hostname from `ipAddress`.")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public Ptsv2paymentsDeviceInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer. 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of the customer. ")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Ptsv2paymentsDeviceInformation userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Customer’s browser as identified from the HTTP header data. For example, &#x60;Mozilla&#x60; is the value that identifies the Netscape browser. 
   * @return userAgent
  **/
  @ApiModelProperty(value = "Customer’s browser as identified from the HTTP header data. For example, `Mozilla` is the value that identifies the Netscape browser. ")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsDeviceInformation ptsv2paymentsDeviceInformation = (Ptsv2paymentsDeviceInformation) o;
    return Objects.equals(this.hostName, ptsv2paymentsDeviceInformation.hostName) &&
        Objects.equals(this.ipAddress, ptsv2paymentsDeviceInformation.ipAddress) &&
        Objects.equals(this.userAgent, ptsv2paymentsDeviceInformation.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostName, ipAddress, userAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsDeviceInformation {\n");
    
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

