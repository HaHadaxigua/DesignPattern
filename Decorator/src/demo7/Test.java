package demo7;

public class Test {
    public static void main(String[] args) {
        System.out.println("espresso-----");
        Beverage beverage = new Espresso();
        System.out.println(beverage.getName());
        System.out.println(beverage.cost());

        System.out.println("houseblend----");
        beverage = new HouseBlend();
        System.out.println(beverage.getName());
        System.out.println(beverage.cost());

        System.out.println("mocha-----");
        beverage = new Mocha(beverage);
        System.out.println(beverage.getName());
        System.out.println(beverage.cost());
    }
}
