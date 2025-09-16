package factory.pagamento;

public class MainPagamento {
    public static void main(String[] args) {
        Pagamento p1 = PagamentoFactory.criar("paypal");
        p1.processar(100);

        Pagamento p2 = PagamentoFactory.criar("pix");
        p2.processar(50);
    }
}
