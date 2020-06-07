package demo7;

import java.util.HashMap;

/**
 * 所有饮料的基类,需要去继承
 */
public abstract class Beverage {
    public String name;    // 饮料名

    public String getName() {
        return name;
    }

    // 实现类必须实现
    public abstract double cost();

}
