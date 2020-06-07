package demo1;

public class Test {
    public static void main(String[] args) {
        IPancake pancake = new Pancake();
        IPancake pancakeWithOneEgg = new EggDecorator(pancake);
        // 加一个鸡蛋就做
        pancakeWithOneEgg.cook();
        IPancake pancakeWithTwoEgg = new EggDecorator(pancakeWithOneEgg);
        // 加了两个鸡蛋
        pancakeWithTwoEgg.cook();
        System.out.println("-------------------------");
        IPancake pancakeWithEggAndHam = new HamDecorator(pancakeWithTwoEgg);
        pancakeWithEggAndHam.cook();
        System.out.println("-------------------------");
        // 牛排煎饼
        IPancake pancakeWithSteak = new SteakDecorator(pancakeWithEggAndHam);
        pancakeWithSteak.cook();
    }
}
