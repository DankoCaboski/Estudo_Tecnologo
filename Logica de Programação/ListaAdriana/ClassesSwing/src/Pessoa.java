public class Pessoa {
    String idade;
    String nome;
    String profissao;

    public Pessoa(String nome,String idade,String profissao){
        this.idade = idade;
        this.nome = nome;
        this.profissao = profissao;
    }

    public String getNome(){
        return nome;
    }

    public String getIdade(){
        return idade;
    }
    public String getProfissao(){
        return profissao;
    }
}
