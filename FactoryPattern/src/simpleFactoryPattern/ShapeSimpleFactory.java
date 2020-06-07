package simpleFactoryPattern;

/**
 * 简单工厂模式有个弊端，就是每次要新增加产品都需要修改这个工厂类
 * 违反了开闭原则
 * 可以通过反射来修改这一个弊端
 */
public class ShapeSimpleFactory {
    public static Shape getShape(String ShapeType) {
        if (null == ShapeType) {
            return null;
        } else if ("SQUARE".equalsIgnoreCase(ShapeType)) {
            return new Square();
        } else if ("RECTANGLE".equalsIgnoreCase(ShapeType)) {
            return new Rectangle();
        } else if ("CIRCLE".equalsIgnoreCase(ShapeType)) {
            return new Circle();
        }
        return null;
    }
}
