package factory.transporte;

public class MainTransporte {
    public static void main(String[] args) {
        Transporte t = TransporteFactory.escolher(5, 50);
        t.usar(5);
    }
}
