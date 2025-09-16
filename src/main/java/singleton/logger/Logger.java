package singleton.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class Logger {
    private static Logger instance;
    private Set<LogLevel> activeLevels = EnumSet.allOf(LogLevel.class);

    private Logger() {}

    public static synchronized Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void setActiveLevels(LogLevel... levels) {
        activeLevels = EnumSet.copyOf(Arrays.asList(levels));
    }

    public void log(LogLevel level, String message) {
        if (!activeLevels.contains(level)) return;
        String logMsg = LocalDateTime.now() + " [" + level + "] " + message;

        System.out.println(logMsg);

        try (FileWriter fw = new FileWriter("app.log", true)) {
            fw.write(logMsg + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
