package demo11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
//        Tea tea = new WhiteWater();
//        tea.printDescription();
//        tea = new IceDecorator(tea);
//        tea.printDescription();
//
//        tea = new IceDecorator(tea);
//        tea.printDescription();
//
//        tea  = new MilkDecorator(tea);
//        tea.printDescription();

        Tea tea = new MilkDecorator(new MilkDecorator(new IceDecorator(new WhiteWater())));
        tea.printDescription();
    }
}
