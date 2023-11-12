package bubble_sort;

import java.util.Random;

import funcoes.FuncoesBasicas;

public class BubbleSort {
    
    public static void main(String[] args) {
        FuncoesBasicas funcoesBasicas = new FuncoesBasicas();

        int[] vetor = funcoesBasicas.seedVetor();

        System.out.println("");
        System.out.println("Antes da ordenação:");
        funcoesBasicas.printArray(vetor);

        bubbleSort(vetor, vetor.length);

        System.out.println("");
        System.out.println("Depois da ordenação:");

        funcoesBasicas.printArray(vetor);
    }

    private static int[] bubbleSort(int[] vetor, int vetorSize) {
        int aux;
        for(int i = 0; i < vetorSize; i++) {
            for(int j = 0; j < vetorSize - i; j++) {
                if (j == vetorSize-1) {
                    continue;
                }
                if(vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        return vetor;
    }
}
