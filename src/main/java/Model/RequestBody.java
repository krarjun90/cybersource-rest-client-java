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
import Model.Reportingv3reportsReportPreferences;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * RequestBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-26T18:32:32.437+05:30")
public class RequestBody {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("reportDefinitionName")
  private String reportDefinitionName = null;

  @SerializedName("reportFields")
  private List<String> reportFields = null;

  @SerializedName("reportMimeType")
  private String reportMimeType = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("reportStartTime")
  private DateTime reportStartTime = null;

  @SerializedName("reportEndTime")
  private DateTime reportEndTime = null;

  @SerializedName("reportFilters")
  private Map<String, List<String>> reportFilters = null;

  @SerializedName("reportPreferences")
  private Reportingv3reportsReportPreferences reportPreferences = null;

  @SerializedName("groupName")
  private String groupName = null;

  public RequestBody organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Valid CyberSource Organization Id
   * @return organizationId
  **/
  @ApiModelProperty(example = "Test_Merchatnt_id", value = "Valid CyberSource Organization Id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public RequestBody reportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
    return this;
  }

   /**
   * Get reportDefinitionName
   * @return reportDefinitionName
  **/
  @ApiModelProperty(example = "TransactionRequestClass", value = "")
  public String getReportDefinitionName() {
    return reportDefinitionName;
  }

  public void setReportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
  }

  public RequestBody reportFields(List<String> reportFields) {
    this.reportFields = reportFields;
    return this;
  }

  public RequestBody addReportFieldsItem(String reportFieldsItem) {
    if (this.reportFields == null) {
      this.reportFields = new ArrayList<String>();
    }
    this.reportFields.add(reportFieldsItem);
    return this;
  }

   /**
   * List of fields which needs to get included in a report
   * @return reportFields
  **/
  @ApiModelProperty(example = "[\"Request.RequestID\",\"Request.TransactionDate\",\"Request.MerchantID\"]", value = "List of fields which needs to get included in a report")
  public List<String> getReportFields() {
    return reportFields;
  }

  public void setReportFields(List<String> reportFields) {
    this.reportFields = reportFields;
  }

  public RequestBody reportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * &#39;Format of the report&#39;                  Valid values: - application/xml - text/csv 
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", value = "'Format of the report'                  Valid values: - application/xml - text/csv ")
  public String getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public RequestBody reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Name of the report
   * @return reportName
  **/
  @ApiModelProperty(example = "My Transaction Request report", value = "Name of the report")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public RequestBody timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone of the report
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Chicago", value = "Timezone of the report")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public RequestBody reportStartTime(DateTime reportStartTime) {
    this.reportStartTime = reportStartTime;
    return this;
  }

   /**
   * Start time of the report
   * @return reportStartTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Start time of the report")
  public DateTime getReportStartTime() {
    return reportStartTime;
  }

  public void setReportStartTime(DateTime reportStartTime) {
    this.reportStartTime = reportStartTime;
  }

  public RequestBody reportEndTime(DateTime reportEndTime) {
    this.reportEndTime = reportEndTime;
    return this;
  }

   /**
   * End time of the report
   * @return reportEndTime
  **/
  @ApiModelProperty(example = "2017-10-02T10:10:10+05:00", value = "End time of the report")
  public DateTime getReportEndTime() {
    return reportEndTime;
  }

  public void setReportEndTime(DateTime reportEndTime) {
    this.reportEndTime = reportEndTime;
  }

  public RequestBody reportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

  public RequestBody putReportFiltersItem(String key, List<String> reportFiltersItem) {
    if (this.reportFilters == null) {
      this.reportFilters = new HashMap<String, List<String>>();
    }
    this.reportFilters.put(key, reportFiltersItem);
    return this;
  }

   /**
   * List of filters to apply
   * @return reportFilters
  **/
  @ApiModelProperty(example = "{\"Application.Name\":[\"ics_auth\",\"ics_bill\"]}", value = "List of filters to apply")
  public Map<String, List<String>> getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
  }

  public RequestBody reportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
    return this;
  }

   /**
   * Get reportPreferences
   * @return reportPreferences
  **/
  @ApiModelProperty(value = "")
  public Reportingv3reportsReportPreferences getReportPreferences() {
    return reportPreferences;
  }

  public void setReportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
  }

  public RequestBody groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Specifies the group name
   * @return groupName
  **/
  @ApiModelProperty(example = "myGroup", value = "Specifies the group name")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody requestBody = (RequestBody) o;
    return Objects.equals(this.organizationId, requestBody.organizationId) &&
        Objects.equals(this.reportDefinitionName, requestBody.reportDefinitionName) &&
        Objects.equals(this.reportFields, requestBody.reportFields) &&
        Objects.equals(this.reportMimeType, requestBody.reportMimeType) &&
        Objects.equals(this.reportName, requestBody.reportName) &&
        Objects.equals(this.timezone, requestBody.timezone) &&
        Objects.equals(this.reportStartTime, requestBody.reportStartTime) &&
        Objects.equals(this.reportEndTime, requestBody.reportEndTime) &&
        Objects.equals(this.reportFilters, requestBody.reportFilters) &&
        Objects.equals(this.reportPreferences, requestBody.reportPreferences) &&
        Objects.equals(this.groupName, requestBody.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, reportDefinitionName, reportFields, reportMimeType, reportName, timezone, reportStartTime, reportEndTime, reportFilters, reportPreferences, groupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    reportDefinitionName: ").append(toIndentedString(reportDefinitionName)).append("\n");
    sb.append("    reportFields: ").append(toIndentedString(reportFields)).append("\n");
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    reportStartTime: ").append(toIndentedString(reportStartTime)).append("\n");
    sb.append("    reportEndTime: ").append(toIndentedString(reportEndTime)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    reportPreferences: ").append(toIndentedString(reportPreferences)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

