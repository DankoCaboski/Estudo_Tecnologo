import java.util.Scanner;

public class App {
    /*Jaojão é um garoto sagaz. Sempre que possível, ele vai à Ferpa em busca de cremosas aos finais de semana.
    Agora ele quer dizer a seus amigos a quantiadade À: de cremosas que ele avistou em sua grande terra natal em um
    final de semana. Seja nº (0 < n < 100) o número de cremosas que Jaojão viu no sábado e m (0 < m < 100) o
    número de cremosas que ele viu no domingo, responda a quantidade k de cremosas avistadas.

    Entrada

    A primeira linha contém dois inteiros nº e mm (a quantidade de cremosas avistadas).
    Saída

    Seu programa deverá apresentar um único inteiro k, o total de cremosas. 
    */
    public static void main(String[] args) throws Exception {
        int n;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe n");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("informe n");
        m = sc.nextInt();
        sc.nextLine();
        sc.close();
    
        System.out.println("k = "+ m+n);
    }
}
