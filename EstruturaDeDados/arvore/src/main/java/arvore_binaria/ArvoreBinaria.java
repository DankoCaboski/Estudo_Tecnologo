package arvore_binaria;

public class ArvoreBinaria {

    private static No primeiroNo = new No(5);
    public static void main(String[] args) {

        primeiroNo.direita = new No(4);
    
        insere(primeiroNo, 3);

        insere(primeiroNo, 2);

        printArvore(primeiroNo);

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
            System.out.println(no.direita.valor);
            return;
        }
        if(no.esquerda == null){
            System.out.println(no.valor);
            return; 
        }
    }

    private static void printDireita(No no){
        System.out.println(primeiroNo.direita.valor);
    }

    private static void printEsquerda(No no){
        System.out.println(primeiroNo.esquerda.valor);
    }
}
