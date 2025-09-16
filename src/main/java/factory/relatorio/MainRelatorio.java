package factory.relatorio;

public class MainRelatorio {
    public static void main(String[] args) {
        Relatorio r = RelatorioFactory.criar("html");
        r.gerar("Relatório de Vendas");
    }
}
