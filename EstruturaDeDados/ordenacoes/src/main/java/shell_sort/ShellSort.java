package shell_sort;

import funcoes.FuncoesBasicas;

public class ShellSort {
    
    public static void main(String[] args) {
        
        FuncoesBasicas funcoesBasicas = new FuncoesBasicas();
        
        int[] vetor = funcoesBasicas.seedVetor();

        funcoesBasicas.printArray(vetor, false);

        shellSort(vetor, vetor.length);

        funcoesBasicas.printArray(vetor, true);
    }

    private static void shellSort(int[] vetor, int vetorSize) {
        int h = setH(vetorSize);
        
        for (int i = 0; i < vetorSize; i++) {
            int aux;
            if(i+h>vetorSize-1){
                break;
            }
            if(vetor[i]>vetor[i+h]){
                aux = vetor[i];
                vetor[i] = vetor[i+h];
                vetor[i+h] = aux;
            } 
            h = setH(h);
        }
        
        
    }

    private static int setH(int h){
        if(h==1) return 0;
        if(h % 2 == 0) h = h/2;
            else h = h/2 +1;
        return h;
    }
}
