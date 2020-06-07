package demo8;

public class IceDecorator extends Decorator {
    public IceDecorator(Tea tea) {
        super(tea, 30, "ice");
        price = 30 + tea.price;
        name = otherName + "-" + tea.name;
    }
}
