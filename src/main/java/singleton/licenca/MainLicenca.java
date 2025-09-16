package singleton.licenca;

public class MainLicenca {
    public static void main(String[] args) throws InterruptedException {
        LicencaSoftware lic = LicencaSoftware.ativar("ABC-123", 2000);
        lic.executarOperacao();
        Thread.sleep(3000);
        lic.executarOperacao();
    }
}
