package factory.transporte;

public class PatineteEletrico implements Transporte {
    public void usar(double minutos) {
        System.out.println("🛴 Patinete: " + minutos + " min. Custo R$ " + (minutos * 0.5));
    }
}
