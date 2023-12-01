package select_sort;

import funcoes.FuncoesBasicas;

public class SelectSort {
    public static void main(String[] args) {
        FuncoesBasicas funcoesBasicas = new FuncoesBasicas();

        int[] vetor = funcoesBasicas.seedVetor();

        funcoesBasicas.printArray(vetor, false);

        SelectSort(vetor, vetor.length);

        funcoesBasicas.printArray(vetor, true);
    }

    private static void SelectSort(int[] vetor, int vetorSize){

        for (int i = 0; i < vetorSize; i++) {
            for (int ii = 0; ii < vetorSize; ii++) {
                if (ii == vetorSize-1) {
                    continue;
                }
                boolean found = false;
                int posicao = ii+1;
                int comparacao = vetor[posicao];
                int teste = vetor[ii];
                while (!found) {
                    if (teste > comparacao) {
                        int aux = vetor[ii];
                        vetor[ii] = vetor[ii+1];
                        vetor[ii+1] = aux;
                        found = true;
                    } else{
                        posicao++;
                        if (posicao == vetorSize) {
                            found = true;
                        }
                    }
                }
            }

        }
    }
    
}
