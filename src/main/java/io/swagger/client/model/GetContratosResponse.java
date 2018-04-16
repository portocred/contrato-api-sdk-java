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
import io.swagger.client.model.GetContratosContratoResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Entidade representando a saída da operação de recuperação de contratos.
 */
@ApiModel(description = "Entidade representando a saída da operação de recuperação de contratos.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T17:43:45.741Z")
public class GetContratosResponse {
  @SerializedName("cpfCliente")
  private String cpfCliente = null;

  @SerializedName("nomeCliente")
  private String nomeCliente = null;

  @SerializedName("contratos")
  private List<GetContratosContratoResponse> contratos = null;

  public GetContratosResponse cpfCliente(String cpfCliente) {
    this.cpfCliente = cpfCliente;
    return this;
  }

   /**
   * CPF do cliente.
   * @return cpfCliente
  **/
  @ApiModelProperty(value = "CPF do cliente.")
  public String getCpfCliente() {
    return cpfCliente;
  }

  public void setCpfCliente(String cpfCliente) {
    this.cpfCliente = cpfCliente;
  }

  public GetContratosResponse nomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    return this;
  }

   /**
   * Nome do cliente.
   * @return nomeCliente
  **/
  @ApiModelProperty(value = "Nome do cliente.")
  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public GetContratosResponse contratos(List<GetContratosContratoResponse> contratos) {
    this.contratos = contratos;
    return this;
  }

  public GetContratosResponse addContratosItem(GetContratosContratoResponse contratosItem) {
    if (this.contratos == null) {
      this.contratos = new ArrayList<GetContratosContratoResponse>();
    }
    this.contratos.add(contratosItem);
    return this;
  }

   /**
   * Get contratos
   * @return contratos
  **/
  @ApiModelProperty(value = "")
  public List<GetContratosContratoResponse> getContratos() {
    return contratos;
  }

  public void setContratos(List<GetContratosContratoResponse> contratos) {
    this.contratos = contratos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContratosResponse getContratosResponse = (GetContratosResponse) o;
    return Objects.equals(this.cpfCliente, getContratosResponse.cpfCliente) &&
        Objects.equals(this.nomeCliente, getContratosResponse.nomeCliente) &&
        Objects.equals(this.contratos, getContratosResponse.contratos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfCliente, nomeCliente, contratos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContratosResponse {\n");
    
    sb.append("    cpfCliente: ").append(toIndentedString(cpfCliente)).append("\n");
    sb.append("    nomeCliente: ").append(toIndentedString(nomeCliente)).append("\n");
    sb.append("    contratos: ").append(toIndentedString(contratos)).append("\n");
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
