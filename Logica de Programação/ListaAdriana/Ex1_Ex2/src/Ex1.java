public class Ex1 {
    /*
     * 1. Modele uma conta. A ideia aqui é apenas modelar, isto é, só identifique que informações são
     *importantes. Desenhe no papel tudo o que uma conta tem e tudo o que ela faz. Ela deve ter o nome
     *do titular ( String ), o número ( int ), a agência ( String ), o saldo ( double ) e uma data de
     *abertura ( String ). Além disso, ela deve fazer as seguintes ações: saca, para retirar um valor do
     *saldo; deposita, para adicionar um valor ao saldo; calculaRendimento, para devolver o rendimento
     */

    public String titular;
    public int numero;
    public String agencia;
    private Double saldo;
    private String abertura = "12/03/2023";

    public Double sacar(Double val){
        this.saldo = this.saldo-val;
        return this.saldo;
    }

    public void depositar(Double val){
        this.saldo = this.saldo+val;
    }

    public Double calculaRendimento(){
    
        return saldo*0.1;
    }
}
