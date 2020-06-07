package demo3;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Coffee coffee = new Americano();            // 获取基本美式咖啡
        coffee.makeCoffee("something1");

        Coffee espresso = new Espresso(coffee);     // 通过装饰器，升级美式咖啡为意式咖啡
        espresso.makeCoffee("something2");

        Coffee macchiato = new Macchiato(espresso); // 将意式咖啡升级为玛奇朵
        macchiato.makeCoffee("something3");
    }
}
