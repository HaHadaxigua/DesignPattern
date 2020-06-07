package demo13;

public class MilkDecorator extends Decorator {

    public MilkDecorator(Tea tea) {
        super(tea, "milk", 200);
    }

    @Override
    public void addSomething() {
        System.out.println("加热");
        super.addSomething();
    }
}
