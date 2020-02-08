package factoryMethodPattern;

public class BoatFactory implements VehicleFactory {
    public BoatFactory() {
        System.out.println("boat Factory");
    }

    @Override
    public Vehicle create() {
        return new Boat();
    }
}
