package demo11;

/**
 * 这就是我们的抽象组件
 */
public abstract class Tea {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printDescription() {
        System.out.println(name + "  cost  " + price);
    }
}
