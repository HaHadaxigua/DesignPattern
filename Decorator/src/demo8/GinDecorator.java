package demo8;

public class GinDecorator extends Decorator {
    public GinDecorator(Tea tea) {
        super(tea, 80, "gin");
        price = tea.price;
        name = otherName + "-" + tea.name;
    }
}
