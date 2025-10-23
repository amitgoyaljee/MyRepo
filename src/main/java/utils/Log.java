package utils;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    // Initialize Log4j logger
    private static Logger logger = LogManager.getLogger(Log.class);

    // Info Level Logs
    public static void info(String message) {
        logger.info(message);
    }

    // Warn Level Logs
    public static void warn(String message) {
        logger.warn(message);
    }

    // Error Level Logs
    public static void error(String message) {
        logger.error(message);
    }

    // Fatal Level Logs
    public static void fatal(String message) {
        logger.fatal(message);
    }

    // Debug Level Logs
    public static void debug(String message) {
        logger.debug(message);
        logger.info("Application started");

        int a = 5, b = 3;
        logger.debug("Values: a=" + a + ", b=" + b);

        int sum = a + b;
        logger.debug("Sum = " + sum);

        logger.info("Application finished");
    }
//All>Trace>Debug>info>debug>error>fatal>off

}
