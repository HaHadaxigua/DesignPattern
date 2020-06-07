package demo6;

/**
 * 打印log
 */
public class ConsoleLogger implements ILogger {
    /**
     * 假设我们已经实现了
     */
    @Override
    public void log() {
        System.out.println("print log");
    }
}
