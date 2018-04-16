# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ContratoApi;

import java.io.File;
import java.util.*;

public class ContratoApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://dev-api.portocred.com.br/gestao-contrato/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContratoApi* | [**contratosGet**](docs/ContratoApi.md#contratosGet) | **GET** /contratos | 
*ContratoApi* | [**contratosIdCancelamentoPut**](docs/ContratoApi.md#contratosIdCancelamentoPut) | **PUT** /contratos/{id}/cancelamento | 
*ContratoApi* | [**contratosIdExclusaoPagamentoDelete**](docs/ContratoApi.md#contratosIdExclusaoPagamentoDelete) | **DELETE** /contratos/{id}/exclusao-pagamento | 
*ContratoApi* | [**contratosIdGet**](docs/ContratoApi.md#contratosIdGet) | **GET** /contratos/{id} | 
*ContratoApi* | [**contratosIdSolicitacaoPagamentosPost**](docs/ContratoApi.md#contratosIdSolicitacaoPagamentosPost) | **POST** /contratos/{id}/solicitacao-pagamentos | 
*ContratoApi* | [**contratosParcelasGet**](docs/ContratoApi.md#contratosParcelasGet) | **GET** /contratos/parcelas | 
*ContratoApi* | [**contratosStatusGet**](docs/ContratoApi.md#contratosStatusGet) | **GET** /contratos/status | 


## Documentation for Models

 - [CancelamentoContratoResponse](docs/CancelamentoContratoResponse.md)
 - [ErroResponse](docs/ErroResponse.md)
 - [ExclusaoPagamentoResponse](docs/ExclusaoPagamentoResponse.md)
 - [GetContratosContratoResponse](docs/GetContratosContratoResponse.md)
 - [GetContratosParcelaResponse](docs/GetContratosParcelaResponse.md)
 - [GetContratosResponse](docs/GetContratosResponse.md)
 - [GetParcelasParcelaResponse](docs/GetParcelasParcelaResponse.md)
 - [GetParcelasResponse](docs/GetParcelasResponse.md)
 - [GetStatusContratoResponse](docs/GetStatusContratoResponse.md)
 - [IndicativoSimNao](docs/IndicativoSimNao.md)
 - [SituacaoParcela](docs/SituacaoParcela.md)
 - [SolicitacaoPagamentoParcelaResponse](docs/SolicitacaoPagamentoParcelaResponse.md)
 - [SolicitacaoPagamentoRequest](docs/SolicitacaoPagamentoRequest.md)
 - [SolicitacaoPagamentoResponse](docs/SolicitacaoPagamentoResponse.md)
 - [StatusContrato](docs/StatusContrato.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



