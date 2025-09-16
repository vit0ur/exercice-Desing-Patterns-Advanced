package factory.pagamento;

public class Paypal implements Pagamento {
    public void processar(double valor) {
        System.out.println("💲 Paypal: cobrando " + (valor * 1.05) + " (5% taxa)");
    }
}
