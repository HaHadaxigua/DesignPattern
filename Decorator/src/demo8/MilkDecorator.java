package demo8;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Tea tea) {
        super(tea, 100, "milk");
        price = 50 + tea.price;
        name = otherName + "-" + tea.name;
    }
}
