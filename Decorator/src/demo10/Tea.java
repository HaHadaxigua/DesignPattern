package demo10;

/**
 * 抽象构件
 */
public abstract class Tea {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printDescription() {
        System.out.println(name + "  cost  " + price);
    }
}
