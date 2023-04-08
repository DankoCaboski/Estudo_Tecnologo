import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*03. Implemente um aplicativo em Java que peça um número inicial ao usuário, uma razão
e calcule os termos de uma P.A (Progressão Aritmética), armazenando esses valores em um vetor de tamanho 10. */
public class Ex3 {
Scanner leitor = new Scanner(System.in);
int leitura[] = new int [2];
    public String progressãoAritmética(){
        List<Integer> listaPA = new LinkedList<Integer>();
        for (int i = 0; i <= 1; i++) {
            System.out.println("Informe "+ (i+1) +"º número:");
            leitura[i] = leitor.nextInt();
            leitor.nextLine();
        }
        listaPA.add(leitura[0]);
        for (int i = 1; i <= 9; i++){
            listaPA.add(listaPA.get(i-1)+leitura[1]);
        }
        return listaPA.toString();
    }

}
