import java.util.Scanner;

public class Main {

    // Tabuleiro do jogo (3x3)
    private static char[][] tabuleiro = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    // Jogador atual
    private static char jogadorAtual = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogoAtivo = true;
        int jogadas = 0;

        // Enquanto o jogo estiver ativo e houver jogadas restantes
        while (jogoAtivo && jogadas < 9) {
            exibirTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", escolha um número: ");
            int escolha = scanner.nextInt();

            // Verifica se a escolha é válida e atualiza o tabuleiro
            if (escolhaValida(escolha)) {
                atualizarTabuleiro(escolha);
                jogadas++;

                // Verifica se o jogador atual venceu
                if (verificarVitoria()) {
                    exibirTabuleiro();
                    System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu!");
                    jogoAtivo = false;
                } else if (jogadas == 9) {
                    // Verifica se deu empate
                    exibirTabuleiro();
                    System.out.println("Empate! Ninguém venceu.");
                } else {
                    // Troca de jogador
                    trocarJogador();
                }
            } else {
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    // Exibe o tabuleiro atual
    private static void exibirTabuleiro() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Verifica se a escolha do jogador é válida
    private static boolean escolhaValida(int escolha) {
        // Converte a escolha para coordenadas no tabuleiro
        int linha = (escolha - 1) / 3;
        int coluna = (escolha - 1) % 3;
        // Verifica se a posição escolhida ainda contém um número (não foi marcada)
        return tabuleiro[linha][coluna] != 'X' && tabuleiro[linha][coluna] != 'O';
    }

    // Atualiza o tabuleiro com a jogada do jogador atual
    private static void atualizarTabuleiro(int escolha) {
        int linha = (escolha - 1) / 3;
        int coluna = (escolha - 1) % 3;
        tabuleiro[linha][coluna] = jogadorAtual;
    }

    // Troca de jogador (de 'X' para 'O' ou de 'O' para 'X')
    private static void trocarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    // Verifica se o jogador atual venceu o jogo
    private static boolean verificarVitoria() {
        // Verifica linhas, colunas e diagonais
        return (verificarLinha() || verificarColuna() || verificarDiagonais());
    }

    // Verifica se há uma linha com três símbolos iguais
    private static boolean verificarLinha() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
        }
        return false;
    }

    // Verifica se há uma coluna com três símbolos iguais
    private static boolean verificarColuna() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true;
            }
        }
        return false;
    }

    // Verifica se há uma diagonal com três símbolos iguais
    private static boolean verificarDiagonais() {
        return (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
                (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual);
    }
}
