package demo11;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Tea tea) {
        super(tea, "milk_", 80);
    }

    @Override
    public void addSomething() {

        super.addSomething();
        hot();
    }

    private void hot() {
        System.out.println("进行了加热");
    }
}
