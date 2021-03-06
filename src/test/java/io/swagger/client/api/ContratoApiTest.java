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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErroResponse;
import io.swagger.client.model.ExclusaoPagamentoResponse;
import io.swagger.client.model.GetContratosResponse;
import io.swagger.client.model.GetParcelasResponse;
import io.swagger.client.model.GetStatusContratoResponse;
import io.swagger.client.model.SolicitacaoPagamentoRequest;
import io.swagger.client.model.SolicitacaoPagamentoResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContratoApi
 */
@Ignore
public class ContratoApiTest {

    private final ContratoApi api = new ContratoApi();

    
    /**
     * 
     *
     * Esta funcionalidade tem como objetivo recuperar as informações de um contrato vinculado a um determinado cliente. Como resultado, será possível averiguar o saldo total deste contrato, além da lista de parcelas que o compõe, de forma detalhada, com informações especificas por parcela. Nesta modalidade de chamada, a pesquisa será realizada a partir do CPF do cliente.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contratosGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String codigoLojista = null;
        String cpf = null;
        GetContratosResponse response = api.contratosGet(clientId, accessToken, codigoLojista, cpf);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Esta funcionalidade tem como objetivo cancelar um contrato no periódo D0 a D7 de um determinado cliente.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contratosIdCancelamentoPutTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String id = null;
        byte[] xAuthorization = null;
        String codigoLojista = null;
        String cpf = null;
        String operador = null;
        ExclusaoPagamentoResponse response = api.contratosIdCancelamentoPut(clientId, accessToken, id, xAuthorization, codigoLojista, cpf, operador);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Permitir a exclusão, apenas em D0, do pagamento mais recente de um contrato. É importante observar que um pagamento pode englobar uma ou várias parcelas.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contratosIdExclusaoPagamentoDeleteTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String id = null;
        byte[] xAuthorization = null;
        String codigoLojista = null;
        String cpf = null;
        String operador = null;
        ExclusaoPagamentoResponse response = api.contratosIdExclusaoPagamentoDelete(clientId, accessToken, id, xAuthorization, codigoLojista, cpf, operador);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Esta funcionalidade tem como objetivo recuperar as informações de um contrato vinculado a um determinado cliente. Como resultado, será possível averiguar o saldo total deste contrato, além da lista de parcelas que o compõe, de forma detalhada, com informações especificas por parcela. Nesta modalidade de chamada, a pesquisa será realizada a partir do código do contrato.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contratosIdGetTest() throws ApiException {
        String id = null;
        String clientId = null;
        String accessToken = null;
        String codigoLojista = null;
        GetContratosResponse response = api.contratosIdGet(id, clientId, accessToken, codigoLojista);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Esta funcionalidade tem como objetivo realizar uma solicitação de pagamento de parcelas em aberto de determinado contrato. Como resultado da solicitação, são retornadas as informações das parcelas que foram pagas.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contratosIdSolicitacaoPagamentosPostTest() throws ApiException {
        String id = null;
        String clientId = null;
        String accessToken = null;
        SolicitacaoPagamentoRequest solicitacaoPagamento = null;
        SolicitacaoPagamentoResponse response = api.contratosIdSolicitacaoPagamentosPost(id, clientId, accessToken, solicitacaoPagamento);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Esta funcionalidade tem como objetivo recuperar as informações de parcelas pagas sobre um contrato vinculado a um determinado cliente, dentro de um período.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contratosParcelasGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String codigoLojista = null;
        String cpf = null;
        String dataInicio = null;
        String dataFim = null;
        GetParcelasResponse response = api.contratosParcelasGet(clientId, accessToken, codigoLojista, cpf, dataInicio, dataFim);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Esta funcionalidade tem como objetivo recuperar as informações de status de um contrato vinculado a um determinado cliente.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contratosStatusGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String cpf = null;
        GetStatusContratoResponse response = api.contratosStatusGet(clientId, accessToken, cpf);

        // TODO: test validations
    }
    
}
