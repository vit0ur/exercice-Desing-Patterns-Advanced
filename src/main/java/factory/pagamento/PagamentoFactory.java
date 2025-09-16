package factory.pagamento;

public class PagamentoFactory {
    public static Pagamento criar(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "paypal" -> new Paypal();
            case "stripe" -> new Stripe();
            case "pix" -> new Pix();
            case "boleto" -> new Boleto();
            default -> throw new IllegalArgumentException("Provedor desconhecido");
        };
    }
}
