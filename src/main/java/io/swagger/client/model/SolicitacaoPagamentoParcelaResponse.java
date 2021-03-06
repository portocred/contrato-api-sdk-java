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
import io.swagger.client.model.SituacaoParcela;
import java.io.IOException;

/**
 * Entidade representando uma parcela de um contrato na saida da operação de solicitação de pagamentos.
 */
@ApiModel(description = "Entidade representando uma parcela de um contrato na saida da operação de solicitação de pagamentos.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T17:43:45.741Z")
public class SolicitacaoPagamentoParcelaResponse {
  @SerializedName("codigoContrato")
  private String codigoContrato = null;

  @SerializedName("numeroParcela")
  private String numeroParcela = null;

  @SerializedName("PMT")
  private Double PMT = null;

  @SerializedName("valorPago")
  private Double valorPago = null;

  @SerializedName("dataVencimento")
  private String dataVencimento = null;

  @SerializedName("situacao")
  private SituacaoParcela situacao = null;

  public SolicitacaoPagamentoParcelaResponse codigoContrato(String codigoContrato) {
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

  public SolicitacaoPagamentoParcelaResponse numeroParcela(String numeroParcela) {
    this.numeroParcela = numeroParcela;
    return this;
  }

   /**
   * Número da parcela.
   * @return numeroParcela
  **/
  @ApiModelProperty(value = "Número da parcela.")
  public String getNumeroParcela() {
    return numeroParcela;
  }

  public void setNumeroParcela(String numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  public SolicitacaoPagamentoParcelaResponse PMT(Double PMT) {
    this.PMT = PMT;
    return this;
  }

   /**
   * Código da parcela.
   * @return PMT
  **/
  @ApiModelProperty(value = "Código da parcela.")
  public Double getPMT() {
    return PMT;
  }

  public void setPMT(Double PMT) {
    this.PMT = PMT;
  }

  public SolicitacaoPagamentoParcelaResponse valorPago(Double valorPago) {
    this.valorPago = valorPago;
    return this;
  }

   /**
   * Valor pago.
   * @return valorPago
  **/
  @ApiModelProperty(value = "Valor pago.")
  public Double getValorPago() {
    return valorPago;
  }

  public void setValorPago(Double valorPago) {
    this.valorPago = valorPago;
  }

  public SolicitacaoPagamentoParcelaResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

   /**
   * Data do vencimento.
   * @return dataVencimento
  **/
  @ApiModelProperty(value = "Data do vencimento.")
  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public SolicitacaoPagamentoParcelaResponse situacao(SituacaoParcela situacao) {
    this.situacao = situacao;
    return this;
  }

   /**
   * Get situacao
   * @return situacao
  **/
  @ApiModelProperty(value = "")
  public SituacaoParcela getSituacao() {
    return situacao;
  }

  public void setSituacao(SituacaoParcela situacao) {
    this.situacao = situacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitacaoPagamentoParcelaResponse solicitacaoPagamentoParcelaResponse = (SolicitacaoPagamentoParcelaResponse) o;
    return Objects.equals(this.codigoContrato, solicitacaoPagamentoParcelaResponse.codigoContrato) &&
        Objects.equals(this.numeroParcela, solicitacaoPagamentoParcelaResponse.numeroParcela) &&
        Objects.equals(this.PMT, solicitacaoPagamentoParcelaResponse.PMT) &&
        Objects.equals(this.valorPago, solicitacaoPagamentoParcelaResponse.valorPago) &&
        Objects.equals(this.dataVencimento, solicitacaoPagamentoParcelaResponse.dataVencimento) &&
        Objects.equals(this.situacao, solicitacaoPagamentoParcelaResponse.situacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoContrato, numeroParcela, PMT, valorPago, dataVencimento, situacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitacaoPagamentoParcelaResponse {\n");
    
    sb.append("    codigoContrato: ").append(toIndentedString(codigoContrato)).append("\n");
    sb.append("    numeroParcela: ").append(toIndentedString(numeroParcela)).append("\n");
    sb.append("    PMT: ").append(toIndentedString(PMT)).append("\n");
    sb.append("    valorPago: ").append(toIndentedString(valorPago)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
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

