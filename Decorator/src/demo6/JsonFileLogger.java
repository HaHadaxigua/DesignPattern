package demo6;

public class JsonFileLogger extends FileLogger {
    @Override
    public void log() {
        System.out.println("save to json");
    }
}
