package demo10;

public class GinDecorator extends Decorator {
    public GinDecorator(Tea tea) {      // use fathers's construct
        super(tea, "gin", 80);
    }
}
