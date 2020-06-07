package secondDemo;

public class Test {
    public static void main(String[] args) {
        Subject kfc = new Kfc();                // 创建了我们的被观察者
        Customer c1 = new MikeCustomer(kfc);   // 创建我们的观察者
        new MikeCustomer(kfc);
        kfc.ok();


    }
}
