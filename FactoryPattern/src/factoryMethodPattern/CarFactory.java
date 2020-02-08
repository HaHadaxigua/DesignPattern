package factoryMethodPattern;

public class CarFactory implements VehicleFactory{
    public CarFactory() {
        System.out.println("car Factory");
    }

    @Override
    public Vehicle create() {
        return new Car();
    }
}
