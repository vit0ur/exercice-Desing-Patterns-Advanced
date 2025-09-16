package singleton.logger;

public class MainLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log(LogLevel.INFO, "Sistema iniciado");
        logger.log(LogLevel.WARN, "Memória alta");

        logger.setActiveLevels(LogLevel.ERROR);
        logger.log(LogLevel.INFO, "Este não deve aparecer");
        logger.log(LogLevel.ERROR, "Erro crítico!");
    }
}
