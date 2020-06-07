package demo6;

public class FileLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("save log to file");
    }
}
