import java.util.Scanner;

public class AlturaDeQuedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura, comprimento, quantidade, anterior;

        int[] entrada = new int[2];

        // Leitura da entrada
        do {
            entrada = leiaInteiros(scanner, 2);
            altura = entrada[0];
            comprimento = entrada[1];

            // Verificação se a entrada é válida
            if (altura != 0) {
                int[] XS = leiaInteiros(scanner, comprimento);

                quantidade = altura - XS[0];
                anterior = XS[0];

                for (int i = 1; i < comprimento; i++) {
                    int x = XS[i];

                    if (x < anterior) {
                        quantidade += anterior - x;
                    }

                    anterior = x;
                }

                System.out.println(quantidade);
            }

        } while (altura != 0);

        scanner.close();
    }

    // Função para ler um array de inteiros a partir do input
    public static int[] leiaInteiros(Scanner scanner, int tamanho) {
        int[] numeros = new int[tamanho];

        String[] entrada = scanner.nextLine().split(" ");

        for (int i = 0; i < tamanho; i++) {
            numeros[i] = Integer.parseInt(entrada[i]);
        }

        return numeros;
    }
}
