package factory.transporte;

public class TransporteFactory {
    public static Transporte escolher(double distancia, double orcamento) {
        if (distancia > 10 && orcamento >= 4.5) return new Onibus();
        if (distancia <= 10 && orcamento > distancia * 3) return new Taxi();
        return new PatineteEletrico();
    }
}
