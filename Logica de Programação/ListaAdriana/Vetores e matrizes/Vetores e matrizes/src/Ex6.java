/*06.  Implemente um programa em Java que peça 10 números,
armazene eles em um vetor e diga qual elemento é o maior, e seu valor. */
public class Ex6 {
    Ex1 ex1 = new Ex1();
    public String maior(){
        int n = Integer.parseInt(ex1.recebeLista());
        return "O maior número é: "+n+"\nNo index: "+ex1.getIndexof(n);
    }
}
