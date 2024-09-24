# Jogo da Velha em Java

Este é um simples Jogo da Velha (Tic-Tac-Toe) desenvolvido em Java, jogável no terminal, para dois jogadores. O projeto foi criado com o objetivo de praticar conceitos básicos de programação em Java, como manipulação de arrays, controle de fluxo e interação com o usuário via console.

## Funcionalidades

- Jogo para dois jogadores: "X" e "O".
- Jogada alternada entre os jogadores.
- Validação de jogadas.
- Verificação de vitória ou empate.
- Interface simples de texto no terminal.

## Como Executar o Jogo

### Pré-requisitos

- **Java** (JDK) instalado na sua máquina.
- Um ambiente de desenvolvimento integrado (IDE) como Visual Studio Code, IntelliJ IDEA ou o terminal.

### Passos para execução

1. **Clone o repositório** para sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/jogo-da-velha-java.git
**Navegue até o diretório do projeto**:
-   `cd jogo-da-velha-java`

**Compile o código**:
No terminal, execute o seguinte comando para compilar o código-fonte do jogo:
-   `javac JogoDaVelha.java`

**Execute o jogo**:
Após a compilação, inicie o jogo executando o comando abaixo:
-   `java JogoDaVelha`

 **Jogue**:

-   O jogo será exibido no console e pedirá para que os jogadores insiram os números correspondentes às posições no tabuleiro.
-   O jogo alterna entre os jogadores "X" e "O" até que haja um vencedor ou um empate.

## Tabuleiro do Jogo
O tabuleiro possui as seguintes posições numéricas que os jogadores devem escolher:

<div align="center">
  
1 | 2 | 3 

4 | 5 | 6

7 | 8 | 9
</div>
Os jogadores devem escolher um número de 1 a 9 para marcar a sua jogada.

## Exemplo de Execução
  1 2 3
  
  4 5 6
  
  7 8 9

Jogador X, escolha um número: 5

  1 2 3
  
  4 X 6
  
  7 8 9

Jogador O, escolha um número: 1

  O 2 3
  
  4 X 6
  
  7 8 9

## Melhorias Futuras

-   Adicionar uma interface gráfica (GUI) utilizando Java Swing ou JavaFX.
-   Adicionar um modo de jogo contra a CPU.
-   Implementar o uso de inteligência artificial para um oponente mais desafiador.
