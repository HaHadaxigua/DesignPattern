package lazyNoOrHavaSyn;

public class YouSelf {
    private static YouSelf youSelf;
    private int age;
    private YouSelf(){}
    private YouSelf(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static synchronized YouSelf getInstance(){
        if(youSelf == null)
           youSelf = new YouSelf();
        return youSelf;
    }
}
