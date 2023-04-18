public class Viagem {
    String partida ;
    String destino;
    String modo;
    int horario;


    public Viagem(String partida, String destino,String modo, int horario){
        this.partida = partida;
        this.destino = destino;
        this.modo = modo;
        this.horario = horario;
    }

    public String getPartida(){
        return partida;
    }

    public String getDestino(){
        return destino;
    }
    public String getModo(){
        return modo;
    }
    public int getHorario(){
        return horario;
    }
}
