package demo5;

public class DecoratorUpperStream extends DecoratorInputStream {
    public DecoratorUpperStream(MyInputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void read() {
        System.out.print("read in decorator");
        addupper();
    }

    public void addupper() {
        System.out.print("add upper func\n");
    }
}
