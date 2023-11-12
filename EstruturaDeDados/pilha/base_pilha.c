#include <stdio.h>
#include <stdlib.h>

typedef struct celula {
    int valor;
    struct celula *inferior;
} celula;

celula* empilhar(celula** topo, int n);

int main() {
    celula *topo = NULL;

    topo = empilhar(&topo, 4);

    printf("%d", desempilhar(&topo));

    return 0;
}

celula* empilhar(celula **topo, int n) {
    celula *novo = malloc(sizeof(celula));
    if (novo) {
        novo->valor = n;
        novo->inferior = *topo;
        *topo = novo; // Update the value of the pointer to the top of the stack
        return novo;
    } else {
        printf("%s", "erro ao alocar memoria");
        return NULL;
    }
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
