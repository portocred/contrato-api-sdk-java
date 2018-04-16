# ContratoApi

All URIs are relative to *https://dev-api.portocred.com.br/gestao-contrato/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contratosGet**](ContratoApi.md#contratosGet) | **GET** /contratos | 
[**contratosIdCancelamentoPut**](ContratoApi.md#contratosIdCancelamentoPut) | **PUT** /contratos/{id}/cancelamento | 
[**contratosIdExclusaoPagamentoDelete**](ContratoApi.md#contratosIdExclusaoPagamentoDelete) | **DELETE** /contratos/{id}/exclusao-pagamento | 
[**contratosIdGet**](ContratoApi.md#contratosIdGet) | **GET** /contratos/{id} | 
[**contratosIdSolicitacaoPagamentosPost**](ContratoApi.md#contratosIdSolicitacaoPagamentosPost) | **POST** /contratos/{id}/solicitacao-pagamentos | 
[**contratosParcelasGet**](ContratoApi.md#contratosParcelasGet) | **GET** /contratos/parcelas | 
[**contratosStatusGet**](ContratoApi.md#contratosStatusGet) | **GET** /contratos/status | 


<a name="contratosGet"></a>
# **contratosGet**
> GetContratosResponse contratosGet(clientId, accessToken, codigoLojista, cpf)



Esta funcionalidade tem como objetivo recuperar as informações de um contrato vinculado a um determinado cliente. Como resultado, será possível averiguar o saldo total deste contrato, além da lista de parcelas que o compõe, de forma detalhada, com informações especificas por parcela. Nesta modalidade de chamada, a pesquisa será realizada a partir do CPF do cliente.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContratoApi;


ContratoApi apiInstance = new ContratoApi();
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
String cpf = "cpf_example"; // String | Cpf do cliente que possui o contrato.
try {
    GetContratosResponse result = apiInstance.contratosGet(clientId, accessToken, codigoLojista, cpf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContratoApi#contratosGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |
 **cpf** | **String**| Cpf do cliente que possui o contrato. |

### Return type

[**GetContratosResponse**](GetContratosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contratosIdCancelamentoPut"></a>
# **contratosIdCancelamentoPut**
> ExclusaoPagamentoResponse contratosIdCancelamentoPut(clientId, accessToken, id, xAuthorization, codigoLojista, cpf, operador)



Esta funcionalidade tem como objetivo cancelar um contrato no periódo D0 a D7 de um determinado cliente.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContratoApi;


ContratoApi apiInstance = new ContratoApi();
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
String id = "id_example"; // String | O número do contrado a ser cancelado.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
String cpf = "cpf_example"; // String | Cpf do cliente que possui o contrato.
String operador = "operador_example"; // String | Código do operador.
try {
    ExclusaoPagamentoResponse result = apiInstance.contratosIdCancelamentoPut(clientId, accessToken, id, xAuthorization, codigoLojista, cpf, operador);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContratoApi#contratosIdCancelamentoPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **id** | **String**| O número do contrado a ser cancelado. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |
 **cpf** | **String**| Cpf do cliente que possui o contrato. |
 **operador** | **String**| Código do operador. |

### Return type

[**ExclusaoPagamentoResponse**](ExclusaoPagamentoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contratosIdExclusaoPagamentoDelete"></a>
# **contratosIdExclusaoPagamentoDelete**
> ExclusaoPagamentoResponse contratosIdExclusaoPagamentoDelete(clientId, accessToken, id, xAuthorization, codigoLojista, cpf, operador)



Permitir a exclusão, apenas em D0, do pagamento mais recente de um contrato. É importante observar que um pagamento pode englobar uma ou várias parcelas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContratoApi;


ContratoApi apiInstance = new ContratoApi();
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
String id = "id_example"; // String | O número do contrado a ser cancelado.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
String cpf = "cpf_example"; // String | Cpf do cliente que possui o contrato.
String operador = "operador_example"; // String | Código do operador.
try {
    ExclusaoPagamentoResponse result = apiInstance.contratosIdExclusaoPagamentoDelete(clientId, accessToken, id, xAuthorization, codigoLojista, cpf, operador);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContratoApi#contratosIdExclusaoPagamentoDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **id** | **String**| O número do contrado a ser cancelado. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |
 **cpf** | **String**| Cpf do cliente que possui o contrato. |
 **operador** | **String**| Código do operador. |

### Return type

[**ExclusaoPagamentoResponse**](ExclusaoPagamentoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contratosIdGet"></a>
# **contratosIdGet**
> GetContratosResponse contratosIdGet(id, clientId, accessToken, codigoLojista)



Esta funcionalidade tem como objetivo recuperar as informações de um contrato vinculado a um determinado cliente. Como resultado, será possível averiguar o saldo total deste contrato, além da lista de parcelas que o compõe, de forma detalhada, com informações especificas por parcela. Nesta modalidade de chamada, a pesquisa será realizada a partir do código do contrato.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContratoApi;


ContratoApi apiInstance = new ContratoApi();
String id = "id_example"; // String | Identificador do contrato.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
try {
    GetContratosResponse result = apiInstance.contratosIdGet(id, clientId, accessToken, codigoLojista);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContratoApi#contratosIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador do contrato. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |

### Return type

[**GetContratosResponse**](GetContratosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contratosIdSolicitacaoPagamentosPost"></a>
# **contratosIdSolicitacaoPagamentosPost**
> SolicitacaoPagamentoResponse contratosIdSolicitacaoPagamentosPost(id, clientId, accessToken, solicitacaoPagamento)



Esta funcionalidade tem como objetivo realizar uma solicitação de pagamento de parcelas em aberto de determinado contrato. Como resultado da solicitação, são retornadas as informações das parcelas que foram pagas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContratoApi;


ContratoApi apiInstance = new ContratoApi();
String id = "id_example"; // String | Identificador do contrato.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
SolicitacaoPagamentoRequest solicitacaoPagamento = new SolicitacaoPagamentoRequest(); // SolicitacaoPagamentoRequest | Informações sobre o pagamento a ser realizado em um contrato.
try {
    SolicitacaoPagamentoResponse result = apiInstance.contratosIdSolicitacaoPagamentosPost(id, clientId, accessToken, solicitacaoPagamento);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContratoApi#contratosIdSolicitacaoPagamentosPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador do contrato. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **solicitacaoPagamento** | [**SolicitacaoPagamentoRequest**](SolicitacaoPagamentoRequest.md)| Informações sobre o pagamento a ser realizado em um contrato. |

### Return type

[**SolicitacaoPagamentoResponse**](SolicitacaoPagamentoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contratosParcelasGet"></a>
# **contratosParcelasGet**
> GetParcelasResponse contratosParcelasGet(clientId, accessToken, codigoLojista, cpf, dataInicio, dataFim)



Esta funcionalidade tem como objetivo recuperar as informações de parcelas pagas sobre um contrato vinculado a um determinado cliente, dentro de um período.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContratoApi;


ContratoApi apiInstance = new ContratoApi();
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
String cpf = "cpf_example"; // String | Cpf do cliente que possui o contrato.
String dataInicio = "dataInicio_example"; // String | Data de início da busca. Limitada a 90 dias anteriores à data de movimento atual. (Formato yyyy-MM-dd)
String dataFim = "dataFim_example"; // String | Data de fim da busca. Pode variar entre a data de movimento atual e os 90 dias que a antecedem. (Formato yyyy-MM-dd)
try {
    GetParcelasResponse result = apiInstance.contratosParcelasGet(clientId, accessToken, codigoLojista, cpf, dataInicio, dataFim);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContratoApi#contratosParcelasGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |
 **cpf** | **String**| Cpf do cliente que possui o contrato. |
 **dataInicio** | **String**| Data de início da busca. Limitada a 90 dias anteriores à data de movimento atual. (Formato yyyy-MM-dd) |
 **dataFim** | **String**| Data de fim da busca. Pode variar entre a data de movimento atual e os 90 dias que a antecedem. (Formato yyyy-MM-dd) |

### Return type

[**GetParcelasResponse**](GetParcelasResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contratosStatusGet"></a>
# **contratosStatusGet**
> GetStatusContratoResponse contratosStatusGet(clientId, accessToken, cpf)



Esta funcionalidade tem como objetivo recuperar as informações de status de um contrato vinculado a um determinado cliente.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContratoApi;


ContratoApi apiInstance = new ContratoApi();
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
String cpf = "cpf_example"; // String | Cpf do cliente que possui o contrato.
try {
    GetStatusContratoResponse result = apiInstance.contratosStatusGet(clientId, accessToken, cpf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContratoApi#contratosStatusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **cpf** | **String**| Cpf do cliente que possui o contrato. |

### Return type

[**GetStatusContratoResponse**](GetStatusContratoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

