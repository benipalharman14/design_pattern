package behavioral.chainOfResponsibility;

public class Calling {

    private static LoggerHandler logger = LoggerFactory.getInstance();

    public static void main(String[] args) {
        logger.log(LogLevel.DEBUG,"Hello");
    }
}
