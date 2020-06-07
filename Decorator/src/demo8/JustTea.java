package demo8;

public class JustTea extends Tea {
    public JustTea() {
        name = "white water";
        price = 100;
    }

    @Override
    public void printDescription() {
        System.out.println("white_water---cost: " + price);
        System.out.println("*******************");
    }

}
