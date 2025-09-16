package singleton.licenca;

public class LicencaSoftware {
    private static LicencaSoftware instance;
    private String chaveAtiva;
    private long validade;

    private LicencaSoftware(String chave, long validade) {
        this.chaveAtiva = chave;
        this.validade = validade;
    }

    public static synchronized LicencaSoftware ativar(String chave, long validadeMillis) {
        if (instance == null) {
            instance = new LicencaSoftware(chave, System.currentTimeMillis() + validadeMillis);
            System.out.println("🔑 Licença ativada: " + chave);
        } else {
            System.out.println("⚠️ Já existe licença ativa!");
        }
        return instance;
    }

    public boolean isValida() {
        return System.currentTimeMillis() < validade;
    }

    public void executarOperacao() {
        if (!isValida()) {
            throw new IllegalStateException("🚫 Licença expirada. Operações bloqueadas!");
        }
        System.out.println("✅ Operação permitida");
    }
}
