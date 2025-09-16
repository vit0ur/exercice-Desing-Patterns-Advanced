package factory.relatorio;

public class RelatorioExcel implements Relatorio {
    public void gerar(String conteudo) {
        System.out.println("📊 [Excel] Planilha criada com: " + conteudo);
    }
}
