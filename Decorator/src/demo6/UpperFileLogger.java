package demo6;

import java.io.FilterInputStream;
import java.io.InputStream;

public class UpperFileLogger extends FileLogger {
    @Override
    public void log() {
        System.out.println("add file");
    }

    /**
     *
     */
    public void add() {
        UpperConsoleLogger logger1 = new UpperConsoleLogger();
        logger1.log();
    }
}
