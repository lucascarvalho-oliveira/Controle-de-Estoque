# Sistema de Controle de Estoque
Este é um sistema simples de controle de estoque desenvolvido em Java. Ele permite gerenciar produtos, e consultar o estado atual do estoque para auxiliar pequenas operações e estudos.

## Funcionalidades
- Cadastro de produtos (nome, código, preço, quantidade);
- Adicionar quantidade ao estoque
- Remover quantidade do estoque
- Listar produtos cadastrados
- Validação para evitar estoque negativo
  - Impede adição de valores menores ou iguais a zero
- Remoção de quantidade do estoque
  - Impede remoção de valores menores ou iguais a zero
  - Impede estoque negativo
- Cálculo automático do valor total em estoque
- Validação de regras de negócio no próprio modelo

## Tecnologias Utilizadas
- Java 25
- Programação Orientada a Objetos (POO)
- Estruturas de dados em memória (ex: List)

## Estrutura do Projeto
src/
├── main/        # Classe principal (execução do sistema)
├── produtos/    # Classe Produto

## Como Executar
1. Clonar o repositório
git clone https://github.com/lucascarvalho-oliveira/Controle-de-Estoque.git
cd Controle-de-Estoque
2. Compilar o projeto
No terminal, execute:
javac -d bin src/**/*.java
3. Executar o sistema
java -cp bin main.Main

## Objetivo do Projeto
- Aplicar conceitos de POO
- Trabalhar com encapsulamento
- Implementar regras de negócio básicas
- Simular um sistema real de controle de estoque
