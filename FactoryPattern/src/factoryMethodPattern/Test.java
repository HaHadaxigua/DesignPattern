package factoryMethodPattern;

public class Test {
    public static void main(String[] args) {
        VehicleFactory myFactory = new CarFactory();
        Vehicle myCar = myFactory.create();
        myCar.getVehicle();
    }
}
