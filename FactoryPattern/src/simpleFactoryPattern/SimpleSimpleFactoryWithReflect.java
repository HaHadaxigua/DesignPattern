package simpleFactoryPattern;

public class SimpleSimpleFactoryWithReflect {
    public static Object getClass(Class<? extends Shape> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
