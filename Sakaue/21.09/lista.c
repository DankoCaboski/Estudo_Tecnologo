#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct celula {
    int valor;
    struct celula *seg;
    struct celula *anterior;
} celula;

// Protótipo da função adicionaRandom
void adicionaRandom(celula *cabeca);

int main() {
    srand(time(NULL));

    celula *cabeca = malloc(sizeof(celula));
    cabeca->seg = NULL;
    cabeca->anterior = NULL;
    cabeca->valor = 0;

    for (int i = 10; i > 0; i--) {
        adicionaNovo(cabeca, i);
    }

    printf("Lista inicial: ");
    imprimeLista(cabeca);

    for (int i = 4; i > 0; i--) {
        adicionaRandom(cabeca);
    }

    printf("Lista com duplicadas: ");
    imprimeLista(cabeca);

    removeDuplicates(cabeca);
    printf("Lista sem duplicadas: ");
    imprimeLista(cabeca);

    freeAll(cabeca);

    return 0;
}

void adicionaNovo(celula *cabeca, int i) {
    celula *novo = malloc(sizeof(celula));

    novo->valor = i;
    novo->seg = cabeca->seg;
    cabeca->seg = novo;

    if (novo->seg != NULL) {
        novo->seg->anterior = novo;
    }

    novo->anterior = cabeca;
}

void adicionaRandom(celula *cabeca) {
    int random = rand() % 9+1;

    celula *posCabeca = cabeca->seg;
    int i = 0;

    while (i < random && posCabeca != NULL) {
        posCabeca = posCabeca->seg;
        i++;
    }

    adicionaNovo(posCabeca, random);
}

void imprimeLista(celula *cabeca) {
    celula *atual = cabeca->seg;

    if (atual == NULL) {
        printf("A lista está vazia\n");
    } else {
        while (atual != NULL) {
            printf("%d ", atual->valor);
            atual = atual->seg;
        }
    }

    printf("\n");
}

void removeDuplicates(celula *cabeca) {
    celula *atual = cabeca->seg;

    while (atual != NULL) {
        celula *controle = atual;

        while (controle->seg != NULL) {
            if (controle->seg->valor == atual->valor) {
                celula *temp = controle->seg;
                controle->seg = temp->seg;

                if (temp->seg != NULL) {
                    temp->seg->anterior = controle;
                }

                free(temp);
            } else {
                controle = controle->seg;
            }
        }

        atual = atual->seg;
    }
}

void freeAll(celula *cabeca) {
    celula *atual = cabeca->seg;

    while (atual != NULL) {
        celula *temp = atual;
        atual = atual->seg;
        free(temp);
    }

    cabeca->seg = NULL;
}

int getComprimento (celula *cabeca) {
    int retorno = 0;
    celula *atual = cabeca->seg;

    while (atual != NULL) {
        retorno++;
        atual = atual->seg;
    }
    return retorno;
}