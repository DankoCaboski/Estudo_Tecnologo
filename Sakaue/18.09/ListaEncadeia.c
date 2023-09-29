#include <stdio.h>
#include <stdlib.h>

int main() {
    
    struct no {
        int valor;
        struct no *seg;
    };
    
    struct no *cabeca = (struct no *)malloc(sizeof(struct no));
    cabeca->seg=NULL;
    cabeca->valor=0;


    for (int i = 5; i >0; i--) {
        struct no *celula = (struct no *)malloc(sizeof(struct no));
        
        celula->valor = i;
        celula->seg = cabeca->seg;
        cabeca->seg = celula;      
    }
    
    struct no *temp;
    struct no *atual = (struct no *)malloc(sizeof(struct no));
    atual = cabeca;
    while (atual != NULL) {
        printf("%d", atual->valor);
        temp=atual;
        atual = atual->seg;
        free(temp);

    }

    return 0;
}
