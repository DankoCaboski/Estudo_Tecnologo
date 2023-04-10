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
            array[i] = gerador.nextInt(11);
        }
        System.out.println(Arrays.toString(array));//debug printa a matriz na tela
        System.out.println("Informe o número a ser procurado");

        procurado= leitor.nextInt();
        List<Integer> matriz = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            matriz.add(array[i]);
        }
        if(matriz.contains(procurado)){
            return "O index do número procurado é: "+ matriz.indexOf(procurado);
            }else{return "O número não esta na matriz aleatoria";}
        }
    }

