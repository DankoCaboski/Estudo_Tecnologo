import java.util.Scanner;

public class Pilha {
    
    private static No top;
    public static void main(String[] args) {
        
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Piha vazia? " + Pilha.isEmpty());
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe  um nome");
            Pilha.push(scanner.nextLine());
        }

        Pilha.printPilha();

        Pilha.ordenarAlfabetico();

        Pilha.printPilha();

        System.out.println("Peek: " + Pilha.peek().nome);

        System.out.println("Pop: " + Pilha.pop().nome);

        System.out.println("Pop: " + Pilha.pop().nome);
       
        Pilha.printPilha();

        System.out.println("Is empty: " + Pilha.isEmpty());

        scanner.close();
    }


    private static boolean isEmpty() {
        if (top == null) return true; else return false;
    }


    public static void push(String nome) {
        No newNode = new No(nome);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        System.out.println(nome + " adicionado com sucesso");
    }

    public static No pop() {
        if (top == null) {
            throw new IllegalStateException("Pilha vazia");
        }
        No carta = top;
        top = top.next;
        return carta;
    }

    public static No peek() {
        if (top == null) {
            throw new IllegalStateException("Pilha vazia");
        }
        return top;
    }

        public static void printPilha() {
        No temp = top;
        while (temp != null) {
            System.out.print(temp.nome + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void ordenarAlfabetico() {
        if (top == null || top.next == null) {
            return;
        }

        No atual = top;
        No teste = null;
        String temp;

        while (atual != null) {
            teste = atual.next;

            while (teste != null) {
                if (atual.nome.compareTo(teste.nome) > 0) {
                    temp = atual.nome;
                    atual.nome = teste.nome;
                    teste.nome = temp;
                }
                teste = teste.next;
            }
            atual = atual.next;
        }
    }
}