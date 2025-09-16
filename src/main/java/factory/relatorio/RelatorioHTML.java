package factory.relatorio;

public class RelatorioHTML implements Relatorio {
    public void gerar(String conteudo) {
        System.out.println("<html><body><h1>" + conteudo + "</h1></body></html>");
    }
}
