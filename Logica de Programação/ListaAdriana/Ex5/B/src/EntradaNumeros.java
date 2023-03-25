import java.util.Scanner;

public class EntradaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, A, B, C;
        double divisao;
        String resposta;
        
        // Leitura dos dois primeiros números
        System.out.print("Digite dois números inteiros separados por um espaço: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        divisao = (double) a / b;
        System.out.printf("%.2f%n", divisao);
        
        // Leitura dos três próximos números
        System.out.print("Digite três números inteiros separados por um espaço: ");
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        
        // Verificação das condições
        if (A + B == C || A == B || B == A + C || A == B + C || A == C || B == C) {
            resposta = "S";
        } else {
            resposta = "N";
        }
        System.out.println(resposta);
        
        scanner.close();
    }
}
