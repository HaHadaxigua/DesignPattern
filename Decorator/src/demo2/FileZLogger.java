package demo2;

public class FileZLogger implements ZLogger {
    @Override
    public void log(String msg) {
        System.out.println("FileZLogger:" + msg);
    }
}
