/*01. Implemente um programa em Java que peça 10 números,
armazene eles em um vetor e diga qual elemento é o menor, e seu valor.*/

import java.util.*;

public class Ex1 {
    public String recebeLista() {
        Scanner leitor = new Scanner(System.in);
        List<Integer> leitura = new ArrayList<Integer>();
        int maior = 0;
        int menor = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Informe o " + i + "º número");
            leitura.add(leitor.nextInt());
            if (leitura.get(i-1)>maior){
                maior = leitura.get(i-1);
            }
        }
        String res ="";
        res = Integer.toString(maior);
        return "O maior número é: " + res;
    }
}