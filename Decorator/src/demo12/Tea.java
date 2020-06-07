package demo12;

/**
 * 抽象组件
 */
public abstract class Tea {
    private String name;
    private int price;

    public void printDescription() {
        System.out.println(name + "  cost  " + price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
