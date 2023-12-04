package funcoes;

import java.util.Random;

public class listaSCabeca {
    
private static No primeiroNo = new No(5);
private static No ultimoNo = primeiroNo;


    public static void main(String[] args) {

        insere(10);
        
        insere(15);

        Random r = new Random();
        for(int i = 0; i < 10; i++){
            insere(r.nextInt(50));
        }
        
        System.out.println("Lista inicial:");
        printAll();

        remove(new No(15));
        
        System.out.println("Lista final:");
        printAll();
    }

    private static void insere(int i){
        ultimoNo.next = new No(i);
        ultimoNo = ultimoNo.next;
    }

    private static void insereNoComeco(No no){
        No temNo = primeiroNo;
        primeiroNo = no;
        primeiroNo.next = temNo;
    }

    private static void remove(No toRemove){
        No temp = primeiroNo;
        No aux = primeiroNo;
        No aux2 = aux.next;
        while (temp.next != null) {
            int tempVal = temp.next.valor;
            int toRemoveVal = toRemove.valor;
            if(temp == primeiroNo && tempVal == toRemoveVal){
                primeiroNo = temp.next;
                return;
            }
            if(tempVal == toRemoveVal){
                primeiroNo = primeiroNo.next;
                while (aux.next != null) {
                    insereNoComeco(aux);
                }
                return;
            }
            aux2 = aux.next;
            aux2.next = aux;
            temp = aux.next;
        }
    }

    private static void printAll(){
        No temp = primeiroNo;
        while (temp.next != null) {
            System.out.println(temp.valor);
            temp = temp.next;
        }   
    }
}
