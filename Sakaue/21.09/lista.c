#include <stdio.h>
#include <stdlib.h>

struct no {
    int valor;
    struct no *seg;
    struct no *ultimo;
};

int main() {
    struct no *cabeca = (struct no *)malloc(sizeof(struct no));
    cabeca->seg = NULL;
    cabeca->ultimo = NULL;
    cabeca->valor = 0;

    for (int i = 5; i > 0; i--) {
        adicionaNovo(&cabeca,i);
    }

    imprimeLista(&cabeca);
    return 0;
}

void adicionaNovo(struct no **cabeca,int i) {
    struct no *celula = (struct no *)malloc(sizeof(struct no));

    celula->valor = i;
    celula->seg = (*cabeca)->seg;
    (*cabeca)->seg = celula;
    (*cabeca)->ultimo = celula->seg;
}

void imprimeLista(struct no **cabeca) {
    struct no *atual = (*cabeca)->seg;
    while (atual != NULL) {
        printf("%d ", atual->valor);
        atual = atual->seg;
    }
    free(atual);
    printf("\n");
}
