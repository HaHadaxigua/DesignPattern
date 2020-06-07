package demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Process> chain = new ArrayList<>();
        chain.add(new AProcess());
        chain.add(new BProcess());

        chain.forEach(x -> x.doSomeProcess("hello world"));
    }
}
