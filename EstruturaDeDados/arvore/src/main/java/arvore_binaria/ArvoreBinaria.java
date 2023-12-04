package arvore_binaria;

public class ArvoreBinaria {

    private static No raiz = new No(5);
    public static void main(String[] args) {

        raiz.direita = new No(4);
    
        insere(raiz, 3);

        insere(raiz, 2);

        printArvore(raiz);

    }

    private static void insere(No no, int i){
        if(no.valor < i){
            if (no.direita == null) {
                System.out.println("MAIOR Q O PRIMEIRO NÓ");
                no.direita = new No(i);
            }else{
                insere(no.direita, i);
            }
        }else{
            if(no.esquerda == null){
                System.out.println("MENOR Q O PRIMEIRO NÓ");
                no.esquerda = new No(i);
            }else{
                insere(no.esquerda, i);
            }
        }
    }

    private static void printArvore(No no){
        if(no.esquerda != null){
            printArvore(no.esquerda);
            if(no.direita != null){
                printArvore(no.direita);
            }
            // System.out.println(no.direita.valor);
            return;
        }
        if(no.esquerda == null){
            System.out.println(no.valor);
            return; 
        }
    }

    private static void printDireita(No no){
        System.out.println(raiz.direita.valor);
    }

    private static void printEsquerda(No no){
        System.out.println(raiz.esquerda.valor);
    }
}
