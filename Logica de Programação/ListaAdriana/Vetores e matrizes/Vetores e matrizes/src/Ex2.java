import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*02. Implemente um programa em Java que peça 10 números, armazene eles em um vetor
e diga qual elemento é o maior, qual é o menor e quais seus valores.*/
public class Ex2 {
    Scanner leitor = new Scanner(System.in);
    List<Integer> leitura = new LinkedList<>();
    int maior;
    int menor;
    public String maiorMenor(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Informe o "+i+" número");
            leitura.add(leitor.nextInt());
            leitor.nextLine();
            if (i == 1){maior = leitura.get(i-1); menor = leitura.get(i-1);}
            if(leitura.get(i-1)>maior){
                this.maior = leitura.get(i-1);
            }else{if(leitura.get(i-1) < menor){this.menor = i;}}
        }
        return "Maior número: " + maior+ "\nMenor número: " +menor;
    }
}
