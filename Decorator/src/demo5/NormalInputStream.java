package demo5;

import java.io.InputStream;

/**
 * 具体构件
 */
public class NormalInputStream implements MyInputStream {
    @Override
    public void read() {
        System.out.println("just read");
    }
}
