package factory.transporte;

public class Onibus implements Transporte {
    public void usar(double valor) {
        System.out.println("🚌 Ônibus: rota fixa, valor R$ 4,50");
    }
}
