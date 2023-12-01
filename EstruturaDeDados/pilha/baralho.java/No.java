public class No {
    public String nome;
    public Integer valor;
    public No next;
    
    No(String nome) {
        this.nome = nome;
        this.valor = null;
        this.next = null;
    }

    public String getValor() {
        return valor.toString();
    }
    public void setValor(Integer valor) {
        this.valor = valor;
    }
    public No getNext() {
        return next;
    }
    public void setNext(No next) {
        this.next = next;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}