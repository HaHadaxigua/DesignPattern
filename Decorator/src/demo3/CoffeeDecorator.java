package demo3;

abstract class CoffeeDecorator implements Coffee {
    Coffee coffee;                                          // 引用指向新传入的对象

    public CoffeeDecorator(Coffee coffee) {                   // 子类需要实现构造函数，具体的装饰交给具体的子类
        this.coffee = coffee;
    }

    public abstract void makeCoffee(String coffeeBeans);    // 子类需要实现具体装饰方法
}
