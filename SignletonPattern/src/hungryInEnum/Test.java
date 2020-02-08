package hungryInEnum;

public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.He;
        Singleton s2 = Singleton.He;
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
