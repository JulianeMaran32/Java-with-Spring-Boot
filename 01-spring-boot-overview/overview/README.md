# Spring Boot Boot - Overview

Este é um projeto de exemplo desenvolvido com Spring Boot. Ele oferece uma API REST para gerenciar tarefas, incluindo
funcionalidades de CRUD.

## Pré Requisitos

- Java 17 ou superior
- Maven
- Banco de Dados MySQL

## Instalação

1. Clone o repositório

    ```bash
    git clone https://github.com/JulianeMaran32/Java-with-Spring-Boot
    ```

2. Acesse o diretório

    ```bash
    cd Java-with-Spring-Boot/01-spring-boot-overview/overview
    ```

3. Compile e rode o projeto usando o Maven

    ```bash
    mvn clean spring-boot:run
    ```
   
4. O projeto estará disponível em http://localhost:8080.

## Configuração

O projeto usa um banco de dados MySQL, você precisa configurar o arquivo `application.properties` com as credenciais do
banco:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome-do-banco-de-dados
spring.datasource.username=usuario
spring.datasource.password=sua-senha
```

## Rodando o Projeto

Para rodar a aplicação localmente, use o seguinte comando Maven:

```bash
mvn spring-boot:run
```

## Testes

Para rodar os testes unitários e de integração, use o comando Maven:

```bash
mvn test
```

## Docker

Para rodar o projeto usando Docker, você pode construir a imagem e iniciar o container com os seguintes comandos:

```bash
docker build -t meu-projeto .
docker run -p 8080:8080 meu-projeto
```