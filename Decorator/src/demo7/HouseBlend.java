package demo7;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        name = "HouseBlend";
    }

    @Override
    public double cost() {
        return 10;
    }
}
