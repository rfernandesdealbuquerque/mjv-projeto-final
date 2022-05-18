<p align="center">
  <img src="https://github.com/rodrigoflu/mjv-java-school/blob/main/aventura-itens/AventuraLogo.png" alt="Sublime's custom image" width="200"/>
</p>
<h1 align="center">Loja Itens de Aventura - Projeto Final da MJV School Java</h1>

## 🐣 Introdução
Este repositório foi criado para armazenar o código-fonte do Projeto Final desenvolvido para a MJV School Java e hospedar a API no Heroku.

💢 O projeto foi desenvolvido originalmente no repositório https://github.com/rodrigoflu/mjv-java-school/tree/main/aventura-itens. 

Favor acessar link acima para ver todos os commits e ter mais informações. 

O Projeto Final consiste em considerarmos um contexto hipotético (criado pelo próprio aluno) para aplicar o conhecimento adquirido durante a School. 

## 💭 Contexto 
Seu João foi um amante de aventuras a sua vida inteira. Porém, com a idade, não pode mais fazer atividades radicais. Há alguns anos atrás, decidiu abrir uma pequena loja de itens de aventura para se manter perto de sua paixão e potencializar outros amantes de adrenalina. Hoje, seu João está expandindo o seu negócio e quer realizar novas parcerias para disponibilizar os seus produtos em outras lojas.

 <img src="https://github.com/rodrigoflu/mjv-java-school/blob/main/aventura-itens/SeuJoao.png" alt="Sublime's custom image" width="150" align="right"/>


## ✅ Objetivo

Seu João: "Quero um sistema simples e consistente que eu e os meus parceiros possamos utilizar para gerenciar o estoque de produtos, cadastros de clientes e compras realizadas de itens da minha loja. Todas as informações devem ser armazenadas em um banco de dados."

## ❔ Por que uma API REST?

As lojas parceiras provavelmente já possuem o seu próprio sistema, diferente do da loja de João. Assim, ao disponibilizar os recursos em uma API REST, todas as lojas parceiras podem integrá-lo rapidamente aos seus próprios sistemas, podendo assim gerenciar e interagir também com o negócio de Seu João.

## 🚀 Como utilizar

A API foi hospedada na plataforma Heroku. A Endpoint base é: https://rodrigo-aventura-itens-api.herokuapp.com/

A API possui uma documentação disponível no Swagger, acessível no link: https://rodrigo-aventura-itens-api.herokuapp.com/swagger-ui/index.html#/

## 🛠️ Tecnologias & Ferramentas
- Java (Projeto Maven)
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Astah Community
- Eclipse IDE

O projeto foi desenvolvido em Java, utilizando Spring Boot framework. Foi utilizado Spring Data JPA  para implementar a camada de persistência dos dados e o banco de dados PostgreSQL.

## 📝 Diagrama UML

Inicialmente foi desenvolvido um Diagrama de classes UML para conceber visualmente a estrutura do projeto:

![Diagrama](https://github.com/rodrigoflu/mjv-java-school/blob/main/aventura-itens/diagram-uml-aventura-itens.png)

Com o Diagrama mapeado, fica mais fácil implementar os relacionamentos entre as entidades do projeto. 

## 📁 Estrutura e Pacotes

Adicionar texto

## 📦 Regras de Negocio e Funcionalidades

### 1️⃣ Jornada 1 (Seu Joao) - falando de cada funcionalidade com JSON 

#### Criando uma Aventura

 🔐 Para Seu João poder adicionar produtos, é preciso criar a aventura associada aos produtos primeiro. 

* Criando Aventura MERGULHO (criarAventura)

```
{
  "nomeAventura": "MERGULHO"
}
```
#### Adicionando e Alterando Produtos

* Adicionando produtos de MERGULHO (adicionarProduto)

```
{
  "nomeProduto": "MASCARA MERGULHO MORMAII",
  "descricao": "Tamanho grande e cor verde",
  "preco": 46.39,
  "quantidadeEmEstoque": 15,
  "idAventura": 0
}
```
```
{
  "nomeProduto": "ROUPA DE MERGULHO BODY GLOVE",
  "descricao": "Tamanho pequeno tecido elástico",
  "preco": 459.69,
  "quantidadeEmEstoque": 13,
  "idAventura": 0
}
```
```
{
  "nomeProduto": "PE DE PATO KPALOA",
  "descricao": "Tamanho medio tipo Tritão",
  "preco": 99.99,
  "quantidadeEmEstoque": 20,
  "idAventura": 0
}
```

* Listando todos os produtos

* Listando produtos por Aventura

 🔐 Seu João quer poder alterar diretamente as informações dos produtos de sua loja. Eventualmente, será necessário mudar o preço ou atualizar o estoque dos produtos manualmente.

* Alterando o `preco` e `quantidadeEmEstoque` do produto PE DE PATO KPALOA usando o seu `id` (alterarProduto)

```
{
  "nomeProduto": "PE DE PATO KPALOA",
  "descricao": "Tamanho medio tipo Tritão",
  "preco": 75.55,
  "quantidadeEmEstoque": 35,
  "idAventura": 0
}
```

### 2️⃣ Jornada 2 (Seu Joao e lojas parceiras) 
 

## ✒️ Desenvolvedor

Rodrigo Fernandes de Albuquerque
