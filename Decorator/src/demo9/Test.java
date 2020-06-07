package demo9;

public class Test {
    public static void main(String[] args) {
//        Tea tea = new WhiteWater();
//        tea.printDescription();
//
//        tea = new IceDecorator(tea);
//        tea.printDescription();
//
//        tea = new MilkDecorator(tea);
//        tea.printDescription();
//
//        tea = new IceDecorator(new WhiteWater());
//        tea.printDescription();

        Tea tea1 = new IceDecorator(new MilkDecorator(new WhiteWater()));
        tea1.printDescription();
    }
}
