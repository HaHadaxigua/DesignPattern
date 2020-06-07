package demo12;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Tea tea) {
        super(tea, "milk", 80);
    }

    @Override
    protected void addSomething() {
        super.addSomething();
        System.out.println("加热");
    }
}
