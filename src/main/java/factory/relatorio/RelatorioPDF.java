package factory.relatorio;

public class RelatorioPDF implements Relatorio {
    public void gerar(String conteudo) {
        System.out.println("📕 [PDF] Gerando binário com: " + conteudo);
    }
}
