package demo5;

public class Test {
    public static void main(String[] args) {
        // 1. 创建基本构建  多态的使用
        MyInputStream inputStream = new NormalInputStream();
        // 普通对象的使用
        inputStream.read();
        // 2. 使用我们的装饰器
        inputStream = new MyBufferedInputStream(inputStream);
        // 升级普通对象后的使用
        inputStream.read();

        inputStream = new DecoratorUpperStream(inputStream);
        inputStream.read();

        System.out.println("-----------------");

        // 使用继承的方法
        MyInputStream originalInputStream = new OriginalFilterInputStream();
        originalInputStream.read();

        MyInputStream upperInputStream = new UpperCaseInputStream();
        upperInputStream.read();

        // 我要给这个大写输入流 添加过滤能力
        // 怎么办?
        MyInputStream upperAndFilterStream = new UpperAndFilterInputStream();
        upperAndFilterStream.read();

        originalInputStream = new UpperAndFilterInputStream();
        originalInputStream.read();
    }
}
