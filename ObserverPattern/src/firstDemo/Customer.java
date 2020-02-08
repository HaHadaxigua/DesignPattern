package firstDemo;

public class Customer implements Observer{
    private String info;
    @Override
    public void getUpdate(String msg) {
        this.info = Customer.class.getName() + ":decide "+msg;
    }

    public void output(){
        System.out.println(info);
    }
}
