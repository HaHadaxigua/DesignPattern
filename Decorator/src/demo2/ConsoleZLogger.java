package demo2;

public class ConsoleZLogger implements ZLogger {
    @Override
    public void log(String msg) {
        System.out.println("ConsoleLogger:" + msg);
    }
}
