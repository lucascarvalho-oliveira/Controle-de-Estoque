<p align="center">
  <a href="./README.en.md">
    <img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge">
  </a>
</p>

# Sistema de Controle de Estoque
Este projeto é um simulador de controle de estoque desenvolvido em Java, criado com o objetivo de praticar Programação Orientada a Objetos (POO) e a implementação de regras de negócio básicas.
O sistema permite cadastrar produtos, controlar quantidades em estoque e consultar o valor total armazenado, simulando operações comuns de um pequeno sistema de gestão.

< Este projeto utiliza estrutura de dados em memória, não possui integração com banco de dados.

## Funcionalidades

### Gerenciamento de Produtos

- Cadastro de produtos com:
  - Nome
  - Código
  - Preço
  - Quantidade em estoque
- Listagem de todos os produtos cadastrados

### Controle de Estoque

- Adicionar quantidade ao estoque
- Remover quantidade do estoque
- Atualização automática da quantidade disponível

### Validações de Regras de Negócio
O sistema implementa validações para garantir a consistência dos dados:

### Adição de estoque

- Impede adicionar valores menores ou iguais a zero

 ### Remoção de estoque

- Impede remover valores menores ou iguais a zero
- Impede que o estoque fique negativo

### Cálculos Automáticos

- Cálculo do valor total do estoque

## Tecnologias Utilizadas
- `Java 25`
- Programação Orientada a Objetos `(POO)`
- Estruturas de dados em memória
  - `Map`

## Conceitos Aplicados
Durante o desenvolvimento deste projeto foram aplicados conceitos importantes como:

- Encapsulamento
- Modelagem de objetos
- Separação de responsabilidades
- Validação de regras de negócio
- Estruturação básica de projeto Java

## Estrutura do Projeto

src/
├── main/           # Ponto de entrada (execução)
│   └── Main.java
└── produtos/       # Modelo de dados e regras de negócio
    └── Produto.java

## Como Executar o Projeto
1. Clonar o repositório <br>
`git clone https://github.com/lucascarvalho-oliveira/Controle-de-Estoque.git
cd Controle-de-Estoque`
2. Compilar o projeto <br>
No terminal, execute:<br>
`javac -d bin src/**/*.java`
3. Executar o sistema<br>
`java -cp bin main.Main`

## Objetivo do Projeto
Este projeto foi desenvolvido com fins educacionais, com os seguintes objetivos:

- Praticar **Programação Orientada a Objetos**
- Implementar **regras de negócio em modelos**
- Trabalhar com **estruturas de dados em Java**
- Simular a lógica de um **sistema de controle de estoque**

## Possíveis Melhorias Futuras
Algumas evoluções possíveis para o projeto:

- Integração com **banco de dados**
- Interface gráfica ou web
- Implementação de camada de serviço
- Criação de **testes automatizados**
