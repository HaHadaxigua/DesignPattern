package simpleFactoryPattern;

public class MyShape implements Shape {
    public MyShape() {
        System.out.println("MyShape");
    }

    @Override
    public void draw() {
        System.out.println("draw dh");
    }
}
