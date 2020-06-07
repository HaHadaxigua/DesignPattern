package demo;

public class BProcess implements Process {

    @Override
    public void doSomeProcess(String data) {
        System.out.println(data + "do B");
        data += "do B";
    }
}
