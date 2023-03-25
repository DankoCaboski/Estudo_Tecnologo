import java.util.Scanner;

public class EntradaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Ca, Ba, Pa, Cr, Br, Pr, resposta = 0;

        // Leitura dos valores da primeira entrada
        System.out.print("Digite os valores da primeira entrada separados por um espaço: ");
        String entrada1 = scanner.nextLine();
        String[] valores1 = entrada1.split(" ");
        Ca = Integer.parseInt(valores1[0]);
        Ba = Integer.parseInt(valores1[1]);
        Pa = Integer.parseInt(valores1[2]);

        // Leitura dos valores da segunda entrada
        System.out.print("Digite os valores da segunda entrada separados por um espaço: ");
        String entrada2 = scanner.nextLine();
        String[] valores2 = entrada2.split(" ");
        Cr = Integer.parseInt(valores2[0]);
        Br = Integer.parseInt(valores2[1]);
        Pr = Integer.parseInt(valores2[2]);

        // Cálculo da resposta
        if (Cr > Ca) {
            resposta += Cr - Ca;
        }
        if (Br > Ba) {
            resposta += Br - Ba;
        }
        if (Pr > Pa) {
            resposta += Pr - Pa;
        }

        System.out.println(resposta);

        scanner.close();
    }
}