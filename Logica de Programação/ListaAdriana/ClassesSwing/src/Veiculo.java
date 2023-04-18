public class Veiculo {
    String tipo;
    String marca;
    String modelo;
    int ano;

    public Veiculo(String tipo, String marca, String modelo, int ano){
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getTipo(){
        return tipo;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
}
