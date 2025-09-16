package factory.pagamento;

import java.util.UUID;

public class Boleto implements Pagamento {
    public void processar(double valor) {
        String codigo = UUID.randomUUID().toString().substring(0, 8);
        System.out.println("📄 Boleto: R$ " + valor + " Código: " + codigo);
    }
}
