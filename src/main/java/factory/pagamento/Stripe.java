package factory.pagamento;

public class Stripe implements Pagamento {
    public void processar(double valor) {
        System.out.println("💳 Stripe: pagamento de " + valor);
    }
}
