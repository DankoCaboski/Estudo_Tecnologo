import java.util.*;

/*05. Escreve um programa que sorteio, aleatoriamente, 10 números e armazene estes em um vetor.
Em seguida, o usuário digita um número e seu programa em Java deve acusar se o número digitado está no vetor ou não.
Se estiver, diga a posição que está. */
public class Ex5 {
    int array[] = new int [10];
    Random gerador = new Random();
    Scanner leitor = new Scanner(System.in);
    public String random() {
        int procurado = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = gerador.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Informe o número a ser procurado");//debug printa a matriz na tela

        procurado= leitor.nextInt();
        if(Arrays.asList(array).contains(procurado)){
            return "O index do número procurado é: "+ Arrays.asList(array).indexOf(procurado);
            }else{return "O número não esta na matriz aleatoria";}
        }
    }

