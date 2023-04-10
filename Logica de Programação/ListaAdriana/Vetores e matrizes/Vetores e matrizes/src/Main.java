import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ex = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe o exercício");
        ex = leitor.nextInt();

        switch (ex) {
            case 1:
                Ex1 ex1 = new Ex1();
                System.out.println("O maior número é: " +ex1.recebeLista());
                break;
            case 2:
                Ex2 ex2= new Ex2();
                System.out.println(ex2.maiorMenor());
                break;
            case 3:
                Ex3 ex3 = new Ex3();
                System.out.println(ex3.progressãoAritmética());
                break;
            case 4:
                Ex4 ex4 = new Ex4();
                System.out.println(ex4.pregressaoGeometrica());
                break;
            case 5:
                Ex5 ex5 = new Ex5();
                System.out.println(ex5.random());
                break;
            case 6:
                Ex6 ex6 = new Ex6();
                System.out.println(ex6.maior());
                break;
            case 7:
                Ex7 ex7 = new Ex7();
                System.out.println(ex7.jogoDaVelha());
        }
    }
}