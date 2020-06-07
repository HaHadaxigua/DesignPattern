package demo6;

public class Test {
    public static void main(String[] args) {
        basic2();
    }

    private static void basic2() {
        ILogger logger = new UpperConsoleLogger();
        ILogger logger1 = new JsonFileLogger();
        logger.log();
        logger1.log();
    }

    private static void basic() {
        ILogger logger = new ConsoleLogger();
        ILogger logger1 = new FileLogger();
        logger.log();
        logger1.log();
    }
}
