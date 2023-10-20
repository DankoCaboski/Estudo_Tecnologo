#include <stdio.h>
#include <stdlib.h>

typedef struct celula {
    int valor;
    char nipe;
    int posicao;
    struct celula *inferior;
} celula;

celula* empilhar(celula** topo, int i, int n);

int main() {
    celula *topo = NULL;

    for (int i = 0; i < 11; i++)
    {
        for (int ii = 0; ii < 5; ii++)
        {
            topo = empilhar(&topo, i, ii);
        }
        
    }

    // desempilhar(&topo);
    if(topo){
    printf("%d",topo->posicao);
    printf("%s", "\n ");
    printf("%c",topo->nipe);

    }
    else
    {
        printf("%s", "TOPO esta null");
    }
    
    return 0;
}

celula* empilhar(celula **topo, int n, int nipe) {

    char tipo[4] = {'p', 'o', 'c', 'e'};

    celula *novo = malloc(sizeof(celula));
    novo->valor = n;
    if (*topo != NULL) {
            novo->posicao = (*topo)->posicao + 1;
    } else {
        novo->posicao = 0;
    }

    novo->nipe=tipo[nipe-1];

    novo->inferior = *topo;
    *topo = novo; // Update the value of the pointer to the top of the stack
    return novo;
}


int desempilhar(celula** topo) {
    if (*topo == NULL) {
        printf("%s", "Stack vazia");
        return -1; // Return some error value
    }
    celula *excluir = *topo;
    *topo = excluir->inferior;
    int valor = excluir->valor;
    free(excluir); // Deallocate memory
    return valor;
}
