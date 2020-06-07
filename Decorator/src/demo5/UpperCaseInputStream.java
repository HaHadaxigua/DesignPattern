package demo5;

public class UpperCaseInputStream extends NormalInputStream {
    @Override
    public void read() {
        System.out.print("upper word");
        addUpper();
    }

    public void addUpper() {
        System.out.print("add upper func+\n");
    }
}
