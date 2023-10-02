#include <stdio.h>
#include <stdlib.h>

struct no {
    int valor;
    struct no *seg;
    struct no *anterior;
};

int main() {

    srand(time(NULL)); 
    
    struct no *cabeca = (struct no *)malloc(sizeof(struct no));
    cabeca->seg = NULL;
    cabeca->anterior = NULL;
    cabeca->valor = 0;

    for (int i = 10; i > 0; i--) {
        adicionaNovo(&cabeca,i);
    }

    imprimeLista(&cabeca);

    for (int i = 4; i > 0; i--) {
        adicionaRandom(&cabeca);
    }

    // freeAll(&cabeca);

    imprimeLista(&cabeca);
    return 0;
}

void adicionaNovo(struct no **cabeca,int i) {
    struct no *celula = (struct no *)malloc(sizeof(struct no));

    celula->valor = i;
    celula->seg = (*cabeca)->seg;
    (*cabeca)->anterior=celula;
    (*cabeca)->seg = celula;
    (*cabeca)->anterior = NULL;
}

void adicionaRandom(struct no **cabeca) {
    struct no *posCabeca = (*cabeca);
    struct no *celula = (struct no *)malloc(sizeof(struct no));
    struct no **posicao = (*cabeca); 
    
    int comprimento = getComprimento(&posCabeca);
    int iteracoes = 0;
    int random = rand() % 7;

    while(iteracoes<= random){
        adicionaNovo((&posCabeca), random);
        iteracoes++;
    }
}

void imprimeLista(struct no **cabeca) {
    struct no *atual = (*cabeca)->seg;
    if((*cabeca)->seg==NULL){
        char msg[]  = "A lista esta vazia";
        printf("%s", msg);
    }
    else
    {
        while (atual != NULL) {
        printf("%d ", atual->valor);
        atual = atual->seg;
        }
    }
    
    printf("\n");
}

void freeAll(struct no **cabeca) {
    struct no *atual = (*cabeca)->seg;
    while (atual != NULL) {
        struct no *temp = atual;
        atual = atual->seg;
        free(temp);
    }
    (*cabeca)->seg=NULL;
}

int getComprimento(struct no **cabeca) {
    struct no *atual = (*cabeca)->seg;
    int comprimento = 0;

    while (atual != NULL) {
        comprimento++;
        atual = atual->seg;
    }

    return comprimento;
}
