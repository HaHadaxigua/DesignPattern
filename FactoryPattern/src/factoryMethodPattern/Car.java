package factoryMethodPattern;

public class Car implements Vehicle {
    public Car() {
        System.out.println("car");
    }

    @Override
    public void getVehicle() {
        System.out.println("get a car");
    }
}
