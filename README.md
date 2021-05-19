# Criação da segunda API.

Fiz a busca via WebClient dos CEPs mockados na [Primeira API](https://github.com/mtscarneiro/winetest1), para retorno da loja física mais próxima.
Com inserção de dados mockados também para CEP do usuário, fiz a recuperação da primeira api assim:

```java
public WebClient webClient(WebClient.Builder builder) {
		return builder
		.baseUrl("http://localhost:8080")
		.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
		.build();
	}
```
- Recuperei e inseri numa nova classe os dados da primeira api usando esse método:

```java

        Mono<ClassX> monostore = this.webClient
                .method(HttpMethod.GET)
                .uri("/xxxx/{id}", id)
                .retrieve()
                .bodyToMono(ClassX.class);

        ClassX ns = monostore.block();
        
        return ns;
}
```

Obs: No run, na classe TestConfig, tive que mockar o ID também para que pudesse concluir o resgate do codigo da loja declarado na primeira api.

Essa segunda API, também fiz pra que desse pra inserir novos "clientes" pois a inserção de CEPS próprios, para descobrir qual a loja mais próxima, está liberado.


