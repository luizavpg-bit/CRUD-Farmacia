<table>
<tr>

<td width="35%" align="center">

<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original-wordmark.svg" width="180"/>

</td>

<td width="65%">

# ✨ Farmácia: API RESTful com Spring Boot

<img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
<img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">

Repositório referente à resolução da atividade prática avaliada **WEB-JAVA-08 — Performance Goal Check — Bloco 02**, proposta pela Generation Brasil: um Projeto Spring, baseado no Projeto Blog Pessoal, implementando um Sistema de Comércio Eletrônico (e-commerce) de uma Farmácia.

</td>

</tr>
</table>

---

## 🌸 Sobre o projeto

A atividade consiste em desenvolver uma API REST para o gerenciamento de uma Farmácia, contemplando dois recursos principais — **Categoria** e **Produto** — relacionados entre si por meio de uma associação do tipo **Um para Muitos (1:N)**.

```
Categoria (1) ───── (N) Produto
```

---

## 🌸 Habilidades trabalhadas

- Construção de API RESTful com **Spring Boot 3**
- Mapeamento Objeto-Relacional (ORM) com **Spring Data JPA** e **Hibernate**
- Persistência e manipulação de dados relacionais com **MySQL**
- Validação de Dados de Entrada (**Bean Validation / Jakarta Validation**)
- Mapeamento de Relacionamento **1:N** e **N:1** entre entidades (**@OneToMany** e **@ManyToOne**)
- Testes e validação de requisições HTTP (`GET`, `POST`, `PUT`, `DELETE`) via **Insomnia**
- Versionamento com **Git/GitHub**, utilizando branches para cada etapa do desenvolvimento

---

## 🌸 Estrutura do projeto

```text
com.generation.farmacia
 ├── FarmaciaApplication.java
 ├── controller
 │    ├── CategoriaController.java
 │    └── ProdutoController.java
 ├── model
 │    ├── Categoria.java
 │    └── Produto.java
 └── repository
      ├── CategoriaRepository.java
      └── ProdutoRepository.java
```

---

## 🌸 Endpoints da API

### 🏷️ Categorias (`/categorias`)

- `GET /categorias` — Listar todas as categorias
- `GET /categorias/{id}` — Buscar categoria por ID
- `GET /categorias/descricao/{descricao}` — Buscar categorias por descrição (Case Insensitive)
- `POST /categorias` — Criar nova categoria
- `PUT /categorias` — Atualizar categoria existente
- `DELETE /categorias/{id}` — Deletar categoria por ID

### 💊 Produtos (`/produtos`)

- `GET /produtos` — Listar todos os produtos
- `GET /produtos/{id}` — Buscar produto por ID
- `GET /produtos/nome/{nome}` — Buscar produtos por nome (Case Insensitive)
- `POST /produtos` — Criar novo produto vinculado a uma categoria existente
- `PUT /produtos` — Atualizar produto existente (Valida existência do produto e da categoria)
- `DELETE /produtos/{id}` — Deletar produto por ID

---

## 🌸 Requisitos do Projeto

- A entidade **Categoria** possui, no mínimo, o atributo `id`, mais um atributo de livre escolha e o relacionamento com a entidade **Produto**.
- A entidade **Produto** possui, no mínimo, o atributo `id`, mais quatro atributos de livre escolha e o relacionamento **1:N** com a entidade **Categoria**.
- CRUD completo implementado para ambos os recursos, contemplando os seis métodos obrigatórios:
  1. Listar todos os registros persistidos
  2. Buscar um registro pelo identificador (ID)
  3. Listar registros com base em um atributo específico da entidade
  4. Cadastrar novos registros
  5. Atualizar registros existentes
  6. Remover registros do banco de dados

---

## 🛢️ Configuração do Banco de Dados

1. Certifique-se de ter o **MySQL** instalado e em execução na sua máquina.
2. Verifique o arquivo `src/main/resources/application.properties`:

```properties
spring.application.name=farmacia
spring.datasource.url=jdbc:mysql://localhost:3306/db_farmacia?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

O Spring Data JPA criará a base de dados `db_farmacia` e as tabelas `tb_categorias` e `tb_produtos` automaticamente ao iniciar a aplicação.

---

## 🌸 Como executar

1. **Clonar o repositório:**

```bash
git clone https://github.com/luizavpg-bit/CRUD-Farmacia.git
```

2. **Aceder à pasta do projeto:**

```bash
cd CRUD-Farmacia
```

3. **Configurar o banco de dados** seguindo os passos da seção [Configuração do Banco de Dados](#-configuração-do-banco-de-dados) acima.

4. **Executar o projeto:**

```bash
mvn spring-boot:run
```

5. **Aceder e testar a API:** A aplicação estará em execução em `http://localhost:8080`. Você pode importar as requisições no Insomnia ou Postman para testar os endpoints.

---

## 🌸 Tecnologias utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- Jakarta Validation
- MySQL
- Maven

---

## 👤 Desenvolvido por:

**Luiza Valentina Paolinelli Guimarães**
