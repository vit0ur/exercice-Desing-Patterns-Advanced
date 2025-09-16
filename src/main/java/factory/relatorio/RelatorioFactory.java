package factory.relatorio;

public class RelatorioFactory {
    public static Relatorio criar(String formato) {
        return switch (formato.toLowerCase()) {
            case "pdf" -> new RelatorioPDF();
            case "html" -> new RelatorioHTML();
            case "excel" -> new RelatorioExcel();
            default -> throw new IllegalArgumentException("Formato inválido");
        };
    }
}
