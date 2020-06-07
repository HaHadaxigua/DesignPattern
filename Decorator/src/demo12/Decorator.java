package demo12;

public abstract class Decorator extends Tea {
    Tea tea;
    private String otherName;
    private int otherPrice;

    public Decorator(Tea tea, String otherName, int otherPrice) {
        this.tea = tea;
        this.otherName = otherName;
        this.otherPrice = otherPrice;
        setPrice(tea.getPrice() + otherPrice);
        setName(otherName + tea.getName());
    }

    @Override
    public void printDescription() {
        addSomething();
        super.printDescription();
        System.out.println("-----------");
    }

    protected void addSomething() {
        tea.printDescription();
        System.out.println("add " + otherName + "  $" + otherPrice);
    }


}
