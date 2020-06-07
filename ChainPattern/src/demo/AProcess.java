package demo;

public class AProcess implements Process {
    @Override
    public void doSomeProcess(String data) {
        System.out.println(data + "do A");
        data += "do A";
    }
}
