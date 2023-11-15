package arvore_binaria;

public class No {
    public int valor;
    public String conteudo;
    public No esquerda;
    public No direita;

    public No(){}

    public No(int i){
        this.valor = i;
        this.conteudo = Integer.toString(i);
    }
}
