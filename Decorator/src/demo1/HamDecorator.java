package demo1;

public class HamDecorator extends PancakeDecorator {

    public HamDecorator(IPancake pancake) {
        super(pancake);
    }

    @Override
    public void cook() {
        System.out.println("添加了火腿");
        super.cook();
        warm();         // 添加新功能
    }

    private void warm() {
        System.out.println("烤至180°");
    }
}
