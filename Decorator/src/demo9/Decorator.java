package demo9;

public abstract class Decorator extends Tea {
    private Tea tea;
    private String otherName;
    private double otherPrice;

    public Decorator(Tea tea, String otherName, double otherPrice) {
        this.tea = tea;
        setPrice(tea.getPrice() + otherPrice);
        setName(otherName + "-" + tea.getName());
        this.otherName = otherName;
        this.otherPrice = otherPrice;
    }

    @Override
    public void printDescription() {
        addSomething();
        System.out.println(getName() + "  cost  " + getPrice());
        System.out.println("------------------");
    }

    private void addSomething() {
        System.out.println("add " + otherName + "  $" + otherPrice);
    }


}
