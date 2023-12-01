#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct celula {
    int valor;
    struct celula *seg;
} celula;

int main() {
    srand(time(NULL));

    celula *no = malloc(sizeof(celula));

    for (int i = 10; i >= 0; i--) {
        adicionaNovo(&no, i);
    }

    printf("Lista inicial: ");
    imprimeLista(no);

    for (int i = 4; i > 0; i--) {
        adicionaRandom(no);
    }

    printf("Lista com duplicadas: ");
    imprimeLista(no);

    removeDuplicates(&no);
    printf("Lista sem duplicadas: ");
    imprimeLista(no);

    freeAll(no);

    return 0;
}

void adicionaNovo(celula **no, int i) {
    celula *novo = malloc(sizeof(celula));
    novo->valor = i;

    if(*no != NULL) {
        novo->seg = *no;
        *no = novo;
    } else {
        novo->seg = NULL;
        *no = novo;
    }
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

    while (atual->seg != NULL) {
        printf("%d ", atual->valor);
        atual = atual->seg;
    }

    printf("\n");
}


void removeDuplicates(celula **no) {
    // Initialize pointer to first element of linked list
    celula *atual = *no;

    while (atual != NULL) {
        celula *controle = atual;

        while (controle->seg != NULL) {
            if (controle->seg->valor == atual->valor) {
                celula *temp = controle->seg;
                controle->seg = temp->seg;

                if (temp->seg != NULL) {
                    // temp->seg->anterior = controle;
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