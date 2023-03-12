public class Poligono {
    Double base;
    Double altura;
    Double largura;

    public Double calcularArea(){
        return base*altura;
    }

    public Double calcularAltura(){
        return base*altura*largura;
    }

    public Double calcularPerimetro() {
        return 2*(base*altura);
    }
}
