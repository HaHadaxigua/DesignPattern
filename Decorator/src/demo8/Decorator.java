package demo8;

public abstract class Decorator extends Tea {
    Tea tea;
    double otherCost;
    String otherName;

    public Decorator(Tea tea, double otherCost, String otherName) {
        this.tea = tea;
        this.otherCost = otherCost;
        this.otherName = otherName;
    }

    // 覆盖父类方法
    public void printDescription() {
        addSomething();
        System.out.println(name + "---cost:" + price);
        System.out.println("*******************");
    }

    public void addSomething() {
        tea.printDescription();
        System.out.println("add  " + otherName + "  cost: " + otherCost);
    }
}
