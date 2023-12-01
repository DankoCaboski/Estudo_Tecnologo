package mergeSort;

import funcoes.FuncoesBasicas;

public class MergeSort {
    public static void main(String args[]) {

        FuncoesBasicas funcoesBasicas = new FuncoesBasicas();

        int[] vetor = funcoesBasicas.seedVetor();

        funcoesBasicas.printArray(vetor, false);

        mergeSort(vetor, vetor.length);

        funcoesBasicas.printArray(vetor, true);

    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }

        int meio = n / 2;
        int[] esquerda = new int[meio];
        int[] direita = new int[n - meio];

        for (int i = 0; i < meio; i++) {
            esquerda[i] = a[i];
        }

        for (int i = meio; i < n; i++) {
            direita[i - meio] = a[i];
        }

        mergeSort(esquerda, meio);
        mergeSort(direita, n - meio);

        merge(a, esquerda, direita, meio, n - meio);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }

        while (i < left) {
            a[k++] = l[i++];
        }

        while (j < right) {
            a[k++] = r[j++];
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
