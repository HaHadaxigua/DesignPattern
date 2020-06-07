package demo10;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
//        Tea tea = new WhiteWater();
//        tea.printDescription();
//
//        tea = new GinDecorator(tea);
//        tea.printDescription();
//
//        tea = new MilkDecorator(tea);
//        tea.printDescription();

        Tea tea = new MilkDecorator(new MilkDecorator(new GinDecorator(new WhiteWater())));
        tea.printDescription();

//        testInputStream();

    }

    public static void testInputStream() throws IOException {
        InputStream inputStream = new BufferedInputStream(new FileInputStream("README.md"));
        byte[] buffered = new byte[1024];
        int readBytes = 0;
        while ((readBytes = inputStream.read(buffered)) != -1) {
            String str = new String(buffered, 0, readBytes);
            System.out.println(str);
        }
    }
}
