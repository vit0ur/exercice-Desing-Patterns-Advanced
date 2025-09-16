package factory.transporte;

public class Taxi implements Transporte {
    public void usar(double km) {
        System.out.println("🚕 Taxi: corrida de " + km + " km. Total R$ " + (km * 3));
    }
}
