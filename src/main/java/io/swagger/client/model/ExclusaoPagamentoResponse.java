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
import java.io.IOException;

/**
 * Entidade representando um cancelamento de um contrato.
 */
@ApiModel(description = "Entidade representando um cancelamento de um contrato.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T17:43:45.741Z")
public class ExclusaoPagamentoResponse {
  @SerializedName("comprovante")
  private String comprovante = null;

  public ExclusaoPagamentoResponse comprovante(String comprovante) {
    this.comprovante = comprovante;
    return this;
  }

   /**
   * Comprovante de Cancelamento no seguinte formato.
   * @return comprovante
  **/
  @ApiModelProperty(value = "Comprovante de Cancelamento no seguinte formato.")
  public String getComprovante() {
    return comprovante;
  }

  public void setComprovante(String comprovante) {
    this.comprovante = comprovante;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExclusaoPagamentoResponse exclusaoPagamentoResponse = (ExclusaoPagamentoResponse) o;
    return Objects.equals(this.comprovante, exclusaoPagamentoResponse.comprovante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comprovante);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExclusaoPagamentoResponse {\n");
    
    sb.append("    comprovante: ").append(toIndentedString(comprovante)).append("\n");
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
