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

    embaralhar(&topo);

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

    novo->nipe = tipo[nipe - 1];

    novo->inferior = *topo;
    *topo = novo;
        
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

void embaralhar(celula **topo) {
    celula *nova_pilha = NULL;
    int tamanho = 0;

    // Calculate the size of the linked list
    celula *atual = *topo;
    while (atual != NULL) {
        tamanho++;
        atual = atual->inferior;
    }

    // Shuffle the linked list
    for (int i = 0; i < tamanho; i++) {
        // Generate a random number between 0 and tamanho - i - 1
        int random_index = rand() % (tamanho - i);

        // Find the node at the random index
        atual = *topo;
        for (int j = 0; j < random_index; j++) {
            if(atual->posicao != 0){
                atual = atual->inferior;
            }
            
        }

        // Remove the node from the original linked list
        if (atual == *topo) {
            *topo = atual->inferior;
        } else {
            celula *anterior = *topo;
            while (anterior->inferior != atual) {
                anterior = anterior->inferior;
            }
            anterior->inferior = atual->inferior;
        }

        // Add the node to the shuffled linked list
        atual->inferior = nova_pilha;
        nova_pilha = atual;
        topo = &nova_pilha;
    }
}
