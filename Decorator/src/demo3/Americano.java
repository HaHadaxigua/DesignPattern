package demo3;


/**
 * the most normal coffee
 */
public class Americano implements Coffee {
    @Override
    public void makeCoffee(String addition) {
        System.out.print("we get a cup of Americano with" + addition + "--------");
        System.out.println("Americano:just coffee beans and water");
    }
}

abstract class AbstractDecorator {
    abstract void decorator();
}

class MilkDecorator extends AbstractDecorator implements Coffee {

    @Override
    void decorator() {

    }

    @Override
    public void makeCoffee(String addition) {

    }
}
