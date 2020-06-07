package demo9;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Tea tea) {
        super(tea, "milk", 80);
    }
}
