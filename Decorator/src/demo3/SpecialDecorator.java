package demo3;

public class SpecialDecorator {
}

class Espresso extends CoffeeDecorator {
    public Espresso(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void makeCoffee(String addition) {
        addPressure();
        System.out.print("we get a cup of espresso with" + addition + "--------");
        System.out.println(coffee.getClass().getSimpleName() + "---->Espresso");
    }

    private void addPressure() {
        System.out.println("under pressure");
    }
}

class Macchiato extends CoffeeDecorator {
    public Macchiato(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void makeCoffee(String addition) {
        addMilk();
        System.out.print("we get a cup of Machiato with" + addition + "--------");
        System.out.println(coffee.getClass().getSimpleName() + "---->Macchiato");
    }

    private void addMilk() {
        System.out.println("add milk");
    }
}
