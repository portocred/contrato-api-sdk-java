/*
 * Gestão de Contratos
 * API de Gestão de Contratos.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetContratosParcelaResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Entidade representando um contrato.
 */
@ApiModel(description = "Entidade representando um contrato.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T17:43:45.741Z")
public class GetContratosContratoResponse {
  @SerializedName("codigoContrato")
  private String codigoContrato = null;

  @SerializedName("parcelas")
  private List<GetContratosParcelaResponse> parcelas = null;

  public GetContratosContratoResponse codigoContrato(String codigoContrato) {
    this.codigoContrato = codigoContrato;
    return this;
  }

   /**
   * Código do contrato.
   * @return codigoContrato
  **/
  @ApiModelProperty(value = "Código do contrato.")
  public String getCodigoContrato() {
    return codigoContrato;
  }

  public void setCodigoContrato(String codigoContrato) {
    this.codigoContrato = codigoContrato;
  }

  public GetContratosContratoResponse parcelas(List<GetContratosParcelaResponse> parcelas) {
    this.parcelas = parcelas;
    return this;
  }

  public GetContratosContratoResponse addParcelasItem(GetContratosParcelaResponse parcelasItem) {
    if (this.parcelas == null) {
      this.parcelas = new ArrayList<GetContratosParcelaResponse>();
    }
    this.parcelas.add(parcelasItem);
    return this;
  }

   /**
   * Get parcelas
   * @return parcelas
  **/
  @ApiModelProperty(value = "")
  public List<GetContratosParcelaResponse> getParcelas() {
    return parcelas;
  }

  public void setParcelas(List<GetContratosParcelaResponse> parcelas) {
    this.parcelas = parcelas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContratosContratoResponse getContratosContratoResponse = (GetContratosContratoResponse) o;
    return Objects.equals(this.codigoContrato, getContratosContratoResponse.codigoContrato) &&
        Objects.equals(this.parcelas, getContratosContratoResponse.parcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoContrato, parcelas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContratosContratoResponse {\n");
    
    sb.append("    codigoContrato: ").append(toIndentedString(codigoContrato)).append("\n");
    sb.append("    parcelas: ").append(toIndentedString(parcelas)).append("\n");
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
