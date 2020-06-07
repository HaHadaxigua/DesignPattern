package demo7;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.name + ",Mocha";
    }

    @Override
    public double cost() {
        return 5 + beverage.cost();
    }

}
