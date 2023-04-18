public class Lugar {
    String endereco;
    String nome;
    String tipo;

    public Lugar(String endereco, String nome,String tipo){
        this.endereco = endereco;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }
    public String getTipo(){
        return tipo;
    }
}