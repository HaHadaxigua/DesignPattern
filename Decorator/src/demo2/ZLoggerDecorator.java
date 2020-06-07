package demo2;

/**
 * 无论需求有多么复制，他仍然是一个日志类，所以LoggerDecorator从ZLogger派生
 * <p>
 * 但是由于装饰的内容不同，所以只能是抽象类
 */
public abstract class ZLoggerDecorator implements ZLogger {
    ZLogger logger;                                 // 对已有的logger进行装饰, 如FileZLogger,ConsoleZLogger

    public ZLoggerDecorator(ZLogger logger) {       // 自己定义了构造函数且没有空参构造
        this.logger = logger;
    }
}
