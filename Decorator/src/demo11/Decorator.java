package demo11;

public abstract class Decorator extends Tea {
    Tea tea;
    private String otherName;
    private int otherPrice;

    public Decorator(Tea tea, String otherName, int otherPrice) {
        this.tea = tea;
        this.otherName = otherName;
        this.otherPrice = otherPrice;
        setName(otherName + tea.getName());        // 获取具体组件的能力
        setPrice(otherPrice + tea.getPrice());
    }

    public void printDescription() {
        addSomething();
        super.printDescription();
        System.out.println("------------");
    }

    public void addSomething() {
        tea.printDescription();
        System.out.println("Add  " + otherName + "  : " + otherPrice);
    }
}
