package demo2;

public class ConsoleUpZLogger extends ZLoggerDecorator {
    public ConsoleUpZLogger(ZLogger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) {
        msg = msg.toUpperCase();        // 装饰：
        logger.log(msg);                // 执行已有的log功能
    }
}
