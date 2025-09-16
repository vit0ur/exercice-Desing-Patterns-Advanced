package factory.pagamento;

public class Pix implements Pagamento {
    public void processar(double valor) {
        System.out.println("⚡ Pix: pagamento de " + valor + " (expira em 30min)");
    }
}
