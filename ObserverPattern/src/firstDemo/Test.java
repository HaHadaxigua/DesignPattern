package firstDemo;

public class Test {
    /**
     * we just set the subject's info,
     * and observer make action
     *
     * because, observer is listen the interface setVal in Subject's
     * @param args
     */
    public static void main(String[] args) {
        Shop subject = new Shop();
        Customer observer = new Customer();
        subject.addAttach(observer);
        subject.setInfo(true);
        observer.output();
        subject.setInfo(false);
        observer.output();
    }
}
