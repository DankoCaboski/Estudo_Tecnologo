import java.util.Scanner;

public class BoboResponde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, bobo, i;
        String resposta = "s";
        System.out.print("Digite o número de pessoas na fila: ");
        n = scanner.nextInt();
        System.out.print("Digite o número do bobo da vez: ");
        bobo = scanner.nextInt();
        scanner.close();
        for (i = 2; i <= n; i++) {
            System.out.print("Digite o número da " + i + "ª pessoa na fila: ");
            int numeroPessoa = scanner.nextInt();
            if (numeroPessoa > bobo) {
                resposta = "N";
            }
        }
        System.out.println("O bobo respondeu: " + resposta);
    }
}





