package funcoes;

import java.util.Random;

public class FuncoesBasicas {
    
    public void printArray(int[] vetor){
        for (int i : vetor) {
            System.out.println(i);
        }
    }

    public int[] seedVetor(){
        Random random = new Random();
        
        int vetorSize = random.nextInt(11) + 5;

        int[] vetor = new int[vetorSize];

        for(int i = 1; i < vetorSize; i++){
            vetor[i-1] = random.nextInt(11);
        }
        return vetor;
    }
}
