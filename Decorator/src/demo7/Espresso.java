package demo7;

public class Espresso extends Beverage {
    public Espresso() {
        name = "Espresso";
    }

    @Override
    public double cost() {
        return 20;
    }
}
