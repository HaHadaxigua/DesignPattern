package demo12;


public class IceDecorator extends Decorator {
    public IceDecorator(Tea tea) {
        super(tea, "ice_", 50);
    }
}
