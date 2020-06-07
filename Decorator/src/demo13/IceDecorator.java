package demo13;

public class IceDecorator extends Decorator {
    public IceDecorator(Tea tea) {
        super(tea, "ice", 50);
    }
}
