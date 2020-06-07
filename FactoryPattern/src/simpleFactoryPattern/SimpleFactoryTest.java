package simpleFactoryPattern;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        factoryTest2();
    }

    private static void factoryTest1() {
        Shape circle = ShapeSimpleFactory.getShape("circle");
        circle.draw();
        Shape rectangle = ShapeSimpleFactory.getShape("rectangle");
        rectangle.draw();
        Shape square = ShapeSimpleFactory.getShape("square");
        square.draw();
    }

    /**
     * 这种方法,就不需要再去修改工厂类了
     */
    private static void factoryTest2() {
        Circle circle = (Circle) SimpleSimpleFactoryWithReflect.getClass(Circle.class);
        circle.draw();
        MyShape myShape = (MyShape) SimpleSimpleFactoryWithReflect.getClass(MyShape.class);
        myShape.draw();
    }
}
