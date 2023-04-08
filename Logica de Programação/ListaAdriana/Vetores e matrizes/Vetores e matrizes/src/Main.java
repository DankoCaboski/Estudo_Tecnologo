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
                System.out.println(ex1.recebeLista());
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
        }
    }
}