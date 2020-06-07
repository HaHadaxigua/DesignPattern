package demo1;

public class SteakDecorator extends PancakeDecorator {
    public SteakDecorator(IPancake pancake) {
        super(pancake);
    }

    @Override
    public void cook() {
        System.out.println("添加了牛排");
        addCumin();
        super.cook();
    }

    private void addCumin() {
        System.out.println("烤牛排 加孜然");
    }
}
