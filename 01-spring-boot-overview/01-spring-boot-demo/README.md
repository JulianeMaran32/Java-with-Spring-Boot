# Spring Boot Demo

## 📌 Sobre o Projeto

Este é um projeto simples em **Spring Boot** que demonstra como criar e executar uma aplicação Java com um **REST
Controller**.

## 🚀 Tecnologias Utilizadas

- **Spring Boot**
- **Maven** (Gerenciamento de dependências)
- **Tomcat** (Servidor embutido)

## 📥 Como Executar o Projeto

1. Clone o repositório:

   ```sh
   git clone https://github.com/JulianeMaran32/Java-with-Spring-Boot.git
   ```
2. Importe o projeto na sua IDE (IntelliJ, Eclipse, VS Code etc.).
3. Execute a classe principal: `MycoolappApplication.java`.
4. A aplicação iniciará na porta **8080**.

## 🛠 Criando um REST Controller

1. Criar uma classe `FunRestController` no pacote `rest`.
2. Adicionar `@RestController` na classe.
3. Criar um método com `@GetMapping("/")` que retorna **"Hello World!"**.

## 🔎 Testando a API

1. Inicie a aplicação.
2. Acesse no navegador: `http://localhost:8080/`
3. O retorno esperado será: **"Hello World!"**

📢 **Pronto! Agora você tem um serviço REST funcional!** 🚀
