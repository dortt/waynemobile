# Wayne Mobile

Aplicação Java de teste para a 4ª Plataforma.

## Sobre

WayneMobile é um sistema de API's para inclusão e exclusão de CDR e inclusão de Clientes.

## Recursos e Softwares

* [Maven](https://maven.apache.org/) - Dependency Management
* [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) - Java Development Kit
* [Spring Boot 2.2.5](https://start.spring.io/) - Spring Boot Initializr
* [IntelliJ IDEA](https://www.jetbrains.com/?utm_source=product&utm_medium=link&utm_campaign=IC&utm_content=2019.1) - IDE
* [MySQL 5.7.28](https://dev.mysql.com/downloads/mysql/) - Database Engine
* [TortoiseGIT](https://tortoisegit.org/) - Interface (GUI) para Windows Explorer
* [Postman](https://www.postman.com/downloads) - Collaborative API Test Platform

## Documentação

O arquivo de configuração (database, porta, etc.) encontra-se em:

```
src/main/resources/application.resources
```

Url Padrão:

```
http://localhost:8085/
```
### Compilar

* Primeiro configurar a conexão MySQL no _"application.resources"_
* Na pasta raiz do projeto

```
Gerar o pacote
./mvnw clean package

ou

Rodar Aplicação 
./mvnw spring-boot:run
```

### CDR
Trata-se de todos acessos feitos pelos clientes (clique em endereços da web, ligação, envio de sms, etc.)

**Cadastro**
```
URL (Método: POST)
http://localhost:8085/api/cdr/create
```
```
Parâmetros em formato JSON (obrigatórios)
{
  "action": "url",
  "address": "http://seusite.com.br/"
}
```
```
Retorno em formato JSON
{
  "id": 1,
  "action": "url",
  "address": "http://seusite.com.br/"
}
```

**Deletar**
```
URL (Método: DELETE)
http://localhost:8085/api/cdr/delete/{id}
```
```
Retorno em formato JSON (se {id} existir)
{
  "deleted": true
}
```

### Clientes
Cadastro de clientes com Nome e CPF.

**Cadastro**
```
URL (Método: POST)
http://localhost:8085/api/client/create
```
```
Parâmetros em formato JSON (obrigatórios e CPF precisa ser válido)
{
  "name": "John Doe",
  "cpf": "00000000000"
}
```
```
Retorno em formato JSON
{
  "id": 1,
  "name": "John Doe",
  "cpf": "00000000000"
}
```

## Authors

* **Willians Joseph Dortt** - *Versão 1.0* - [dortt](https://github.com/dortt)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Agradecimentos

* *Lucas Mognilnik* pela indicação
* *Thomas da Costa* pela oportunidade
