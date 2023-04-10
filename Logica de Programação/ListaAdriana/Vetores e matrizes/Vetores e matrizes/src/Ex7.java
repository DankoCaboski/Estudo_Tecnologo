import java.util.*;

/*07 - Criando um tabuleiro de Jogo da Velha
Implemente um tabuleiro de jogo da velha, usando matrizes de caracteres (char) 3x3,
onde o usuário pede o número da linha (1 até 3) e o da coluna (1 até 3).
A cada vez que o usuário entrar com esses dados, colocar um 'X' ou 'O' no local selecionado. */
public class Ex7 {
    int range = 3;
    String[][] tabulaeiro = new String[range][range];
    Scanner leitor = new Scanner(System.in);
    Random gerador = new Random();
    String frase_linha = "Em qual linha quer jogar, 1,2, ou 3?";
    String frase_coluna = "Em qual coluna, 1,2, ou 3?";
    int linha = 0;
    int coluna = 0;
    boolean user = false;
    String userSymbol = "";
    String machineSymbol = "";

    public String jogoDaVelha() {
        System.out.println("vamos jogar!");
        print_tabuleiro();
        System.out.println("Você será 'X' ou 'O'?");
        userSymbol = leitor.nextLine();
        userSymbol = userSymbol.toUpperCase();
        if (userSymbol.contains("X")) {
            user = true;
            user_joga();
            System.out.println("oi");
            System.out.println("Você começa!");
            machineSymbol = "O";
        } else {
            System.out.println("Como sou 'X' eu começo!");
            userSymbol = "O";
            machineSymbol = "X";
            print_tabuleiro();
            maquina_joga();
        }
        while (end_game()==false) {
            if (user) {
                user_joga();
            } else {
                maquina_joga();
            }
            end_game();
        }
        return "O jogo terminou";
    }

    private void maquina_joga() {
        linha = gerador.nextInt(3);
        coluna = gerador.nextInt(3);
        if (tabulaeiro[linha][coluna] != null) {
            while (tabulaeiro[linha][coluna] != null) {
                linha = gerador.nextInt(2);
                coluna = gerador.nextInt(2);
            }
        }
        System.out.println("Vou jogar na linha " + (linha + 1) + "\ne na coluna " + (coluna + 1));
        tabulaeiro[linha][coluna] = machineSymbol;
        user = !user;
        print_tabuleiro();
    }

    private void user_joga() {
        System.out.println(frase_linha);
        linha = leitor.nextInt() - 1;
        System.out.println(frase_coluna);
        coluna = leitor.nextInt() - 1;
        while (tabulaeiro[linha][coluna] != null) {
            System.out.println("Posição já ocupada, informe outra");
            System.out.println(frase_linha);
            linha = leitor.nextInt() - 1;
            System.out.println(frase_coluna);
            coluna = leitor.nextInt() - 1;
        }
        tabulaeiro[linha][coluna] = userSymbol;
        print_tabuleiro();
        user = !user;
    }

    private void print_tabuleiro() {
        for (int i = 0; i < tabulaeiro.length; i++) {
            for (int j = 0; j < tabulaeiro.length; j++) {
                System.out.print(tabulaeiro[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    private boolean end_game() {
        boolean endgame = false;

        for (int l = 0; l < 3; l++) {
            Integer soma = 0;
            List<Integer> index = new LinkedList<>();
            for (int c = 0; c < 3; c++) {
                if (tabulaeiro[l][c] != null){
                if (tabulaeiro[l][c].equals("X")) {
                    index.add(1);
                } else {
                    if (tabulaeiro[l][c].equals("O")) {
                        index.add(0);
                    }
                }
                }else {
                        index.add(null);
                    }

                for (Integer i : index) {
                    if (i != null) {
                        soma = soma + i;
                    }
                }
            }
            if (soma == null) {
                continue;
            } else {
                if ((soma == 0 || soma == 3) && Arrays.asList(tabulaeiro[l]).size() == 3) {
                    endgame = true;
                    break;
                }
            }
            if (endgame) {
                break;
            }
        }
        return endgame;
    }
}
