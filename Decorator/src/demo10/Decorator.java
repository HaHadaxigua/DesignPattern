package demo10;

/**
 * 装饰器模式 就是使用组合来实现类能力的扩展
 * <p>
 * 抽象装饰类
 * <p>
 * 给Tea增加额外的功能和状态
 */
public abstract class Decorator extends Tea {
    Tea tea;        // 持有抽象组件的引用 通过组合 获取组件的能力
    // extends Tea 来使得装饰器和组件都是一个超类型 Tea  里氏替换原则
    private String otherName;
    private double otherPrice;

    // 定义构造函数
    public Decorator(Tea tea, String otherName, double otherPrice) {
        this.tea = tea;
        this.otherName = otherName;
        this.otherPrice = otherPrice;
        setName(otherName + tea.getName());        // 获取具体组件的能力
        setPrice(otherPrice + tea.getPrice());
    }

    // 重写Tea中的方法   still use the abstract component's function name
    @Override
    public void printDescription() {
        tea.printDescription();
        addSomething();
        super.printDescription();                       // 使用父类打印价格的功能
        System.out.println("-----------------");        // 表示一段增加功能
    }

    // 增加的额外功能  write additional func here
    public void addSomething() {
        // 打印上一段的输出
        System.out.println("add " + otherName + " cost : " + otherPrice);
    }
}
