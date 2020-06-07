package demo8;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
//        Tea tea =new JustTea();
//        tea.printDescription();
//
//        tea = new IceDecorator(tea);
//        tea.printDescription();
//
//        tea = new MilkDecorator(tea);
//        tea.printDescription();
//
//        tea = new MilkDecorator(tea);
//        tea.printDescription();
//
//        tea = new IceDecorator(tea);
//        tea.printDescription();

        // 1. 动态的添加职责
        Tea tea = new MilkDecorator(new IceDecorator(new JustTea()));
        tea.printDescription();
        System.out.println("分割线");
        // 2. 动态的撤销职责
        tea = new IceDecorator(new JustTea());
        tea.printDescription();


    }

    private void testInputStream() throws IOException {
        InputStream inputStream = new BufferedInputStream(new FileInputStream("README.md"));

        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            String str = new String(buffer, 0, bytesRead);
            System.out.println(str);
        }
    }
}
