package charge;

public class Iphone {
    Lightning lightning;    // 拥有lightning接口

    public Iphone(Lightning lightning) {
        this.lightning = lightning;
    }

    public void charge() {
        System.out.println("开始给iphone充电");
        lightning.chargeWithLightning();
        System.out.println("结束对iphone充电");
    }
}
