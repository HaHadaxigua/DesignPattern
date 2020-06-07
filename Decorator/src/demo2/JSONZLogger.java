package demo2;

public class JSONZLogger extends ZLoggerDecorator {
    public JSONZLogger(ZLogger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) {
        String s = "string to json:" + msg;
        logger.log(s);
    }
}
