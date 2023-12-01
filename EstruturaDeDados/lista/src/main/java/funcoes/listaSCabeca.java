package funcoes;

import java.util.Random;

import lombok.val;

public class listaSCabeca {
    
private static No primeiroNo = new No(5);

    public static void main(String[] args) {

        primeiroNo.next = new No(10);
        primeiroNo.next.next = new No(15);

        Random r = new Random();
        for(int i = 0; i < 10; i++){
            insere(r.nextInt(50));
        }
        
        System.out.println("Lista inicial:");
        printAll();

        remove(15);
        
        System.out.println("Lista final:");
        printAll();
    }

    private static void insere(int i){
        No temp = primeiroNo;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new No(i);
    }

    private static void remove(int val){
        No temp = primeiroNo;
        while (temp.next != null) {
            if(temp == primeiroNo && temp.valor == val){
                primeiroNo = temp.next;
                return;
            }
            int tempVal = temp.next.valor;
            if(tempVal == val){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
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
