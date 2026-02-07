Documentação do Projeto – Lista de Tarefas com Spring Boot

Sobre o Projeto

Este é um CRUD (Create, Read, Update, Delete) de tarefas (To-Do List) desenvolvido em Java com Spring Boot.
A aplicação permite que o usuário:

✅ Crie novas tarefas
✅ Liste tarefas existentes
✅ Atualize informações de uma tarefa
✅ Exclua tarefas
✅ Trate exceções de forma adequada em cada método

Este projeto é ideal para quem está aprendendo Spring Boot, REST APIs, Spring Data JPA e MVC no Java.

Tecnologias Utilizadas

Tecnologia                    Versão / Uso
Java	                    Linguagem principal
Spring Boot	               Framework backend
Spring Data JPA	        Acesso ao banco de dados
Maven	                Gerenciamento de dependências
Banco de dados	               PostgreSql
Lombok (opcional)	      Geração de getters/setters

Estrutura de Pastas (Exemplo)

src
├── main
│   ├── java
│   │   └── com.exemplo.tarefas
│   │       ├── controller
│   │       │   └── taskControl.java
│   │       ├── domain
│   │       │   └── Tasks.java
│   │       ├── repository
│   │       │   └── TaskRepository.java
│   │       ├── service
│   │       │   └── TaskService.java
│   │       ├──infra
│   │       │   └── RestExceptionHandler.java
│   │       └── exception
│   │           └── AllException.java
│   └── resources
│       └── application.properties

Testes (Opcional)

Use testes de unidade com insomnia ou PostMan para validar:

✔ Criação de tarefas
✔ Atualização
✔ Exclusão
✔ Tratamento de erro

Executando o Projeto

1. Clone o repositório:

   git clone https://github.com/MatheusCristophi/Lista-de-Tarefas-spring-boot.git

2. Entre no diretório:

   cd Lista-de-Tarefas-spring-boot

3. Rode com Maven:

    mvn spring-boot:run

4. Acesse sua API em:

    http://localhost:8080/api/tarefas
