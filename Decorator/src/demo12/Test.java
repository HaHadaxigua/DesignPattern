package demo12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
//        Tea tea = new Water();
//        tea.printDescription();
//        System.out.println("**********");
//
//        tea = new IceDecorator(tea);
//        tea.printDescription();
//        System.out.println("**********");
//
//        tea = new MilkDecorator(tea);
//        tea.printDescription();

        Tea tea1 = new MilkDecorator(new IceDecorator(new Water()));
        tea1.printDescription();
    }
}
