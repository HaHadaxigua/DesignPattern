package demo10;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Tea tea) {
        super(tea, "milk_", 200);
    }

    /**
     * 扩展的开放接口
     */
    @Override
    public void addSomething() {
        super.addSomething();
        System.out.println("add some sugar");
    }
}
