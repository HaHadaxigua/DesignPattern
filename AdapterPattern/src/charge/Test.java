package charge;

public class Test {
    public static void main(String[] args) {
        AndroidLine line = new AndroidLine();
        TypeCToLightningAdapter adapter = new TypeCToLightningAdapter(line);
        Iphone iphone = new Iphone(adapter);
        iphone.charge();
    }
}
