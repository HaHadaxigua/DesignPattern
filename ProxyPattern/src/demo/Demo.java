package demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo {


    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.toString());
                if (method.getName().equals("hello")) {
                    System.out.println("good morning");
                }
                return null;
            }
        };

        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new Class[]{Hello.class},
                handler     // 传入调用处理方法的handler
        );
        hello.hello();
    }

}

interface Hello {
    // this is a normal interface
    public void hello();
}
