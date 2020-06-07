package demo4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class A {
    public void printA() {
        System.out.println("a");
    }

}

class B extends A {
    public void printB() {
        System.out.println("b");
    }
}

class Test {
    A a = new A();
    A a1 = new B();

}