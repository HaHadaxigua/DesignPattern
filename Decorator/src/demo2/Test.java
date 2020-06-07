package demo2;

public class Test {
    ZLogger oldLogger = new FileZLogger();
    ZLogger newLogger = new ConsoleUpZLogger(oldLogger);

}
