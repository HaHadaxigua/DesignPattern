package factoryMethodPattern;

public class Boat implements Vehicle {
    public Boat() {
        System.out.println("boat");
    }

    @Override
    public void getVehicle() {
        System.out.println("get a boat");
    }
}
