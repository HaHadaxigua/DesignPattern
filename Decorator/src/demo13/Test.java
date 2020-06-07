package demo13;

public class Test {
    public static void main(String[] args) {
        Tea tea = new MilkDecorator(new IceDecorator(new IceDecorator(new WhiteWater())));
        tea.printDescription();
    }
}
