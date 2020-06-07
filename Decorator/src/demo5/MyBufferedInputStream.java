package demo5;

/**
 * 具体装饰器
 */
public class MyBufferedInputStream extends DecoratorInputStream {
    public MyBufferedInputStream(MyInputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void read() {
        System.out.println("we read in buffed");
        dosomething();
    }

    /**
     * 这个是具体装饰器干的额外的事情: 具体的能力
     */
    public void dosomething() {
        System.out.println("add a buffered");
    }
}
