package secondDemo;

public class MikeCustomer extends Customer {
    public MikeCustomer(Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    @Override
    void get() {
        System.out.println("麦克骑着车去拿kfc");
    }
}
